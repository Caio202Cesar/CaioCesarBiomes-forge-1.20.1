package net.caiocesarmods.caiocesarbiomes.datagen.loot;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

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
        this.dropSelf(ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get());
        this.add(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get());
        this.add(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_PLANKS.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_SAPLING.get());
        this.add(ModBlocks.ITALIAN_CYPRESS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ITALIAN_CYPRESS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.STONE_PINE_LOG.get());
        this.dropSelf(ModBlocks.STONE_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STONE_PINE_PLANKS.get());
        this.dropSelf(ModBlocks.STONE_PINE_SAPLING.get());
        this.add(ModBlocks.STONE_PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.STONE_PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));*/

        this.dropSelf(ModBlocks.FIG_LOG.get());
        this.dropSelf(ModBlocks.JUNGLE_FIG_LOG.get());
        this.dropSelf(ModBlocks.FIG_WOOD.get());
        this.dropSelf(ModBlocks.JUNGLE_FIG_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FIG_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FIG_WOOD.get());
        this.dropSelf(ModBlocks.FIG_PLANKS.get());
        this.dropSelf(ModBlocks.FIG_SAPLING.get());
        this.dropSelf(ModBlocks.WEEPING_FIG_SAPLING.get());
        this.dropSelf(ModBlocks.INDIAN_LAUREL_SAPLING.get());
        this.add(ModBlocks.WEEPING_FIG_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WEEPING_FIG_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.INDIAN_LAUREL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.INDIAN_LAUREL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.BASIL.get());
        this.add(ModBlocks.POTTED_BASIL.get(), createPotFlowerItemTable(ModBlocks.BASIL.get()));
        this.dropSelf(ModBlocks.PURPLE_BASIL.get());
        this.add(ModBlocks.POTTED_PURPLE_BASIL.get(), createPotFlowerItemTable(ModBlocks.PURPLE_BASIL.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
