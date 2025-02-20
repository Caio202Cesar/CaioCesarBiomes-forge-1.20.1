package net.caiocesarmods.caiocesarbiomes.datagen;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CaioCesarBiomesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ARBUTUS);
        simpleItem(ModItems.AVOCADO);
        simpleItem(ModItems.FIG);
        simpleItem(ModItems.BLACK_CURRANT);
        simpleItem(ModItems.RED_CURRANT);
        simpleItem(ModItems.MULBERRIES);
        simpleItem(ModItems.LOQUAT);
        simpleItem(ModItems.OLIVES);
        simpleItem(ModItems.POMEGRANATE);
        simpleItem(ModItems.STARFRUIT);
        simpleItem(ModItems.STARFRUIT_SLICE);

        simpleBlockItemBlockTexture(ModBlocks.BASIL);
        simpleBlockItemBlockTexture(ModBlocks.PURPLE_BASIL);

        saplingItem(ModBlocks.MONKEY_PUZZLE_SAPLING);
        saplingItem(ModBlocks.INDIAN_LAUREL_SAPLING);
        saplingItem(ModBlocks.WEEPING_FIG_SAPLING);
        saplingItem(ModBlocks.CRIMSON_SOUTHERN_BEECH_SAPLING);
        saplingItem(ModBlocks.ORANGE_SOUTHERN_BEECH_SAPLING);
        saplingItem(ModBlocks.FIG_SAPLING);
        saplingItem(ModBlocks.ITALIAN_CYPRESS_SAPLING);
        saplingItem(ModBlocks.STONE_PINE_SAPLING);
        saplingItem(ModBlocks.OLEANDER_PINK_SAPLING);
        saplingItem(ModBlocks.OLEANDER_DARK_PINK_SAPLING);
        saplingItem(ModBlocks.OLEANDER_WHITE_SAPLING);
        saplingItem(ModBlocks.OLEANDER_RED_SAPLING);
        saplingItem(ModBlocks.POMEGRANATE_SAPLING);
        saplingItem(ModBlocks.OLIVE_SAPLING);
        saplingItem(ModBlocks.HOLM_OAK_SAPLING);
        saplingItem(ModBlocks.CORK_OAK_SAPLING);
        saplingItem(ModBlocks.PLANE_SAPLING);

    }

    private void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private void simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/" + item.getId().getPath()));
    }

    private void saplingItem(RegistryObject<Block> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "block/" + item.getId().getPath()));
    }
}
