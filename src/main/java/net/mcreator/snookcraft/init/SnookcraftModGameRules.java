
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.snookcraft.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SnookcraftModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> PLAYERSDROPHEADS = GameRules.register("playersDropHeads", GameRules.Category.DROPS,
			GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> RESTRICTLAVAUSE = GameRules.register("restrictLavaUse", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> LOGCHESTUSAGE = GameRules.register("logChestUsage", GameRules.Category.MISC,
			GameRules.BooleanValue.create(true));
}
