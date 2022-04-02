
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

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
import net.mcreator.perodiumcraft.world.features.ores.DeepslateRubyOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.DeepslateInfinitiOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.DeepslateHochiymOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.DeepslateAkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.CopperOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.CoalOreFeature;
import net.mcreator.perodiumcraft.world.features.ores.AkvamarineOreFeature;
import net.mcreator.perodiumcraft.world.features.lakes.PerodiumWaterFeature;
import net.mcreator.perodiumcraft.world.features.RubyIslandFeature;
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
import net.mcreator.perodiumcraft.world.features.InfinitiIslandFeature;
import net.mcreator.perodiumcraft.world.features.InfinitGeodeFeature;
import net.mcreator.perodiumcraft.world.features.HochiymIslandFeature;
import net.mcreator.perodiumcraft.world.features.HochiymGeodeFeature;
import net.mcreator.perodiumcraft.world.features.GoldGeodeFeature;
import net.mcreator.perodiumcraft.world.features.Gold2GeodeFeature;
import net.mcreator.perodiumcraft.world.features.EmeraldGeodeFeature;
import net.mcreator.perodiumcraft.world.features.DiamondGeodeFeature;
import net.mcreator.perodiumcraft.world.features.CopperGeodeFeature;
import net.mcreator.perodiumcraft.world.features.Copper2GeodeFeature;
import net.mcreator.perodiumcraft.world.features.CoalGeodeFeature;
import net.mcreator.perodiumcraft.world.features.AkvamarineIslandFeature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse4Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse3Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse2Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineHouse1Feature;
import net.mcreator.perodiumcraft.world.features.AkvamarineGeodeFeature;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PerodiumcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PerodiumcraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PERODIUM_WATER = register("perodium_water", PerodiumWaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, PerodiumWaterFeature.GENERATE_BIOMES, PerodiumWaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_COBBLESTONE = register("perodium_cobblestone", PerodiumCobblestoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumCobblestoneFeature.GENERATE_BIOMES,
					PerodiumCobblestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HOCHIYM_ORE = register("hochiym_ore", HochiymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, HochiymOreFeature.GENERATE_BIOMES, HochiymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_ORE = register("akvamarine_ore", AkvamarineOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AkvamarineOreFeature.GENERATE_BIOMES, AkvamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INFINITI_ORE = register("infiniti_ore", InfinitiOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, InfinitiOreFeature.GENERATE_BIOMES, InfinitiOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_HOCHIYM_ORE = register("nether_hochiym_ore", NetherHochiymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherHochiymOreFeature.GENERATE_BIOMES,
					NetherHochiymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_AKVAMARINE_ORE = register("nether_akvamarine_ore", NetherAkvamarineOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherAkvamarineOreFeature.GENERATE_BIOMES,
					NetherAkvamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE_2 = register("ruby_ore_2", RubyOre2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOre2Feature.GENERATE_BIOMES, RubyOre2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_INFINITI_ORE = register("nether_infiniti_ore", NetherInfinitiOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherInfinitiOreFeature.GENERATE_BIOMES,
					NetherInfinitiOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_HOCHIYM_ORE = register("end_hochiym_ore", EndHochiymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EndHochiymOreFeature.GENERATE_BIOMES,
					EndHochiymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_AKVAMARINE_ORE = register("end_akvamarine_ore", EndAkvamarineOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EndAkvamarineOreFeature.GENERATE_BIOMES,
					EndAkvamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_RUBY_ORE = register("end_ruby_ore", EndRubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EndRubyOreFeature.GENERATE_BIOMES, EndRubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> END_INFINITI_ORE = register("end_infiniti_ore", EndInfinitiOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EndInfinitiOreFeature.GENERATE_BIOMES,
					EndInfinitiOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_HOCHIYM_ORE = register("perodium_hochiym_ore", PerodiumHochiymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumHochiymOreFeature.GENERATE_BIOMES,
					PerodiumHochiymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_AKVAMARINE_ORE = register("perodium_akvamarine_ore",
			PerodiumAkvamarineOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					PerodiumAkvamarineOreFeature.GENERATE_BIOMES, PerodiumAkvamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_RUBY_ORE = register("perodium_ruby_ore", PerodiumRubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumRubyOreFeature.GENERATE_BIOMES,
					PerodiumRubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_INFINITI_ORE = register("perodium_infiniti_ore", PerodiumInfinitiOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumInfinitiOreFeature.GENERATE_BIOMES,
					PerodiumInfinitiOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COAL_ORE = register("coal_ore", CoalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoalOreFeature.GENERATE_BIOMES, CoalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> IRON_ORE = register("iron_ore", IronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IronOreFeature.GENERATE_BIOMES, IronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLD_ORE = register("gold_ore", GoldOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GoldOreFeature.GENERATE_BIOMES, GoldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIAMONDORE = register("diamondore", DiamondoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DiamondoreFeature.GENERATE_BIOMES, DiamondoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAPIS_LAZULI_ORE = register("lapis_lazuli_ore", LapisLazuliOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LapisLazuliOreFeature.GENERATE_BIOMES,
					LapisLazuliOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EMERALD_ORE = register("emerald_ore", EmeraldOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EmeraldOreFeature.GENERATE_BIOMES, EmeraldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_QUARTZ_ORE_2 = register("perodium_quartz_ore_2", PerodiumQuartzOre2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumQuartzOre2Feature.GENERATE_BIOMES,
					PerodiumQuartzOre2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> REDSTONE_ORE = register("redstone_ore", RedstoneOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, RedstoneOreFeature.GENERATE_BIOMES, RedstoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COPPER_ORE = register("copper_ore", CopperOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES, CopperOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_GLOWSTONE = register("perodium_glowstone", PerodiumGlowstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumGlowstoneFeature.GENERATE_BIOMES,
					PerodiumGlowstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_HOCHIYM_ORE = register("deepslate_hochiym_ore", DeepslateHochiymOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateHochiymOreFeature.GENERATE_BIOMES,
					DeepslateHochiymOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_AKVAMARINE_ORE = register("deepslate_akvamarine_ore",
			DeepslateAkvamarineOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslateAkvamarineOreFeature.GENERATE_BIOMES, DeepslateAkvamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_INFINITI_ORE = register("deepslate_infiniti_ore", DeepslateInfinitiOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateInfinitiOreFeature.GENERATE_BIOMES,
					DeepslateInfinitiOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore", DeepslateRubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateRubyOreFeature.GENERATE_BIOMES,
					DeepslateRubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HOCHIYM_GRASS_PLANT = register("hochiym_grass_plant", HochiymGrassPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HochiymGrassPlantFeature.GENERATE_BIOMES,
					HochiymGrassPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_GRASS_PLANT = register("akvamarine_grass_plant", AkvamarineGrassPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AkvamarineGrassPlantFeature.GENERATE_BIOMES,
					AkvamarineGrassPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INFINITI_GRASS_PLANT = register("infiniti_grass_plant", InfinitiGrassPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, InfinitiGrassPlantFeature.GENERATE_BIOMES,
					InfinitiGrassPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_GRASS_PLANT = register("ruby_grass_plant", RubyGrassPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RubyGrassPlantFeature.GENERATE_BIOMES,
					RubyGrassPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_GRASS_PLANT = register("perodium_grass_plant", PerodiumGrassPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumGrassPlantFeature.GENERATE_BIOMES,
					PerodiumGrassPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_DEAD_BUSH = register("perodium_dead_bush", PerodiumDeadBushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumDeadBushFeature.GENERATE_BIOMES,
					PerodiumDeadBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_BUSH = register("akvamarine_bush", AkvamarineBushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AkvamarineBushFeature.GENERATE_BIOMES,
					AkvamarineBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_TULIP = register("perodium_tulip", PerodiumTulipFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumTulipFeature.GENERATE_BIOMES, PerodiumTulipFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_CORNFLOWER = register("akvamarine_cornflower", AkvamarineCornflowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AkvamarineCornflowerFeature.GENERATE_BIOMES,
					AkvamarineCornflowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_DANDELEON = register("ruby_dandeleon", RubyDandeleonFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RubyDandeleonFeature.GENERATE_BIOMES, RubyDandeleonFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_BUSH = register("perodium_bush", PerodiumBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumBushFeature.GENERATE_BIOMES, PerodiumBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_YELLOW_MUSHROOM = register("perodium_yellow_mushroom",
			PerodiumYellowMushroomFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					PerodiumYellowMushroomFeature.GENERATE_BIOMES, PerodiumYellowMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_MUSHROOM = register("perodium_mushroom", PerodiumMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumMushroomFeature.GENERATE_BIOMES,
					PerodiumMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_MUSHROOM = register("ruby_mushroom", RubyMushroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RubyMushroomFeature.GENERATE_BIOMES, RubyMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_CACTUS = register("perodium_cactus", PerodiumCactusFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PerodiumCactusFeature.GENERATE_BIOMES,
					PerodiumCactusFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_BUSH_2 = register("perodium_bush_2", PerodiumBush2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PerodiumBush2Feature.GENERATE_BIOMES,
					PerodiumBush2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_1 = register("mushroom_1", Mushroom1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom1Feature.GENERATE_BIOMES, Mushroom1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_2 = register("mushroom_2", Mushroom2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom2Feature.GENERATE_BIOMES, Mushroom2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_3 = register("mushroom_3", Mushroom3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom3Feature.GENERATE_BIOMES, Mushroom3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_GEODE = register("akvamarine_geode", AkvamarineGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AkvamarineGeodeFeature.GENERATE_BIOMES,
					AkvamarineGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HOCHIYM_GEODE = register("hochiym_geode", HochiymGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, HochiymGeodeFeature.GENERATE_BIOMES, HochiymGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INFINIT_GEODE = register("infinit_geode", InfinitGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, InfinitGeodeFeature.GENERATE_BIOMES, InfinitGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_GEODE = register("ruby_geode", RubyGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RubyGeodeFeature.GENERATE_BIOMES, RubyGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_QUARTZ_GEODE = register("perodium_quartz_geode", PerodiumQuartzGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PerodiumQuartzGeodeFeature.GENERATE_BIOMES,
					PerodiumQuartzGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COAL_GEODE = register("coal_geode", CoalGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CoalGeodeFeature.GENERATE_BIOMES, CoalGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIAMOND_GEODE = register("diamond_geode", DiamondGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, DiamondGeodeFeature.GENERATE_BIOMES, DiamondGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EMERALD_GEODE = register("emerald_geode", EmeraldGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, EmeraldGeodeFeature.GENERATE_BIOMES, EmeraldGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAPIS_LAZULI_GEODE = register("lapis_lazuli_geode", LapisLazuliGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LapisLazuliGeodeFeature.GENERATE_BIOMES,
					LapisLazuliGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> REDSTONE_GEODE = register("redstone_geode", RedstoneGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RedstoneGeodeFeature.GENERATE_BIOMES, RedstoneGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> IRON_1_GEODE = register("iron_1_geode", Iron1GeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Iron1GeodeFeature.GENERATE_BIOMES, Iron1GeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> IRON_2_GEODE = register("iron_2_geode", Iron2GeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Iron2GeodeFeature.GENERATE_BIOMES, Iron2GeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLD_GEODE = register("gold_geode", GoldGeodeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GoldGeodeFeature.GENERATE_BIOMES, GoldGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLD_2_GEODE = register("gold_2_geode", Gold2GeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Gold2GeodeFeature.GENERATE_BIOMES, Gold2GeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COPPER_GEODE = register("copper_geode", CopperGeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CopperGeodeFeature.GENERATE_BIOMES, CopperGeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COPPER_2_GEODE = register("copper_2_geode", Copper2GeodeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Copper2GeodeFeature.GENERATE_BIOMES, Copper2GeodeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_HOUSE_1 = register("akvamarine_house_1", AkvamarineHouse1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AkvamarineHouse1Feature.GENERATE_BIOMES,
					AkvamarineHouse1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_HOUSE_1 = register("perodium_house_1", PerodiumHouse1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PerodiumHouse1Feature.GENERATE_BIOMES,
					PerodiumHouse1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_HOUSE_1 = register("ruby_house_1", RubyHouse1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RubyHouse1Feature.GENERATE_BIOMES, RubyHouse1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_HOUSE_2 = register("akvamarine_house_2", AkvamarineHouse2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AkvamarineHouse2Feature.GENERATE_BIOMES,
					AkvamarineHouse2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_HOUSE_3 = register("akvamarine_house_3", AkvamarineHouse3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AkvamarineHouse3Feature.GENERATE_BIOMES,
					AkvamarineHouse3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_HOUSE_4 = register("akvamarine_house_4", AkvamarineHouse4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AkvamarineHouse4Feature.GENERATE_BIOMES,
					AkvamarineHouse4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_HOUSE_2 = register("perodium_house_2", PerodiumHouse2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PerodiumHouse2Feature.GENERATE_BIOMES,
					PerodiumHouse2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_HOUSE_3 = register("perodium_house_3", PerodiumHouse3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PerodiumHouse3Feature.GENERATE_BIOMES,
					PerodiumHouse3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PERODIUM_HOUSE_4 = register("perodium_house_4", PerodiumHouse4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PerodiumHouse4Feature.GENERATE_BIOMES,
					PerodiumHouse4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_HOUSE_2 = register("ruby_house_2", RubyHouse2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RubyHouse2Feature.GENERATE_BIOMES, RubyHouse2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_HOUSE_3 = register("ruby_house_3", RubyHouse3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RubyHouse3Feature.GENERATE_BIOMES, RubyHouse3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_HOUSE_4 = register("ruby_house_4", RubyHouse4Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RubyHouse4Feature.GENERATE_BIOMES, RubyHouse4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HOCHIYM_ISLAND = register("hochiym_island", HochiymIslandFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.RAW_GENERATION, HochiymIslandFeature.GENERATE_BIOMES, HochiymIslandFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AKVAMARINE_ISLAND = register("akvamarine_island", AkvamarineIslandFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, AkvamarineIslandFeature.GENERATE_BIOMES,
					AkvamarineIslandFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INFINITI_ISLAND = register("infiniti_island", InfinitiIslandFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, InfinitiIslandFeature.GENERATE_BIOMES,
					InfinitiIslandFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ISLAND = register("ruby_island", RubyIslandFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, RubyIslandFeature.GENERATE_BIOMES, RubyIslandFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
