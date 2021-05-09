package net.mcreator.perodiumcraft2.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.mcreator.perodiumcraft2.item.AkvamarineBerriesItem;
import net.mcreator.perodiumcraft2.block.AkvamarineBushBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;
import net.mcreator.perodiumcraft2.Perodiumcraft2Mod;

import java.util.Map;

@Perodiumcraft2ModElements.ModElement.Tag
public class AkvamarineBush2PlantRightClickedProcedure extends Perodiumcraft2ModElements.ModElement {
	public AkvamarineBush2PlantRightClickedProcedure(Perodiumcraft2ModElements instance) {
		super(instance, 147);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency x for procedure AkvamarineBush2PlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency y for procedure AkvamarineBush2PlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency z for procedure AkvamarineBush2PlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Perodiumcraft2Mod.LOGGER.warn("Failed to load dependency world for procedure AkvamarineBush2PlantRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AkvamarineBushBlock.block.getDefaultState(), 3);
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(AkvamarineBerriesItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
