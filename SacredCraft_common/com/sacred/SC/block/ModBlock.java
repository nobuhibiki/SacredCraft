package com.sacred.SC.block;

import com.sacred.SC.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public class ModBlock {
	
	public static Block Lamp;
	@SuppressWarnings("deprecation")
	public static void BlockInit(){
		Lamp = new BlockLamp(200, true);
		
		GameRegistry.registerBlock(Lamp, BlockItemSC.class);
	};
}
