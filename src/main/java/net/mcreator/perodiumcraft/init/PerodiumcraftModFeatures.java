
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.perodiumcraft.world.features.plants.RubyMushroomFeature;
import net.mcreator.perodiumcraft.world.features.plants.RubyGrassPlantFeature;
import net.mcreator.perodiumcraft.world.features.plants.RubyDandeleonFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumYellowMushroomFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumTulipFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumMushroomFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumGrassPlantFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumDeadBushFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumBushFeature;
import net.mcreator.perodiumcraft.world.features.plants.PerodiumBush2Feature;
import net.mcreator.perodiumcraft.world.features.plants.InfinitiGrassPlantFeature;
import net.mcreator.perodiumcraft.world.features.plants.HochiymGrassPlantFeature;
import net.mcreator.perodiumcraft.world.features.plants.AkvamarineGrassPlantFeature;
import net.mcreator.perodiumcraft.world.features.plants.AkvamarineCornflowerFeature;
import net.mcreator.perodiumcraft.world.features.plants.AkvamarineBushFeature;
import net.mcreator.perodiumcraft.world.features.ores.RubyOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.RubyOre2Feature;
import net.mcreator.perodiumcraft.world.features.ores.RedstoneOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumRubyOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumQuartzOre2Feature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumInfinitiOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumHochiymOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumGlowstoneFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumCobblestoneFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumCactusFeature;
import net.mcreator.perodiumcraft.world.features.ores.PerodiumAkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.NetherInfinitiOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.NetherHochiymOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.NetherAkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.LapisLazuliOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.IronOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.InfinitiOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.HochiymOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.GoldOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.EndRubyOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.EndInfinitiOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.EndHochiymOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.EndAkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.EmeraldOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.DiamondoreFeature;
import net.mcreator.perodiumcraft.world.features.ores.CopperOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.CoalOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.AkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.lakes.PerodiumWaterFeature;
import net.mcreator.perodiumcraft.world.features.RubyHouse4Feature;
import net.mcreator.perodiumcraft.world.features.RubyHouse3Feature;
import net.mcreator.perodiumcraft.world.features.RubyHouse2Feature;
import net.mcreator.perodiumcraft.world.features.RubyHouse1Feature;
import net.mcreator.perodiumcraft.world.features.RubyGeodeFeature;
import net.mcreator.perodiumcraft.world.features.RedstoneGeodeFeature;
import net.mcreator.perodiumcraft.world.features.PerodiumQuartzGeodeFeature;
import net.mcreator.perodiumcraft.world.features.PerodiumHouse4Feature;
import net.mcreator.perodiumcraft.world.features.PerodiumHouse3Feature;
import net.mcreator.perodiumcraft.world.features.PerodiumHouse2Feature;
import net.mcreator.perodiumcraft.world.features.PerodiumHouse1Feature;
import net.mcreator.perodiumcraft.world.features.Mushroom3Feature;
import net.mcreator.perodiumcraft.world.features.Mushroom2Feature;
import net.mcreator.perodiumcraft.world.features.Mushroom1Feature;
import net.mcreator.perodiumcraft.world.features.LapisLazuliGeodeFeature;
import net.mcreator.perodiumcraft.world.features.Iron2GeodeFeature;
import net.mcreator.perodiumcraft.world.features.Iron1GeodeFeature;
import net.mcreator.perodiumcraft.world.features.InfinitGeodeFeature;
import net.mcreator.perodiumcraft.world.features.HochiymGeodeFeature;
import net.mcreator.perodiumcraft.world.features.GoldGeodeFeature;
import net.mcreator.perodiumcraft.world.features.Gold2GeodeFeature;
import net.mcreator.perodiumcraft.world.features.EmeraldGeodeFeature;
import net.mcreator.perodiumcraft.world.features.DiamondGeodeFeature;
import net.mcreator.perodiumcraft.world.features.CopperGeodeFeature;
import net.mcreator.perodiumcraft.world.features.Copper2GeodeFeature;
import net.mcreator.perodiumcraft.world.features.CoalGeodeFeature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse4Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse3Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse2Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse1Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineGeodeFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(PerodiumWaterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.LAKES, PerodiumWaterFeature.GENERATE_BIOMES,
				PerodiumWaterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumCobblestoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumCobblestoneFeature.GENERATE_BIOMES, PerodiumCobblestoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HochiymOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, HochiymOreFeature.GENERATE_BIOMES,
				HochiymOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AkvamarineOreFeature.GENERATE_BIOMES, AkvamarineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES,
				RubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(InfinitiOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				InfinitiOreFeature.GENERATE_BIOMES, InfinitiOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherHochiymOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				NetherHochiymOreFeature.GENERATE_BIOMES, NetherHochiymOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherAkvamarineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				NetherAkvamarineOreFeature.GENERATE_BIOMES, NetherAkvamarineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOre2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOre2Feature.GENERATE_BIOMES,
				RubyOre2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherInfinitiOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				NetherInfinitiOreFeature.GENERATE_BIOMES, NetherInfinitiOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EndHochiymOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				EndHochiymOreFeature.GENERATE_BIOMES, EndHochiymOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EndAkvamarineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				EndAkvamarineOreFeature.GENERATE_BIOMES, EndAkvamarineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EndRubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EndRubyOreFeature.GENERATE_BIOMES,
				EndRubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EndInfinitiOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				EndInfinitiOreFeature.GENERATE_BIOMES, EndInfinitiOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumHochiymOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumHochiymOreFeature.GENERATE_BIOMES, PerodiumHochiymOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumAkvamarineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumAkvamarineOreFeature.GENERATE_BIOMES, PerodiumAkvamarineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumRubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumRubyOreFeature.GENERATE_BIOMES, PerodiumRubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumInfinitiOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumInfinitiOreFeature.GENERATE_BIOMES, PerodiumInfinitiOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CoalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoalOreFeature.GENERATE_BIOMES,
				CoalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IronOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IronOreFeature.GENERATE_BIOMES,
				IronOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GoldOreFeature.GENERATE_BIOMES,
				GoldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DiamondoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DiamondoreFeature.GENERATE_BIOMES,
				DiamondoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LapisLazuliOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LapisLazuliOreFeature.GENERATE_BIOMES, LapisLazuliOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EmeraldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EmeraldOreFeature.GENERATE_BIOMES,
				EmeraldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumQuartzOre2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumQuartzOre2Feature.GENERATE_BIOMES, PerodiumQuartzOre2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RedstoneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				RedstoneOreFeature.GENERATE_BIOMES, RedstoneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CopperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES,
				CopperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumGlowstoneFeature.GENERATE_BIOMES, PerodiumGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HochiymGrassPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				HochiymGrassPlantFeature.GENERATE_BIOMES, HochiymGrassPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineGrassPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AkvamarineGrassPlantFeature.GENERATE_BIOMES, AkvamarineGrassPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(InfinitiGrassPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				InfinitiGrassPlantFeature.GENERATE_BIOMES, InfinitiGrassPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyGrassPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RubyGrassPlantFeature.GENERATE_BIOMES, RubyGrassPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumGrassPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumGrassPlantFeature.GENERATE_BIOMES, PerodiumGrassPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumDeadBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumDeadBushFeature.GENERATE_BIOMES, PerodiumDeadBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AkvamarineBushFeature.GENERATE_BIOMES, AkvamarineBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumTulipFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumTulipFeature.GENERATE_BIOMES, PerodiumTulipFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineCornflowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AkvamarineCornflowerFeature.GENERATE_BIOMES, AkvamarineCornflowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyDandeleonFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RubyDandeleonFeature.GENERATE_BIOMES, RubyDandeleonFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumBushFeature.GENERATE_BIOMES, PerodiumBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumYellowMushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumYellowMushroomFeature.GENERATE_BIOMES, PerodiumYellowMushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumMushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumMushroomFeature.GENERATE_BIOMES, PerodiumMushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyMushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RubyMushroomFeature.GENERATE_BIOMES, RubyMushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumCactusFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerodiumCactusFeature.GENERATE_BIOMES, PerodiumCactusFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumBush2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PerodiumBush2Feature.GENERATE_BIOMES, PerodiumBush2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom1Feature.GENERATE_BIOMES,
				Mushroom1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom2Feature.GENERATE_BIOMES,
				Mushroom2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom3Feature.GENERATE_BIOMES,
				Mushroom3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AkvamarineGeodeFeature.GENERATE_BIOMES, AkvamarineGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HochiymGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				HochiymGeodeFeature.GENERATE_BIOMES, HochiymGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(InfinitGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				InfinitGeodeFeature.GENERATE_BIOMES, InfinitGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RubyGeodeFeature.GENERATE_BIOMES,
				RubyGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumQuartzGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PerodiumQuartzGeodeFeature.GENERATE_BIOMES, PerodiumQuartzGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CoalGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CoalGeodeFeature.GENERATE_BIOMES,
				CoalGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DiamondGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				DiamondGeodeFeature.GENERATE_BIOMES, DiamondGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EmeraldGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				EmeraldGeodeFeature.GENERATE_BIOMES, EmeraldGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LapisLazuliGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LapisLazuliGeodeFeature.GENERATE_BIOMES, LapisLazuliGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedstoneGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				RedstoneGeodeFeature.GENERATE_BIOMES, RedstoneGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Iron1GeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Iron1GeodeFeature.GENERATE_BIOMES, Iron1GeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Iron2GeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Iron2GeodeFeature.GENERATE_BIOMES, Iron2GeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoldGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GoldGeodeFeature.GENERATE_BIOMES,
				GoldGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Gold2GeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Gold2GeodeFeature.GENERATE_BIOMES, Gold2GeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CopperGeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CopperGeodeFeature.GENERATE_BIOMES, CopperGeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Copper2GeodeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Copper2GeodeFeature.GENERATE_BIOMES, Copper2GeodeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineHouse1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AkvamarineHouse1Feature.GENERATE_BIOMES, AkvamarineHouse1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumHouse1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PerodiumHouse1Feature.GENERATE_BIOMES, PerodiumHouse1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyHouse1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				RubyHouse1Feature.GENERATE_BIOMES, RubyHouse1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineHouse2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AkvamarineHouse2Feature.GENERATE_BIOMES, AkvamarineHouse2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineHouse3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AkvamarineHouse3Feature.GENERATE_BIOMES, AkvamarineHouse3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AkvamarineHouse4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AkvamarineHouse4Feature.GENERATE_BIOMES, AkvamarineHouse4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumHouse2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PerodiumHouse2Feature.GENERATE_BIOMES, PerodiumHouse2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumHouse3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PerodiumHouse3Feature.GENERATE_BIOMES, PerodiumHouse3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PerodiumHouse4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PerodiumHouse4Feature.GENERATE_BIOMES, PerodiumHouse4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyHouse2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				RubyHouse2Feature.GENERATE_BIOMES, RubyHouse2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyHouse3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				RubyHouse3Feature.GENERATE_BIOMES, RubyHouse3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyHouse4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				RubyHouse4Feature.GENERATE_BIOMES, RubyHouse4Feature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
