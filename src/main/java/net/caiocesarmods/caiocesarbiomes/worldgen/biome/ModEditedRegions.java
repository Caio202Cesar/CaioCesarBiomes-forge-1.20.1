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
            //Badlands
            builder.replaceBiome(Biomes.WOODED_BADLANDS, AutumnalPewenGroveBiome.NEO_WOODED_BADLANDS);
            //Temperate Badlands
            //Outback = subtropical badlands

            //Forest
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.TEMPERATE_DECIDUOUS_FOREST); //It is basically the Vanilla Forest biome, but featuring a more diverse flora, with planes and other trees;
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.SUBTROPICAL_DECIDUOUS_FOREST); //Warmer/subtropical variant
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.CONTINENTAL_MIXED_FOREST); //Or Hemiboreal Forest, the colder variant
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.JAPANESE_MAPLE_GROVE);
            builder.replaceBiome(Biomes.FOREST, AutumnalPewenGroveBiome.SUBTROPICAL_LAUREL_FOREST);

            //Windswept Forest
            builder.replaceBiome(Biomes.WINDSWEPT_FOREST, AutumnalPewenGroveBiome.AUTUMNAL_PEWEN_CONIFEROUS_GROVE);//Colder variant without crape myrtles.
            builder.replaceBiome(Biomes.WINDSWEPT_FOREST, AutumnalPewenGroveBiome.MOUNTAINOUS_JAPANESE_MAPLE_GROVE);//Colder variant without crape myrtles.

            //Jungle
            builder.replaceBiome(Biomes.JUNGLE, TropicalRainforestBiome.TROPICAL_RAINFOREST); //Jungle biome recreated with more diverse flora. Jungle fig trees spawn here and not anymore in their own biome

            //Tropical wet-dry
            builder.replaceBiome(Biomes.SAVANNA, TropicalSavannaBiome.TROPICAL_SAVANNA); //The vanilla savanna with more flora
            builder.replaceBiome(Biomes.SAVANNA, TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST); //Wetter
            builder.replaceBiome(Biomes.SAVANNA, TropicalDryEucalyptusForestBiome.TROPICAL_SEASONAL_FOREST); //Jungle fig trees spawn here and not anymore in their own biome

            //Beach
            builder.replaceBiome(Biomes.BEACH, HumidTropicalBeachBiome.HUMID_TROPICAL_BEACH);
            builder.replaceBiome(Biomes.BEACH, HumidSubtropicalBeachBiome.HUMID_SUBTROPICAL_BEACH);
            builder.replaceBiome(Biomes.BEACH, HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH);
            builder.replaceBiome(Biomes.BEACH, HumidTemperateBeachBiome.HUMID_TEMPERATE_BEACH);

            //River
            builder.replaceBiome(Biomes.RIVER, TropicalDesertRiver.TROPICAL_DESERT_RIVER);
            builder.replaceBiome(Biomes.RIVER, HumidSubtropicalBeachBiome.HUMID_SUBTROPICAL_BEACH);
            builder.replaceBiome(Biomes.RIVER, HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH);
            builder.replaceBiome(Biomes.RIVER, HumidTemperateBeachBiome.HUMID_TEMPERATE_BEACH);

            //Tundra
            builder.replaceBiome(Biomes.SNOWY_PLAINS, TussockTundraBiome.TUSSOCK_TUNDRA_BIOME);
            builder.replaceBiome(Biomes.SNOWY_PLAINS, GravellyTundraBiome.GRAVELLY_TUNDRA_BIOME);

            //Desert
            builder.replaceBiome(Biomes.DESERT, SahelBiome.STEPPIC_SAVANNA);
            builder.replaceBiome(Biomes.DESERT, TropicalDesertBiome.TROPICAL_DESERT);
            builder.replaceBiome(Biomes.DESERT, SubtropicalDesertBiome.SUBTROPICAL_DESERT);
            builder.replaceBiome(Biomes.DESERT, CoastalSubtropicalDesertBiome.COASTAL_SUBTROPICAL_DESERT);
            builder.replaceBiome(Biomes.DESERT, HumidTemperateBeachBiome.HUMID_TEMPERATE_BEACH);
        });
    }
}
