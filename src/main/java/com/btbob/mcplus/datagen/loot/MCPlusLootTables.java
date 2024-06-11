package com.btbob.mcplus.datagen.loot;

import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MCPlusLootTables extends BlockLootSubProvider {

    public MCPlusLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
       //GNEISS
        this.add(MCPlusBlocks.GNEISS.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.GNEISS.get(), MCPlusBlocks.COBBLED_GNEISS.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.CHISELED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_GNEISS.get());
        this.add(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR.get());
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR_BASE.get());
        //SLATE
        this.add(MCPlusBlocks.SLATE.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.SLATE.get(), MCPlusBlocks.COBBLED_SLATE.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_SLATE.get());
        this.dropSelf(MCPlusBlocks.CHISELED_SLATE.get());
        this.dropSelf(MCPlusBlocks.SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_SLATE.get());
        this.add(MCPlusBlocks.SMOOTH_SLATE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_SLATE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.SLATE_PILLAR.get());
        this.dropSelf(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.SLATE_PILLAR_BASE.get());

        //MARBLE
        this.add(MCPlusBlocks.MARBLE.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.MARBLE.get(), MCPlusBlocks.COBBLED_MARBLE.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_MARBLE.get());
        this.dropSelf(MCPlusBlocks.PAINTED_COBBLED_MARBLE.get());
        this.dropSelf(MCPlusBlocks.MARBLE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_MARBLE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.PAINTED_MARBLE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_MARBLE.get());
        this.dropSelf(MCPlusBlocks.CHISELED_MARBLE.get());
        this.dropSelf(MCPlusBlocks.MARBLE_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_MARBLE_TILES.get());
        this.dropSelf(MCPlusBlocks.PAINTED_MARBLE_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_MARBLE.get());
        this.add(MCPlusBlocks.SMOOTH_MARBLE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_MARBLE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.MARBLE_PILLAR.get());
        this.dropSelf(MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.MARBLE_PILLAR_BASE.get());
        // GABBRO
        this.dropSelf(MCPlusBlocks.GABBRO.get());
        //LIMESTONE
        this.dropSelf(MCPlusBlocks.LIMESTONE.get());
        //CHERT
        this.dropSelf(MCPlusBlocks.CHERT.get());
        //this.dropSelf(MCPlusBlocks.COBBLED_SLATE.get());
       // this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.CHERT_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_CHERT_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_CHERT.get());
        this.dropSelf(MCPlusBlocks.CHISELED_CHERT.get());
        this.dropSelf(MCPlusBlocks.CHERT_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_CHERT_TILES.get());
        this.dropSelf(MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_CHERT.get());
        this.add(MCPlusBlocks.SMOOTH_CHERT_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_CHERT_SLAB.get()));
      //  this.dropSelf(MCPlusBlocks.SLATE_PILLAR.get());
       // this.dropSelf(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get());
       // this.dropSelf(MCPlusBlocks.SLATE_PILLAR_BASE.get());

    }




    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MCPlusBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
