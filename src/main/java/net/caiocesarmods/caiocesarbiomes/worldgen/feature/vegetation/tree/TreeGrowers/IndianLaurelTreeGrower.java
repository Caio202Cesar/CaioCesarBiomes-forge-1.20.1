package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers;

import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IndianLaurelTreeGrower extends AbstractMegaTreeGrower {
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return ModTreeFeatures.INDIAN_LAUREL_KEY;
    }

    /**
     * @return the key of the huge variant of this tree
     */
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource pRandom) {
        return ModTreeFeatures.INDIAN_LAUREL_BIG_KEY;
    }
}
