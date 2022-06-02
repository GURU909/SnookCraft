
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SnookcraftMod.MODID);
	public static final RegistryObject<Item> DUCK = REGISTRY.register("duck_spawn_egg",
			() -> new ForgeSpawnEggItem(SnookcraftModEntities.DUCK, -26368, -1, new Item.Properties().tab(SnookcraftModTabs.TAB_SNOOK_CRAFT_TAB)));
	public static final RegistryObject<Item> SNOOKUMS_DUCK = REGISTRY.register("snookums_duck_spawn_egg",
			() -> new ForgeSpawnEggItem(SnookcraftModEntities.SNOOKUMS_DUCK, -65281, -256,
					new Item.Properties().tab(SnookcraftModTabs.TAB_SNOOK_CRAFT_TAB)));
}
