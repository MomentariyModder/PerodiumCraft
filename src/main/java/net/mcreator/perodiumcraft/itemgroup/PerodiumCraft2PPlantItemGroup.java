
package net.mcreator.perodiumcraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.perodiumcraft.block.PerodiumDeadBushBlock;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumCraft2PPlantItemGroup extends PerodiumcraftModElements.ModElement {
	public PerodiumCraft2PPlantItemGroup(PerodiumcraftModElements instance) {
		super(instance, 209);
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
