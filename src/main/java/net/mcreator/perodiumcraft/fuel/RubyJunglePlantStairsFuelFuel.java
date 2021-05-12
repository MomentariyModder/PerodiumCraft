
package net.mcreator.perodiumcraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.perodiumcraft.block.RubyJungleStairsBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class RubyJunglePlantStairsFuelFuel extends PerodiumcraftModElements.ModElement {
	public RubyJunglePlantStairsFuelFuel(PerodiumcraftModElements instance) {
		super(instance, 249);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(RubyJungleStairsBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
