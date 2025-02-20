package net.caiocesarmods.caiocesarbiomes;

import com.mojang.logging.LogUtils;
import net.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.caiocesarmods.caiocesarbiomes.item.ModCreativeModeTabs;
import net.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.caiocesarmods.caiocesarbiomes.worldgen.biome.ModTerrablender;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CaioCesarBiomesMod.MOD_ID)
public class CaioCesarBiomesMod {
    public static final String MOD_ID = "caiocesarbiomes";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CaioCesarBiomesMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        //ModTerrablender.registerBiomes();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_KAPOK_SAPLING.getId(), ModBlocks.POTTED_RED_KAPOK_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AVOCADO_SAPLING.getId(), ModBlocks.POTTED_AVOCADO_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FREMONT_COTTONWOOD_SAPLING.getId(), ModBlocks.POTTED_FREMONT_COTTONWOOD_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_POPLAR_SAPLING.getId(), ModBlocks.POTTED_BLACK_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TAHITI_LIME_SAPLING.getId(), ModBlocks.POTTED_TAHITI_LIME_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LEMON_SAPLING.getId(), ModBlocks.POTTED_LEMON_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CITRON_SAPLING.getId(), ModBlocks.POTTED_CITRON_SAPLING);

        });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.AVOCADO);
            event.accept(ModItems.ARBUTUS);
            event.accept(ModItems.FIG);
            event.accept(ModItems.BLACK_CURRANT);
            event.accept(ModItems.RED_CURRANT);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
