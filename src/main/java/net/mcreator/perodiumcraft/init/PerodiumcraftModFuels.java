
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
		if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_OAK.asItem())
			event.setBurnTime(3200);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PLANKS.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_SLAB.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_STAIRS.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_PLANT.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_SLAB.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_STAIRS.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_PLANT.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_SLAB.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_STAIRS.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_FENCE.asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_FENCE_GATE.asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE_GATE.asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE_GATE.asItem())
			event.setBurnTime(600);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.PERODIUM_OAK_DOOR.asItem())
			event.setBurnTime(400);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.AKVAMARINE_BIRCH_DOOR.asItem())
			event.setBurnTime(400);
		else if (event.getItemStack().getItem() == PerodiumcraftModBlocks.RUBY_JUNGLE_DOOR.asItem())
			event.setBurnTime(400);
	}
}
