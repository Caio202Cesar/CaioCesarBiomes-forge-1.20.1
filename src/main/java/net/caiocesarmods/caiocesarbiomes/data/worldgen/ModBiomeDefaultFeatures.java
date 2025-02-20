package net.caiocesarmods.caiocesarbiomes.data.worldgen;

import net.caiocesarmods.caiocesarbiomes.data.worldgen.placement.ModVegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModBiomeDefaultFeatures {
    public static void addMonkeyPuzzleTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREES_MONKEY_PUZZLE);
    }
    public static void addJungleFigTrees(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREES_JUNGLE_FIG);
    }
    public static void addOleanderShrubs(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.OLEANDER);
    }
    public static void addScrublandOleanderShrubs(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.SCRUBLAND_OLEANDER);
    }
    public static void addMediterraneanConifers(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.MEDITERRANEAN_CONIFERS);
    }
    public static void addScrublandMediterraneanConifers(BiomeGenerationSettings.Builder pBuilder) {
        pBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.SCRUBLAND_MEDITERRANEAN_CONIFERS);
    }
}
