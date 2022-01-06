
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PerodiumPie1Item extends Item {
	public PerodiumPie1Item() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f)

				.build()));
		setRegistryName("perodium_pie_1");
	}
}
