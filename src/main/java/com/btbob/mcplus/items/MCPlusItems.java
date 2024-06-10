package com.btbob.mcplus.items;

import com.btbob.mcplus.MCPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MCPlusItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPlus.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
