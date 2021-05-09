
package net.mcreator.perodiumcraft2.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft2.block.PerodiumOakSlabBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumOakPlantSlabFuel extends Perodiumcraft2ModElements.ModElement {
	public PerodiumOakPlantSlabFuel(Perodiumcraft2ModElements instance) {
		super(instance, 250);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PerodiumOakSlabBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
