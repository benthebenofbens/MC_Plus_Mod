package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> GNEISS_SMELTABLE = List.of(Blocks.GRANITE);

    public RecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE.get(),2).pattern("LC").pattern("CL").define('L', MCPlusBlocks.LIMESTONE.get()).define('C', MCPlusBlocks.CHERT.get()).unlockedBy(getHasName(MCPlusBlocks.LIMESTONE.get()), has(MCPlusBlocks.LIMESTONE.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.PAINTED_COBBLED_MARBLE.get()).requires(MCPlusBlocks.COBBLED_MARBLE.get()).requires(Items.LAPIS_LAZULI).unlockedBy(getHasName(MCPlusBlocks.COBBLED_MARBLE.get()), has(MCPlusBlocks.COBBLED_MARBLE.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.PAINTED_MARBLE_BRICKS.get()).requires(MCPlusBlocks.MARBLE_BRICKS.get()).requires(Items.LAPIS_LAZULI).unlockedBy(getHasName(MCPlusBlocks.MARBLE_BRICKS.get()), has(MCPlusBlocks.MARBLE_BRICKS.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.PAINTED_MARBLE_TILES.get()).requires(MCPlusBlocks.MARBLE_TILES.get()).requires(Items.LAPIS_LAZULI).unlockedBy(getHasName(MCPlusBlocks.MARBLE_TILES.get()), has(MCPlusBlocks.MARBLE_TILES.get())).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_MARBLE.get(), MCPlusBlocks.MARBLE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_MARBLE.get(), MCPlusBlocks.COBBLED_MARBLE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_BRICKS.get(), MCPlusBlocks.POLISHED_MARBLE.get());
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_BRICKS.get(), MCPlusBlocks.POLISHED_MARBLE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR.get(), MCPlusBlocks.POLISHED_MARBLE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_TILES.get(), MCPlusBlocks.POLISHED_MARBLE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get(), MCPlusBlocks.MARBLE_PILLAR.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_BASE.get(), MCPlusBlocks.MARBLE_PILLAR.get(), 1);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_MARBLE_TILES.get(), MCPlusBlocks.MARBLE_TILES.get());
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_MARBLE_BRICKS.get(), MCPlusBlocks.MARBLE_BRICKS.get());

        //GNEISS
        oreBlasting(pRecipeOutput, GNEISS_SMELTABLE, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS.get(), 0.1F, 200, "gneiss");
        stairSlabWall(pRecipeOutput, MCPlusBlocks.GNEISS.get(), MCPlusBlocks.GNEISS_SLAB.get(), MCPlusBlocks.GNEISS_STAIRS.get(), MCPlusBlocks.GNEISS_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.COBBLED_GNEISS.get(), MCPlusBlocks.COBBLED_GNEISS_SLAB.get(), MCPlusBlocks.COBBLED_GNEISS_STAIRS.get(), MCPlusBlocks.COBBLED_GNEISS_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get(), MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB.get(), MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_STAIRS.get(), MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.GNEISS_BRICKS.get(), MCPlusBlocks.GNEISS_BRICK_SLAB.get(), MCPlusBlocks.GNEISS_BRICK_STAIRS.get(), MCPlusBlocks.GNEISS_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.CRACKED_GNEISS_BRICKS.get(), MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB.get(), MCPlusBlocks.CRACKED_GNEISS_BRICK_STAIRS.get(), MCPlusBlocks.CRACKED_GNEISS_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get(), MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB.get(), MCPlusBlocks.ENERGIZED_GNEISS_BRICK_STAIRS.get(), MCPlusBlocks.ENERGIZED_GNEISS_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.GNEISS_TILES.get(), MCPlusBlocks.GNEISS_TILE_SLAB.get(), MCPlusBlocks.GNEISS_TILE_STAIRS.get(), MCPlusBlocks.GNEISS_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.CRACKED_GNEISS_TILES.get(), MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB.get(), MCPlusBlocks.CRACKED_GNEISS_TILE_STAIRS.get(), MCPlusBlocks.CRACKED_GNEISS_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.ENERGIZED_GNEISS_TILES.get(), MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB.get(), MCPlusBlocks.ENERGIZED_GNEISS_TILE_STAIRS.get(), MCPlusBlocks.ENERGIZED_GNEISS_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.POLISHED_GNEISS.get(), MCPlusBlocks.POLISHED_GNEISS_SLAB.get(), MCPlusBlocks.POLISHED_GNEISS_STAIRS.get(), MCPlusBlocks.POLISHED_GNEISS_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.SMOOTH_GNEISS.get(), MCPlusBlocks.SMOOTH_GNEISS_SLAB.get(), MCPlusBlocks.SMOOTH_GNEISS_STAIRS.get(), MCPlusBlocks.SMOOTH_GNEISS_WALL.get());
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_GNEISS.get(), MCPlusBlocks.GNEISS.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_GNEISS.get(), MCPlusBlocks.COBBLED_GNEISS.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_BRICKS.get(), MCPlusBlocks.POLISHED_GNEISS.get());
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_BRICKS.get(), MCPlusBlocks.POLISHED_GNEISS.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_PILLAR.get(), MCPlusBlocks.POLISHED_GNEISS.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_TILES.get(), MCPlusBlocks.POLISHED_GNEISS.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get(), MCPlusBlocks.GNEISS_PILLAR.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_PILLAR_BASE.get(), MCPlusBlocks.GNEISS_PILLAR.get(), 1);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_GNEISS_TILES.get(), MCPlusBlocks.GNEISS_TILES.get());
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_GNEISS_BRICKS.get(), MCPlusBlocks.GNEISS_BRICKS.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.COBBLED_GNEISS.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.COBBLED_GNEISS.get()), has(MCPlusBlocks.COBBLED_GNEISS.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.GNEISS_BRICKS.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.GNEISS_BRICKS.get()), has(MCPlusBlocks.GNEISS_BRICKS.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_GNEISS_TILES.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.GNEISS_TILES.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.GNEISS_TILES.get()), has(MCPlusBlocks.GNEISS_TILES.get())).save(pRecipeOutput);

        //SLATE
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE.get(),2).pattern("SD").pattern("DS").define('S', Blocks.STONE).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        stairSlabWall(pRecipeOutput, MCPlusBlocks.SLATE.get(), MCPlusBlocks.SLATE_SLAB.get(), MCPlusBlocks.SLATE_STAIRS.get(), MCPlusBlocks.SLATE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.COBBLED_SLATE.get(), MCPlusBlocks.COBBLED_SLATE_SLAB.get(), MCPlusBlocks.COBBLED_SLATE_STAIRS.get(), MCPlusBlocks.COBBLED_SLATE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get(), MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB.get(), MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_STAIRS.get(), MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.SLATE_BRICKS.get(), MCPlusBlocks.SLATE_BRICK_SLAB.get(), MCPlusBlocks.SLATE_BRICK_STAIRS.get(), MCPlusBlocks.SLATE_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.CRACKED_SLATE_BRICKS.get(), MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB.get(), MCPlusBlocks.CRACKED_SLATE_BRICK_STAIRS.get(), MCPlusBlocks.CRACKED_SLATE_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get(), MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB.get(), MCPlusBlocks.BEDAZZLED_SLATE_BRICK_STAIRS.get(), MCPlusBlocks.BEDAZZLED_SLATE_BRICK_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.SLATE_TILES.get(), MCPlusBlocks.SLATE_TILE_SLAB.get(), MCPlusBlocks.SLATE_TILE_STAIRS.get(), MCPlusBlocks.SLATE_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.CRACKED_SLATE_TILES.get(), MCPlusBlocks.CRACKED_SLATE_TILE_SLAB.get(), MCPlusBlocks.CRACKED_SLATE_TILE_STAIRS.get(), MCPlusBlocks.CRACKED_SLATE_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.BEDAZZLED_SLATE_TILES.get(), MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB.get(), MCPlusBlocks.BEDAZZLED_SLATE_TILE_STAIRS.get(), MCPlusBlocks.BEDAZZLED_SLATE_TILE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.POLISHED_SLATE.get(), MCPlusBlocks.POLISHED_SLATE_SLAB.get(), MCPlusBlocks.POLISHED_SLATE_STAIRS.get(), MCPlusBlocks.POLISHED_SLATE_WALL.get());
        stairSlabWall(pRecipeOutput, MCPlusBlocks.SMOOTH_SLATE.get(), MCPlusBlocks.SMOOTH_SLATE_SLAB.get(), MCPlusBlocks.SMOOTH_SLATE_STAIRS.get(), MCPlusBlocks.SMOOTH_SLATE_WALL.get());
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_SLATE.get(), MCPlusBlocks.SLATE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_SLATE.get(), MCPlusBlocks.COBBLED_SLATE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_BRICKS.get(), MCPlusBlocks.POLISHED_SLATE.get());
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_BRICKS.get(), MCPlusBlocks.POLISHED_SLATE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_PILLAR.get(), MCPlusBlocks.POLISHED_SLATE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_TILES.get(), MCPlusBlocks.POLISHED_SLATE.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_PILLAR_CAPITAL.get(), MCPlusBlocks.SLATE_PILLAR.get(), 1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_PILLAR_BASE.get(), MCPlusBlocks.SLATE_PILLAR.get(), 1);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_SLATE_TILES.get(), MCPlusBlocks.SLATE_TILES.get());
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.CRACKED_SLATE_BRICKS.get(), MCPlusBlocks.SLATE_BRICKS.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()).requires(MCPlusBlocks.COBBLED_SLATE.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.COBBLED_SLATE.get()), has(MCPlusBlocks.COBBLED_SLATE.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()).requires(MCPlusBlocks.SLATE_BRICKS.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.SLATE_BRICKS.get()), has(MCPlusBlocks.SLATE_BRICKS.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()).requires(MCPlusBlocks.SLATE_TILES.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.SLATE_TILES.get()), has(MCPlusBlocks.SLATE_TILES.get())).save(pRecipeOutput);

        //LIMESTONE
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.LIMESTONE.get(),2).pattern("SC").pattern("CS").define('S', Blocks.SANDSTONE).define('C',Blocks.CALCITE).unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE)).save(pRecipeOutput);
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_LIMESTONE.get(), MCPlusBlocks.COBBLED_LIMESTONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CHERT.get()).requires(Blocks.DEEPSLATE).requires(Items.QUARTZ).unlockedBy(getHasName(Items.DEEPSLATE), has(Items.DEEPSLATE)).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_CHERT.get(), MCPlusBlocks.CHERT.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_CHERT.get(), MCPlusBlocks.CHERT.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get()).requires(MCPlusBlocks.CHERT_BRICKS.get()).requires(Items.AMETHYST_SHARD).unlockedBy(getHasName(MCPlusBlocks.CHERT_BRICKS.get()), has(MCPlusBlocks.CHERT_BRICKS.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get()).requires(MCPlusBlocks.CHERT_TILES.get()).requires(Items.AMETHYST_SHARD).unlockedBy(getHasName(MCPlusBlocks.CHERT_TILES.get()), has(MCPlusBlocks.CHERT_TILES.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GABBRO.get(),2).pattern("BD").pattern("DB").define('B', Blocks.BASALT).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_GABBRO.get(), MCPlusBlocks.GABBRO.get());

    }


    protected static void stairSlabWall(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pBase, ItemLike pSlab, ItemLike pStair, ItemLike pWall) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pStair, 4).define('#', pBase).pattern("#  ").pattern("## ").pattern("###");
        slab(pFinishedRecipeConsumer, RecipeCategory.BUILDING_BLOCKS, pSlab, pBase);
        wall(pFinishedRecipeConsumer, RecipeCategory.BUILDING_BLOCKS, pWall, pBase);
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, MCPlus.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }





}
