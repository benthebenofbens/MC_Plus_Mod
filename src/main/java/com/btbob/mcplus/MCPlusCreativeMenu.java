package com.btbob.mcplus;

import com.btbob.mcplus.blocks.MCPlusBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                        pOutput.accept(MCPlusBlocks.COBBLED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_GNEISS_SLAB.get());
                        pOutput.accept(MCPlusBlocks.GNEISS_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_GNEISS_TILES.get());
                        pOutput.accept(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get());
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
                        pOutput.accept(MCPlusBlocks.COBBLED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get());
                        pOutput.accept(MCPlusBlocks.POLISHED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.CHISELED_SLATE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE.get());
                        pOutput.accept(MCPlusBlocks.SMOOTH_SLATE_SLAB.get());
                        pOutput.accept(MCPlusBlocks.SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.CRACKED_SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR.get());
                        pOutput.accept(MCPlusBlocks.SLATE_PILLAR_BASE.get());
                        //LIMESTONE
                        pOutput.accept(MCPlusBlocks.LIMESTONE.get());
                        //GABBRO
                        pOutput.accept(MCPlusBlocks.GABBRO.get());
                        //CHERT
                        pOutput.accept(MCPlusBlocks.CHERT.get());
                     //   pOutput.accept(MCPlusBlocks.COBBLED_SLATE.get());
                      //  pOutput.accept(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get());
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
                     //   pOutput.accept(MCPlusBlocks.SLATE_PILLAR_CAPITAL.get());
                     //   pOutput.accept(MCPlusBlocks.SLATE_PILLAR.get());
                      //  pOutput.accept(MCPlusBlocks.SLATE_PILLAR_BASE.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
