
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.AkvamarineBirchFenceGateBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class AkvamarineBirchFenceGateFuelFuel extends PerodiumcraftModElements.ModElement {
	public AkvamarineBirchFenceGateFuelFuel(PerodiumcraftModElements instance) {
		super(instance, 333);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AkvamarineBirchFenceGateBlock.block, (int) (1)).getItem())
			event.setBurnTime(600);
	}
}
