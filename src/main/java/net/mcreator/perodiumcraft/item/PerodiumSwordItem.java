
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumSwordItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_sword")
	public static final Item block = null;
	public PerodiumSwordItem(PerodiumcraftModElements instance) {
		super(instance, 360);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 14f;
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
		}, 3, -3f, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("perodium_sword"));
	}
}
