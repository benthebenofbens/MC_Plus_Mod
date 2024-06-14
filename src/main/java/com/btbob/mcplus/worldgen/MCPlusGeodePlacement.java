package com.btbob.mcplus.worldgen;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class MCPlusGeodePlacement {
    private static List<PlacementModifier> geodePlacement(RarityFilter pChance, PlacementModifier heightmap) {
        return List.of(pChance, InSquarePlacement.spread(), heightmap, BiomeFilter.biome());

    }

    public static List<PlacementModifier> commonGeodePlacement(PlacementModifier pHeightRange) {
        return geodePlacement(RarityFilter.onAverageOnceEvery(24), pHeightRange);
    }
}
