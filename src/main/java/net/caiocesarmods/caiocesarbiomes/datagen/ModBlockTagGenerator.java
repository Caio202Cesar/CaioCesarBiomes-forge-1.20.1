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

                .add(ModBlocks.NOTHOFAGUS_LOG.get())
                .add(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get())
                .add(ModBlocks.NOTHOFAGUS_WOOD.get())
                .add(ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get())

                .add(ModBlocks.JUNGLE_FIG_LOG.get())
                .add(ModBlocks.FIG_LOG.get())
                .add(ModBlocks.STRIPPED_FIG_LOG.get())
                .add(ModBlocks.JUNGLE_FIG_WOOD.get())
                .add(ModBlocks.FIG_WOOD.get())
                .add(ModBlocks.STRIPPED_FIG_WOOD.get())

                .add(ModBlocks.ITALIAN_CYPRESS_LOG.get())
                .add(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get())
                .add(ModBlocks.ITALIAN_CYPRESS_WOOD.get())
                .add(ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get())

                .add(ModBlocks.STONE_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STONE_PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get())

                .add(ModBlocks.OLEANDER_LOG.get())
                .add(ModBlocks.STRIPPED_OLEANDER_LOG.get())
                .add(ModBlocks.OLEANDER_WOOD.get())
                .add(ModBlocks.STRIPPED_OLEANDER_WOOD.get())

                .add(ModBlocks.POMEGRANATE_LOG.get())
                .add(ModBlocks.STRIPPED_POMEGRANATE_LOG.get())
                .add(ModBlocks.POMEGRANATE_WOOD.get())
                .add(ModBlocks.STRIPPED_POMEGRANATE_WOOD.get())

                .add(ModBlocks.OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get())
                .add(ModBlocks.OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get())

                .add(ModBlocks.CORK_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_CORK_OAK_LOG.get())
                .add(ModBlocks.CORK_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_CORK_OAK_WOOD.get())

                .add(ModBlocks.HOLM_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_HOLM_OAK_LOG.get())
                .add(ModBlocks.HOLM_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_HOLM_OAK_WOOD.get())

                .add(ModBlocks.PLANE_LOG.get())
                .add(ModBlocks.STRIPPED_PLANE_LOG.get())
                .add(ModBlocks.PLANE_WOOD.get())
                .add(ModBlocks.STRIPPED_PLANE_WOOD.get())

                .add(ModBlocks.CRABAPPLE_LOG.get())
                .add(ModBlocks.STRIPPED_CRABAPPLE_LOG.get())
                .add(ModBlocks.CRABAPPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get())

                .add(ModBlocks.AVOCADO_LOG.get())
                .add(ModBlocks.STRIPPED_AVOCADO_LOG.get())
                .add(ModBlocks.AVOCADO_WOOD.get())
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD.get())

                .add(ModBlocks.STRAWBERRY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_STRAWBERRY_TREE_LOG.get())
                .add(ModBlocks.STRAWBERRY_TREE_WOOD.get())
                .add(ModBlocks.STRIPPED_STRAWBERRY_TREE_WOOD.get())

                .add(ModBlocks.CITRUS_LOG.get())
                .add(ModBlocks.STRIPPED_CITRUS_LOG.get())
                .add(ModBlocks.CITRUS_WOOD.get())
                .add(ModBlocks.STRIPPED_CITRUS_WOOD.get())
        ;

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ARAUCARIA_PLANKS.get())
                .add(ModBlocks.NOTHOFAGUS_PLANKS.get())
                .add(ModBlocks.FIG_PLANKS.get())
                .add(ModBlocks.ITALIAN_CYPRESS_PLANKS.get())
                .add(ModBlocks.PINE_PLANKS.get())
                .add(ModBlocks.OLEANDER_PLANKS.get())
                .add(ModBlocks.POMEGRANATE_PLANKS.get())
                .add(ModBlocks.OLIVE_PLANKS.get())
                .add(ModBlocks.CORK_OAK_PLANKS.get())
                .add(ModBlocks.HOLM_OAK_PLANKS.get())
                .add(ModBlocks.PLANE_PLANKS.get())
                .add(ModBlocks.CRABAPPLE_PLANKS.get())
                .add(ModBlocks.AVOCADO_PLANKS.get())
                .add(ModBlocks.STRAWBERRY_TREE_PLANKS.get())
                .add(ModBlocks.CITRUS_PLANKS.get())

        ;

    }
}
