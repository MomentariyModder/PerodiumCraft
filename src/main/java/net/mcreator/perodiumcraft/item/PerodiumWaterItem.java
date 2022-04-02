
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;
import net.mcreator.perodiumcraft.init.PerodiumcraftModFluids;

public class PerodiumWaterItem extends BucketItem {
	public PerodiumWaterItem() {
		super(PerodiumcraftModFluids.PERODIUM_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM));
	}
}
