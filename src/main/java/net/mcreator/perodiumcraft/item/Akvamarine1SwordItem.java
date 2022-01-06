
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;
import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;

public class Akvamarine1SwordItem extends SwordItem {
	public Akvamarine1SwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3124;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 12f;
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
		}, 3, -3f, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
		setRegistryName("akvamarine_1_sword");
	}
}
