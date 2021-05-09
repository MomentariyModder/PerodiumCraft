
package net.mcreator.perodiumcraft2.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft2.block.AkvamarineOakBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class AkvamarineOakFUELFuel extends Perodiumcraft2ModElements.ModElement {
	public AkvamarineOakFUELFuel(Perodiumcraft2ModElements instance) {
		super(instance, 142);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AkvamarineOakBlock.block, (int) (1)).getItem())
			event.setBurnTime(3200);
	}
}
