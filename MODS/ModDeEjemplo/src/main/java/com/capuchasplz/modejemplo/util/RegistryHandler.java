package com.capuchasplz.modejemplo.util;

import com.capuchasplz.modejemplo.ModEjemplo;
import com.capuchasplz.modejemplo.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModEjemplo.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	//Items 
	public static final RegistryObject<Item> TARTA_FRESA = ITEMS.register("tarta_fresa", ItemBase::new);
	
}
