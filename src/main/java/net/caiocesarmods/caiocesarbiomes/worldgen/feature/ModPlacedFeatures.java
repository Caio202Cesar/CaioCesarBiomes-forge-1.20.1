package net.caiocesarmods.caiocesarbiomes.worldgen.feature;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.placement.ModTreePlacements;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.placement.ModVegetationPlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        ModTreePlacements.bootstrap(context);
        ModVegetationPlacements.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name));
    }
}
