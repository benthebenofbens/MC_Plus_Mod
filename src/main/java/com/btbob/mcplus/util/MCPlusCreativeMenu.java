package com.btbob.mcplus.util;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MCPlusCreativeMenu {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCPlus.MODID);

    //PLATINUM + ADDITIONAL ORES AND GEMSTONE LATER :>
    public static final RegistryObject<CreativeModeTab> MC_PLUS_TAB = CREATIVE_MODE_TABS.register("mc_plus_building_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MCPlusBlocks.GNEISS.get()))
                    .title(Component.translatable("creativetab.mc_plus_building_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //GNEISS
                        pOutput.accept(MCPlusBlocks.GNEISS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_WALL.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_GNEISS_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_GNEISS_WALL.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_WALL.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GNEISS_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GNEISS_WALL.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS_WALL.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_TILES.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_PILLAR_BASE.get());
                        //MARBLE
                        pOutput.accept(MCPlusBlocks.MARBLE.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_MARBLE.get());
                        pOutput.accept(MCPlusBlocks.PAINTED_COBBLED_MARBLE.get());
                        pOutput.accept(MCPlusBlocks.MARBLE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_MARBLE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.PAINTED_MARBLE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_MARBLE.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_MARBLE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_MARBLE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_MARBLE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.MARBLE_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_MARBLE_TILES.get());
                        pOutput.accept(MCPlusBlocks.PAINTED_MARBLE_TILES.get());
                        pOutput.accept(MCPlusBlocks.MARBLE_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.MARBLE_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.MARBLE_PILLAR_BASE.get());
                        //SLATE
                        pOutput.accept(MCPlusBlocks.SLATE.get());
                        pOutput.accept(MCPlusBlocks.SLATE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SLATE_WALL.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_SLATE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_SLATE_WALL.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_WALL.get());
                        pOutput.accept(MCPlusBlocks.SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.SLATE_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.SLATE_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SLATE_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_WALL.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_SLATE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_SLATE_WALL.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE_WALL.get());
                        pOutput.accept(MCPlusBlocks.SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.SLATE_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.SLATE_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SLATE_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_TILE_STAIRS.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_TILE_WALL.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR_BASE.get());
                        //LIMESTONE
                        pOutput.accept(MCPlusBlocks.LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.LICHENY_COBBLED_LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.LIMESTONE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_LIMESTONE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.LICHENY_LIMESTONE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_LIMESTONE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_LIMESTONE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.LIMESTONE_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_LIMESTONE_TILES.get());
                        pOutput.accept(MCPlusBlocks.LICHENY_LIMESTONE_TILES.get());
                        pOutput.accept(MCPlusBlocks.LIMESTONE_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.LIMESTONE_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.LIMESTONE_PILLAR_BASE.get());
                        //GABBRO
                        pOutput.accept(MCPlusBlocks.GABBRO.get());
                        //   pOutput.accept(MCPlusBlocks.COBBLED_SLATE.get());
                        //  pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.GABBRO_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GABBRO_BRICKS.get());
                       // pOutput.accept(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GABBRO.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_GABBRO.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GABBRO.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GABBRO_SLAB.get());
                        pOutput.accept(MCPlusBlocks.GABBRO_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GABBRO_TILES.get());
                      //  pOutput.accept(MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get());
                        pOutput.accept(MCPlusBlocks.GABBRO_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.GABBRO_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.GABBRO_PILLAR_BASE.get());
                        //CHERT
                        pOutput.accept(MCPlusBlocks.CHERT.get());
                        pOutput.accept(MCPlusBlocks.COBBLED_CHERT.get());
                        pOutput.accept(MCPlusBlocks.CRYSTALLINE_COBBLED_CHERT.get());
                        pOutput.accept(MCPlusBlocks.CHERT_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_CHERT_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRYSTALLINE_CHERT_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_CHERT.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_CHERT.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_CHERT.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_CHERT_SLAB.get());
                        pOutput.accept(MCPlusBlocks.CHERT_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_CHERT_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRYSTALLINE_CHERT_TILES.get());
                        pOutput.accept(MCPlusBlocks.CHERT_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.CHERT_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.CHERT_PILLAR_BASE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MC_PLUS_NATURE_TAB = CREATIVE_MODE_TABS.register("mc_plus_nature_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NatureBlocks.MUSHROOM_GROWING_BOX.get()))
                    .title(Component.translatable("creativetab.mc_plus_nature_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(NatureBlocks.MUSHROOM_GROWING_BOX.get());

                        pOutput.accept(MCPlusItems.CHICKEN_OF_THE_WOODS_SPORES.get());
                        pOutput.accept(NatureBlocks.CHICKEN_OF_THE_WOODS.get());
                        pOutput.accept(NatureBlocks.WOODY_CHICKEN_OF_THE_WOODS.get());

                        pOutput.accept(MCPlusItems.FIRE_CORAL_SPORES.get());
                        pOutput.accept(NatureBlocks.FIRE_CORAL.get());

                        pOutput.accept(Blocks.BROWN_MUSHROOM);
                        pOutput.accept(Blocks.RED_MUSHROOM);
                        pOutput.accept(NatureBlocks.AFUNGUS.get());
                        pOutput.accept(NatureBlocks.DEADLY_AFUNGUS.get());


                        pOutput.accept(MCPlusItems.INDIGO_MILKCAP_SPORES.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
