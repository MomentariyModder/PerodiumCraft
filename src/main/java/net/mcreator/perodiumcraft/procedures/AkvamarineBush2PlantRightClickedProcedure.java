package net.mcreator.perodiumcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;
import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

public class AkvamarineBush2PlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), PerodiumcraftModBlocks.AKVAMARINE_BUSH.get().defaultBlockState(), 3);
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PerodiumcraftModItems.AKVAMARINE_BERRIES.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
