package net.caiocesarmods.caiocesarbiomes.data.worldgen.biome;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {

    public static ResourceKey<Biome> createKey(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name));
    }
}
