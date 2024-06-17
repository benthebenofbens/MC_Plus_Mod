package com.btbob.mcplus.blocks.custom;

import com.btbob.mcplus.blocks.NatureBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class MushroomBunchBlock extends HorizontalDirectionalBlock {

    public MushroomBunchBlock(Properties pProperties) {
        super(pProperties);
    }


    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SHAPE_U = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
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
            case UP:
                return SHAPE_U;
            case DOWN:
                return SHAPE_U;
        }
    }

    //FACING
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = this.defaultBlockState();
        LevelReader levelreader = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();

        for(Direction direction : pContext.getNearestLookingDirections()) {
            if(direction.getAxis().isVertical()) {
                blockstate = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection());
            } else if (direction.getAxis().isHorizontal()) {
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockpos = pPos.below();
        BlockState blockstate = pLevel.getBlockState(blockpos);
        BlockState sideBlockstate = pLevel.getBlockState(pPos.relative(pState.getValue(FACING)));

        if (pState.getValue(FACING) == Direction.DOWN) {
        return  (blockstate.is(BlockTags.MUSHROOM_GROW_BLOCK) || blockstate.is(BlockTags.DIRT) || blockstate.is(NatureBlocks.MUSHROOM_GROWING_BOX.get()) || blockstate.is(BlockTags.LOGS_THAT_BURN));
        } else {
            return (sideBlockstate.is(BlockTags.MUSHROOM_GROW_BLOCK) || sideBlockstate.is(BlockTags.DIRT) || sideBlockstate.is(NatureBlocks.MUSHROOM_GROWING_BOX.get()) || sideBlockstate.is(BlockTags.LOGS_THAT_BURN));
        }
    }
}
