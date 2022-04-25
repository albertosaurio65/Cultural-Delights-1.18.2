package com.ncpbails.culturaldelights.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {
    public static final FoodProperties AVOCADO = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties CUT_AVOCADO = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.3F).fast().build();
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.5F).build();
    public static final FoodProperties CUT_CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.9F).fast().build();
    public static final FoodProperties PICKLE = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties CUT_PICKLE = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5F).fast().build();
    public static final FoodProperties EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties CUT_EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(8).saturationMod(0.4F).fast().build();
    public static final FoodProperties SMOKED_EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.8F).build();
    public static final FoodProperties SMOKED_TOMATO = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties SMOKED_CORN = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties SMOKED_CUT_EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.8F).fast().build();
    public static final FoodProperties SMOKED_WHITE_EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.8F).build();
    public static final FoodProperties WHITE_EGGPLANT = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties CORN_COB = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties POPCORN = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.2F).fast().build();
    public static final FoodProperties CORN_DOUGH = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties TORTILLA = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties TORTILLA_CHIPS = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.3F).fast().build();

    public static final FoodProperties ELOTE = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.8F).build();
    public static final FoodProperties HEARTY_SALAD = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(1.1F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties BEEF_BURRITO = (new FoodProperties.Builder()).fast().nutrition(14).saturationMod(0.7F).build();
    public static final FoodProperties MUTTON_SANDWICH = (new FoodProperties.Builder()).fast().nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties FRIED_EGGPLANT_PASTA = (new FoodProperties.Builder()).fast().nutrition(12).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties EGGPLANT_BURGER = (new FoodProperties.Builder()).fast().nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties AVOCADO_TOAST = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5F).build();

    public static final FoodProperties VEGETABLE_MAKI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties TAMAGO = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties CHICKEN_MAKI = (new FoodProperties.Builder()).fast().nutrition(10).saturationMod(1F).build();
    public static final FoodProperties COD_MAKI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties KOI_NIGIRI = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.5F).build();
    public static final FoodProperties LIONFISH_MAKI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties PERCH_NIGIRI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.25F).build();
    public static final FoodProperties PIKE_MAKI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties PUFFERFISH_NIGIRI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 1), 1.0F).build();
    public static final FoodProperties SALMON_NIGIRI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties TROPICAL_NIGIRI = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.15F).build();
    public static final FoodProperties ONIGIRI = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.5F).build();

}