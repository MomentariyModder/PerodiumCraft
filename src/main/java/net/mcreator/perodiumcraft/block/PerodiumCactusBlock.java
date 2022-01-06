
package net.mcreator.perodiumcraft.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.perodiumcraft.procedures.PerodiumCactusKoghdaSushchnostStalkivaietsiaSBlokomProcedure;
import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

import java.util.List;
import java.util.Collections;

public class PerodiumCactusBlock extends Block {
	public PerodiumCactusBlock() {
		super(BlockBehaviour.Properties.of(Material.CACTUS).sound(SoundType.GRASS).strength(1f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("perodium_cactus");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PerodiumCactusKoghdaSushchnostStalkivaietsiaSBlokomProcedure.execute(entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(PerodiumcraftModBlocks.PERODIUM_CACTUS, renderType -> renderType == RenderType.cutout());
	}
}
