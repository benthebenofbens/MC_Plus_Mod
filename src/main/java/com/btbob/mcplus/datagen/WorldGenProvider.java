package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.worldgen.MCPlusBiomeModifiers;
import com.btbob.mcplus.worldgen.MCPlusConfiguredFeatures;
import com.btbob.mcplus.worldgen.MCPlusPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MCPlusConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, MCPlusPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, MCPlusBiomeModifiers::bootstrap)
            ;


    public WorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MCPlus.MODID));
    }
}
