package com.btbob.mcplus.world.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class MushroomPoisoningMobEffect extends MobEffect {
    public MushroomPoisoningMobEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }



    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        super.applyEffectTick(pLivingEntity, pAmplifier);
        pLivingEntity.hurt(pLivingEntity.damageSources().wither(), 1.4F);

    }

}
