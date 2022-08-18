package com.Muurr.Bark.Items;

import java.util.List;

import com.Muurr.Bark.Constants;
import com.dunk.tfc.TerraFirmaCraft;
import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Core.TFC_Core;
import com.dunk.tfc.Core.Player.FoodStatsTFC;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Food;
import com.dunk.tfc.api.Entities.IAnimal;
import com.dunk.tfc.api.Enums.EnumFoodGroup;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import com.dunk.tfc.api.Interfaces.IFood;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemBarkStrip extends ItemTerra{
	public ItemBarkStrip()
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
			icons[i] = registerer.registerIcon("bark:barks/"+Constants.BarkWoods[i]+" Strip");
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
		if (foodstats.needFood())
			player.setItemInUse(is, 32);

		return is;
	}

	@Override
	public ItemStack onEaten(ItemStack is, World world, EntityPlayer player)
	{
		FoodStatsTFC foodstats = TFC_Core.getPlayerFoodStats(player);
		if(!world.isRemote)
		{
			foodstats.addNutrition(EnumFoodGroup.Grain, 0.1f);
			foodstats.stomachLevel += 1f;
			is.stackSize = is.stackSize - 1;
		}

		world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		TFC_Core.setPlayerFoodStats(player, foodstats);
		return is;
	}
	
	public ItemStack onConsumedByEntity(ItemStack is, World world, EntityLivingBase entity)
	{
		if(entity instanceof IAnimal)
		{
			if(!world.isRemote)
			{
				is.stackSize = is.stackSize - 1;
			}
			world.playSoundAtEntity(entity, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		}
		return is;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack is)
	{
		return 32;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack is)
	{
		return EnumAction.eat;
	}
	
	public boolean isEdible(ItemStack is)
	{
		return true;
	}

	public boolean isUsable(ItemStack is)
	{
		return true;
	}
}