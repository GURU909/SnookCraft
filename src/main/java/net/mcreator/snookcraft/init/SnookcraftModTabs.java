
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SnookcraftModTabs {
	public static CreativeModeTab TAB_SNOOK_CRAFT_TAB;

	public static void load() {
		TAB_SNOOK_CRAFT_TAB = new CreativeModeTab("tabsnook_craft_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AXOLOTL_BUCKET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
