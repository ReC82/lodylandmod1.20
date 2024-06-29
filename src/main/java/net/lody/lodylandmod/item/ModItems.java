package net.lody.lodylandmod.item;

import net.lody.lodylandmod.LodyLandMod;
import net.lody.lodylandmod.item.custom.CharcoalDetector;
import net.lody.lodylandmod.item.custom.FuelItem;
import net.lody.lodylandmod.item.custom.IronDetector;
import net.lody.lodylandmod.item.custom.LavaDetector;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LodyLandMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAVA_DETECTOR = ITEMS.register("lava_detector",
            () -> new LavaDetector(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> CHARCOAL_DETECTOR = ITEMS.register("charcoal_detector",
            () -> new CharcoalDetector(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> IRON_DETECTOR = ITEMS.register("iron_detector",
            () -> new IronDetector(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> MAGNETIC_COIL = ITEMS.register("magnetic_coil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eb) {
        ITEMS.register(eb);
    }
}
