package com.btbob.mcplus;

import com.btbob.mcplus.blocks.MCPlusBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.blocks.entity.ModBlockEntities;
import com.btbob.mcplus.items.MCPlusItems;
import com.btbob.mcplus.screen.MCPlusMenuTypes;
import com.btbob.mcplus.screen.MushroomGrowingBoxScreen;
import com.btbob.mcplus.util.MCPlusCreativeMenu;
import com.btbob.mcplus.world.effect.MCPlusMobEffects;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCPlus.MODID)
public class MCPlus
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mcplus";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public MCPlus()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MCPlusCreativeMenu.register(modEventBus);
        MCPlusItems.register(modEventBus);
        MCPlusBlocks.register(modEventBus);
        NatureBlocks.register(modEventBus);

        MCPlusMobEffects.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        MCPlusMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.INKY_CAP.getId(), NatureBlocks.POTTED_INKY_CAP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.GIANT_PUFFBALL.getId(), NatureBlocks.POTTED_GIANT_PUFFBALL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.GRAY_MOREL.getId(), NatureBlocks.POTTED_GRAY_MOREL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.BASKET_STINKHORN.getId(), NatureBlocks.POTTED_BASKET_STINKHORN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.INDIGO_MILKCAP.getId(), NatureBlocks.POTTED_INDIGO_MILKCAP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.DEATH_CAP.getId(), NatureBlocks.POTTED_DEATH_CAP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.DESTROYING_ANGEL.getId(), NatureBlocks.POTTED_DESTROYING_ANGEL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.EARTHBALL.getId(), NatureBlocks.POTTED_EARTHBALL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.FALSE_DEATH_CAP.getId(), NatureBlocks.POTTED_FALSE_DEATH_CAP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.DESERT_SHAGGY_MANE.getId(), NatureBlocks.POTTED_DESERT_SHAGGY_MANE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.PORTABELLA.getId(), NatureBlocks.POTTED_PORTABELLA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.SANDY_STILTBALL.getId(), NatureBlocks.POTTED_SANDY_STILTBALL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.BLACK_TRUFFLE.getId(), NatureBlocks.POTTED_BLACK_TRUFFLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.LILAC_BONNETS.getId(), NatureBlocks.POTTED_LILAC_BONNETS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.FIRE_CORAL.getId(), NatureBlocks.POTTED_FIRE_CORAL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.GLOWING_MUSHROOMS.getId(), NatureBlocks.POTTED_GLOWING_MUSHROOMS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(NatureBlocks.YELLOW_PARASOLS.getId(), NatureBlocks.POTTED_YELLOW_PARASOLS);
        });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(MCPlusMenuTypes.MUSHROOM_GROWING_BOX_MENU.get(), MushroomGrowingBoxScreen::new);

            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
