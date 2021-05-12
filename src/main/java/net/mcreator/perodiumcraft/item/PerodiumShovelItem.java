
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumShovelItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_shovel")
	public static final Item block = null;
	public PerodiumShovelItem(PerodiumcraftModElements instance) {
		super(instance, 363);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4062;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 13f;
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
		}.setRegistryName("perodium_shovel"));
	}
}
