package net.mcreator.snookcraft.procedures;

import net.minecraft.world.entity.Entity;

import java.util.Calendar;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;

public class WriteToFileProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		File ChestAccess = new File("");
		try {
			FileWriter ChestAccesswriter = new FileWriter(ChestAccess);
			BufferedWriter ChestAccessbw = new BufferedWriter(ChestAccesswriter);
			{
				ChestAccessbw.write(("Timestamp: " + ((("D: " + Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) + ""
						+ ("H: " + Calendar.getInstance().get(Calendar.HOUR_OF_DAY))) + ""
						+ (("M: " + Calendar.getInstance().get(Calendar.MINUTE)) + "" + ("S: " + Calendar.getInstance().get(Calendar.SECOND))))));
				ChestAccessbw.newLine();
			}
			{
				ChestAccessbw.write(("Player: " + entity.getDisplayName().getString()));
				ChestAccessbw.newLine();
			}
			{
				ChestAccessbw.write(("Coordinates: " + ((("X: " + entity.getX()) + "" + ("Y: " + entity.getY())) + "" + ("Z: " + entity.getZ()))));
				ChestAccessbw.newLine();
			}
			{
				ChestAccessbw.write("----------------------------------------------------------------------------");
				ChestAccessbw.newLine();
			}
			ChestAccessbw.close();
			ChestAccesswriter.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
