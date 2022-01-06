
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PerodiumcraftModTabs {
	public static CreativeModeTab TAB_PERODIUM_CRAFT_ITEM;
	public static CreativeModeTab TAB_PERODIUM_CRAFT_BLOCKS;
	public static CreativeModeTab TAB_PERODIUM_CRAFT_2_P_PLANT;
	public static CreativeModeTab TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS;
	public static CreativeModeTab TAB_PERODIUM_CRAFT_FOOD;

	public static void load() {
		TAB_PERODIUM_CRAFT_ITEM = new CreativeModeTab("tabperodium_craft_item") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PerodiumcraftModItems.PERODIUM_INGOT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_PERODIUM_CRAFT_BLOCKS = new CreativeModeTab("tabperodium_craft_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PerodiumcraftModBlocks.PERODIUM_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_PERODIUM_CRAFT_2_P_PLANT = new CreativeModeTab("tabperodium_craft_2_p_plant") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PerodiumcraftModBlocks.PERODIUM_DEAD_BUSH);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS = new CreativeModeTab("tabperodium_craft_toolsand_armors") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PerodiumcraftModItems.PERODIUM_MULTI_TOOL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_PERODIUM_CRAFT_FOOD = new CreativeModeTab("tabperodium_craft_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PerodiumcraftModItems.PERODIUM_BERRIES);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
