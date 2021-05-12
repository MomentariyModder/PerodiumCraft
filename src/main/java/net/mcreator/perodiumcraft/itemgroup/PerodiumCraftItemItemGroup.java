
package net.mcreator.perodiumcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft.item.PerodiumIngotItem;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumCraftItemItemGroup extends PerodiumcraftModElements.ModElement {
	public PerodiumCraftItemItemGroup(PerodiumcraftModElements instance) {
		super(instance, 222);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabperodium_craft_item") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PerodiumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
