package net.caiocesarmods.caiocesarbiomes.worldgen.biome;

import com.mojang.datafixers.util.Pair;
import net.caiocesarmods.caiocesarbiomes.worldgen.biome.ModBiomes.AutumnalPewenGroveBiome;
import net.caiocesarmods.caiocesarbiomes.worldgen.biome.ModBiomes.TropicalRainforestBiome;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModEditedRegions extends Region {
    public ModEditedRegions(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint,
            ResourceKey<Biome>>> mapper) {
//Features: ponderosa pine, juniperus
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            builder.replaceBiome(Biomes.WOODED_BADLANDS, AutumnalPewenGroveBiome.NEO_WOODED_BADLANDS);
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.TEMPERATE_SEASONAL_FOREST); //Featuring a more diverse flora, with planes and other trees;
            builder.replaceBiome(Biomes.JUNGLE, TropicalRainforestBiome.TROPICAL_RAINFOREST); //Jungle fig trees spawn here and not anymore in their own biome

        });
    }
}
