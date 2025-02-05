package net.caiocesarmods.caiocesarbiomes.worldgen.tree;

import net.caiocesarmods.caiocesarbiomes.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class MonkeyPuzzleTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        if (randomSource.nextInt(10) == 0) {
            return ModConfiguredFeatures.MONKEY_PUZZLE_KEY;
        } else {
            return ModConfiguredFeatures.YOUNG_MONKEY_PUZZLE_KEY;
        }
    }
}
