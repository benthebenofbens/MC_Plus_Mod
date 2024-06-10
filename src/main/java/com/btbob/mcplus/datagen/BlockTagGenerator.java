package com.btbob.mcplus.datagen;


import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                MCPlusBlocks.GNEISS.get(),
                MCPlusBlocks.MARBLE.get(),
                MCPlusBlocks.LIMESTONE.get(),
                MCPlusBlocks.SLATE.get(),
                MCPlusBlocks.GABBRO.get(),
                MCPlusBlocks.CHERT.get());


    }
}
