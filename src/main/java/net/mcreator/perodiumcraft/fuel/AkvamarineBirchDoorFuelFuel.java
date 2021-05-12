
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.AkvamarineBirchDoorBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class AkvamarineBirchDoorFuelFuel extends PerodiumcraftModElements.ModElement {
	public AkvamarineBirchDoorFuelFuel(PerodiumcraftModElements instance) {
		super(instance, 336);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AkvamarineBirchDoorBlock.block, (int) (1)).getItem())
			event.setBurnTime(400);
	}
}
