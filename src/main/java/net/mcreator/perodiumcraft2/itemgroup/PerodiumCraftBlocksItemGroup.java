
package net.mcreator.perodiumcraft2.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft2.block.PerodiumBlockBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumCraftBlocksItemGroup extends Perodiumcraft2ModElements.ModElement {
	public PerodiumCraftBlocksItemGroup(Perodiumcraft2ModElements instance) {
		super(instance, 204);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabperodium_craft_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PerodiumBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
