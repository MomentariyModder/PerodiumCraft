
package net.mcreator.perodiumcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft.item.PerodiumMultiToolItem;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumCraftToolsandArmorsItemGroup extends PerodiumcraftModElements.ModElement {
	public PerodiumCraftToolsandArmorsItemGroup(PerodiumcraftModElements instance) {
		super(instance, 279);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabperodium_craft_toolsand_armors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PerodiumMultiToolItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
