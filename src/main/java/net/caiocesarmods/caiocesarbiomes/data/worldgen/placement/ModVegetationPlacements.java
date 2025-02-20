package net.caiocesarmods.caiocesarbiomes.data.worldgen.placement;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModVegetationFeatures;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModVegetationFeatures.JUNGLE_FIG_TREES;
import static net.minecraft.data.worldgen.placement.PlacementUtils.register;
import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

//Ver VegetationPlacements.java
public class ModVegetationPlacements {
    //Tees
    public static final ResourceKey<PlacedFeature> TREES_MONKEY_PUZZLE = ModPlacedFeatures.registerKey("trees_monkey_puzzle");
    public static final ResourceKey<PlacedFeature> TREES_JUNGLE_FIG = ModPlacedFeatures.registerKey("trees_monkey_puzzle");
    public static final ResourceKey<PlacedFeature> OLEANDER = ModPlacedFeatures.registerKey("oleander");
    public static final ResourceKey<PlacedFeature> SCRUBLAND_OLEANDER = ModPlacedFeatures.registerKey("scrubland_oleander");
    public static final ResourceKey<PlacedFeature> MEDITERRANEAN_CONIFERS = ModPlacedFeatures.registerKey("mediterranean_conifers");
    public static final ResourceKey<PlacedFeature> SCRUBLAND_MEDITERRANEAN_CONIFERS = ModPlacedFeatures.registerKey("scrubland_mediterranean_conifers");
    public static final ResourceKey<PlacedFeature> AUTUMNAL_SOUTHERN_BEECHES = ModPlacedFeatures.registerKey("autumnal_southern_beeches");
    public static final ResourceKey<PlacedFeature> TROPICAL_CITRUSES = ModPlacedFeatures.registerKey("tropical_citruses");
    public static final ResourceKey<PlacedFeature> TREES_TROPICAL_RAINFOREST = ModPlacedFeatures.registerKey("trees_tropical_rainforest");

    //Plants
    public static final ResourceKey<PlacedFeature> TROPICAL_PLANTS = ModPlacedFeatures.registerKey("tropical_plants");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> monkey_puzzle_trees_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.MONKEY_PUZZLE_TREES);
        final Holder<ConfiguredFeature<?, ?>> jungle_figs_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.JUNGLE_FIG_TREES);
        final Holder<ConfiguredFeature<?, ?>> oleander_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.OLEANDER_SHRUBS);
        final Holder<ConfiguredFeature<?, ?>> mediterranean_conifer_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.MEDITERRANEAN_CONIFERS);
        final Holder<ConfiguredFeature<?, ?>> autumnal_southern_beeches_holder =
                featureHolderGetter.getOrThrow(ModVegetationFeatures.AUTUMNAL_SOUTHERN_BEECHES);
        final Holder<ConfiguredFeature<?, ?>> tropical_citrus_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.TROPICAL_CITRUS_TREES);
        final Holder<ConfiguredFeature<?, ?>> tropical_rainforest_trees_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.TROPICAL_RAINFOREST_TREES);

        final Holder<ConfiguredFeature<?, ?>> tropical_plants_holder = featureHolderGetter.getOrThrow(ModVegetationFeatures.PATCH_TROPICAL_PLANTS);

        //Trees
        register(context, TREES_MONKEY_PUZZLE, monkey_puzzle_trees_holder, treePlacement(PlacementUtils.countExtra(5, 0.1F, 1),
                ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        register(context, TREES_JUNGLE_FIG, jungle_figs_holder, treePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));
        register(context, OLEANDER, oleander_holder, treePlacement(PlacementUtils.countExtra(8, 0.1F, 1)));
        register(context, SCRUBLAND_OLEANDER, oleander_holder, treePlacement(PlacementUtils.countExtra(0, 0.3F, 3)));
        register(context, MEDITERRANEAN_CONIFERS, mediterranean_conifer_holder, treePlacement(PlacementUtils
                .countExtra(2, 0.1F, 1)));
        register(context, SCRUBLAND_MEDITERRANEAN_CONIFERS, mediterranean_conifer_holder, treePlacement(PlacementUtils
                .countExtra(0, 0.1F, 1)));
        register(context, AUTUMNAL_SOUTHERN_BEECHES, autumnal_southern_beeches_holder, treePlacement(PlacementUtils
                .countExtra(6, 0.1F, 1)));
        register(context, TROPICAL_CITRUSES, tropical_citrus_holder, treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));
        register(context, TREES_TROPICAL_RAINFOREST, tropical_rainforest_trees_holder,
                treePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));

        //Plants
        register(context, TROPICAL_PLANTS, tropical_plants_holder, CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}

