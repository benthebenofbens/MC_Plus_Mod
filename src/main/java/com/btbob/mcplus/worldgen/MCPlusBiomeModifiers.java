package com.btbob.mcplus.worldgen;

import com.btbob.mcplus.MCPlus;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class MCPlusBiomeModifiers {



    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_UPPER = registerKey("add_limestone_upper");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_LOWER = registerKey("add_limestone_lower");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE = registerKey("add_marble");

    public static final ResourceKey<BiomeModifier> ADD_SLATE_UPPER = registerKey("add_slate_upper");
    public static final ResourceKey<BiomeModifier> ADD_SLATE_LOWER = registerKey("add_slate_lower");

    public static final ResourceKey<BiomeModifier> ADD_GABBRO = registerKey("add_gabbro");
    public static final ResourceKey<BiomeModifier> ADD_CHERT = registerKey("add_chert");
    public static final ResourceKey<BiomeModifier> ADD_GNEISS = registerKey("add_gneiss");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SLATE_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.UPPER_SLATE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SLATE_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.LOWER_SLATE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LIMESTONE_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.UPPER_LIMESTONE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LIMESTONE_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.LOWER_LIMESTONE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_MOUNTAIN), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.MARBLE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GNEISS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_BADLANDS), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.GNEISS_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CHERT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.CHERT_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GABBRO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(MCPlusPlacedFeatures.GABBRO_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MCPlus.MODID, name));
    }
}
