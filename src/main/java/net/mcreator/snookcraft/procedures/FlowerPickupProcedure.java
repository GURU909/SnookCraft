package net.mcreator.snookcraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public class FlowerPickupProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		if ((itemstack.getDisplayName().getString()).contains("Dandelion")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:dandelion_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Oxeye Daisy")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:oxeye_daisy_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Poppy")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:poppy_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Blue Orchid")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:blue_orchid_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Allium")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:allium_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Cornflower")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:cornflower_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Azure Bluet")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:azure_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Red Tulip")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:red_tulip_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Orange Tulip")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:orange_tulip_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("White Tulip")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:white_tulip_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Pink Tulip")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:pink_tulip_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Wither Rose")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:wither_rose_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Sunflower")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:sunflower_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Lilac")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:lilac_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Rose Bush")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:rose_bush_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Lily of the Valley")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:lily_of_the_valley_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((itemstack.getDisplayName().getString()).contains("Peony")) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:peony_logic"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		if ((entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:dandelion_logic"))).isDone()
				: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:poppy_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:blue_orchid_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:allium_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:oxeye_daisy_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:cornflower_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:orange_tulip_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:red_tulip_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:white_tulip_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:pink_tulip_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:peony_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:rose_bush_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:lilac_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:sunflower_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:wither_rose_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(
										_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:lily_of_the_valley_logic")))
								.isDone()
						: false)
				&& (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
						? _plr.getAdvancements()
								.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:azure_logic")))
								.isDone()
						: false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("snookcraft:flower_power"));
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
