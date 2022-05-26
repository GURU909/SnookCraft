
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.snookcraft.item.PlayerTotemItem;
import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SnookcraftMod.MODID);
	public static final RegistryObject<Item> PLAYER_TOTEM = REGISTRY.register("player_totem", () -> new PlayerTotemItem());
}
