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

    public static final ResourceKey<PlacedFeature> CRIMSON_SOUTHERN_BEECH_CHECKED = ModPlacedFeatures.registerKey("crimson_southern_beech_checked");
    public static final ResourceKey<PlacedFeature> ORANGE_SOUTHERN_BEECH_CHECKED = ModPlacedFeatures.registerKey("orange_southern_beech_checked");
    public static final ResourceKey<PlacedFeature> WINDSWEPT_CRIMSON_SOUTHERN_BEECH_CHECKED =
            ModPlacedFeatures.registerKey("windswept_crimson_southern_beech_checked");
    public static final ResourceKey<PlacedFeature> WINDSWEPT_ORANGE_SOUTHERN_BEECH_CHECKED =
            ModPlacedFeatures.registerKey("windswept_orange_southern_beech_checked");

    public static final ResourceKey<PlacedFeature> WEEPING_FIG_CHECKED = ModPlacedFeatures.registerKey("weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> BIG_WEEPING_FIG_CHECKED = ModPlacedFeatures.registerKey("big_weeping_fig_checked");
    public static final ResourceKey<PlacedFeature> INDIAN_LAUREL_CHECKED = ModPlacedFeatures.registerKey("indian_laurel_checked");
    public static final ResourceKey<PlacedFeature> BIG_INDIAN_LAUREL_CHECKED = ModPlacedFeatures.registerKey("big_indian_laurel_checked");

    public static final ResourceKey<PlacedFeature> ITALIAN_CYPRESS_CHECKED = ModPlacedFeatures.registerKey("italian_cypress_checked");

    public static final ResourceKey<PlacedFeature> PINK_OLEANDER_CHECKED = ModPlacedFeatures.registerKey("pink_oleander_checked");
    public static final ResourceKey<PlacedFeature> DARK_PINK_OLEANDER_CHECKED = ModPlacedFeatures.registerKey("dark_pink_oleander_checked");
    public static final ResourceKey<PlacedFeature> RED_OLEANDER_CHECKED = ModPlacedFeatures.registerKey("red_oleander_checked");
    public static final ResourceKey<PlacedFeature> WHITE_OLEANDER_CHECKED = ModPlacedFeatures.registerKey("white_oleander_checked");

    public static final ResourceKey<PlacedFeature> FIG_CHECKED = ModPlacedFeatures.registerKey("fig_checked");

    public static final ResourceKey<PlacedFeature> HOLM_OAK_CHECKED = ModPlacedFeatures.registerKey("holm_oak_checked");
    public static final ResourceKey<PlacedFeature> FANCY_HOLM_OAK_CHECKED = ModPlacedFeatures.registerKey("fancy_holm_oak_checked");
    public static final ResourceKey<PlacedFeature> CORK_OAK_CHECKED = ModPlacedFeatures.registerKey("cork_oak_checked");
    public static final ResourceKey<PlacedFeature> FANCY_CORK_OAK_CHECKED = ModPlacedFeatures.registerKey("fancy_cork_oak_checked");

    public static final ResourceKey<PlacedFeature> PLANE_CHECKED = ModPlacedFeatures.registerKey("plane_checked");
    public static final ResourceKey<PlacedFeature> FANCY_PLANE_CHECKED = ModPlacedFeatures.registerKey("fancy_plane_checked");

    public static final ResourceKey<PlacedFeature> STONE_PINE1_CHECKED = ModPlacedFeatures.registerKey("stone_pine1_checked");
    public static final ResourceKey<PlacedFeature> STONE_PINE2_CHECKED = ModPlacedFeatures.registerKey("stone_pine2_checked");

    public static final ResourceKey<PlacedFeature> POMEGRANATE_CHECKED = ModPlacedFeatures.registerKey("pomegranate_checked");

    public static final ResourceKey<PlacedFeature> OLIVE_CHECKED = ModPlacedFeatures.registerKey("olive_checked");
    public static final ResourceKey<PlacedFeature> BIG_OLIVE_CHECKED = ModPlacedFeatures.registerKey("big_olive_checked");

    public static final ResourceKey<PlacedFeature> PINK_CRABAPPLE_CHECKED = ModPlacedFeatures.registerKey("pink_crabapple_checked");
    public static final ResourceKey<PlacedFeature> WHITE_CRABAPPLE_CHECKED = ModPlacedFeatures.registerKey("white_crabapple_checked");

    public static final ResourceKey<PlacedFeature> STRAWBERRY_TREE1_CHECKED = ModPlacedFeatures.registerKey("strawberry_tree1_checked");
    public static final ResourceKey<PlacedFeature> STRAWBERRY_TREE2_CHECKED = ModPlacedFeatures.registerKey("strawberry_tree2_checked");

    public static final ResourceKey<PlacedFeature> AVOCADO_CHECKED = ModPlacedFeatures.registerKey("avocado_checked");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> featureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.MONKEY_PUZZLE_KEY);
        final Holder<ConfiguredFeature<?, ?>> young_monkey_puzzle_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.YOUNG_MONKEY_PUZZLE_KEY);

        final Holder<ConfiguredFeature<?, ?>> weeping_fig_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_KEY);
        final Holder<ConfiguredFeature<?, ?>> weeping_fig_big_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.WEEPING_FIG_BIG_KEY);
        final Holder<ConfiguredFeature<?, ?>> indian_laurel_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_KEY);
        final Holder<ConfiguredFeature<?, ?>> indian_laurel_big_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.INDIAN_LAUREL_BIG_KEY);

        final Holder<ConfiguredFeature<?, ?>> crimson_beech_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY);
        final Holder<ConfiguredFeature<?, ?>> orange_beech_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY);
        final Holder<ConfiguredFeature<?, ?>> windswept_crimson_beech_holder =
                featureHolderGetter.getOrThrow(ModTreeFeatures.WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY);
        final Holder<ConfiguredFeature<?, ?>> windswept_orange_beech_holder =
                featureHolderGetter.getOrThrow(ModTreeFeatures.WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY);

        final Holder<ConfiguredFeature<?, ?>> italian_cypress_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.ITALIAN_CYPRESS_KEY);

        final Holder<ConfiguredFeature<?, ?>> pink_oleander_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.PINK_OLEANDER_KEY);
        final Holder<ConfiguredFeature<?, ?>> dark_pink_oleander_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.DARK_PINK_OLEANDER_KEY);
        final Holder<ConfiguredFeature<?, ?>> red_oleander_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.RED_OLEANDER_KEY);
        final Holder<ConfiguredFeature<?, ?>> white_oleander_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.WHITE_OLEANDER_KEY);

        final Holder<ConfiguredFeature<?, ?>> fig_holder = featureHolderGetter.getOrThrow(ModTreeFeatures.FIG_KEY);


        register(context, MONKEY_PUZZLE_CHECKED, monkey_puzzle_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        register(context, YOUNG_MONKEY_PUZZLE_CHECKED, young_monkey_puzzle_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));

        register(context, WEEPING_FIG_CHECKED, weeping_fig_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        register(context, BIG_WEEPING_FIG_CHECKED, weeping_fig_big_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.WEEPING_FIG_SAPLING.get()));
        register(context, INDIAN_LAUREL_CHECKED, indian_laurel_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
        register(context, BIG_INDIAN_LAUREL_CHECKED, indian_laurel_big_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.INDIAN_LAUREL_SAPLING.get()));

        register(context, CRIMSON_SOUTHERN_BEECH_CHECKED, crimson_beech_holder, PlacementUtils.filteredByBlockSurvival(
                ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get()));
        register(context, ORANGE_SOUTHERN_BEECH_CHECKED, orange_beech_holder, PlacementUtils.filteredByBlockSurvival(
                ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get()));
        register(context, WINDSWEPT_CRIMSON_SOUTHERN_BEECH_CHECKED, windswept_crimson_beech_holder, PlacementUtils.filteredByBlockSurvival(
                ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get()));
        register(context, WINDSWEPT_ORANGE_SOUTHERN_BEECH_CHECKED, windswept_orange_beech_holder, PlacementUtils.filteredByBlockSurvival(
                ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get()));

        register(context, ITALIAN_CYPRESS_CHECKED, italian_cypress_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.ITALIAN_CYPRESS_SAPLING.get()));

        register(context, PINK_OLEANDER_CHECKED, pink_oleander_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.OLEANDER_PINK_SAPLING.get()));
        register(context, DARK_PINK_OLEANDER_CHECKED, dark_pink_oleander_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.OLEANDER_DARK_PINK_SAPLING.get()));
        register(context, RED_OLEANDER_CHECKED, red_oleander_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.OLEANDER_RED_SAPLING.get()));
        register(context, WHITE_OLEANDER_CHECKED, white_oleander_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.OLEANDER_WHITE_SAPLING.get()));

        register(context, FIG_CHECKED, fig_holder, PlacementUtils.filteredByBlockSurvival(ModBlocks.FIG_SAPLING.get()));

    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placement) {
        register(context, key, feature, List.of(placement));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placement) {
        context.register(key, new PlacedFeature(feature, placement));
    }
}

