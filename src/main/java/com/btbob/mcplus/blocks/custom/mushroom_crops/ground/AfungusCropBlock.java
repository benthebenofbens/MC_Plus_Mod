package com.btbob.mcplus.blocks.custom.mushroom_crops.ground;

import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class AfungusCropBlock extends MushroomCropBlock {
    public AfungusCropBlock(Properties pProperties) {
        super(pProperties);
    }

    protected ItemLike getBaseSeedId() {
        return MCPlusItems.AFUNGUS_SPORES.get();
    }

}
