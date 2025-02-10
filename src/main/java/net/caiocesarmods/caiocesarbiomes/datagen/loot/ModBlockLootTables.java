package net.caiocesarmods.caiocesarbiomes.datagen.loot;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

//Ver tutorial sobre DataGen
public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ARAUCARIA_LOG.get());
        this.dropSelf(ModBlocks.ARAUCARIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ARAUCARIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());
        this.dropSelf(ModBlocks.ARAUCARIA_PLANKS.get());
        this.dropSelf(ModBlocks.MONKEY_PUZZLE_SAPLING.get());
        this.add(ModBlocks.MONKEY_PUZZLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MONKEY_PUZZLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.NOTHOFAGUS_LOG.get());
        this.dropSelf(ModBlocks.NOTHOFAGUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get());
        this.dropSelf(ModBlocks.NOTHOFAGUS_PLANKS.get());

        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_PLANKS.get());

        this.dropSelf(ModBlocks.STONE_PINE_LOG.get());
        this.dropSelf(ModBlocks.STONE_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STONE_PINE_PLANKS.get());

        this.dropSelf(ModBlocks.BASIL.get());
        this.add(ModBlocks.POTTED_BASIL.get(), createPotFlowerItemTable(ModBlocks.BASIL.get()));
        this.dropSelf(ModBlocks.PURPLE_BASIL.get());
        this.add(ModBlocks.POTTED_PURPLE_BASIL.get(), createPotFlowerItemTable(ModBlocks.PURPLE_BASIL.get()));
    }
}
