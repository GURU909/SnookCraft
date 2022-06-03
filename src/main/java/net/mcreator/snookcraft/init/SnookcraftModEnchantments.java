
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.snookcraft.enchantment.ThunderboltEnchantment;
import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SnookcraftMod.MODID);
	public static final RegistryObject<Enchantment> THUNDERBOLT = REGISTRY.register("thunderbolt", () -> new ThunderboltEnchantment());
}
