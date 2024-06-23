package com.btbob.mcplus.util;

import com.btbob.mcplus.MCPlus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MCPlusTags {
    public static class Blocks {
        public static final TagKey<Block> SMALL_MUSHROOMS = tag("small_mushrooms");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MCPlus.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SMALL_MUSHROOMS = tag("small_mushrooms");
        public static final TagKey<Item> SPORES = tag("spores");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MCPlus.MODID, name));
        }
    }
}
