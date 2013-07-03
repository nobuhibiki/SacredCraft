package com.sacred.SC;

import com.sacred.SC.block.ModBlock;
import com.sacred.SC.handler.LocalizationHandler;
import com.sacred.SC.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION
	)

@NetworkMod(
		serverSideRequired = false,
		clientSideRequired = true)

public class SacredCraft {

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		LocalizationHandler.loadLanguages();
			
		ModBlock.BlockInit();
	}
	@Init
	public void init(FMLInitializationEvent event){

	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){

	}
}

