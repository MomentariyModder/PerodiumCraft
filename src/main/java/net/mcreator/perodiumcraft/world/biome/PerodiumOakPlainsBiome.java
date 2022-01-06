
package net.mcreator.perodiumcraft.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;
import net.mcreator.perodiumcraft.init.PerodiumcraftModBiomes;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class PerodiumOakPlainsBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(PerodiumcraftModBlocks.PERODIUM_GRASS.defaultBlockState(),
					PerodiumcraftModBlocks.PERODIUM_DIRT.defaultBlockState(), PerodiumcraftModBlocks.PERODIUM_DIRT.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-13421773).waterColor(-13421773).waterFogColor(-13421773)
				.skyColor(-13421773).foliageColorOverride(-13421773).grassColorOverride(-13421773).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT);
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.PLAINS).depth(0f).scale(0f)
				.temperature(0f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(PerodiumcraftMod.MODID, "perodium_oak_plains"),
				SURFACE_BUILDER);
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(PerodiumcraftModBiomes.PERODIUM_OAK_PLAINS)),
				BiomeDictionary.Type.PLAINS);
	}
}
