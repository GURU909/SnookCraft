package net.mcreator.snookcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.snookcraft.init.SnookcraftModBlocks;

public class MarijuanaUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (SnookcraftModBlocks.MARIJUANA.get().defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
			world.setBlock(new BlockPos(x, y + 1, z), SnookcraftModBlocks.MARIJUANA.get().defaultBlockState(), 3);
		}
	}
}
