package net.caiocesarmods.caiocesarbiomes.worldgen.feature;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModTreeFeatures;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModVegetationFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        ModTreeFeatures.bootstrap(context);
        ModVegetationFeatures.bootstrap(context);

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name));
    }
}
