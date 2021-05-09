
package net.mcreator.perodiumcraft2.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class InfinitiiPickaxeItem extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:infinitii_pickaxe")
	public static final Item block = null;
	public InfinitiiPickaxeItem(Perodiumcraft2ModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3124;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(InfinitiItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
		}.setRegistryName("infinitii_pickaxe"));
	}
}
