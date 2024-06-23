package com.btbob.mcplus.blocks.custom.mushroom_crops.ground;

import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.world.level.ItemLike;

public class OysterCropBlock extends MushroomCropBlock {
    public OysterCropBlock(Properties pProperties) {
        super(pProperties);
    }
    protected ItemLike getBaseSeedId() {
        return MCPlusItems.OYSTER_SPORES.get();
    }

}
