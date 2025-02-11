package net.caiocesarmods.caiocesarbiomes.item;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaioCesarBiomesMod.MOD_ID);

    //Fruits and Nuts
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIG = ITEMS.register("figfruit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARBUTUS = ITEMS.register("arbutus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MULBERRIES = ITEMS.register("mulberries",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOQUAT = ITEMS.register("loquat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_CURRANT = ITEMS.register("red_currant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CURRANT = ITEMS.register("black_currant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARFRUIT = ITEMS.register("starfruit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARFRUIT_SLICE = ITEMS.register("starfruit_slice",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
