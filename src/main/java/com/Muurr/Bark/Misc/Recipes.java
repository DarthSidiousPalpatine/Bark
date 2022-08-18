package com.Muurr.Bark.Misc;

import com.Muurr.Bark.Constants;
import com.Muurr.Bark.Items.BarkItems;
import com.dunk.tfc.Reference;
import com.dunk.tfc.api.TFCItems;
import com.dunk.tfc.api.Constant.Global;
import com.dunk.tfc.api.Crafting.CraftingManagerTFC;
import com.dunk.tfc.api.Crafting.LoomManager;
import com.dunk.tfc.api.Crafting.LoomRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
	public static void regRecipes() {
		for (int i = 0; i < Constants.BarkWoods.length; i++) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BarkItems.barkstrip, 6, i), new ItemStack(BarkItems.barksheet, 1, i), "itemKnife"));
			if(i > 0)
				GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BarkItems.barksheet, 1, 0), new ItemStack(BarkItems.barksheet, 1, i)));
				GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BarkItems.barkstrip, 1, 0), new ItemStack(BarkItems.barkstrip, 1, i), "itemKnife"));
		}
		//Loom
		LoomManager.getInstance().addRecipe(new LoomRecipe(new ItemStack(BarkItems.barkstrip,16,0), new ItemStack(BarkItems.barkcloth,1,0)),new ResourceLocation("bark:textures/blocks/"+Constants.BarkWoods[0]+" ClothBlock.png"));
		LoomManager.getInstance().addRecipe(new LoomRecipe(new ItemStack(BarkItems.barkstrip,16,3), new ItemStack(BarkItems.barkcloth,1,1)),new ResourceLocation("bark:textures/blocks/"+Constants.BarkWoods[3]+" ClothBlock.png"));
		LoomManager.getInstance().addRecipe(new LoomRecipe(new ItemStack(BarkItems.barkstrip,16,25), new ItemStack(BarkItems.barkcloth,1,2)),new ResourceLocation("bark:textures/blocks/"+Constants.BarkWoods[25]+" ClothBlock.png"));

		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedbasket, 1, 0),
				new Object[] { " ### ", " # # ", "## ##", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchbasket, 1, 0),
				new Object[] { " ### ", " # # ", "## ##", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bamboobasket, 1, 0),
				new Object[] { " ### ", " # # ", "## ##", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedbarkshirt, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchbarkshirt, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bamboobarkshirt, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedbarkpants, 1, 0), new Object[] { "#####", "#####", "## ##", "## ##", "## ##", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchbarkpants, 1, 0), new Object[] { "#####", "#####", "## ##", "## ##", "## ##", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bamboobarkpants, 1, 0), new Object[] { "#####", "#####", "## ##", "## ##", "## ##", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedbastshoes, 1, 0), new Object[] { "     ", "## ##", "## ##", "## ##", "     ", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchbastshoes, 1, 0), new Object[] { "     ", "## ##", "## ##", "## ##", "     ", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bamboobastshoes, 1, 0), new Object[] { "     ", "## ##", "## ##", "## ##", "     ", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedboots, 1, 0), new Object[] { "###  ", "###  ", "## ##", "  ###", "  ###", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchboots, 1, 0), new Object[] { "###  ", "###  ", "## ##", "  ###", "  ###", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bambooboots, 1, 0), new Object[] { "###  ", "###  ", "## ##", "  ###", "  ###", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
		//CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.strippedhat, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 0) });
		//CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.birchhat, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 1) });
		//CraftingManagerTFC.getInstance().addRecipe(new ItemStack(BarkItems.bamboohat, 1, 0), new Object[] { "#   #", "#####", "#####", "#####", "#####", '#', new ItemStack(BarkItems.flatbarkcloth, 1, 2) });
		
	}
}
