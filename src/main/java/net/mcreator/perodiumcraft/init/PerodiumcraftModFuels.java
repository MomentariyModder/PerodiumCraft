
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class PerodiumcraftModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_OAK.get().asItem())
			event.setBurnTime(3200);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PLANKS.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_SLAB.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_STAIRS.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_PLANT.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_SLAB.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_STAIRS.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_PLANT.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_SLAB.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_STAIRS.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_FENCE.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_FENCE_GATE.get().asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE_GATE.get().asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE_GATE.get().asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_DOOR.get().asItem())
			event.setBurnTime(400);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_DOOR.get().asItem())
			event.setBurnTime(400);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_DOOR.get().asItem())
			event.setBurnTime(400);
	}
}
