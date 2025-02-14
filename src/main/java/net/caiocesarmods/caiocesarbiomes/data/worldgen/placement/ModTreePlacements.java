package net.caiocesarmods.caiocesarbiomes.data.worldgen.placement;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModTreeFeatures;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

import static net.minecraft.data.worldgen.placement.PlacementUtils.register;

//See TreePlacements.java
public class ModTreePlacements {
    public static final ResourceKey<PlacedFeature> MONKEY_PUZZLE_CHECKED = ModPlacedFeatures.registerKey("monkey_puzzle_checked");
    public static final ResourceKey<PlacedFeature> YOUNG_MONKEY_PUZZLE_CHECKED = ModPlacedFeatures.registerKey("young_monkey_puzzle_checked");
    public static final ResourceKey<PlacedFeature> WEEPING_FIG_CHECKED = ModPlacedFeatures.registerKey("weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> BIG_WEEPING_FIG_CHECKED = ModPlacedFeatures.registerKey("big_weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> INDIAN_LAUREL_CHECKED = ModPlacedFeatures.registerKey("indian_laurel_checked");
    public static final ResourceKey<PlacedFeature> BIG_INDIAN_LAUREL_CHECKED = ModPlacedFeatures.registerKey("big_indian_laurel_checked");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.MONKEY_PUZZLE_KEY);
        final Holder<ConfiguredFeature<?, ?>> young_monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.YOUNG_MONKEY_PUZZLE_KEY);
        final Holder<ConfiguredFeature<?, ?>> weeping_fig_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_KEY);
        final Holder<ConfiguredFeature<?, ?>> weeping_fig_big_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_BIG_KEY);
        final Holder<ConfiguredFeature<?, ?>> indian_laurel_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_KEY);
        final Holder<ConfiguredFeature<?, ?>> indian_laurel_big_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_BIG_KEY);

        register(context, MONKEY_PUZZLE_CHECKED, monkey_puzzle_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        register(context, YOUNG_MONKEY_PUZZLE_CHECKED, young_monkey_puzzle_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        register(context,WEEPING_FIG_CHECKED, weeping_fig_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        register(context,BIG_WEEPING_FIG_CHECKED, weeping_fig_big_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        register(context,INDIAN_LAUREL_CHECKED, indian_laurel_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
        register(context,BIG_INDIAN_LAUREL_CHECKED, indian_laurel_big_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}

