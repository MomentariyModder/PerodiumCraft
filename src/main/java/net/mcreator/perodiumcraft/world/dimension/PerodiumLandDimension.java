
package net.mcreator.perodiumcraft.world.dimension;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

import java.util.Set;
import java.util.HashSet;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class PerodiumLandDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_STONE);
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_oak_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_oak_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_zombie_plains"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_zombie_plains"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_zombie_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_zombie_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_birch_forest"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_birch_forest"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:infiniti_swamp")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:infiniti_swamp")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_zombie_plains"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:akvamarine_zombie_plains"))
					.getGenerationSettings().getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_oak_forest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:perodium_oak_forest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_jungle_forest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_jungle_forest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:hochiym_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:hochiym_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("perodiumcraft:ruby_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.2, 0.2, 0.2);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("perodiumcraft:perodium_land"), customEffect));
		}
	}
}
