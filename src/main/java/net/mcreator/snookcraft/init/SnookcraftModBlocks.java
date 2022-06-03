
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.snookcraft.block.MapleSyrupBlock;
import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SnookcraftMod.MODID);
	public static final RegistryObject<Block> MAPLE_SYRUP = REGISTRY.register("maple_syrup", () -> new MapleSyrupBlock());
}
