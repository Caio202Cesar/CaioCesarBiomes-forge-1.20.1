package net.caiocesarmods.caiocesarbiomes.worldgen.biome;
/*
import com.mojang.datafixers.util.Pair;
import net.caiocesarmods.caiocesarbiomes.worldgen.biome.ModBiomes.AutumnalPewenGroveBiome;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class ModOverworldRegions extends Region {
    public ModOverworldRegions(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        // The parameters for this biome are chosen arbitrarily.
        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.span(ParameterUtils.Temperature.COOL, ParameterUtils.Temperature.COOL))
                .humidity(ParameterUtils.Humidity.span(ParameterUtils.Humidity.WET, ParameterUtils.Humidity.HUMID))
                .continentalness(ParameterUtils.Continentalness.MID_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_0, ParameterUtils.Erosion.EROSION_1)
                .depth(ParameterUtils.Depth.FLOOR, ParameterUtils.Depth.FLOOR)
                .weirdness(ParameterUtils.Weirdness.PEAK_NORMAL, ParameterUtils.Weirdness.PEAK_VARIANT)
                .build().forEach(point -> builder.add(point, MediterraneanConiferousSavannaBiome.MEDITERRANEAN_CONIFEROUS_SAVANNA));

        // Add our points to the mapper
        builder.build().forEach(mapper);
    }
}*/
