
package net.mcreator.perodiumcraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class DeepslateRubyOreBlock extends Block {
	public DeepslateRubyOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(9f, 30f).requiresCorrectToolForDrops());
		setRegistryName("deepslate_ruby_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 3;
		return false;
	}
}