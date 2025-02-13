package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers;

import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class CrimsonAutumnalSouthernBeechTreeGrower extends AbstractTreeGrower {
    /**
     * @param pRandom
     * @param pHasFlowers
     * @return the key of this tree
     */
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        if (pRandom.nextInt(10) == 0) {
            return ModTreeFeatures.WINDSWEPT_AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY;
        } else {
            return ModTreeFeatures.AUTUMNAL_CRIMSON_SOUTHERN_BEECH_KEY;
        }
    }
}
