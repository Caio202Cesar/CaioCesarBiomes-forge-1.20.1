package net.caiocesarmods.caiocesarbiomes.worldgen.feature.tree;

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
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

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
    public static final ResourceKey<ConfiguredFeature<?, ?>> ITALIAN_CYPRESS_KEY = FeatureUtils.createKey("italian_cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_KEY = FeatureUtils.createKey("cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_CORK_OAK_KEY = FeatureUtils.createKey("fancy_cork_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_SHRUB_KEY = FeatureUtils.createKey("cork_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_KEY = FeatureUtils.createKey("holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_HOLM_OAK_KEY = FeatureUtils.createKey("fancy_holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_SHRUB_KEY = FeatureUtils.createKey("cork_oak_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KERMES_OAK_KEY = FeatureUtils.createKey("kermes_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FANCY_KERMES_OAK_KEY = FeatureUtils.createKey("fancy_kermes_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KERMES_OAK_SHRUB_KEY = FeatureUtils.createKey("kermes_oak_shrub");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        //Araucaria Trees
        FeatureUtils.register(context, MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3,7)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
        FeatureUtils.register(context, YOUNG_MONKEY_PUZZLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new StraightTrunkPlacer(6, 2, 14),
                //new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1))
                BlockStateProvider.simple(ModBlocks.MONKEY_PUZZLE_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13,17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

        //Nothofagus Trees
        FeatureUtils.register(context, WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(context, WINDSWEPT_AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 6, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        FeatureUtils.register(context, AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());
        FeatureUtils.register(context, AUTUMNAL_ORANGE_SOUTHERN_BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NOTHOFAGUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(0, 0, 0)).build());

        //Italian Cypress Tree
        FeatureUtils.register(context, ITALIAN_CYPRESS_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LOG.get()),
                new StraightTrunkPlacer(16, 2, 1),
                BlockStateProvider.simple(ModBlocks.ITALIAN_CYPRESS_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(1, 0),
                        UniformInt.of(1, 1),
                        UniformInt.of(1, 0)),
                new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

        //Mediterranean Oaks


        //Oak Shrubs


    }}
