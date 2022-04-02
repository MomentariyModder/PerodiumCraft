
package net.mcreator.perodiumcraft.world.dimension;

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
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_STONE.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_SAND.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_SANDSTONE.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.INFINITI_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.INFINITI_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.AKVAMARINE_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.PERODIUM_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.RUBY_DIRT.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.HOCHIYM_GRASS.get());
			replaceableBlocks.add(PerodiumcraftModBlocks.HOCHIYM_DIRT.get());
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
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.2, 0.2, 0.2);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("perodiumcraft:perodium_land"), customEffect));
		}
	}
}
