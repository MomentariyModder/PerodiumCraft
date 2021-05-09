package net.mcreator.perodiumcraft2.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.perodiumcraft2.block.AkvamarineBush2Block;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;
import net.mcreator.perodiumcraft2.Perodiumcraft2Mod;

import java.util.Map;

@Perodiumcraft2ModElements.ModElement.Tag
public class AkvamarineBushUpdateTickProcedure extends Perodiumcraft2ModElements.ModElement {
	public AkvamarineBushUpdateTickProcedure(Perodiumcraft2ModElements instance) {
		super(instance, 146);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency x for procedure AkvamarineBushUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency y for procedure AkvamarineBushUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency z for procedure AkvamarineBushUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency world for procedure AkvamarineBushUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AkvamarineBush2Block.block.getDefaultState(), 3);
	}
}
