
package net.mcreator.perodiumcraft2.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft2.block.PerodiumOakFenceBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumOakPlantFenceFuel extends Perodiumcraft2ModElements.ModElement {
	public PerodiumOakPlantFenceFuel(Perodiumcraft2ModElements instance) {
		super(instance, 252);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PerodiumOakFenceBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
