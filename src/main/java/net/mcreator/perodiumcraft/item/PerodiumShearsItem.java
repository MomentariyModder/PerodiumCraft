
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public class PerodiumShearsItem extends ShearsItem {
	public PerodiumShearsItem() {
		super(new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS).durability(952).fireResistant());
		setRegistryName("perodium_shears");
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 4f;
	}
}
