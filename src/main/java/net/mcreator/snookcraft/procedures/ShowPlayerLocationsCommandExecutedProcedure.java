package net.mcreator.snookcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import java.util.List;
import java.util.ArrayList;

public class ShowPlayerLocationsCommandExecutedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent((((entityiterator.getDisplayName().getString() + "- ") + ""
							+ ("X: " + new java.text.DecimalFormat("##").format(entityiterator.getX()))) + ""
							+ (("Y: " + new java.text.DecimalFormat("##").format(entityiterator.getY())) + ""
									+ ("Z: " + new java.text.DecimalFormat("##").format(entityiterator.getZ()))))),
							(false));
			}
		}
	}
}
