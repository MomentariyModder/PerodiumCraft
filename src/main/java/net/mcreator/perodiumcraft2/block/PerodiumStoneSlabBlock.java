
package net.mcreator.perodiumcraft2.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.state.properties.SlabType;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftBlocksItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

import java.util.List;
import java.util.Collections;

@Perodiumcraft2ModElements.ModElement.Tag
public class PerodiumStoneSlabBlock extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:perodium_stone_slab")
	public static final Block block = null;
	public PerodiumStoneSlabBlock(Perodiumcraft2ModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(PerodiumCraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(4f, 12f).setLightLevel(s -> 0).harvestLevel(4)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("perodium_stone_slab");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
