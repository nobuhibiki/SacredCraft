package com.sacred.SC.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.sacred.SC.lib.Reference;
import com.sacred.SC.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLamp extends BlockSC{
	private final boolean powered;
	public BlockLamp(int id, boolean par2) {
		super(id, Material.redstoneLight);
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setUnlocalizedName(Strings.BlockLamp);
		this.powered = par2;

        if (par2)
        {
            this.setLightValue(1.0F);
        }
	}

	public Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconReg){
		icons = new Icon[15];
		for(int i = 0; i < icons.length; i++){
			icons[i] = iconReg.registerIcon(Reference.MOD_ID+":"+(this.getUnlocalizedName2()) + i);
		}
	}
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int i, int j){
		return icons[j];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs creativeTabs, List list){
		for(int i = 0; i < 15; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	public int damageDropped(int meta){
		return meta;
	}
}
