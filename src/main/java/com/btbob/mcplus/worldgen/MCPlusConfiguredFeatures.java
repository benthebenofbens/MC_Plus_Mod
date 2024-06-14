package com.btbob.mcplus.worldgen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class MCPlusConfiguredFeatures {


    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LIMESTONE_KEY = registerKey("ore_limestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MARBLE_KEY = registerKey("ore_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SLATE_KEY = registerKey("ore_slate");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_GABBRO_KEY = registerKey("ore_gabbro");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_CHERT_KEY = registerKey("ore_chert");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_GNEISS_KEY = registerKey("ore_gneiss");



    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> limestone = List.of(OreConfiguration.target(stoneReplaceable, MCPlusBlocks.LIMESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> slate = List.of(OreConfiguration.target(stoneReplaceable, MCPlusBlocks.SLATE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> gneiss = List.of(OreConfiguration.target(stoneReplaceable, MCPlusBlocks.GNEISS.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> marble = List.of(OreConfiguration.target(stoneReplaceable, MCPlusBlocks.MARBLE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> gabbro = List.of(OreConfiguration.target(deepslateReplaceable, MCPlusBlocks.GABBRO.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> chert = List.of(OreConfiguration.target(deepslateReplaceable, MCPlusBlocks.CHERT.get().defaultBlockState()));



        register(context, ORE_LIMESTONE_KEY, Feature.ORE, new OreConfiguration(limestone, 64));
        register(context, ORE_SLATE_KEY, Feature.ORE, new OreConfiguration(slate, 64));
        register(context, ORE_MARBLE_KEY, Feature.ORE, new OreConfiguration(marble, 64));
        register(context, ORE_CHERT_KEY, Feature.ORE, new OreConfiguration(chert, 64));
        register(context, ORE_GABBRO_KEY, Feature.ORE, new OreConfiguration(gabbro, 64));
        register(context, ORE_GNEISS_KEY, Feature.ORE, new OreConfiguration(gneiss, 64));


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MCPlus.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
