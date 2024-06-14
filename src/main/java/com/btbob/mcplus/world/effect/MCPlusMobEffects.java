package com.btbob.mcplus.world.effect;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.world.effect.custom.MushroomPoisoningMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MCPlusMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MCPlus.MODID);

    public static final RegistryObject<MobEffect> MUSHROOM_POISONING = registerEffect("mushroom_poisoning", () -> new MushroomPoisoningMobEffect(MobEffectCategory.HARMFUL, 6836818));



    private static <T extends MobEffect> RegistryObject<T> registerEffect(String name, Supplier<T> effect) {
        RegistryObject<T> toReturn = MOB_EFFECT.register(name, effect);
        return toReturn;
    }


    public static void register(IEventBus eventBus) {
        MOB_EFFECT.register(eventBus);
    }
}
