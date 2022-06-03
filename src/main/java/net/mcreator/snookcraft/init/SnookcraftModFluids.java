
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.snookcraft.fluid.MapleSyrupFluid;
import net.mcreator.snookcraft.SnookcraftMod;

public class SnookcraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SnookcraftMod.MODID);
	public static final RegistryObject<Fluid> MAPLE_SYRUP = REGISTRY.register("maple_syrup", () -> new MapleSyrupFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MAPLE_SYRUP = REGISTRY.register("flowing_maple_syrup", () -> new MapleSyrupFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MAPLE_SYRUP.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MAPLE_SYRUP.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
