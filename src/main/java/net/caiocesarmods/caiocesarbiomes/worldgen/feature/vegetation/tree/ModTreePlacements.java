package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

//See TreePlacements.java
public class ModTreePlacements {
    public static final ResourceKey<PlacedFeature> MONKEY_PUZZLE_CHECKED = PlacementUtils.createKey("monkey_puzzle_checked");
    public static final ResourceKey<PlacedFeature> YOUNG_MONKEY_PUZZLE_CHECKED = PlacementUtils.createKey("young_monkey_puzzle_checked");

    public static final ResourceKey<PlacedFeature> WEEPING_FIG_CHECKED = PlacementUtils.createKey("weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> BIG_WEEPING_FIG_CHECKED = PlacementUtils.createKey("big_weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> INDIAN_LAUREL_CHECKED = PlacementUtils.createKey("indian_laurel_checked");
    public static final ResourceKey<PlacedFeature> BIG_INDIAN_LAUREL_CHECKED = PlacementUtils.createKey("big_indian_laurel_checked");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> monkey_puzzle_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.MONKEY_PUZZLE_KEY);
        Holder<ConfiguredFeature<?, ?>> young_monkey_puzzle_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.YOUNG_MONKEY_PUZZLE_KEY);
        Holder<ConfiguredFeature<?, ?>> weeping_fig_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_KEY);
        Holder<ConfiguredFeature<?, ?>> weeping_fig_big_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_BIG_KEY);
        Holder<ConfiguredFeature<?, ?>> indian_laurel_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_KEY);
        Holder<ConfiguredFeature<?, ?>> indian_laurel_big_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_BIG_KEY);

        PlacementUtils.register(context, MONKEY_PUZZLE_CHECKED, monkey_puzzle_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        PlacementUtils.register(context, YOUNG_MONKEY_PUZZLE_CHECKED, young_monkey_puzzle_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        PlacementUtils.register(context,WEEPING_FIG_CHECKED, weeping_fig_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        PlacementUtils.register(context,BIG_WEEPING_FIG_CHECKED, weeping_fig_big_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        PlacementUtils.register(context,INDIAN_LAUREL_CHECKED, indian_laurel_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
        PlacementUtils.register(context,BIG_INDIAN_LAUREL_CHECKED, indian_laurel_big_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
    }
}
