
package net.mcreator.perodiumcraft.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.perodiumcraft.procedures.AkvamarineBushUpdateTickProcedure;
import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class AkvamarineBushBlock extends FlowerBlock {
	public AkvamarineBushBlock() {
		super(MobEffects.SATURATION, 0,
				BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).strength(3f, 3f));
		setRegistryName("akvamarine_bush");
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		AkvamarineBushUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(PerodiumcraftModBlocks.AKVAMARINE_BUSH, renderType -> renderType == RenderType.cutout());
	}
}
