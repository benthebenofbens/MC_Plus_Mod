package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) { super(output, MCPlus.MODID, exFileHelper); }

    @Override
    protected void registerStatesAndModels() {
        //GNEISS
        blockWithItem(MCPlusBlocks.GNEISS);
        stairsBlock(((StairBlock)MCPlusBlocks.GNEISS_STAIRS.get()), blockTexture(MCPlusBlocks.GNEISS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.GNEISS_SLAB.get()), blockTexture(MCPlusBlocks.GNEISS.get()), blockTexture(MCPlusBlocks.GNEISS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.GNEISS_WALL.get()), blockTexture(MCPlusBlocks.GNEISS.get()));
        blockWithItem(MCPlusBlocks.COBBLED_GNEISS);
        stairsBlock(((StairBlock)MCPlusBlocks.COBBLED_GNEISS_STAIRS.get()), blockTexture(MCPlusBlocks.COBBLED_GNEISS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.COBBLED_GNEISS_SLAB.get()), blockTexture(MCPlusBlocks.COBBLED_GNEISS.get()), blockTexture(MCPlusBlocks.COBBLED_GNEISS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.COBBLED_GNEISS_WALL.get()), blockTexture(MCPlusBlocks.COBBLED_GNEISS.get()));
        blockWithItem(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS);
        stairsBlock(((StairBlock)MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_STAIRS.get()), blockTexture(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB.get()), blockTexture(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get()), blockTexture(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_WALL.get()), blockTexture(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get()));
        blockWithItem(MCPlusBlocks.GNEISS_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.GNEISS_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.GNEISS_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.GNEISS_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.GNEISS_BRICKS.get()), blockTexture(MCPlusBlocks.GNEISS_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.GNEISS_BRICK_WALL.get()), blockTexture(MCPlusBlocks.GNEISS_BRICKS.get()));
        blockWithItem(MCPlusBlocks.CRACKED_GNEISS_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.CRACKED_GNEISS_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.CRACKED_GNEISS_BRICK_WALL.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get()));
        blockWithItem(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.ENERGIZED_GNEISS_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.ENERGIZED_GNEISS_BRICK_WALL.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get()));
        blockWithItem(MCPlusBlocks.POLISHED_GNEISS);
        stairsBlock(((StairBlock)MCPlusBlocks.POLISHED_GNEISS_STAIRS.get()), blockTexture(MCPlusBlocks.POLISHED_GNEISS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.POLISHED_GNEISS_SLAB.get()), blockTexture(MCPlusBlocks.POLISHED_GNEISS.get()), blockTexture(MCPlusBlocks.POLISHED_GNEISS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.POLISHED_GNEISS_WALL.get()), blockTexture(MCPlusBlocks.POLISHED_GNEISS.get()));
        blockWithItem(MCPlusBlocks.CHISELED_GNEISS);
        blockWithItem(MCPlusBlocks.GNEISS_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.GNEISS_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.GNEISS_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.GNEISS_TILE_SLAB.get()), blockTexture(MCPlusBlocks.GNEISS_TILES.get()), blockTexture(MCPlusBlocks.GNEISS_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.GNEISS_TILE_WALL.get()), blockTexture(MCPlusBlocks.GNEISS_TILES.get()));
        blockWithItem(MCPlusBlocks.CRACKED_GNEISS_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.CRACKED_GNEISS_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_TILES.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.CRACKED_GNEISS_TILE_WALL.get()), blockTexture(MCPlusBlocks.CRACKED_GNEISS_TILES.get()));
        blockWithItem(MCPlusBlocks.ENERGIZED_GNEISS_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.ENERGIZED_GNEISS_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.ENERGIZED_GNEISS_TILE_WALL.get()), blockTexture(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get()));
        blockWithItem(MCPlusBlocks.SMOOTH_GNEISS);
        stairsBlock(((StairBlock)MCPlusBlocks.SMOOTH_GNEISS_STAIRS.get()), blockTexture(MCPlusBlocks.SMOOTH_GNEISS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.SMOOTH_GNEISS_WALL.get()), blockTexture(MCPlusBlocks.SMOOTH_GNEISS.get()));
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GNEISS_PILLAR.get()), blockTexture(MCPlusBlocks.GNEISS_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/gneiss_pillar_top"));
        blockItem(MCPlusBlocks.GNEISS_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/gneiss_pillar_top"));
        blockItem(MCPlusBlocks.GNEISS_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GNEISS_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.GNEISS_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/gneiss_pillar_top"));
        blockItem(MCPlusBlocks.GNEISS_PILLAR_BASE);
        //MARBLE
        blockWithItem(MCPlusBlocks.MARBLE);
        blockWithItem(MCPlusBlocks.COBBLED_MARBLE);
        blockWithItem(MCPlusBlocks.PAINTED_COBBLED_MARBLE);
        blockWithItem(MCPlusBlocks.MARBLE_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_MARBLE_BRICKS);
        blockWithItem(MCPlusBlocks.PAINTED_MARBLE_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_MARBLE);
        blockWithItem(MCPlusBlocks.CHISELED_MARBLE);
        blockWithItem(MCPlusBlocks.MARBLE_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_MARBLE_TILES);
        blockWithItem(MCPlusBlocks.PAINTED_MARBLE_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_MARBLE);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.MARBLE_PILLAR.get()), blockTexture(MCPlusBlocks.MARBLE_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/marble_pillar_top"));
        blockItem(MCPlusBlocks.MARBLE_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/marble_pillar_top"));
        blockItem(MCPlusBlocks.MARBLE_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.MARBLE_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.MARBLE_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/marble_pillar_top"));
        blockItem(MCPlusBlocks.MARBLE_PILLAR_BASE);
        //SLATE
        blockWithItem(MCPlusBlocks.SLATE);
        stairsBlock(((StairBlock)MCPlusBlocks.SLATE_STAIRS.get()), blockTexture(MCPlusBlocks.SLATE.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.SLATE_SLAB.get()), blockTexture(MCPlusBlocks.SLATE.get()), blockTexture(MCPlusBlocks.SLATE.get()));
        wallBlock(((WallBlock)MCPlusBlocks.SLATE_WALL.get()), blockTexture(MCPlusBlocks.SLATE.get()));
        blockWithItem(MCPlusBlocks.COBBLED_SLATE);
        stairsBlock(((StairBlock)MCPlusBlocks.COBBLED_SLATE_STAIRS.get()), blockTexture(MCPlusBlocks.COBBLED_SLATE.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.COBBLED_SLATE_SLAB.get()), blockTexture(MCPlusBlocks.COBBLED_SLATE.get()), blockTexture(MCPlusBlocks.COBBLED_SLATE.get()));
        wallBlock(((WallBlock)MCPlusBlocks.COBBLED_SLATE_WALL.get()), blockTexture(MCPlusBlocks.COBBLED_SLATE.get()));
        blockWithItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE);
        stairsBlock(((StairBlock)MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_STAIRS.get()), blockTexture(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB.get()), blockTexture(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()), blockTexture(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()));
        wallBlock(((WallBlock)MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_WALL.get()), blockTexture(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()));
        blockWithItem(MCPlusBlocks.SLATE_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.SLATE_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.SLATE_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.SLATE_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.SLATE_BRICKS.get()), blockTexture(MCPlusBlocks.SLATE_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.SLATE_BRICK_WALL.get()), blockTexture(MCPlusBlocks.SLATE_BRICKS.get()));
        blockWithItem(MCPlusBlocks.CRACKED_SLATE_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.CRACKED_SLATE_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_BRICKS.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.CRACKED_SLATE_BRICK_WALL.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_BRICKS.get()));
        blockWithItem(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS);
        stairsBlock(((StairBlock)MCPlusBlocks.BEDAZZLED_SLATE_BRICK_STAIRS.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()));
        wallBlock(((WallBlock)MCPlusBlocks.BEDAZZLED_SLATE_BRICK_WALL.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()));
        blockWithItem(MCPlusBlocks.POLISHED_SLATE);
        stairsBlock(((StairBlock)MCPlusBlocks.POLISHED_SLATE_STAIRS.get()), blockTexture(MCPlusBlocks.POLISHED_SLATE.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.POLISHED_SLATE_SLAB.get()), blockTexture(MCPlusBlocks.POLISHED_SLATE.get()), blockTexture(MCPlusBlocks.POLISHED_SLATE.get()));
        wallBlock(((WallBlock)MCPlusBlocks.POLISHED_SLATE_WALL.get()), blockTexture(MCPlusBlocks.POLISHED_SLATE.get()));
        blockWithItem(MCPlusBlocks.CHISELED_SLATE);
        blockWithItem(MCPlusBlocks.SLATE_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.SLATE_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.SLATE_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.SLATE_TILE_SLAB.get()), blockTexture(MCPlusBlocks.SLATE_TILES.get()), blockTexture(MCPlusBlocks.SLATE_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.SLATE_TILE_WALL.get()), blockTexture(MCPlusBlocks.SLATE_TILES.get()));
        blockWithItem(MCPlusBlocks.CRACKED_SLATE_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.CRACKED_SLATE_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.CRACKED_SLATE_TILE_SLAB.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_TILES.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.CRACKED_SLATE_TILE_WALL.get()), blockTexture(MCPlusBlocks.CRACKED_SLATE_TILES.get()));
        blockWithItem(MCPlusBlocks.BEDAZZLED_SLATE_TILES);
        stairsBlock(((StairBlock)MCPlusBlocks.BEDAZZLED_SLATE_TILE_STAIRS.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()));
        slabBlock(((SlabBlock)MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()));
        wallBlock(((WallBlock)MCPlusBlocks.BEDAZZLED_SLATE_TILE_WALL.get()), blockTexture(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()));
        blockWithItem(MCPlusBlocks.SMOOTH_SLATE);
        stairsBlock(((StairBlock)MCPlusBlocks.SMOOTH_SLATE_STAIRS.get()), blockTexture(MCPlusBlocks.SMOOTH_SLATE.get()));
        wallBlock(((WallBlock)MCPlusBlocks.SMOOTH_SLATE_WALL.get()), blockTexture(MCPlusBlocks.SMOOTH_SLATE.get()));
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.SLATE_PILLAR.get()), blockTexture(MCPlusBlocks.SLATE_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/slate_pillar_top"));
        blockItem(MCPlusBlocks.SLATE_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.SLATE_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/slate_pillar_top"));
        blockItem(MCPlusBlocks.SLATE_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.SLATE_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.SLATE_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/slate_pillar_top"));
        blockItem(MCPlusBlocks.SLATE_PILLAR_BASE);
        //CHERT
        blockWithItem(MCPlusBlocks.CHERT);
        blockWithItem(MCPlusBlocks.COBBLED_CHERT);
        blockWithItem(MCPlusBlocks.CRYSTALLINE_COBBLED_CHERT);
        blockWithItem(MCPlusBlocks.CHERT_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_CHERT_BRICKS);
        blockWithItem(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_CHERT);
        blockWithItem(MCPlusBlocks.CHISELED_CHERT);
        blockWithItem(MCPlusBlocks.CHERT_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_CHERT_TILES);
        blockWithItem(MCPlusBlocks.CRYSTALLINE_CHERT_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_CHERT);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.CHERT_PILLAR.get()), blockTexture(MCPlusBlocks.CHERT_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/chert_pillar_top"));
        blockItem(MCPlusBlocks.CHERT_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.CHERT_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.CHERT_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/chert_pillar_top"));
        blockItem(MCPlusBlocks.CHERT_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.CHERT_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.CHERT_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/chert_pillar_top"));
        blockItem(MCPlusBlocks.CHERT_PILLAR_BASE);
        //LIMESTONE
        blockWithItem(MCPlusBlocks.LIMESTONE);
        blockWithItem(MCPlusBlocks.COBBLED_LIMESTONE);
        blockWithItem(MCPlusBlocks.LICHENY_COBBLED_LIMESTONE);
        blockWithItem(MCPlusBlocks.LIMESTONE_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_LIMESTONE_BRICKS);
        blockWithItem(MCPlusBlocks.LICHENY_LIMESTONE_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_LIMESTONE);
        blockWithItem(MCPlusBlocks.CHISELED_LIMESTONE);
        blockWithItem(MCPlusBlocks.LIMESTONE_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_LIMESTONE_TILES);
        blockWithItem(MCPlusBlocks.LICHENY_LIMESTONE_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_LIMESTONE);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.LIMESTONE_PILLAR.get()), blockTexture(MCPlusBlocks.LIMESTONE_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/limestone_pillar_top"));
        blockItem(MCPlusBlocks.LIMESTONE_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.LIMESTONE_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.LIMESTONE_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/limestone_pillar_top"));
        blockItem(MCPlusBlocks.LIMESTONE_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.LIMESTONE_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.LIMESTONE_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/limestone_pillar_top"));
        blockItem(MCPlusBlocks.LIMESTONE_PILLAR_BASE);
        //GABBRO
        blockWithItem(MCPlusBlocks.GABBRO);
        //  blockWithItem(MCPlusBlocks.COBBLED_SLATE);
        //  blockWithItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE);
        blockWithItem(MCPlusBlocks.GABBRO_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_GABBRO_BRICKS);
       // blockWithItem(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_GABBRO);
        blockWithItem(MCPlusBlocks.CHISELED_GABBRO);
        blockWithItem(MCPlusBlocks.GABBRO_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_GABBRO_TILES);
      //  blockWithItem(MCPlusBlocks.CRYSTALLINE_CHERT_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_GABBRO);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GABBRO_PILLAR.get()), blockTexture(MCPlusBlocks.GABBRO_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/gabbro_pillar_top"));
        blockItem(MCPlusBlocks.GABBRO_PILLAR);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GABBRO_PILLAR_CAPITAL.get()), blockTexture(MCPlusBlocks.GABBRO_PILLAR_CAPITAL.get()), new ResourceLocation(MCPlus.MODID, "block/gabbro_pillar_top"));
        blockItem(MCPlusBlocks.GABBRO_PILLAR_CAPITAL);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.GABBRO_PILLAR_BASE.get()), blockTexture(MCPlusBlocks.GABBRO_PILLAR_BASE.get()), new ResourceLocation(MCPlus.MODID, "block/gabbro_pillar_top"));
        blockItem(MCPlusBlocks.GABBRO_PILLAR_BASE);


        //MUSHROOMS
        //MUSHROOM BLOCKS
        blockWithItem(NatureBlocks.MUSHROOM_GROWING_BOX);
        simpleBlockWithItem(NatureBlocks.GIANT_PUFFBALL.get(), models().cross(blockTexture(NatureBlocks.GIANT_PUFFBALL.get()).getPath(), blockTexture(NatureBlocks.GIANT_PUFFBALL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_GIANT_PUFFBALL.get(), models().singleTexture("potted_giant_puffball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.GIANT_PUFFBALL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.INDIGO_MILKCAP.get(), models().cross(blockTexture(NatureBlocks.INDIGO_MILKCAP.get()).getPath(), blockTexture(NatureBlocks.INDIGO_MILKCAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_INDIGO_MILKCAP.get(), models().singleTexture("potted_indigo_milkcap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.INDIGO_MILKCAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.GRAY_MOREL.get(), models().cross(blockTexture(NatureBlocks.GRAY_MOREL.get()).getPath(), blockTexture(NatureBlocks.GRAY_MOREL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_GRAY_MOREL.get(), models().singleTexture("potted_gray_morel", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.GRAY_MOREL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.INKY_CAP.get(), models().cross(blockTexture(NatureBlocks.INKY_CAP.get()).getPath(), blockTexture(NatureBlocks.INKY_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_INKY_CAP.get(), models().singleTexture("potted_inky_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.INKY_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.DESERT_SHAGGY_MANE.get(), models().cross(blockTexture(NatureBlocks.DESERT_SHAGGY_MANE.get()).getPath(), blockTexture(NatureBlocks.DESERT_SHAGGY_MANE.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_DESERT_SHAGGY_MANE.get(), models().singleTexture("potted_desert_shaggy_mane", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.DESERT_SHAGGY_MANE.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.PORTABELLA.get(), models().cross(blockTexture(NatureBlocks.PORTABELLA.get()).getPath(), blockTexture(NatureBlocks.PORTABELLA.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_PORTABELLA.get(), models().singleTexture("potted_portabella", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.PORTABELLA.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.SANDY_STILTBALL.get(), models().cross(blockTexture(NatureBlocks.SANDY_STILTBALL.get()).getPath(), blockTexture(NatureBlocks.SANDY_STILTBALL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_SANDY_STILTBALL.get(), models().singleTexture("potted_sandy_stiltball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.SANDY_STILTBALL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.BLACK_TRUFFLE.get(), models().cross(blockTexture(NatureBlocks.BLACK_TRUFFLE.get()).getPath(), blockTexture(NatureBlocks.BLACK_TRUFFLE.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_BLACK_TRUFFLE.get(), models().singleTexture("potted_black_truffle", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.BLACK_TRUFFLE.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.LILAC_BONNETS.get(), models().cross(blockTexture(NatureBlocks.LILAC_BONNETS.get()).getPath(), blockTexture(NatureBlocks.LILAC_BONNETS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_LILAC_BONNETS.get(), models().singleTexture("potted_lilac_bonnets", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.LILAC_BONNETS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.BASKET_STINKHORN.get(), models().cross(blockTexture(NatureBlocks.BASKET_STINKHORN.get()).getPath(), blockTexture(NatureBlocks.BASKET_STINKHORN.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_BASKET_STINKHORN.get(), models().singleTexture("potted_basket_stinkhorn", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.BASKET_STINKHORN.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.FIRE_CORAL.get(), models().cross(blockTexture(NatureBlocks.FIRE_CORAL.get()).getPath(), blockTexture(NatureBlocks.FIRE_CORAL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_FIRE_CORAL.get(), models().singleTexture("potted_fire_coral", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.FIRE_CORAL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.GLOWING_MUSHROOMS.get(), models().cross(blockTexture(NatureBlocks.GLOWING_MUSHROOMS.get()).getPath(), blockTexture(NatureBlocks.GLOWING_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_GLOWING_MUSHROOMS.get(), models().singleTexture("potted_glowing_mushrooms", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.GLOWING_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.YELLOW_PARASOLS.get(), models().cross(blockTexture(NatureBlocks.YELLOW_PARASOLS.get()).getPath(), blockTexture(NatureBlocks.YELLOW_PARASOLS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_YELLOW_PARASOLS.get(), models().singleTexture("potted_yellow_parasols", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.YELLOW_PARASOLS.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.DEATH_CAP.get(), models().cross(blockTexture(NatureBlocks.DEATH_CAP.get()).getPath(), blockTexture(NatureBlocks.DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_DEATH_CAP.get(), models().singleTexture("potted_death_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.FALSE_DEATH_CAP.get(), models().cross(blockTexture(NatureBlocks.FALSE_DEATH_CAP.get()).getPath(), blockTexture(NatureBlocks.FALSE_DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_FALSE_DEATH_CAP.get(), models().singleTexture("potted_false_death_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.FALSE_DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.DESTROYING_ANGEL.get(), models().cross(blockTexture(NatureBlocks.DESTROYING_ANGEL.get()).getPath(), blockTexture(NatureBlocks.DESTROYING_ANGEL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_DESTROYING_ANGEL.get(), models().singleTexture("potted_destroying_angel", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.DESTROYING_ANGEL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.EARTHBALL.get(), models().cross(blockTexture(NatureBlocks.EARTHBALL.get()).getPath(), blockTexture(NatureBlocks.EARTHBALL.get())).renderType("cutout"));
        simpleBlockWithItem(NatureBlocks.POTTED_EARTHBALL.get(), models().singleTexture("potted_earthball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(NatureBlocks.EARTHBALL.get())).renderType("cutout"));


    }




    private void blockWithItem(RegistryObject<Block> blockRegistryObject)  {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MCPlus.MODID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }



}
