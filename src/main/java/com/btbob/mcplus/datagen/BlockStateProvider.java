package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
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
        blockWithItem(MCPlusBlocks.COBBLED_GNEISS);
        blockWithItem(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS);
        blockWithItem(MCPlusBlocks.GNEISS_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_GNEISS_BRICKS);
        blockWithItem(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_GNEISS);
        blockWithItem(MCPlusBlocks.CHISELED_GNEISS);
        blockWithItem(MCPlusBlocks.GNEISS_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_GNEISS_TILES);
        blockWithItem(MCPlusBlocks.ENERGIZED_GNEISS_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_GNEISS);
        //axisBlock(((RotatedPillarBlock) MCPlusBlocks.GNEISS_PILLAR.get()), blockTexture(MCPlusBlocks.GNEISS_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/gneiss_pillar_top"));
        //blockItem(MCPlusBlocks.GNEISS_PILLAR);
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
        blockWithItem(MCPlusBlocks.COBBLED_SLATE);
        blockWithItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE);
        blockWithItem(MCPlusBlocks.SLATE_BRICKS);
        blockWithItem(MCPlusBlocks.CRACKED_SLATE_BRICKS);
        blockWithItem(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS);
        blockWithItem(MCPlusBlocks.POLISHED_SLATE);
        blockWithItem(MCPlusBlocks.CHISELED_SLATE);
        blockWithItem(MCPlusBlocks.SLATE_TILES);
        blockWithItem(MCPlusBlocks.CRACKED_SLATE_TILES);
        blockWithItem(MCPlusBlocks.BEDAZZLED_SLATE_TILES);
        blockWithItem(MCPlusBlocks.SMOOTH_SLATE);
        axisBlock(((RotatedPillarBlock) MCPlusBlocks.SLATE_PILLAR.get()), blockTexture(MCPlusBlocks.SLATE_PILLAR.get()), new ResourceLocation(MCPlus.MODID, "block/slate_pillar_top"));
        blockItem(MCPlusBlocks.SLATE_PILLAR);
        //CHERT
        blockWithItem(MCPlusBlocks.CHERT);
        //LIMESTONE
        blockWithItem(MCPlusBlocks.LIMESTONE);
        //GABBRO
        blockWithItem(MCPlusBlocks.GABBRO);
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
