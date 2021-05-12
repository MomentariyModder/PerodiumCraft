
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumShearsItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_shears")
	public static final Item block = null;
	public PerodiumShearsItem(PerodiumcraftModElements instance) {
		super(instance, 155);
	}

	@Override
	public void initElements() {
		elements.items
				.add(() -> new ShearsItem(new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab).maxDamage(952).isImmuneToFire()) {
					@Override
					public int getItemEnchantability() {
						return 1;
					}

					@Override
					public float getDestroySpeed(ItemStack stack, BlockState block) {
						return 4f;
					}
				}.setRegistryName("perodium_shears"));
	}
}
