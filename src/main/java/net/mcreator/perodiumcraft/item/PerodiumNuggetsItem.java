
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public class PerodiumNuggetsItem extends Item {
	public PerodiumNuggetsItem() {
		super(new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("perodium_nuggets");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
