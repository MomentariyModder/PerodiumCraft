package net.mcreator.perodiumcraft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PerodiumCactusKoghdaSushchnostStalkivaietsiaSBlokomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 1);
	}
}
