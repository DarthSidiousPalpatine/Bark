package com.Muurr.Bark.Handlers;

import java.util.Arrays;

import com.Muurr.Bark.Items.BarkItems;
import com.Muurr.Bark.Misc.BarkAchievements;
import com.dunk.tfc.Reference;
import com.dunk.tfc.Core.TFC_Achievements;
import com.dunk.tfc.Core.Player.InventoryPlayerTFC;
import com.dunk.tfc.Handlers.EntityLivingHandler;
import com.dunk.tfc.Items.ItemArrow;
import com.dunk.tfc.Items.ItemBloom;
import com.dunk.tfc.Items.ItemOreSmall;
import com.dunk.tfc.Items.ItemQuiver;
import com.dunk.tfc.Items.Tools.ItemJavelin;
import com.dunk.tfc.api.TFCItems;
import com.dunk.tfc.api.TFCOptions;
import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Interfaces.IEquipable;
import com.dunk.tfc.api.Interfaces.IEquipable.EquipType;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class BarkEntityLivingHandler extends EntityLivingHandler{
	
	@SubscribeEvent
	public void handleItemPickup(EntityItemPickupEvent event)
	{
		EntityPlayer player = event.entityPlayer;
		ItemStack item = event.item.getEntityItem();

		if (item.getItem() == BarkItems.birchbarkpants)
			player.triggerAchievement(BarkAchievements.birchBarkPants);
	}
}
