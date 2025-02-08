package net.caiocesarmods.caiocesarbiomes.datagen;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.worldgen.biome.ModBiomes.AutumnalPewenGroveBiome;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.BIOME, AutumnalPewenGroveBiome::bootstrap);



    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, Set<String> modIds) {
        super(output, registries, BUILDER, Set.of(CaioCesarBiomesMod.MOD_ID));
    }
}
