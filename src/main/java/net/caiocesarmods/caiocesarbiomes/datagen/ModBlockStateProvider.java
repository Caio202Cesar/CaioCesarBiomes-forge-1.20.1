package net.caiocesarmods.caiocesarbiomes.datagen;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CaioCesarBiomesMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.ARAUCARIA_LOG.get()), blockTexture(ModBlocks.ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_araucaria_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()));
        saplingBlock(ModBlocks.MONKEY_PUZZLE_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.NOTHOFAGUS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.NOTHOFAGUS_WOOD.get()), blockTexture(ModBlocks.NOTHOFAGUS_LOG.get()), blockTexture(ModBlocks.NOTHOFAGUS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get()), blockTexture(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_nothofagus_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get()), blockTexture(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get()));
        leavesBlock(ModBlocks.CRIMSON_SOUTHERN_BEECH_AUTUMNAL_LEAVES);
        leavesBlock(ModBlocks.ORANGE_SOUTHERN_BEECH_AUTUMNAL_LEAVES);
        saplingBlock(ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING);
        saplingBlock(ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.PLANE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PLANE_WOOD.get()), blockTexture(ModBlocks.PLANE_LOG.get()), blockTexture(ModBlocks.PLANE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PLANE_LOG.get()), blockTexture(ModBlocks.STRIPPED_PLANE_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_plane_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PLANE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PLANE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PLANE_LOG.get()));
        leavesBlock(ModBlocks.PLANE_LEAVES);
        saplingBlock(ModBlocks.PLANE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_PLANE_SAPLING.get(), models().singleTexture("potted_plane_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PLANE_SAPLING.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_WOOD.get()), blockTexture(ModBlocks.CRABAPPLE_LOG.get()), blockTexture(ModBlocks.CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_crabapple_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()));
        leavesBlock(ModBlocks.CRABAPPLE_PINK_LEAVES);
        leavesBlock(ModBlocks.CRABAPPLE_WHITE_LEAVES);
        saplingBlock(ModBlocks.CRABAPPLE_PINK_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_CRABAPPLE_PINK_SAPLING.get(), models().singleTexture("potted_crabapple_pink_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CRABAPPLE_PINK_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.CRABAPPLE_WHITE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_CRABAPPLE_WHITE_SAPLING.get(), models().singleTexture("potted_crabapple_white_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.CRABAPPLE_WHITE_SAPLING.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.FIG_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FIG_WOOD.get()), blockTexture(ModBlocks.FIG_LOG.get()), blockTexture(ModBlocks.FIG_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.JUNGLE_FIG_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.JUNGLE_FIG_WOOD.get()), blockTexture(ModBlocks.JUNGLE_FIG_LOG.get()), blockTexture(ModBlocks.JUNGLE_FIG_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FIG_LOG.get()), blockTexture(ModBlocks.STRIPPED_FIG_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_fig_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FIG_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FIG_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FIG_LOG.get()));
        leavesBlock(ModBlocks.WEEPING_FIG_LEAVES);
        leavesBlock(ModBlocks.INDIAN_LAUREL_LEAVES);
        saplingBlock(ModBlocks.WEEPING_FIG_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WEEPING_FIG_SAPLING.get(), models().singleTexture("potted_weeping_fig_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.WEEPING_FIG_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.INDIAN_LAUREL_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_INDIAN_LAUREL_SAPLING.get(), models().singleTexture("potted_indian_laurel_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.INDIAN_LAUREL_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.FIG_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_FIG_SAPLING.get(), models().singleTexture("potted_fig_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.FIG_SAPLING.get())).renderType("cutout"));


        logBlock(((RotatedPillarBlock) ModBlocks.ITALIAN_CYPRESS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ITALIAN_CYPRESS_WOOD.get()), blockTexture(ModBlocks.ITALIAN_CYPRESS_LOG.get()),
                blockTexture(ModBlocks.ITALIAN_CYPRESS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()), blockTexture(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_italian_cypress_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()));
        leavesBlock(ModBlocks.ITALIAN_CYPRESS_LEAVES);
        saplingBlock(ModBlocks.ITALIAN_CYPRESS_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_ITALIAN_CYPRESS_SAPLING.get(), models().singleTexture("potted_italian_cypress_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.ITALIAN_CYPRESS_SAPLING.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.STONE_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STONE_PINE_WOOD.get()), blockTexture(ModBlocks.STONE_PINE_LOG.get()),
                blockTexture(ModBlocks.STONE_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_LOG.get()), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()));
        leavesBlock(ModBlocks.STONE_PINE_LEAVES);
        saplingBlock(ModBlocks.STONE_PINE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_STONE_PINE_SAPLING.get(), models().singleTexture("potted_stone_pine_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.STONE_PINE_SAPLING.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.OLEANDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.OLEANDER_WOOD.get()), blockTexture(ModBlocks.OLEANDER_LOG.get()),
                blockTexture(ModBlocks.OLEANDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OLEANDER_LOG.get()), blockTexture(ModBlocks.STRIPPED_OLEANDER_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_oleander_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OLEANDER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_OLEANDER_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_OLEANDER_LOG.get()));
        leavesBlock(ModBlocks.OLEANDER_RED_LEAVES);
        leavesBlock(ModBlocks.OLEANDER_PINK_LEAVES);
        leavesBlock(ModBlocks.OLEANDER_DARK_PINK_LEAVES);
        leavesBlock(ModBlocks.OLEANDER_WHITE_LEAVES);
        saplingBlock(ModBlocks.OLEANDER_RED_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_OLEANDER_RED_SAPLING.get(), models().singleTexture("potted_oleander_red_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OLEANDER_RED_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.OLEANDER_WHITE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_OLEANDER_WHITE_SAPLING.get(), models().singleTexture("potted_oleander_white_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OLEANDER_WHITE_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.OLEANDER_PINK_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_OLEANDER_PINK_SAPLING.get(), models().singleTexture("potted_oleander_pink_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OLEANDER_PINK_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.OLEANDER_DARK_PINK_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_OLEANDER_DARK_PINK_SAPLING.get(), models().singleTexture("potted_oleander_dark_pink_sapling",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.OLEANDER_DARK_PINK_SAPLING.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.HOLM_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HOLM_OAK_WOOD.get()), blockTexture(ModBlocks.HOLM_OAK_LOG.get()),
                blockTexture(ModBlocks.HOLM_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLM_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_HOLM_OAK_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_holm_oak_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLM_OAK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_HOLM_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_HOLM_OAK_LOG.get()));
        leavesBlock(ModBlocks.HOLM_OAK_LEAVES);
        saplingBlock(ModBlocks.HOLM_OAK_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.CORK_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CORK_OAK_WOOD.get()), blockTexture(ModBlocks.CORK_OAK_LOG.get()),
                blockTexture(ModBlocks.CORK_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CORK_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_CORK_OAK_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_cork_oak_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CORK_OAK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CORK_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CORK_OAK_LOG.get()));
        leavesBlock(ModBlocks.CORK_OAK_LEAVES);
        saplingBlock(ModBlocks.CORK_OAK_SAPLING);

        blockItem(ModBlocks.ARAUCARIA_LOG);
        blockItem(ModBlocks.ARAUCARIA_WOOD);
        blockItem(ModBlocks.STRIPPED_ARAUCARIA_LOG);
        blockItem(ModBlocks.STRIPPED_ARAUCARIA_WOOD);
        blockWithItem(ModBlocks.ARAUCARIA_PLANKS);

        blockItem(ModBlocks.NOTHOFAGUS_LOG);
        blockItem(ModBlocks.NOTHOFAGUS_WOOD);
        blockItem(ModBlocks.STRIPPED_NOTHOFAGUS_LOG);
        blockItem(ModBlocks.STRIPPED_NOTHOFAGUS_WOOD);
        blockWithItem(ModBlocks.NOTHOFAGUS_PLANKS);

        blockItem(ModBlocks.PLANE_LOG);
        blockItem(ModBlocks.PLANE_WOOD);
        blockItem(ModBlocks.STRIPPED_PLANE_LOG);
        blockItem(ModBlocks.STRIPPED_PLANE_WOOD);
        blockWithItem(ModBlocks.PLANE_PLANKS);

        blockItem(ModBlocks.FIG_LOG);
        blockItem(ModBlocks.FIG_WOOD);
        blockItem(ModBlocks.JUNGLE_FIG_LOG);
        blockItem(ModBlocks.JUNGLE_FIG_WOOD);
        blockItem(ModBlocks.STRIPPED_FIG_LOG);
        blockItem(ModBlocks.STRIPPED_FIG_WOOD);
        blockWithItem(ModBlocks.FIG_PLANKS);

        blockItem(ModBlocks.ITALIAN_CYPRESS_LOG);
        blockItem(ModBlocks.ITALIAN_CYPRESS_WOOD);
        blockItem(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG);
        blockItem(ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD);
        blockWithItem(ModBlocks.ITALIAN_CYPRESS_PLANKS);

        blockItem(ModBlocks.STONE_PINE_LOG);
        blockItem(ModBlocks.STONE_PINE_WOOD);
        blockItem(ModBlocks.STRIPPED_PINE_LOG);
        blockItem(ModBlocks.STRIPPED_PINE_WOOD);
        blockWithItem(ModBlocks.PINE_PLANKS);

        blockItem(ModBlocks.HOLM_OAK_LOG);
        blockItem(ModBlocks.HOLM_OAK_WOOD);
        blockItem(ModBlocks.STRIPPED_HOLM_OAK_LOG);
        blockItem(ModBlocks.STRIPPED_HOLM_OAK_WOOD);
        blockWithItem(ModBlocks.HOLM_OAK_PLANKS);

        blockItem(ModBlocks.CORK_OAK_LOG);
        blockItem(ModBlocks.CORK_OAK_WOOD);
        blockItem(ModBlocks.STRIPPED_CORK_OAK_LOG);
        blockItem(ModBlocks.STRIPPED_CORK_OAK_WOOD);
        blockWithItem(ModBlocks.CORK_OAK_PLANKS);

        simpleBlockWithItem(ModBlocks.BASIL.get(), models().cross(blockTexture(ModBlocks.BASIL.get()).getPath(),
                blockTexture(ModBlocks.BASIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BASIL.get(), models().singleTexture("potted_basil",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.BASIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PURPLE_BASIL.get(), models().cross(blockTexture(ModBlocks.PURPLE_BASIL.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_BASIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_BASIL.get(), models().singleTexture("potted_purple_basil",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.PURPLE_BASIL.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(CaioCesarBiomesMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
