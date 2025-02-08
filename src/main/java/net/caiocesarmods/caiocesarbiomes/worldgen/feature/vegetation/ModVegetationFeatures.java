package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation;

import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.ModTreePlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

//Ver VegetationFeatures.java
public class ModVegetationFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> MONKEY_PUZZLE_TREES = FeatureUtils.createKey("monkey_puzzle_trees");

    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_FIG_TREES = FeatureUtils.createKey("jungle_fig_trees");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> bootstapContext) {
        HolderGetter<PlacedFeature> holderGetter = bootstapContext.lookup(Registries.PLACED_FEATURE);
        Holder<PlacedFeature> monkey_puzzle_holder = holderGetter.getOrThrow(ModTreePlacements.MONKEY_PUZZLE_CHECKED);
        Holder<PlacedFeature> young_monkey_puzzle_holder = holderGetter.getOrThrow(ModTreePlacements.YOUNG_MONKEY_PUZZLE_CHECKED);
        Holder<PlacedFeature> weeping_fig_holder = holderGetter.getOrThrow(ModTreePlacements.WEEPING_FIG_CHECKED);
        Holder<PlacedFeature> weeping_fig_big_holder = holderGetter.getOrThrow(ModTreePlacements.BIG_WEEPING_FIG_CHECKED);
        Holder<PlacedFeature> indian_laurel_holder = holderGetter.getOrThrow(ModTreePlacements.INDIAN_LAUREL_CHECKED);
        Holder<PlacedFeature> indian_laurel_big_holder = holderGetter.getOrThrow(ModTreePlacements.BIG_INDIAN_LAUREL_CHECKED);

        FeatureUtils.register(bootstapContext, MONKEY_PUZZLE_TREES, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(young_monkey_puzzle_holder, 0.1F)), monkey_puzzle_holder));
        FeatureUtils.register(bootstapContext, JUNGLE_FIG_TREES, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(weeping_fig_holder, 0.3F),
                        new WeightedPlacedFeature(weeping_fig_big_holder, 0.3F),
                        new WeightedPlacedFeature(indian_laurel_holder, 0.3F)), indian_laurel_big_holder));

    }
}
