
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.AkvamarineBirchPlanksBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class AkvamarinePlantFuelFuel extends PerodiumcraftModElements.ModElement {
	public AkvamarinePlantFuelFuel(PerodiumcraftModElements instance) {
		super(instance, 241);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AkvamarineBirchPlanksBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
