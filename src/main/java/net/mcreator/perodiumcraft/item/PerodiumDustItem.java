
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftItemItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumDustItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_dust")
	public static final Item block = null;
	public PerodiumDustItem(PerodiumcraftModElements instance) {
		super(instance, 369);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PerodiumCraftItemItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("perodium_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
