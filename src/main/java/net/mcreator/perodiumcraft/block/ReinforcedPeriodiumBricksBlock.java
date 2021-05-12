
package net.mcreator.perodiumcraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftBlocksItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

import java.util.List;
import java.util.Collections;

@PerodiumcraftModElements.ModElement.Tag
public class ReinforcedPeriodiumBricksBlock extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:reinforced_periodium_bricks")
	public static final Block block = null;
	public ReinforcedPeriodiumBricksBlock(PerodiumcraftModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(PerodiumCraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(9f, 45f).setLightLevel(s -> 0).harvestLevel(4)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("reinforced_periodium_bricks");
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
