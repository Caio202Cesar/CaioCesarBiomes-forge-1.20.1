package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers;

import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WeepingFigTreeGrower extends AbstractMegaTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource randomSource, boolean b) {
        return ModTreeFeatures.WEEPING_FIG_KEY;
    }

    /**
     * @return the key of the huge variant of this tree
     */
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(@NotNull RandomSource pRandom) {
        return ModTreeFeatures.WEEPING_FIG_BIG_KEY;
    }
}
