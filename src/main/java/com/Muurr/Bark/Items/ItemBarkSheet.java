package com.Muurr.Bark.Items;

import com.dunk.tfc.Reference;
import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

import com.Muurr.Bark.Constants;

public class ItemBarkSheet extends ItemTerra{

	public ItemBarkSheet()
	{
		super();
		setMaxDamage(0);
		setHasSubtypes(true);
		setCreativeTab(TFCTabs.TFC_MATERIALS);
		this.metaNames = new String[Constants.BarkWoods.length];
		for(int i = 0; i < Constants.BarkWoods.length; i++)
		{
			metaNames[i] = Constants.BarkWoods[i];
		}
		this.setWeight(EnumWeight.LIGHT);
		this.setSize(EnumSize.SMALL);
	}
	
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List list)
	{
		for(int i = 0; i < Constants.BarkWoods.length; i++) {
			list.add(new ItemStack(this,1,i));
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if(meta < icons.length)
			return icons[meta];
		return icons[0];
	}
	
	private IIcon[] icons = new IIcon[Constants.BarkWoods.length];
	@Override
	public void registerIcons(IIconRegister registerer)
	{
		for(int i = 0; i < Constants.BarkWoods.length; i++) {
			icons[i] = registerer.registerIcon("bark:barks/"+Constants.BarkWoods[i]+" Sheet");
		}
	}
}
