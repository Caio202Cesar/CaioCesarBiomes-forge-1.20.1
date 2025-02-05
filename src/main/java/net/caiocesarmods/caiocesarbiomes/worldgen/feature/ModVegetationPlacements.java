package net.caiocesarmods.caiocesarbiomes.worldgen.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

//Ver VegetationPlacements.java
public class ModVegetationPlacements {
    public static final ResourceKey<PlacedFeature> TREES_MONKEY_PUZZLE = PlacementUtils.createKey("trees_monkey_puzzle");

    public static void bootstrap(BootstapContext<PlacedFeature> bootstapContext) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = bootstapContext.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> monkey_puzzle_trees_holder = holdergetter.getOrThrow(ModVegetationFeatures.MONKEY_PUZZLE_TREES);

        PlacementUtils.register(bootstapContext, TREES_MONKEY_PUZZLE, monkey_puzzle_trees_holder,
                treePlacement(PlacementUtils.countExtra(5, 0.1F, 1)));
    }
}
