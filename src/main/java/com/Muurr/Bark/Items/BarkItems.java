package com.Muurr.Bark.Items;

import com.Muurr.Bark.Bark;
import com.Muurr.Bark.Constants;
import com.dunk.tfc.Reference;
import com.dunk.tfc.Handlers.TFCFuelHandler;
import com.dunk.tfc.Items.ItemBoots;
import com.dunk.tfc.Items.ItemClothing;
import com.dunk.tfc.Items.ItemFlatGeneric;
import com.dunk.tfc.Items.ItemHat;
import com.dunk.tfc.Items.ItemLooseRock;
import com.dunk.tfc.Items.ItemPants;
import com.dunk.tfc.Items.ItemShirt;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Armor;
import com.dunk.tfc.api.TFCItems;
import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Interfaces.IEquipable;
import com.dunk.tfc.api.Interfaces.IEquipable.EquipType;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BarkItems extends TFCItems{
	
	//Materials
	public static Item barksheet;
	public static Item barkstrip;
	public static Item barkcloth;
	public static Item flatbarkcloth;
	
	//Clothes
	public static Item strippedbarkshirt;
	public static Item birchbarkshirt;
	public static Item bamboobarkshirt;
	public static Item strippedbarkpants;
	public static Item birchbarkpants;
	public static Item bamboobarkpants;
	public static Item strippedbastshoes;
	public static Item birchbastshoes;
	public static Item bamboobastshoes;
	public static Item strippedboots;
	public static Item birchboots;
	public static Item bambooboots;
	public static Item strippedhat;
	public static Item birchhat;
	public static Item bamboohat;
	
	public static Item strippedbasket;
	public static Item birchbasket;
	public static Item bamboobasket;
	
	public static void setup()
	{
		//Barks
		flatbarkcloth = ((ItemTerra) new ItemFlatGeneric().setUnlocalizedName("Flat Bark Cloth")).setFolder("flatcloth/").setMetaNames(Constants.BarkCloths);
		barksheet = new ItemBarkSheet().setUnlocalizedName("BarkSheet");
		barkstrip = new ItemBarkStrip().setUnlocalizedName("BarkStrip");
		barkcloth = ((ItemLooseRock) new ItemBarkCloth().setUnlocalizedName("BarkCloth")).setSpecialCraftingType(flatbarkcloth).setMetaNames(Constants.BarkCloths);	
		
		
		//Clothes
		strippedbarkshirt = new ItemShirt(IEquipable.ClothingType.SHIRT)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Shirt Stripped.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("BirchBarkShirtStripped");
		birchbarkshirt = new ItemShirt(IEquipable.ClothingType.SHIRT)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Shirt.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("BirchBarkShirt");
		bamboobarkshirt = new ItemShirt(IEquipable.ClothingType.SHIRT)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/Bamboo Shirt.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("BambooBarkShirt");
		
		strippedbarkpants = new ItemPants(IEquipable.ClothingType.PANTS)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/StrippedBark Pants.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("StrippedBarkPants");
		birchbarkpants = new ItemPants(IEquipable.ClothingType.PANTS)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Pants.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("BirchBarkPants");
		bamboobarkpants = new ItemPants(IEquipable.ClothingType.PANTS)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BambooBark Pants.png")
				.setHeatResistance(1).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses).setUnlocalizedName("BambooBarkPants");
		
		//Boots
		strippedbastshoes = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.05f)
				.addWalkableSurface(Material.sand, 0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, -0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark BastShoes Stripped.png").setHeatResistance(1).setColdResistance(0).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BirchBastShoesStripped");
		birchbastshoes = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.05f)
				.addWalkableSurface(Material.sand, 0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, -0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark BastShoes.png").setHeatResistance(1).setColdResistance(0).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BirchBastShoes");
		bamboobastshoes = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.05f)
				.addWalkableSurface(Material.sand, 0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, -0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/Bamboo BastShoes.png").setHeatResistance(1).setColdResistance(0).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BambooBastShoes");
		
		strippedboots = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.1f)
				.addWalkableSurface(Material.sand, -0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, 0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Boots Stripped.png").setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BirchBootsStripped");
		birchboots = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.1f)
				.addWalkableSurface(Material.sand, -0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, 0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Boots.png").setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BirchBoots");
		bambooboots = ((ItemClothing) (new ItemBoots(IEquipable.ClothingType.FULLBOOTS).setDefaultWalkable(0.1f)
				.addWalkableSurface(Material.sand, -0.1f).addWalkableSurface(Material.grass, 0.5f).addWalkableSurface(Material.snow, 0.1f)))
						.setResourceLocation(Bark.MODID, "textures/models/clothes/Bamboo Boots.png").setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes)
						.setMaxDamage(strawUses).setUnlocalizedName("BambooBoots");
		
		//Hats
		strippedhat = new ItemHat(IEquipable.ClothingType.CLOTH_HAT).setHeadSunProtection(0.5f)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Hat Stripped.png")
				.setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses * 4).setUnlocalizedName("BirchHatStripped");
		birchhat = new ItemHat(IEquipable.ClothingType.CLOTH_HAT).setNoWearInCold(true).setHeadSunProtection(0.5f)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/BirchBark Hat.png")
				.setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses * 4).setUnlocalizedName("BirchHat");
		bamboohat = new ItemHat(IEquipable.ClothingType.CLOTH_HAT).setNoWearInCold(true).setHeadSunProtection(0.5f)
				.setResourceLocation(Bark.MODID, "textures/models/clothes/Bamboo Hat.png")
				.setHeatResistance(0).setColdResistance(1).setStraw(true).setArmorType(Armor.strawClothes).setMaxDamage(strawUses * 4).setUnlocalizedName("BambooHat");
		
		strippedbasket = new BarkBasket(new String[] { "Stripped Bark Basket" }).setMaxDamage(7).setUnlocalizedName("StrippedBarkBasket");
		birchbasket = new BarkBasket(new String[] { "Birch Bark Basket" }).setMaxDamage(7).setUnlocalizedName("BirchBarkBasket");
		bamboobasket = new BarkBasket(new String[] { "Bamboo Bark Basket" }).setMaxDamage(7).setUnlocalizedName("BambooBarkBasket");
		
		
		//Register
		GameRegistry.registerItem(flatbarkcloth, flatRock.getUnlocalizedName());
		GameRegistry.registerItem(barksheet, barksheet.getUnlocalizedName());
		GameRegistry.registerItem(barkstrip, barkstrip.getUnlocalizedName());
		GameRegistry.registerItem(barkcloth, barkcloth.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedbarkshirt, strippedbarkshirt.getUnlocalizedName());
		GameRegistry.registerItem(birchbarkshirt, birchbarkshirt.getUnlocalizedName());
		GameRegistry.registerItem(bamboobarkshirt, bamboobarkshirt.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedbarkpants, strippedbarkpants.getUnlocalizedName());
		GameRegistry.registerItem(birchbarkpants, birchbarkpants.getUnlocalizedName());
		GameRegistry.registerItem(bamboobarkpants, bamboobarkpants.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedbastshoes, strippedbastshoes.getUnlocalizedName());
		GameRegistry.registerItem(birchbastshoes, birchbastshoes.getUnlocalizedName());
		GameRegistry.registerItem(bamboobastshoes, bamboobastshoes.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedboots, strippedboots.getUnlocalizedName());
		GameRegistry.registerItem(birchboots, birchboots.getUnlocalizedName());
		GameRegistry.registerItem(bambooboots, bambooboots.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedhat, strippedhat.getUnlocalizedName());
		GameRegistry.registerItem(birchhat, birchhat.getUnlocalizedName());
		GameRegistry.registerItem(bamboohat, bamboohat.getUnlocalizedName());
		
		GameRegistry.registerItem(strippedbasket, strippedbasket.getUnlocalizedName());
		GameRegistry.registerItem(birchbasket, birchbasket.getUnlocalizedName());
		GameRegistry.registerItem(bamboobasket, bamboobasket.getUnlocalizedName());
	}
	//Fuels
	public static void registerFurnaceFuel()
	{
		TFCFuelHandler.registerFuel(barksheet, 800);
		TFCFuelHandler.registerFuel(barkstrip, 400);
		TFCFuelHandler.registerFuel(barkcloth, 1600);
	}
}
