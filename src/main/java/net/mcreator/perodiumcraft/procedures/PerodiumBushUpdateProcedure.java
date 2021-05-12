package net.mcreator.perodiumcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.perodiumcraft.block.PerodiumBush2Block;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import java.util.Map;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumBushUpdateProcedure extends PerodiumcraftModElements.ModElement {
	public PerodiumBushUpdateProcedure(PerodiumcraftModElements instance) {
		super(instance, 404);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency x for procedure PerodiumBushUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency y for procedure PerodiumBushUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency z for procedure PerodiumBushUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency world for procedure PerodiumBushUpdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PerodiumBush2Block.block.getDefaultState(), 3);
	}
}
