package com.Muurr.Bark;

import net.minecraft.init.Blocks;

import com.Muurr.Bark.Items.BarkItems;
import com.Muurr.Bark.Misc.BarkAchievements;
import com.Muurr.Bark.Misc.Recipes;
import com.dunk.tfc.Core.TFC_Achievements;
import com.Muurr.Bark.Handlers.BarkCraftingHandler;
import com.Muurr.Bark.Handlers.BarkEntityLivingHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Bark.MODID, version = Bark.VERSION, dependencies = "required-after:terrafirmacraftplus")
public class Bark
{
    public static final String MODID = "bark";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		//Items/Blocks Registry
    	//Config Handle
    	BarkItems.setup();
    	Recipes.regRecipes();
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	//Proxy/TileEnt/Entity/GUI/Packets
    	BarkItems.registerFurnaceFuel();
    	FMLCommonHandler.instance().bus().register(new BarkCraftingHandler());
    	FMLCommonHandler.instance().bus().register(new BarkEntityLivingHandler());
    	
    	BarkAchievements.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		//IdkWhatIsThatFor
    }
}
