package com.btbob.mcplus.blocks.custom.mushroom_crops.ground;

import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class GiantPuffballCropBlock extends MushroomCropBlock {
    public GiantPuffballCropBlock(Properties pProperties) {
        super(pProperties);
    }
    protected ItemLike getBaseSeedId() {
        return MCPlusItems.GIANT_PUFFBALL_SPORES.get();
    }

}
