
package net.mcreator.perodiumcraft.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

public class InfinitiGrassPlantBlock extends FlowerBlock {
	public InfinitiGrassPlantBlock() {
		super(MobEffects.SATURATION, 0, BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).instabreak());
		setRegistryName("infiniti_grass_plant");
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(PerodiumcraftModBlocks.INFINITI_GRASS_PLANT, renderType -> renderType == RenderType.cutout());
	}
}
