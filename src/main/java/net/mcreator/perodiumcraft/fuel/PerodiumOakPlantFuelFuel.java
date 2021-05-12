
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.PerodiumOakPlantBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumOakPlantFuelFuel extends PerodiumcraftModElements.ModElement {
	public PerodiumOakPlantFuelFuel(PerodiumcraftModElements instance) {
		super(instance, 251);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PerodiumOakPlantBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
