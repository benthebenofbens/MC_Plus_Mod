package com.btbob.mcplus.items;

import com.btbob.mcplus.world.effect.MCPlusMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class MCPlusFoods {
    public static final FoodProperties EDIBLE_MUSHROOM = new FoodProperties.Builder().nutrition(3).saturationMod(.3f).build();
    public static final FoodProperties AFUNGUS = new FoodProperties.Builder().nutrition(3).saturationMod(.3f).effect(() -> new MobEffectInstance(MCPlusMobEffects.MUSHROOM_POISONING.get(), 500, 1), .25F).build();
    public static final FoodProperties GLOWING_MUSHROOM = new FoodProperties.Builder().nutrition(3).saturationMod(.3f).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1F).build();
    public static final FoodProperties INEDIBLE_MUSHROOM = new FoodProperties.Builder().nutrition(1).saturationMod(.3f).effect(() -> new MobEffectInstance(MCPlusMobEffects.MUSHROOM_POISONING.get(), 100,0), .3F).build();
    public static final FoodProperties POISON_MUSHROOM = new FoodProperties.Builder().nutrition(1).fast().saturationMod(.3f).effect(() -> new MobEffectInstance(MCPlusMobEffects.MUSHROOM_POISONING.get(), 250, 0), 1f).build();
    public static final FoodProperties DEADLY_MUSHROOM = new FoodProperties.Builder().nutrition(1).fast().saturationMod(.3f).effect(() -> new MobEffectInstance(MCPlusMobEffects.MUSHROOM_POISONING.get(), 500, 1), 1f).build();

    public static final FoodProperties MUSHROOM_SPORES = new FoodProperties.Builder().nutrition(0).saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100,1), 1F).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 100,0), 1F).build();


}
