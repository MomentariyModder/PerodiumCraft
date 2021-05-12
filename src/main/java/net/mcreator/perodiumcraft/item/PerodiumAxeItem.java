
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumAxeItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_axe")
	public static final Item block = null;
	public PerodiumAxeItem(PerodiumcraftModElements instance) {
		super(instance, 362);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4062;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PerodiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("perodium_axe"));
	}
}
