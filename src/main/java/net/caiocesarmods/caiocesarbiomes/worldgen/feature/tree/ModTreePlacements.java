package net.caiocesarmods.caiocesarbiomes.worldgen.feature.tree;

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

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder<ConfiguredFeature<?, ?>> monkey_puzzle_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.MONKEY_PUZZLE_KEY);
        Holder<ConfiguredFeature<?, ?>> young_monkey_puzzle_holder = configuredFeatureHolderGetter.getOrThrow(ModTreeFeatures.YOUNG_MONKEY_PUZZLE_KEY);

        PlacementUtils.register(context, MONKEY_PUZZLE_CHECKED, monkey_puzzle_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        PlacementUtils.register(context, YOUNG_MONKEY_PUZZLE_CHECKED, young_monkey_puzzle_holder, PlacementUtils
                .filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
    }
}
