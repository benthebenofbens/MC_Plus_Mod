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
        this.dropSelf(MCPlusBlocks.GNEISS_STAIRS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_WALL.get());
        this.add(MCPlusBlocks.GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.COBBLED_GNEISS_STAIRS.get());
        this.dropSelf(MCPlusBlocks.COBBLED_GNEISS_WALL.get());
        this.add(MCPlusBlocks.COBBLED_GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.COBBLED_GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_STAIRS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_WALL.get());
        this.add(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_BRICK_WALL.get());
        this.add(MCPlusBlocks.GNEISS_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.GNEISS_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_BRICK_WALL.get());
        this.add(MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_WALL.get());
        this.add(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.POLISHED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_GNEISS_STAIRS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_GNEISS_WALL.get());
        this.add(MCPlusBlocks.POLISHED_GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.POLISHED_GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CHISELED_GNEISS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.GNEISS_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.GNEISS_TILE_WALL.get());
        this.add(MCPlusBlocks.GNEISS_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.GNEISS_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GNEISS_TILE_WALL.get());
        this.add(MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.ENERGIZED_GNEISS_TILE_WALL.get());
        this.add(MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.SMOOTH_GNEISS.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_GNEISS_STAIRS.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_GNEISS_WALL.get());
        this.add(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get()));
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR.get());
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.GNEISS_PILLAR_BASE.get());
        //SLATE
        this.add(MCPlusBlocks.SLATE.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.SLATE.get(), MCPlusBlocks.COBBLED_SLATE.get()));
        this.dropSelf(MCPlusBlocks.SLATE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.SLATE_WALL.get());
        this.add(MCPlusBlocks.SLATE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SLATE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.COBBLED_SLATE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.COBBLED_SLATE_WALL.get());
        this.add(MCPlusBlocks.COBBLED_SLATE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.COBBLED_SLATE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_WALL.get());
        this.add(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.SLATE_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.SLATE_BRICK_WALL.get());
        this.add(MCPlusBlocks.SLATE_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SLATE_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_BRICK_WALL.get());
        this.add(MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_STAIRS.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_WALL.get());
        this.add(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB.get()));
        this.dropSelf(MCPlusBlocks.POLISHED_SLATE.get());
        this.dropSelf(MCPlusBlocks.POLISHED_SLATE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_SLATE_WALL.get());
        this.add(MCPlusBlocks.POLISHED_SLATE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.POLISHED_SLATE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CHISELED_SLATE.get());
        this.dropSelf(MCPlusBlocks.SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.SLATE_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.SLATE_TILE_WALL.get());
        this.add(MCPlusBlocks.SLATE_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SLATE_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_SLATE_TILE_WALL.get());
        this.add(MCPlusBlocks.CRACKED_SLATE_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.CRACKED_SLATE_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_TILE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.BEDAZZLED_SLATE_TILE_WALL.get());
        this.add(MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.SMOOTH_SLATE.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_SLATE_STAIRS.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_SLATE_WALL.get());
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
        //this.dropSelf(MCPlusBlocks.COBBLED_SLATE.get());
        // this.dropSelf(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
        this.dropSelf(MCPlusBlocks.GABBRO_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GABBRO_BRICKS.get());
       // this.dropSelf(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_GABBRO.get());
        this.dropSelf(MCPlusBlocks.CHISELED_GABBRO.get());
        this.dropSelf(MCPlusBlocks.GABBRO_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_GABBRO_TILES.get());
      //  this.dropSelf(MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_GABBRO.get());
        this.add(MCPlusBlocks.SMOOTH_GABBRO_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_GABBRO_SLAB.get()));
        this.dropSelf(MCPlusBlocks.GABBRO_PILLAR.get());
        this.dropSelf(MCPlusBlocks.GABBRO_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.GABBRO_PILLAR_BASE.get());
        //LIMESTONE
        this.add(MCPlusBlocks.LIMESTONE.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.LIMESTONE.get(), MCPlusBlocks.COBBLED_LIMESTONE.get()));


        this.dropSelf(MCPlusBlocks.COBBLED_LIMESTONE.get());
        this.dropSelf(MCPlusBlocks.LICHENY_COBBLED_LIMESTONE.get());
        this.dropSelf(MCPlusBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.CRACKED_LIMESTONE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.LICHENY_LIMESTONE_BRICKS.get());
        this.dropSelf(MCPlusBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(MCPlusBlocks.CHISELED_LIMESTONE.get());
        this.dropSelf(MCPlusBlocks.LIMESTONE_TILES.get());
        this.dropSelf(MCPlusBlocks.CRACKED_LIMESTONE_TILES.get());
        this.dropSelf(MCPlusBlocks.LICHENY_LIMESTONE_TILES.get());
        this.dropSelf(MCPlusBlocks.SMOOTH_LIMESTONE.get());
        this.add(MCPlusBlocks.SMOOTH_LIMESTONE_SLAB.get(), block -> createSlabItemTable(MCPlusBlocks.SMOOTH_LIMESTONE_SLAB.get()));
        this.dropSelf(MCPlusBlocks.LIMESTONE_PILLAR.get());
        this.dropSelf(MCPlusBlocks.LIMESTONE_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.LIMESTONE_PILLAR_BASE.get());
        //CHERT
        this.add(MCPlusBlocks.CHERT.get(), block -> createSingleItemTableWithSilkTouch(MCPlusBlocks.CHERT.get(), MCPlusBlocks.COBBLED_CHERT.get()));
        this.dropSelf(MCPlusBlocks.COBBLED_CHERT.get());
        this.dropSelf(MCPlusBlocks.CRYSTALLINE_COBBLED_CHERT.get());
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
        this.dropSelf(MCPlusBlocks.CHERT_PILLAR.get());
        this.dropSelf(MCPlusBlocks.CHERT_PILLAR_CAPITAL.get());
        this.dropSelf(MCPlusBlocks.CHERT_PILLAR_BASE.get());

    }




    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MCPlusBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
