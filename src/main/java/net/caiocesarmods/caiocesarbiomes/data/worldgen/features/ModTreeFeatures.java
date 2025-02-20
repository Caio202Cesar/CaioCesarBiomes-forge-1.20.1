package net.caiocesarmods.caiocesarbiomes.data.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.ModConfiguredFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ModTreeFeatures {
    //Ver TreeFeatures.java
    public static final ResourceKey<ConfiguredFeature<?, ?>> MONKEY_PUZZLE_KEY = ModConfiguredFeatures.registerKey("monkey_puzzle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YOUNG_MONKEY_PUZZLE_KEY = ModConfiguredFeatures.registerKey("monkey_puzzle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY =
            ModConfiguredFeatures.registerKey("windswept_crimson_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY =
            ModConfiguredFeatures.registerKey("windswept_orange_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY =
            ModConfiguredFeatures.registerKey("crimson_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY =
            ModConfiguredFeatures.registerKey("orange_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_FIG_BIG_KEY = ModConfiguredFeatures.registerKey("weeping_fig_big_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_FIG_KEY = ModConfiguredFeatures.registerKey("weeping_fig_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIAN_LAUREL_BIG_KEY = ModConfiguredFeatures.registerKey("indian_laurel_big_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIAN_LAUREL_KEY = ModConfiguredFeatures.registerKey("indian_laurel_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ITALIAN_CYPRESS_KEY = ModConfiguredFeatures.registerKey("italian_cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_KEY = ModConfiguredFeatures.registerKey("cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_CORK_OAK_KEY = ModConfiguredFeatures.registerKey("fancy_cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_SHRUB_KEY = ModConfiguredFeatures.registerKey("cork_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_KEY = ModConfiguredFeatures.registerKey("holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_HOLM_OAK_KEY = ModConfiguredFeatures.registerKey("fancy_holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_SHRUB_KEY = ModConfiguredFeatures.registerKey("cork_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_OLEANDER_KEY = ModConfiguredFeatures.registerKey("pink_oleander");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_PINK_OLEANDER_KEY = ModConfiguredFeatures.registerKey("dark_pink_oleander");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OLEANDER_KEY = ModConfiguredFeatures.registerKey("white_oleander");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_OLEANDER_KEY = ModConfiguredFeatures.registerKey("red_oleander");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_SHRUB_KEY = ModConfiguredFeatures.registerKey("oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIG_KEY = ModConfiguredFeatures.registerKey("fig_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLANE_KEY = ModConfiguredFeatures.registerKey("plane");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_PLANE_KEY = ModConfiguredFeatures.registerKey("fancy_plane");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_PINE1_KEY = ModConfiguredFeatures.registerKey("stone_pine1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_PINE2_KEY = ModConfiguredFeatures.registerKey("stone_pine2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POMEGRANATE_KEY = ModConfiguredFeatures.registerKey("pomegranate_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_KEY = ModConfiguredFeatures.registerKey("olive_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BIG_OLIVE_KEY = ModConfiguredFeatures.registerKey("big_olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRABAPPLE_KEY = ModConfiguredFeatures.registerKey("pink_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRABAPPLE_KEY = ModConfiguredFeatures.registerKey("white_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRY_TREE1_KEY = ModConfiguredFeatures.registerKey("strawberry_tree1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRY_TREE2_KEY = ModConfiguredFeatures.registerKey("strawberry_tree2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AVOCADO_KEY = ModConfiguredFeatures.registerKey("avocado_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEMON_KEY = ModConfiguredFeatures.registerKey("lemon_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRON_KEY = ModConfiguredFeatures.registerKey("citron_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BUDDHA_HAND_KEY = ModConfiguredFeatures.registerKey("buddha_hand_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TAHITI_LIME_KEY = ModConfiguredFeatures.registerKey("tahiti_lime_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STARFRUIT_KEY = ModConfiguredFeatures.registerKey("starfruit_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_KAPOK_KEY = ModConfiguredFeatures.registerKey("red_kapok");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FREMONT_COTTONWOOD_KEY = ModConfiguredFeatures.registerKey("fremont_cottonwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_BLACK_POPLAR_KEY = ModConfiguredFeatures.registerKey("fancy_black_poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOMBARDY_POPLAR_KEY = ModConfiguredFeatures.registerKey("lombardy_poplar");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<Block> holderGetter = context.lookup(Registries.BLOCK);
        //Araucaria Trees
        register(context, MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3,7)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
        register(context, YOUNG_MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new StraightTrunkPlacer(6, 2, 14),
                //new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1))
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13,17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

        //Nothofagus Trees
        register(context, WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());
        register(context, AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());

        //Jungle Figs
        register(context, WEEPING_FIG_BIG_KEY, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.simple(ModBlocks.WEEPING_FIG_LEAVES.get()),
                        new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                ).ignoreVines().build());
        register(context, WEEPING_FIG_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.WEEPING_FIG_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context,INDIAN_LAUREL_BIG_KEY, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.simple(ModBlocks.INDIAN_LAUREL_LEAVES.get()),
                        new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                ).ignoreVines().build());
        register(context, INDIAN_LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.INDIAN_LAUREL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Italian Cypress Tree
        register(context, ITALIAN_CYPRESS_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LOG.get()),
                new StraightTrunkPlacer(16, 2, 1),
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(1, 0),
                        UniformInt.of(1, 1),
                        UniformInt.of(1, 0)),
                new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

        //Oleander Shrubs
        register(context, PINK_OLEANDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLEANDER_LOG.get()),
                new StraightTrunkPlacer(2, 1, 0),
                BlockStateProvider.simple(ModBlocks.OLEANDER_PINK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, DARK_PINK_OLEANDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLEANDER_LOG.get()),
                new StraightTrunkPlacer(2, 1, 0),
                BlockStateProvider.simple(ModBlocks.OLEANDER_DARK_PINK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, WHITE_OLEANDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLEANDER_LOG.get()),
                new StraightTrunkPlacer(2, 1, 0),
                BlockStateProvider.simple(ModBlocks.OLEANDER_WHITE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, RED_OLEANDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLEANDER_LOG.get()),
                new StraightTrunkPlacer(2, 1, 0),
                BlockStateProvider.simple(ModBlocks.OLEANDER_RED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Fig Tree
        register(context, FIG_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.FIG_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());

        //Mediterranean Oaks
        register(context, HOLM_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, FANCY_HOLM_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());
        register(context, CORK_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, FANCY_CORK_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Oak Shrubs
        register(context, HOLM_OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());
        register(context, CORK_OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());
        register(context, OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(Blocks.OAK_LEAVES),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());

        //Plane Tree (neo-forest feature)
        register(context, PLANE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PLANE_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.PLANE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, FANCY_PLANE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PLANE_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.PLANE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Stone Pine
        register(context, STONE_PINE1_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STONE_PINE_LOG.get()),
                new ForkingTrunkPlacer(8, 6, 0),
                BlockStateProvider.simple(ModBlocks.STONE_PINE_LEAVES.get()),
                new DarkOakFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
                new TwoLayersFeatureSize(2, 0, 2)).build());
        register(context, STONE_PINE2_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STONE_PINE_LOG.get()),
                new StraightTrunkPlacer(8, 6, 0),
                BlockStateProvider.simple(ModBlocks.STONE_PINE_LEAVES.get()),
                new DarkOakFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Pomegranate
        register(context, POMEGRANATE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POMEGRANATE_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.POMEGRANATE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Olive
        register(context, BIG_OLIVE_KEY, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.OLIVE_LOG.get()),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.simple(ModBlocks.OLIVE_LEAVES.get()),
                        new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                ).ignoreVines().build());
        register(context, OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLIVE_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.OLIVE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Crabapple
        register(context, PINK_CRABAPPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_PINK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, WHITE_CRABAPPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_WHITE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Strawberry Tree
        register(context, STRAWBERRY_TREE1_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STRAWBERRY_TREE_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.STRAWBERRY_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, STRAWBERRY_TREE2_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STRAWBERRY_TREE_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.STRAWBERRY_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Avocado Tree
        register(context, AVOCADO_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.AVOCADO_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.AVOCADO_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Citruses
        register(context, LEMON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CITRUS_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.LEMON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, CITRON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CITRUS_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.CITRON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, BUDDHA_HAND_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CITRUS_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.BUDDHA_HAND_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, TAHITI_LIME_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CITRUS_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.TAHITI_LIME_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Starfruit
        register(context, STARFRUIT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STARFRUIT_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.STARFRUIT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //Red Kapok
        register(context, RED_KAPOK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG.defaultBlockState()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.RED_KAPOK_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Fremont Poplar
        register(context, FREMONT_COTTONWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.FREMONT_COTTONWOOD_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Black Poplar
        register(context, FANCY_BLACK_POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.BLACK_POPLAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());
        register(context, LOMBARDY_POPLAR_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get()),
                new StraightTrunkPlacer(12, 2, 1),
                BlockStateProvider.simple(ModBlocks.BLACK_POPLAR_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(1, 0),
                        UniformInt.of(1, 1),
                        UniformInt.of(1, 0)),
                new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
