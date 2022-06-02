
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.snookcraft.client.renderer.SnookumsDuckRenderer;
import net.mcreator.snookcraft.client.renderer.DuckRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SnookcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SnookcraftModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(SnookcraftModEntities.SNOOKUMS_DUCK.get(), SnookumsDuckRenderer::new);
	}
}
