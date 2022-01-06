
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public class PerodiumAmmoItem extends Item {
	public PerodiumAmmoItem() {
		super(new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS).durability(4).rarity(Rarity.COMMON));
		setRegistryName("perodium_ammo");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
