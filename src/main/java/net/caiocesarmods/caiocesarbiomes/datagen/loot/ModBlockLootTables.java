package net.caiocesarmods.caiocesarbiomes.datagen.loot;

import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
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
        this.add(ModBlocks.POTTED_MONKEY_PUZZLE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.MONKEY_PUZZLE_SAPLING.get()));
        this.add(ModBlocks.MONKEY_PUZZLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MONKEY_PUZZLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.NOTHOFAGUS_LOG.get());
        this.dropSelf(ModBlocks.NOTHOFAGUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get());
        this.dropSelf(ModBlocks.NOTHOFAGUS_PLANKS.get());
        this.dropSelf(ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get());
        this.add(ModBlocks.POTTED_CRIMSON_SOUTHERN_BEECH_SAPLING.get(), createPotFlowerItemTable(ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get()));
        this.add(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get());
        this.add(ModBlocks.POTTED_ORANGE_SOUTHERN_BEECH_SAPLING.get(), createPotFlowerItemTable(ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get()));
        this.add(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_PLANKS.get());
        this.dropSelf(ModBlocks.ITALIAN_CYPRESS_SAPLING.get());
        this.add(ModBlocks.POTTED_ITALIAN_CYPRESS_SAPLING.get(), createPotFlowerItemTable(ModBlocks.ITALIAN_CYPRESS_SAPLING.get()));
        this.add(ModBlocks.ITALIAN_CYPRESS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ITALIAN_CYPRESS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.STONE_PINE_LOG.get());
        this.dropSelf(ModBlocks.STONE_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(ModBlocks.PINE_PLANKS.get());
        this.dropSelf(ModBlocks.STONE_PINE_SAPLING.get());
        this.add(ModBlocks.POTTED_STONE_PINE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.STONE_PINE_SAPLING.get()));
        this.add(ModBlocks.STONE_PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.STONE_PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.FIG_LOG.get());
        this.dropSelf(ModBlocks.JUNGLE_FIG_LOG.get());
        this.dropSelf(ModBlocks.FIG_WOOD.get());
        this.dropSelf(ModBlocks.JUNGLE_FIG_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FIG_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FIG_WOOD.get());
        this.dropSelf(ModBlocks.FIG_PLANKS.get());
        this.dropSelf(ModBlocks.FIG_SAPLING.get());
        this.add(ModBlocks.POTTED_FIG_SAPLING.get(), createPotFlowerItemTable(ModBlocks.FIG_SAPLING.get()));
        this.dropSelf(ModBlocks.WEEPING_FIG_SAPLING.get());
        this.add(ModBlocks.POTTED_WEEPING_FIG_SAPLING.get(), createPotFlowerItemTable(ModBlocks.WEEPING_FIG_SAPLING.get()));
        this.add(ModBlocks.WEEPING_FIG_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WEEPING_FIG_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.INDIAN_LAUREL_SAPLING.get());
        this.add(ModBlocks.POTTED_INDIAN_LAUREL_SAPLING.get(), createPotFlowerItemTable(ModBlocks.INDIAN_LAUREL_SAPLING.get()));
        this.add(ModBlocks.INDIAN_LAUREL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.INDIAN_LAUREL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.OLEANDER_LOG.get());
        this.dropSelf(ModBlocks.OLEANDER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OLEANDER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OLEANDER_WOOD.get());
        this.dropSelf(ModBlocks.OLEANDER_PLANKS.get());
        this.dropSelf(ModBlocks.OLEANDER_PINK_SAPLING.get());
        this.add(ModBlocks.POTTED_OLEANDER_PINK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.OLEANDER_PINK_SAPLING.get()));
        this.add(ModBlocks.OLEANDER_PINK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OLEANDER_PINK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.OLEANDER_DARK_PINK_SAPLING.get());
        this.add(ModBlocks.POTTED_OLEANDER_DARK_PINK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.OLEANDER_DARK_PINK_SAPLING.get()));
        this.add(ModBlocks.OLEANDER_DARK_PINK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OLEANDER_DARK_PINK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.OLEANDER_WHITE_SAPLING.get());
        this.add(ModBlocks.POTTED_OLEANDER_WHITE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.OLEANDER_WHITE_SAPLING.get()));
        this.add(ModBlocks.OLEANDER_WHITE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OLEANDER_WHITE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.OLEANDER_RED_SAPLING.get());
        this.add(ModBlocks.POTTED_OLEANDER_RED_SAPLING.get(), createPotFlowerItemTable(ModBlocks.OLEANDER_RED_SAPLING.get()));
        this.add(ModBlocks.OLEANDER_RED_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OLEANDER_RED_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.POMEGRANATE_LOG.get());
        this.dropSelf(ModBlocks.POMEGRANATE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_POMEGRANATE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_POMEGRANATE_WOOD.get());
        this.dropSelf(ModBlocks.POMEGRANATE_PLANKS.get());
        this.dropSelf(ModBlocks.POMEGRANATE_SAPLING.get());
        this.add(ModBlocks.POTTED_POMEGRANATE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.POMEGRANATE_SAPLING.get()));

        this.dropSelf(ModBlocks.OLIVE_LOG.get());
        this.dropSelf(ModBlocks.OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS.get());
        this.dropSelf(ModBlocks.OLIVE_SAPLING.get());
        this.add(ModBlocks.POTTED_OLIVE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.OLIVE_SAPLING.get()));

        this.dropSelf(ModBlocks.HOLM_OAK_LOG.get());
        this.dropSelf(ModBlocks.HOLM_OAK_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLM_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLM_OAK_WOOD.get());
        this.dropSelf(ModBlocks.HOLM_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.HOLM_OAK_SAPLING.get());
        this.add(ModBlocks.POTTED_HOLM_OAK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.HOLM_OAK_SAPLING.get()));
        this.add(ModBlocks.HOLM_OAK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.HOLM_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.CORK_OAK_LOG.get());
        this.dropSelf(ModBlocks.CORK_OAK_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CORK_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CORK_OAK_WOOD.get());
        this.dropSelf(ModBlocks.CORK_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.CORK_OAK_SAPLING.get());
        this.add(ModBlocks.POTTED_CORK_OAK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.CORK_OAK_SAPLING.get()));
        this.add(ModBlocks.CORK_OAK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CORK_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.STRAWBERRY_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRAWBERRY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_STRAWBERRY_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STRAWBERRY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRAWBERRY_TREE_PLANKS.get());
        this.dropSelf(ModBlocks.STRAWBERRY_TREE_SAPLING.get());
        this.add(ModBlocks.POTTED_STRAWBERRY_TREE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.STRAWBERRY_TREE_SAPLING.get()));

        this.dropSelf(ModBlocks.PLANE_LOG.get());
        this.dropSelf(ModBlocks.PLANE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PLANE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PLANE_WOOD.get());
        this.dropSelf(ModBlocks.PLANE_PLANKS.get());
        this.dropSelf(ModBlocks.PLANE_SAPLING.get());
        this.add(ModBlocks.POTTED_PLANE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.PLANE_SAPLING.get()));
        this.add(ModBlocks.PLANE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PLANE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.CRABAPPLE_PLANKS.get());
        this.dropSelf(ModBlocks.CRABAPPLE_PINK_SAPLING.get());
        this.add(ModBlocks.POTTED_CRABAPPLE_PINK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.CRABAPPLE_PINK_SAPLING.get()));
        this.add(ModBlocks.CRABAPPLE_PINK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRABAPPLE_PINK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.CRABAPPLE_WHITE_SAPLING.get());
        this.add(ModBlocks.POTTED_CRABAPPLE_WHITE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.CRABAPPLE_WHITE_SAPLING.get()));
        this.add(ModBlocks.CRABAPPLE_WHITE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRABAPPLE_WHITE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.AVOCADO_LOG.get());
        this.dropSelf(ModBlocks.AVOCADO_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_AVOCADO_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_AVOCADO_WOOD.get());
        this.dropSelf(ModBlocks.AVOCADO_PLANKS.get());
        this.dropSelf(ModBlocks.AVOCADO_SAPLING.get());
        this.add(ModBlocks.POTTED_AVOCADO_SAPLING.get(), createPotFlowerItemTable(ModBlocks.AVOCADO_SAPLING.get()));

        this.dropSelf(ModBlocks.CITRUS_LOG.get());
        this.dropSelf(ModBlocks.CITRUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CITRUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CITRUS_WOOD.get());
        this.dropSelf(ModBlocks.CITRUS_PLANKS.get());
        this.dropSelf(ModBlocks.LEMON_SAPLING.get());
        this.add(ModBlocks.POTTED_LEMON_SAPLING.get(), createPotFlowerItemTable(ModBlocks.LEMON_SAPLING.get()));
        this.dropSelf(ModBlocks.CITRON_SAPLING.get());
        this.add(ModBlocks.POTTED_CITRON_SAPLING.get(), createPotFlowerItemTable(ModBlocks.CITRON_SAPLING.get()));
        this.dropSelf(ModBlocks.BUDDHA_HAND_SAPLING.get());
        this.add(ModBlocks.POTTED_BUDDHA_HAND_SAPLING.get(), createPotFlowerItemTable(ModBlocks.BUDDHA_HAND_SAPLING.get()));
        this.dropSelf(ModBlocks.TAHITI_LIME_SAPLING.get());
        this.add(ModBlocks.POTTED_TAHITI_LIME_SAPLING.get(), createPotFlowerItemTable(ModBlocks.TAHITI_LIME_SAPLING.get()));

        this.dropSelf(ModBlocks.STARFRUIT_LOG.get());
        this.dropSelf(ModBlocks.STARFRUIT_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_STARFRUIT_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STARFRUIT_WOOD.get());
        this.dropSelf(ModBlocks.STARFRUIT_PLANKS.get());
        this.dropSelf(ModBlocks.STARFRUIT_SAPLING.get());
        this.add(ModBlocks.POTTED_STARFRUIT_SAPLING.get(), createPotFlowerItemTable(ModBlocks.STARFRUIT_SAPLING.get()));

        this.dropSelf(ModBlocks.RED_KAPOK_SAPLING.get());
        this.add(ModBlocks.POTTED_RED_KAPOK_SAPLING.get(), createPotFlowerItemTable(ModBlocks.RED_KAPOK_SAPLING.get()));
        this.add(ModBlocks.RED_KAPOK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RED_KAPOK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.POPLAR_LOG.get());
        this.dropSelf(ModBlocks.POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.POPLAR_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_POPLAR_SAPLING.get());
        this.add(ModBlocks.POTTED_BLACK_POPLAR_SAPLING.get(), createPotFlowerItemTable(ModBlocks.BLACK_POPLAR_SAPLING.get()));
        this.add(ModBlocks.BLACK_POPLAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BLACK_POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.FREMONT_COTTONWOOD_SAPLING.get());
        this.add(ModBlocks.POTTED_FREMONT_COTTONWOOD_SAPLING.get(), createPotFlowerItemTable(ModBlocks.FREMONT_COTTONWOOD_SAPLING.get()));
        this.add(ModBlocks.FREMONT_COTTONWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FREMONT_COTTONWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.BASIL.get());
        this.dropSelf(ModBlocks.PURPLE_BASIL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
