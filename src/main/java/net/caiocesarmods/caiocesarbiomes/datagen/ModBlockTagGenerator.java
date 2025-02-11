package net.caiocesarmods.caiocesarbiomes.datagen;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CaioCesarBiomesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ARAUCARIA_LOG.get())
                .add(ModBlocks.ARAUCARIA_WOOD.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get())

                /*.add(ModBlocks.NOTHOFAGUS_LOG.get())
                .add(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get())
                .add(ModBlocks.NOTHOFAGUS_WOOD.get())
                .add(ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get())*/

                .add(ModBlocks.JUNGLE_FIG_LOG.get())
                .add(ModBlocks.STRIPPED_FIG_LOG.get())
                .add(ModBlocks.JUNGLE_FIG_WOOD.get())
                .add(ModBlocks.STRIPPED_FIG_WOOD.get())
        ;

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ARAUCARIA_PLANKS.get())
                //.add(ModBlocks.NOTHOFAGUS_PLANKS.get())
                .add(ModBlocks.FIG_PLANKS.get())
        ;

    }
}
