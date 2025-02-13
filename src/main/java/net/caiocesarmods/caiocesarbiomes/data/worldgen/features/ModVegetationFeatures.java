package net.caiocesarmods.caiocesarbiomes.data.worldgen.features;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.placement.ModTreePlacements;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

//Ver VegetationFeatures.java
public class ModVegetationFeatures {
    //Trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> MONKEY_PUZZLE_TREES = ModConfiguredFeatures.registerKey("monkey_puzzle_trees");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUNGLE_FIG_TREES = ModConfiguredFeatures.registerKey("jungle_fig_trees");
    //Plants
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TROPICAL_PLANTS = ModConfiguredFeatures.registerKey("patch_tropical_plants");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> featureHolderGetter = context.lookup(Registries.PLACED_FEATURE);

        final Holder<PlacedFeature> monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreePlacements.MONKEY_PUZZLE_CHECKED);
        final Holder<PlacedFeature> young_monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreePlacements.YOUNG_MONKEY_PUZZLE_CHECKED);
        final Holder<PlacedFeature> weeping_fig_holder = featureHolderGetter.getOrThrow(ModTreePlacements.WEEPING_FIG_CHECKED);
        final Holder<PlacedFeature> weeping_fig_big_holder = featureHolderGetter.getOrThrow(ModTreePlacements.BIG_WEEPING_FIG_CHECKED);
        final Holder<PlacedFeature> indian_laurel_holder = featureHolderGetter.getOrThrow(ModTreePlacements.INDIAN_LAUREL_CHECKED);
        final Holder<PlacedFeature> indian_laurel_big_holder = featureHolderGetter.getOrThrow(ModTreePlacements.BIG_INDIAN_LAUREL_CHECKED);

        //Trees
        register(context, MONKEY_PUZZLE_TREES, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(young_monkey_puzzle_holder, 0.1F)), monkey_puzzle_holder));
        register(context, JUNGLE_FIG_TREES, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(weeping_fig_holder, 0.3F),
                        new WeightedPlacedFeature(weeping_fig_big_holder, 0.3F),
                        new WeightedPlacedFeature(indian_laurel_holder, 0.3F)), indian_laurel_big_holder));

        //Plants
        register(context, PATCH_TROPICAL_PLANTS, Feature.RANDOM_PATCH, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                .add(ModBlocks.BASIL.get().defaultBlockState(), 10)
                .add(Blocks.GRASS.defaultBlockState(), 10)
                .add(Blocks.BLUE_ORCHID.defaultBlockState(), 10)
                .add(ModBlocks.PURPLE_BASIL.get().defaultBlockState(), 5)
                .add(Blocks.TALL_GRASS.defaultBlockState(), 1)), 32));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int i) {
        return FeatureUtils.simpleRandomPatchConfiguration(i, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}

