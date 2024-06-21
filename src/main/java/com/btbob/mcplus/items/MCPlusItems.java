package com.btbob.mcplus.items;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.custom.MushroomStandingAndWallBlockItem;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MCPlusItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPlus.MODID);

    public static final RegistryObject<Item> INDIGO_MILKCAP_SPORES = ITEMS.register("indigo_milkcap_spores", () -> new Item(new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> CHICKEN_OF_THE_WOODS_SPORES = ITEMS.register("chicken_of_the_woods_spores", () -> new Item(new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> FIRE_CORAL_SPORES = ITEMS.register("fire_coral_spores", () -> new Item(new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> AFUNGUS_SPORES = ITEMS.register("afungus_spores", () -> new Item(new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));

    public static final RegistryObject<BlockItem> FIRE_CORAL = ITEMS.register("fire_coral_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.FIRE_CORAL.get(), NatureBlocks.FIRE_CORAL_WALL.get(), new Item.Properties().food(MCPlusFoods.DEADLY_MUSHROOM), Direction.DOWN));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
