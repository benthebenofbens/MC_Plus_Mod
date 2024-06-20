package com.btbob.mcplus.blocks.custom.mushroom_crops;

import com.btbob.mcplus.blocks.NatureBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MushroomCropBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public MushroomCropBlock(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(NatureBlocks.MUSHROOM_GROWING_BOX.get());
    }
}
