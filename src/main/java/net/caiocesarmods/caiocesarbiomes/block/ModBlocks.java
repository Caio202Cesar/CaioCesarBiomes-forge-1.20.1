package net.caiocesarmods.caiocesarbiomes.block;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers.IndianLaurelTreeGrower;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers.MonkeyPuzzleTreeGrower;
import net.caiocesarmods.caiocesarbiomes.worldgen.feature.vegetation.tree.TreeGrowers.WeepingFigTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    //Make first the pewen grove blocks
    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_LOG = registerBlock("stripped_araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = registerBlock("stripped_araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MONKEY_PUZZLE_LEAVES = registerBlock("monkey_puzzle_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> MONKEY_PUZZLE_SAPLING = registerBlock("monkey_puzzle_sapling",
            () -> new SaplingBlock(new MonkeyPuzzleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> NOTHOFAGUS_LOG = registerBlock("nothofagus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NOTHOFAGUS_WOOD = registerBlock("nothofagus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_NOTHOFAGUS_LOG = registerBlock("stripped_nothofagus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_NOTHOFAGUS_WOOD = registerBlock("stripped_nothofagus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> NOTHOFAGUS_PLANKS = registerBlock("nothofagus_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES = registerBlock("crimson_beech_autumnal_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES = registerBlock("orange_beech_autumnal_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SOUTHERN_BEECH_LEAVES = registerBlock("southern_beech_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ITALIAN_CYPRESS_WOOD = registerBlock("italian_cypress_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ITALIAN_CYPRESS_LOG = registerBlock("stripped_italian_cypress_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ITALIAN_CYPRESS_WOOD = registerBlock("stripped_italian_cypress_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ITALIAN_CYPRESS_PLANKS = registerBlock("italian_cypress_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LEAVES = registerBlock("italian_cypress_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STONE_PINE_LOG = registerBlock("stone_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STONE_PINE_WOOD = registerBlock("stone_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STONE_PINE_LOG = registerBlock("stripped_stone_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STONE_PINE_WOOD = registerBlock("stripped_stone_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STONE_PINE_PLANKS = registerBlock("stone_pine_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STONE_PINE_LEAVES = registerBlock("stone_pine_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> OLEANDER_LOG = registerBlock("oleander_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> OLEANDER_PLANKS = registerBlock("oleander_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLEANDER_WHITE_LEAVES = registerBlock("oleander_white_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLEANDER_PINK_LEAVES = registerBlock("oleander_pink_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_LEAVES = registerBlock("oleander_dark_pink_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLEANDER_RED_LEAVES = registerBlock("oleander_red_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FIG_LOG = registerBlock("stripped_fig_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> FIG_WOOD = registerBlock("fig_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> JUNGLE_FIG_WOOD = registerBlock("jungle_fig_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FIG_WOOD = registerBlock("stripped_fig_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> FIG_PLANKS = registerBlock("fig_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WEEPING_FIG_LEAVES = registerBlock("weeping_fig_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WEEPING_FIG_SAPLING = registerBlock("weeping_fig_sapling",
            () -> new SaplingBlock(new WeepingFigTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> INDIAN_LAUREL_LEAVES = registerBlock("indian_laurel_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> INDIAN_LAUREL_SAPLING = registerBlock("indian_laurel_sapling",
            () -> new SaplingBlock(new IndianLaurelTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> FICUS_ROOTS = registerBlock("ficus_roots",
            () -> new WeepingVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)));
    public static final RegistryObject<Block> FICUS_ROOTS_PLANT = registerBlock("ficus_roots_plant",
            () -> new WeepingVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)));

    public static final RegistryObject<Block> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POMEGRANATE_LEAVES = registerBlock("pomegranate_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> OLIVE_WOOD = registerBlock("olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = registerBlock("stripped_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CORK_OAK_LOG = registerBlock("cork_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CORK_OAK_WOOD = registerBlock("cork_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_LOG = registerBlock("stripped_cork_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_WOOD = registerBlock("stripped_cork_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CORK_OAK_PLANKS = registerBlock("cork_oak_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORK_OAK_LEAVES = registerBlock("cork_oak_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> HOLM_OAK_LOG = registerBlock("holm_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> HOLM_OAK_WOOD = registerBlock("holm_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HOLM_OAK_LOG = registerBlock("stripped_holm_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HOLM_OAK_WOOD = registerBlock("stripped_holm_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> HOLM_OAK_PLANKS = registerBlock("holm_oak_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> KERMES_OAK_LOG = registerBlock("kermes_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> KERMES_OAK_WOOD = registerBlock("kermes_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_KERMES_OAK_LOG = registerBlock("stripped_kermes_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_KERMES_OAK_WOOD = registerBlock("stripped_kermes_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> KERMES_OAK_PLANKS = registerBlock("kermes_oak_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KERMES_OAK_LEAVES = registerBlock("kermes_oak_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //Temperate Seasonal Forest features = that biomes replaces regular forest
    public static final RegistryObject<Block> PLANE_LOG = registerBlock("plane_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PLANE_WOOD = registerBlock("plane_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PLANE_LOG = registerBlock("stripped_plane_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PLANE_WOOD = registerBlock("stripped_plane_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PLANE_PLANKS = registerBlock("plane_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PLANE_LEAVES = registerBlock("plane_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CRABAPPLE_WOOD = registerBlock("crabapple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_LOG = registerBlock("stripped_crabapple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_WOOD = registerBlock("stripped_crabapple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerBlock("crabapple_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CRABAPPLE_PINK_LEAVES = registerBlock("crabapple_pink_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CRABAPPLE_WHITE_LEAVES = registerBlock("crabapple_white_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //Sweet Chestnut, just as Liquambar, also gens in Subtropical Seasonal Forest
    public static final RegistryObject<Block> SWEET_CHESTNUT_LOG = registerBlock("sweet_chestnut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> SWEET_CHESTNUT_WOOD = registerBlock("sweet_chestnut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SWEET_CHESTNUT_LOG = registerBlock("stripped_sweet_chestnut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SWEET_CHESTNUT_WOOD = registerBlock("stripped_sweet_chestnut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> SWEET_CHESTNUT_PLANKS = registerBlock("sweet_chestnut_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SWEET_CHESTNUT_LEAVES = registerBlock("sweet_chestnut_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //Tropical Rainforest (replaces Jungle) Features
    public static final RegistryObject<Block> AVOCADO_LOG = registerBlock("avocado_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> AVOCADO_WOOD = registerBlock("avocado_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_AVOCADO_LOG = registerBlock("stripped_avocado_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_AVOCADO_WOOD = registerBlock("stripped_avocado_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> AVOCADO_PLANKS = registerBlock("avocado_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CITRUS_WOOD = registerBlock("citrus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CITRUS_LOG = registerBlock("stripped_citrus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CITRUS_WOOD = registerBlock("stripped_citrus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CITRUS_PLANKS = registerBlock("avocado_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CITRON_LEAVES = registerBlock("citron_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BUDDHA_HAND_LEAVES = registerBlock("buddha_hand_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> TAHITI_LIME_LEAVES = registerBlock("tahiti_lime_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STARFRUIT_LOG = registerBlock("starfruit_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STARFRUIT_WOOD = registerBlock("starfruit_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STARFRUIT_LOG = registerBlock("stripped_starfruit_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STARFRUIT_WOOD = registerBlock("stripped_starfruit_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STARFRUIT_PLANKS = registerBlock("starfruit_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STARFRUIT_LEAVES = registerBlock("starfruit_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> TROPICAL_HIBISCUS = registerBlock("tropical_hibiscus",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));
    public static final RegistryObject<Block> SPIDER_LILY = registerBlock("spider_lily",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)));

    public static final RegistryObject<Block> BASIL = registerBlock("basil",
            () -> new FlowerBlock(BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> PURPLE_BASIL = registerBlock("purple_basil",
            () -> new FlowerBlock(BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    //Badlands
    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FREMONT_COTTONWOOD_PLANKS = registerBlock("fremont_cottonwood_planks",
            () -> new ModPlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
