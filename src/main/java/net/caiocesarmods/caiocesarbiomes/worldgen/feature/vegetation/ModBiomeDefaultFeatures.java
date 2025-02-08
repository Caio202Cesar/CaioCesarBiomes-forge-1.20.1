package net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation;

import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModBiomeDefaultFeatures {
    public static void addMonkeyPuzzleTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREES_MONKEY_PUZZLE);

    }
}
