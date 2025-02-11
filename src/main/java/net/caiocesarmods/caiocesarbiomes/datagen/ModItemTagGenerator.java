package net.caiocesarmods.caiocesarbiomes.datagen;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CaioCesarBiomesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.ARAUCARIA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get().asItem())
                .add(ModBlocks.JUNGLE_FIG_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FIG_LOG.get().asItem())
                .add(ModBlocks.JUNGLE_FIG_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FIG_WOOD.get().asItem())
        ;

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.ARAUCARIA_PLANKS.get().asItem())
                .add(ModBlocks.FIG_PLANKS.get().asItem());
    }
}
