package net.caiocesarmods.caiocesarbiomes.item;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAIO_CESAR_BIOMES_TAB = CREATIVE_MODE_TABS
            .register("caio_cesar_biomes_tab", () -> CreativeModeTab.builder().icon(() ->
                    new ItemStack(ModItems.AVOCADO.get())).title(Component.translatable("creativetab.caio_cesar_biomes_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.ARAUCARIA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_ARAUCARIA_LOG.get());
                        output.accept(ModBlocks.ARAUCARIA_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());
                        output.accept(ModBlocks.ARAUCARIA_PLANKS.get());
                        output.accept(ModBlocks.MONKEY_PUZZLE_LEAVES.get());

                        output.accept(ModBlocks.BASIL.get());
                        output.accept(ModBlocks.PURPLE_BASIL.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
