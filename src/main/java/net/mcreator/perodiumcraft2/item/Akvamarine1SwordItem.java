
package net.mcreator.perodiumcraft2.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class Akvamarine1SwordItem extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:akvamarine_1_sword")
	public static final Item block = null;
	public Akvamarine1SwordItem(Perodiumcraft2ModElements instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3124;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AkvamarineItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
		}.setRegistryName("akvamarine_1_sword"));
	}
}
