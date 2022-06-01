package net.mcreator.snookcraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.snookcraft.init.SnookcraftModGameRules;
import net.mcreator.snookcraft.SnookcraftMod;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class OnPlayerRightClickOnBlockProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(),
				event.getWorld().getBlockState(event.getPos()), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(SnookcraftModGameRules.LOGCHESTUSAGE)) {
			if (blockstate.getBlock() == Blocks.CHEST) {
				SnookcraftMod.LOGGER.info((("** CHEST OPENED ** Display Name: " + entity.getDisplayName().getString()) + ""
						+ ((" Coordinates: " + (((" X: " + x) + "" + (" Y: " + y)) + "" + (" Z: " + z))) + ""
								+ (" Timestamp: " + new java.text.SimpleDateFormat("MM-dd hh:mm:ss").format(Calendar.getInstance().getTime())))));
			} else if (blockstate.getBlock() == Blocks.TRAPPED_CHEST) {
				SnookcraftMod.LOGGER.info((("** CHEST OPENED ** Display Name: " + entity.getDisplayName().getString()) + ""
						+ ((" Coordinates: " + (((" X: " + x) + "" + (" Y: " + y)) + "" + (" Z: " + z))) + ""
								+ (" Timestamp: " + new java.text.SimpleDateFormat("MM-dd hh:mm:ss").format(Calendar.getInstance().getTime())))));
			}
		}
	}
}
