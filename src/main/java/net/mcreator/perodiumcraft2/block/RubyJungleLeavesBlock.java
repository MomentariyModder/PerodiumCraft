
package net.mcreator.perodiumcraft2.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.perodiumcraft2.itemgroup.PerodiumCraftBlocksItemGroup;
import net.mcreator.perodiumcraft2.Perodiumcraft2ModElements;

import java.util.List;
import java.util.Collections;

@Perodiumcraft2ModElements.ModElement.Tag
public class RubyJungleLeavesBlock extends Perodiumcraft2ModElements.ModElement {
	@ObjectHolder("perodiumcraft2:ruby_jungle_leaves")
	public static final Block block = null;
	public RubyJungleLeavesBlock(Perodiumcraft2ModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(PerodiumCraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(3f, 3f).setLightLevel(s -> 0));
			setRegistryName("ruby_jungle_leaves");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
