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
        //Monkey Puzzle and Bunya Pine leaves are made through traditional json
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

        logBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_WOOD.get()), blockTexture(ModBlocks.CRABAPPLE_LOG.get()), blockTexture(ModBlocks.CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_crabapple_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()));

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
        saplingBlock(ModBlocks.INDIAN_LAUREL_SAPLING);
        saplingBlock(ModBlocks.FIG_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.ITALIAN_CYPRESS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ITALIAN_CYPRESS_WOOD.get()), blockTexture(ModBlocks.ITALIAN_CYPRESS_LOG.get()),
                blockTexture(ModBlocks.ITALIAN_CYPRESS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()), blockTexture(ModBlocks.STRIPPED_PLANE_LOG.get()),
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/stripped_italian_cypress_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PLANE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get()));
        leavesBlock(ModBlocks.ITALIAN_CYPRESS_LEAVES);
        saplingBlock(ModBlocks.ITALIAN_CYPRESS_SAPLING);

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
