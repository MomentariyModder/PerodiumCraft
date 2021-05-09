
package net.mcreator.perodiumcraft2.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftItemItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class RubyItem extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:ruby")
	public static final Item block = null;
	public RubyItem(Perodiumcraft2ModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PerodiumCraftItemItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ruby");
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
