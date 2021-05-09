
package net.mcreator.perodiumcraft2.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class HochiymToolsHoeItem extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:hochiym_tools_hoe")
	public static final Item block = null;
	public HochiymToolsHoeItem(Perodiumcraft2ModElements instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3124;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HochiymItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
		}.setRegistryName("hochiym_tools_hoe"));
	}
}
