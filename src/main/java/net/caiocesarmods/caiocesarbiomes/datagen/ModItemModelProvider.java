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
        simpleItem(ModItems.CHERRY_PLUM);
        simpleItem(ModItems.ELDERBERRIES);
        simpleItem(ModItems.MULBERRIES);
        simpleItem(ModItems.LOQUAT);
        simpleItem(ModItems.OLIVES);
        simpleItem(ModItems.POMEGRANATE);
        simpleItem(ModItems.STARFRUIT);
        simpleItem(ModItems.STARFRUIT_SLICE);
        simpleItem(ModItems.TAMARINDS);

        simpleBlockItemBlockTexture(ModBlocks.BASIL);
        simpleBlockItemBlockTexture(ModBlocks.PURPLE_BASIL);

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
}
