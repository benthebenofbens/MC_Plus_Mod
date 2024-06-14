package com.btbob.mcplus.worldgen;

import com.btbob.mcplus.MCPlus;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class MCPlusPlacedFeatures {


    public static final ResourceKey<PlacedFeature> UPPER_LIMESTONE_PLACED_KEY = registerKey("upper_limestone_placed");
    public static final ResourceKey<PlacedFeature> LOWER_LIMESTONE_PLACED_KEY = registerKey("lower_limestone_placed");
    public static final ResourceKey<PlacedFeature> UPPER_SLATE_PLACED_KEY = registerKey("upper_slate_placed");
    public static final ResourceKey<PlacedFeature> LOWER_SLATE_PLACED_KEY = registerKey("lower_slate_placed");

    public static final ResourceKey<PlacedFeature> MARBLE_PLACED_KEY = registerKey("marble_placed");
    public static final ResourceKey<PlacedFeature> CHERT_PLACED_KEY = registerKey("chert_placed");
    public static final ResourceKey<PlacedFeature> GABBRO_PLACED_KEY = registerKey("gabbro_placed");
    public static final ResourceKey<PlacedFeature> GNEISS_PLACED_KEY = registerKey("gneiss_placed");



    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


        register(context, UPPER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_LIMESTONE_KEY), MCPlusOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, LOWER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_LIMESTONE_KEY), MCPlusOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, UPPER_SLATE_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_SLATE_KEY), MCPlusOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, LOWER_SLATE_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_SLATE_KEY), MCPlusOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, MARBLE_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_MARBLE_KEY), MCPlusOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, GNEISS_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_GNEISS_KEY), MCPlusOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, GABBRO_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_GABBRO_KEY), MCPlusOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, CHERT_PLACED_KEY, configuredFeatures.getOrThrow(MCPlusConfiguredFeatures.ORE_CHERT_KEY), MCPlusOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));

    }



    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MCPlus.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
