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
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_MARBLE.get(), MCPlusBlocks.MARBLE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_MARBLE.get(), MCPlusBlocks.COBBLED_MARBLE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_BASE.get(),1).pattern("P").pattern("S").define('P', MCPlusBlocks.MARBLE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_MARBLE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.MARBLE_PILLAR.get()), has(MCPlusBlocks.MARBLE_PILLAR.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get(),1).pattern("S").pattern("P").define('P', MCPlusBlocks.MARBLE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_MARBLE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.MARBLE_PILLAR.get()), has(MCPlusBlocks.MARBLE_PILLAR.get())).save(pRecipeOutput);


        oreBlasting(pRecipeOutput, GNEISS_SMELTABLE, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS.get(), 0.1F, 200, "gneiss");
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_GNEISS.get(), MCPlusBlocks.GNEISS.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_GNEISS.get(), MCPlusBlocks.COBBLED_GNEISS.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_PILLAR_BASE.get(),1).pattern("P").pattern("S").define('P', MCPlusBlocks.GNEISS_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_GNEISS_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.GNEISS_PILLAR.get()), has(MCPlusBlocks.GNEISS_PILLAR.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get(),1).pattern("S").pattern("P").define('P', MCPlusBlocks.GNEISS_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_GNEISS_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.GNEISS_PILLAR.get()), has(MCPlusBlocks.GNEISS_PILLAR.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.COBBLED_GNEISS.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.COBBLED_GNEISS.get()), has(MCPlusBlocks.COBBLED_GNEISS.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.GNEISS_BRICKS.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.GNEISS_BRICKS.get()), has(MCPlusBlocks.GNEISS_BRICKS.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.ENERGIZED_GNEISS_TILES.get(),1).pattern("RRR").pattern("RGR").pattern("RRR").define('G', MCPlusBlocks.GNEISS_TILES.get()).define('R',Items.REDSTONE).unlockedBy(getHasName(MCPlusBlocks.GNEISS_TILES.get()), has(MCPlusBlocks.GNEISS_TILES.get())).save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE.get(),2).pattern("SD").pattern("DS").define('S', Blocks.STONE).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_SLATE.get(), MCPlusBlocks.SLATE.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_SLATE.get(), MCPlusBlocks.COBBLED_SLATE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_PILLAR_BASE.get(),1).pattern("P").pattern("S").define('P', MCPlusBlocks.SLATE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_SLATE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.SLATE_PILLAR.get()), has(MCPlusBlocks.SLATE_PILLAR.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE_PILLAR_CAPITAL.get(),1).pattern("S").pattern("P").define('P', MCPlusBlocks.SLATE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_SLATE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.SLATE_PILLAR.get()), has(MCPlusBlocks.SLATE_PILLAR.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get()).requires(MCPlusBlocks.COBBLED_SLATE.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.COBBLED_SLATE.get()), has(MCPlusBlocks.COBBLED_SLATE.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get()).requires(MCPlusBlocks.SLATE_BRICKS.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.SLATE_BRICKS.get()), has(MCPlusBlocks.SLATE_BRICKS.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.BEDAZZLED_SLATE_TILES.get()).requires(MCPlusBlocks.SLATE_TILES.get()).requires(Items.DIAMOND).unlockedBy(getHasName(MCPlusBlocks.SLATE_TILES.get()), has(MCPlusBlocks.SLATE_TILES.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.LIMESTONE.get(),2).pattern("SC").pattern("CS").define('S', Blocks.SAND).define('C',Blocks.CALCITE).unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE)).save(pRecipeOutput);
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_LIMESTONE.get(), MCPlusBlocks.COBBLED_LIMESTONE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CHERT.get()).requires(Blocks.DEEPSLATE).requires(Items.QUARTZ).unlockedBy(getHasName(Items.DEEPSLATE), has(Items.DEEPSLATE)).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_CHERT.get(), MCPlusBlocks.CHERT.get());
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_CHERT.get(), MCPlusBlocks.CHERT.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get()).requires(MCPlusBlocks.CHERT_BRICKS.get()).requires(Items.AMETHYST_SHARD).unlockedBy(getHasName(MCPlusBlocks.CHERT_BRICKS.get()), has(MCPlusBlocks.CHERT_BRICKS.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get()).requires(MCPlusBlocks.CHERT_TILES.get()).requires(Items.AMETHYST_SHARD).unlockedBy(getHasName(MCPlusBlocks.CHERT_TILES.get()), has(MCPlusBlocks.CHERT_TILES.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GABBRO.get(),2).pattern("BD").pattern("DB").define('B', Blocks.BASALT).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        polished(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.POLISHED_GABBRO.get(), MCPlusBlocks.GABBRO.get());

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
