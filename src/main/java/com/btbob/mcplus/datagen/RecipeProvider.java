package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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

    //GROUPING PLATINUM SMELTABLES
    public RecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE.get(),2).pattern("LC").pattern("CL").define('L', MCPlusBlocks.LIMESTONE.get()).define('C', MCPlusBlocks.CHERT.get()).unlockedBy(getHasName(MCPlusBlocks.LIMESTONE.get()), has(MCPlusBlocks.LIMESTONE.get())).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_MARBLE.get(), MCPlusBlocks.MARBLE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_BASE.get(),1).pattern("P").pattern("S").define('P', MCPlusBlocks.MARBLE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_MARBLE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.MARBLE_PILLAR.get()), has(MCPlusBlocks.MARBLE_PILLAR.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get(),1).pattern("S").pattern("P").define('P', MCPlusBlocks.MARBLE_PILLAR.get()).define('S', MCPlusBlocks.SMOOTH_MARBLE_SLAB.get()).unlockedBy(getHasName(MCPlusBlocks.MARBLE_PILLAR.get()), has(MCPlusBlocks.MARBLE_PILLAR.get())).save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GNEISS.get(),2).pattern("GS").pattern("SG").define('G', Blocks.GRANITE).define('S',Blocks.RED_SAND).unlockedBy(getHasName(Blocks.GRANITE), has(Blocks.GRANITE)).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_GNEISS.get(), MCPlusBlocks.GNEISS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.SLATE.get(),2).pattern("SD").pattern("DS").define('S', Blocks.STONE).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        smeltingResultFromBase(pRecipeOutput, MCPlusBlocks.SMOOTH_SLATE.get(), MCPlusBlocks.SLATE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.LIMESTONE.get(),2).pattern("SC").pattern("CS").define('S', Blocks.SAND).define('C',Blocks.CALCITE).unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.CHERT.get()).pattern("DQ").define('Q', Items.QUARTZ).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MCPlusBlocks.GABBRO.get(),2).pattern("BD").pattern("DB").define('B', Blocks.BASALT).define('D',Blocks.DEEPSLATE).unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE)).save(pRecipeOutput);

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
