package net.mcreator.perodiumcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

public class PerodiumBushUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), PerodiumcraftModBlocks.PERODIUM_BUSH_2.defaultBlockState(), 3);
	}
}
