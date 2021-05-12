package net.mcreator.perodiumcraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.perodiumcraft.item.PerodiumBerriesItem;
import net.mcreator.perodiumcraft.block.PerodiumBushBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import java.util.Map;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure extends PerodiumcraftModElements.ModElement {
	public PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure(PerodiumcraftModElements instance) {
		super(instance, 403);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency entity for procedure PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastienii!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency x for procedure PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastienii!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency y for procedure PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastienii!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency z for procedure PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastienii!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PerodiumcraftMod.LOGGER.warn("Failed to load dependency world for procedure PerodiumBush2PriNazhatiiPravoiKnopkiMyshiNaRastienii!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = PerodiumBushBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(PerodiumBerriesItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
