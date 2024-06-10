package com.btbob.mcplus.util;

import com.btbob.mcplus.MCPlus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MCPlusTags {
    public static class Blocks {
        public static final TagKey<Block> CEILING_TILE_BLOCKS = tag("ceiling_tile_blocks");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MCPlus.MODID, name));
        }
    }
}
