package com.btbob.mcplus.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class MCPlusGlowingMushroomWallBlock extends HorizontalDirectionalBlock implements net.minecraftforge.common.IPlantable{
    public MCPlusGlowingMushroomWallBlock(Properties pProperties) {  super(pProperties); this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE)); }
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    private static final VoxelShape SHAPE_S = Stream.of(Block.box(0,4,8,16, 12,16)).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_N = Stream.of(Block.box(0,4,0,16, 12,8)).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(Block.box(0,4,0,8, 12,16)).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(Block.box(8,4,0,16, 12,16)).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch ((Direction)pState.getValue(FACING)) {
            case SOUTH:
                return SHAPE_S;
            case NORTH:
            default:
                return SHAPE_N;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
        }
    }

    //FACING
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = this.defaultBlockState();
        LevelReader levelreader = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();

        for(Direction direction : pContext.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockstate = blockstate.setValue(FACING, direction);
                if (blockstate.canSurvive(levelreader, blockpos)) {
                    return blockstate;
                }
            }
        }

        return null;
    }

    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        return pFacing == pState.getValue(FACING) && !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockState blockstate = pLevel.getBlockState(pPos.relative(pState.getValue(FACING)));
        if (blockstate.is(BlockTags.MUSHROOM_GROW_BLOCK) || blockstate.is(BlockTags.LOGS_THAT_BURN)) {
            return true;
        } else {
            return pLevel.getRawBrightness(pPos, 0) < 13 && blockstate.canSustainPlant(pLevel, pPos, pState.getValue(FACING).getOpposite(), this);
        }    }


    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        if (state.getBlock() != this) return defaultBlockState();
        return state;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(LIT, FACING);
    }




    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.isNight() || pLevel.getRawBrightness(pPos, 0) < 10) {
            pState.setValue(LIT, true);
        } else {
            pState.setValue(LIT, false);
        }    }

}
