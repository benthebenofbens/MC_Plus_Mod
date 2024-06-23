package com.btbob.mcplus.blocks.custom.mushroom_crops.ground;

import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;

public class DesertShaggyManeCropBlock extends MushroomCropBlock {
    public DesertShaggyManeCropBlock(Properties pProperties) {
        super(pProperties);
    }

    protected ItemLike getBaseSeedId() {
        return MCPlusItems.DESERT_SHAGGY_MANE_SPORES.get();
    }

}
