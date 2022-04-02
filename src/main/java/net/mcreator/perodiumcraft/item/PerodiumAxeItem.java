
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;
import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;

public class PerodiumAxeItem extends AxeItem {
	public PerodiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 24;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PerodiumcraftModItems.PERODIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS).fireResistant());
	}
}
