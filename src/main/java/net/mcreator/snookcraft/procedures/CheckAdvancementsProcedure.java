package net.mcreator.snookcraft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public class CheckAdvancementsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:coal_advance"))).isDone()
				: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:iron_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:lapis_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:emerald_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:gold_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:copper_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:diamond_advance")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:redstone_advance")))
								.isDone()
						: false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:ore_galore"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		return true;
	}
}
