
package net.mcreator.snookcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.snookcraft.init.SnookcraftModTabs;
import net.mcreator.snookcraft.init.SnookcraftModFluids;

public class MapleSyrupItem extends BucketItem {
	public MapleSyrupItem() {
		super(SnookcraftModFluids.MAPLE_SYRUP,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(SnookcraftModTabs.TAB_SNOOK_CRAFT_TAB));
	}
}
