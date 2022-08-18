package com.Muurr.Bark.Items;

import java.util.List;

import com.Muurr.Bark.Constants;
import com.dunk.tfc.TerraFirmaCraft;
import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Core.Player.PlayerInfo;
import com.dunk.tfc.Core.Player.PlayerManagerTFC;
import com.dunk.tfc.Items.ItemLooseRock;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.TFCBlocks;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemBarkCloth extends ItemLooseRock{
	
	public ItemBarkCloth()
	{
		super();
		setMaxDamage(0);
		setHasSubtypes(true);
		setCreativeTab(TFCTabs.TFC_MATERIALS);
		this.metaNames = new String[Constants.BarkCloths.length];
		for(int i = 0; i < Constants.BarkCloths.length; i++)
		{
			metaNames[i] = Constants.BarkCloths[i];
		}
		this.setWeight(EnumWeight.LIGHT);
		this.setSize(EnumSize.SMALL);
	}
	
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List list)
	{
		for(int i = 0; i < Constants.BarkCloths.length; i++) {
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
	
	private IIcon[] icons = new IIcon[Constants.BarkCloths.length];
	@Override
	public void registerIcons(IIconRegister registerer)
	{
		for(int i = 0; i < metaNames.length; i++) {
			icons[i] = registerer.registerIcon("bark:barks/"+metaNames[i]+" Cloth");
		}
	}
	
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{

		if (itemstack.stackSize >= 5)
		{
			PlayerInfo pi = PlayerManagerTFC.getInstance().getPlayerInfoFromPlayer(entityplayer);
			pi.specialCraftingType = new ItemStack(specialCraftingType, 1, itemstack.getItemDamage());
			pi.specialCraftingTypeAlternate = null;
			entityplayer.openGui(TerraFirmaCraft.instance, 28, entityplayer.worldObj, (int) entityplayer.posX, (int) entityplayer.posY, (int) entityplayer.posZ);
		}
		return true;

	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		return is;
	}
}