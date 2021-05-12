
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.AkvamarineOakBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class AkvamarineOakFUELFuel extends PerodiumcraftModElements.ModElement {
	public AkvamarineOakFUELFuel(PerodiumcraftModElements instance) {
		super(instance, 150);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AkvamarineOakBlock.block, (int) (1)).getItem())
			event.setBurnTime(3200);
	}
}
