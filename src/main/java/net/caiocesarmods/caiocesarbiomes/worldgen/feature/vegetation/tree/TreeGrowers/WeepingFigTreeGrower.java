package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers;

import net.caiocesarmods.caiocesarbiomes.data.worldgen.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class WeepingFigTreeGrower extends AbstractMegaTreeGrower {
    /**
     * @param pRandom
     * @return the key of the huge variant of this tree
     */
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource pRandom) {
        return ModTreeFeatures.WEEPING_FIG_BIG_KEY;
    }

    /**
     * @param pRandom
     * @param pHasFlowers
     * @return the key of this tree
     */
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModTreeFeatures.WEEPING_FIG_KEY;
    }
}
