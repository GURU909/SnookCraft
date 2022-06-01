
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.snookcraft.item.RollingPapersItem;
import net.mcreator.snookcraft.item.JointItem;
import net.mcreator.snookcraft.item.CannabisNuggetItem;
import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SnookcraftMod.MODID);
	public static final RegistryObject<Item> MARIJUANA = block(SnookcraftModBlocks.MARIJUANA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CANNABIS_NUGGET = REGISTRY.register("cannabis_nugget", () -> new CannabisNuggetItem());
	public static final RegistryObject<Item> ROLLING_PAPERS = REGISTRY.register("rolling_papers", () -> new RollingPapersItem());
	public static final RegistryObject<Item> JOINT = REGISTRY.register("joint", () -> new JointItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
