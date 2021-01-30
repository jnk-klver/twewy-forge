package com.jnk_klver.twewy.setup;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {

    //Misc
    public static final RegistryObject<Item> REAPER_WINGS = Registration.ITEMS.register("reaper_wings", () ->
            new ElytraItem(new Item.Properties().group(ItemGroup.TRANSPORTATION).maxStackSize(1)));

    //Unbranded
    public static final RegistryObject<Item> PLAYER_PIN = Registration.ITEMS.register("player_pin", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));

    public static final RegistryObject<Item> PIN_266 = Registration.ITEMS.register("pin_266", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PIN_267 = Registration.ITEMS.register("pin_267", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PIN_268 = Registration.ITEMS.register("pin_268", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PIN_269 = Registration.ITEMS.register("pin_269", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PIN_270 = Registration.ITEMS.register("pin_270", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PIN_271 = Registration.ITEMS.register("pin_271", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));

    //Jupiter Of The Monkey

    static void register() {}
}
