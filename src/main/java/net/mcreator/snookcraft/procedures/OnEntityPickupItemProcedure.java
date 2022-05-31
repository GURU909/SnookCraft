package net.mcreator.snookcraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class OnEntityPickupItemProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getPlayer(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean result = false;
		if (entity instanceof Player
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:welcome_to_snookcraft")))
								.isDone()
						: false)) {
			if ((itemstack.getDisplayName().getString()).contains("Music Disc") && itemstack.getRarity() == Rarity.RARE
					&& !(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
							? _plr.getAdvancements()
									.getOrStartProgress(
											_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:a_fine_addition")))
									.isDone()
							: false)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:a_fine_addition"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:flowers")))
					&& !(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
							? _plr.getAdvancements()
									.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:flower_power")))
									.isDone()
							: false)) {
				result = FlowerPickupProcedure.execute(entity, itemstack);
			}
		}
	}
}
