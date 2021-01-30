package com.jnk_klver.twewy.setup;

import com.jnk_klver.twewy.TwewyMain;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TwewyMain.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TwewyMain.MOD_ID);

    public static void register() {
        BLOCKS.register(getModEventBus());
        //ModBlocks.register();  <----Descomentar si voy a añadir bloques
        ITEMS.register(getModEventBus());
        ModItems.register();
    }

    private static IEventBus getModEventBus() {
        return FMLJavaModLoadingContext.get().getModEventBus();
    }

}
