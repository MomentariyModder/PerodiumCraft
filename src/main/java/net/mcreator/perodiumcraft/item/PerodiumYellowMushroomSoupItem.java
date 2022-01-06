
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public class PerodiumYellowMushroomSoupItem extends Item {
	public PerodiumYellowMushroomSoupItem() {
		super(new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_FOOD).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f)

						.build()));
		setRegistryName("perodium_yellow_mushroom_soup");
	}
}
