
package net.mcreator.snookcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PlayerTotemItem extends Item {
	public PlayerTotemItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
