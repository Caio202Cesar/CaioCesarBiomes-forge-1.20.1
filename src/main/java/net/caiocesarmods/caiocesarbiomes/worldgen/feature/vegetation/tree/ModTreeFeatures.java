package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree;

import com.google.common.collect.ImmutableList;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.OptionalInt;

public class ModTreeFeatures {
    //Ver TreeFeatures.java
    public static final ResourceKey<ConfiguredFeature<?, ?>> MONKEY_PUZZLE_KEY = FeatureUtils.createKey("monkey_puzzle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YOUNG_MONKEY_PUZZLE_KEY = FeatureUtils.createKey("monkey_puzzle");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY = FeatureUtils.createKey(
            "windswept_crimson_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY = FeatureUtils.createKey(
            "windswept_orange_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY = FeatureUtils.createKey("crimson_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY = FeatureUtils.createKey("orange_southern_beech");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_FIG_BIG_KEY = FeatureUtils.createKey("weeping_fig_big_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_FIG_KEY = FeatureUtils.createKey("weeping_fig_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIAN_LAUREL_BIG_KEY = FeatureUtils.createKey("indian_laurel_big_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIAN_LAUREL_KEY = FeatureUtils.createKey("indian_laurel_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ITALIAN_CYPRESS_KEY = FeatureUtils.createKey("italian_cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_KEY = FeatureUtils.createKey("cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_CORK_OAK_KEY = FeatureUtils.createKey("fancy_cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_SHRUB_KEY = FeatureUtils.createKey("cork_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_KEY = FeatureUtils.createKey("holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_HOLM_OAK_KEY = FeatureUtils.createKey("fancy_holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_SHRUB_KEY = FeatureUtils.createKey("cork_oak_shrub");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> KERMES_OAK_KEY = FeatureUtils.createKey("kermes_oak");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_KERMES_OAK_KEY = FeatureUtils.createKey("fancy_kermes_oak");
    //public static final ResourceKey<ConfiguredFeature<?, ?>> KERMES_OAK_SHRUB_KEY = FeatureUtils.createKey("kermes_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OAK_SHRUB_KEY = FeatureUtils.createKey("oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIG_KEY = FeatureUtils.createKey("fig_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLANE_KEY = FeatureUtils.createKey("plane");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_PLANE_KEY = FeatureUtils.createKey("fancy_plane");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> bootstapContext) {
        //Araucaria Trees
        FeatureUtils.register(bootstapContext, MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3,7)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
        FeatureUtils.register(bootstapContext, YOUNG_MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new StraightTrunkPlacer(6, 2, 14),
                //new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1))
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13,17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

        //Nothofagus Trees
        FeatureUtils.register(bootstapContext, WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext, WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext, AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());
        FeatureUtils.register(bootstapContext, AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());

        //Jungle Figs
        FeatureUtils.register(bootstapContext, WEEPING_FIG_BIG_KEY, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.simple(ModBlocks.WEEPING_FIG_LEAVES.get()),
                        new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                ).ignoreVines().build());
        FeatureUtils.register(bootstapContext, WEEPING_FIG_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.WEEPING_FIG_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext,INDIAN_LAUREL_BIG_KEY, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.simple(ModBlocks.INDIAN_LAUREL_LEAVES.get()),
                        new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                ).ignoreVines().build());
        FeatureUtils.register(bootstapContext, INDIAN_LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JUNGLE_FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.INDIAN_LAUREL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());


        //Italian Cypress Tree
        FeatureUtils.register(bootstapContext, ITALIAN_CYPRESS_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LOG.get()),
                new StraightTrunkPlacer(16, 2, 1),
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(1, 0),
                        UniformInt.of(1, 1),
                        UniformInt.of(1, 0)),
                new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

        //Fig Tree
        FeatureUtils.register(bootstapContext, FIG_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FIG_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.FIG_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());

        //Mediterranean Oaks
        FeatureUtils.register(bootstapContext, HOLM_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext, FANCY_HOLM_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());
        FeatureUtils.register(bootstapContext, CORK_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext, FANCY_CORK_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

        //Oak Shrubs
        FeatureUtils.register(bootstapContext, HOLM_OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(ModBlocks.HOLM_OAK_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());
        FeatureUtils.register(bootstapContext, CORK_OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(ModBlocks.CORK_OAK_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());
        FeatureUtils.register(bootstapContext, OAK_SHRUB_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(Blocks.OAK_LEAVES),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))).build());

        //Plane Tree (neo-forest feature)
        FeatureUtils.register(bootstapContext, PLANE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PLANE_LOG.get()),
                new StraightTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(ModBlocks.PLANE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(bootstapContext, FANCY_PLANE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PLANE_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(ModBlocks.PLANE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4))).build());

    }}
