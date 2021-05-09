
package net.mcreator.perodiumcraft2.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft2.block.PerodiumDeadBushBlock;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumCraft2PPlantItemGroup extends Perodiumcraft2ModElements.ModElement {
	public PerodiumCraft2PPlantItemGroup(Perodiumcraft2ModElements instance) {
		super(instance, 205);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabperodium_craft_2_p_plant") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PerodiumDeadBushBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
