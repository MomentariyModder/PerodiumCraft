
package net.mcreator.perodiumcraft2.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft2.item.HochiymItem;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumCraftToolsandArmorsItemGroup extends Perodiumcraft2ModElements.ModElement {
	public PerodiumCraftToolsandArmorsItemGroup(Perodiumcraft2ModElements instance) {
		super(instance, 261);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabperodium_craft_toolsand_armors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HochiymItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
