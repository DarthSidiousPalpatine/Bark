package com.Muurr.Bark.Misc;

import java.util.ArrayList;
import java.util.List;

import com.Muurr.Bark.Items.BarkItems;
import com.dunk.tfc.Core.TFC_Achievements;
import com.dunk.tfc.api.TFCItems;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class BarkAchievements extends TFC_Achievements{
	public static Achievement birchBarkPants;
	
	private static List<Achievement> achlist;
	public static AchievementPage pageBark;
	public static Achievement[] achievementsBark;
	
	public static void init()
	{
		achlist = new ArrayList<Achievement>();
		
		birchBarkPants = createAchievement("achievement.birchBarkPants", "birchBarkPants", 0, 0, new ItemStack(BarkItems.birchbarkpants), null);
		
		achievementsBark = new Achievement[achlist.size()];
		achievementsBark = achlist.toArray(achievementsBark);
		pageBark = new AchievementPage("Bark", achievementsBark);
		AchievementPage.registerAchievementPage(pageBark);
	}
	
	private static Achievement createAchievement(String id, String name, int posX, int posY, ItemStack is, Achievement preReq)
	{
		Achievement a = new Achievement(id, name, posX, posY, is, preReq).registerStat();
		achlist.add(a);
		return a;
	}
}
