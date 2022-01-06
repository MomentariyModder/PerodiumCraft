
package net.mcreator.perodiumcraft.world.biome;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class HochiymPlainsBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(PerodiumcraftModBlocks.HOCHIYM_GRASS.defaultBlockState(),
					PerodiumcraftModBlocks.HOCHIYM_DIRT.defaultBlockState(), PerodiumcraftModBlocks.HOCHIYM_DIRT.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16776961).waterColor(-16776961).waterFogColor(-16776961)
				.skyColor(-16776961).foliageColorOverride(-16776961).grassColorOverride(-16776961).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT);
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0.1f).scale(0.2f)
				.temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(PerodiumcraftMod.MODID, "hochiym_plains"),
				SURFACE_BUILDER);
	}
}
