
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public class AkvamarineBerriesItem extends Item {
	public AkvamarineBerriesItem() {
		super(new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("akvamarine_berries");
	}
}
