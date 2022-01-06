
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;
import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;

public class Akvamarine1HoeItem extends HoeItem {
	public Akvamarine1HoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3124;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PerodiumcraftModItems.AKVAMARINE));
			}
		}, 0, -3f, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
		setRegistryName("akvamarine_1_hoe");
	}
}
