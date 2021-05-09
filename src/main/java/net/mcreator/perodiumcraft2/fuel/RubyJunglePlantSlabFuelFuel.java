
package net.mcreator.perodiumcraft2.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft2.block.RubyJungleSlabBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class RubyJunglePlantSlabFuelFuel extends Perodiumcraft2ModElements.ModElement {
	public RubyJunglePlantSlabFuelFuel(Perodiumcraft2ModElements instance) {
		super(instance, 246);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(RubyJungleSlabBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
