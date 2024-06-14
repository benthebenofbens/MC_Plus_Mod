package com.btbob.mcplus.blocks.entity;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.NatureBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MCPlus.MODID);

    public static final RegistryObject<BlockEntityType<MushroomGrowingBoxBlockEntity>> MUSHROOM_GROWING_BE =
            BLOCK_ENTITIES.register("mushroom_growing_be",() ->
                    BlockEntityType.Builder.of(MushroomGrowingBoxBlockEntity::new,
                            NatureBlocks.MUSHROOM_GROWING_BOX.get()).build(null));



    public static void register(IEventBus eventBus) { BLOCK_ENTITIES.register(eventBus);}
}
