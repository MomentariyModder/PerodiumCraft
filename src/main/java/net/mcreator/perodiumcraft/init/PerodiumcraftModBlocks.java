
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.perodiumcraft.block.StrippedRubyJungleWoodBlock;
import net.mcreator.perodiumcraft.block.StrippedRubyJungleBlock;
import net.mcreator.perodiumcraft.block.StrippedPerodiumOakWoodBlock;
import net.mcreator.perodiumcraft.block.StrippedPerodiumOakBlock;
import net.mcreator.perodiumcraft.block.StrippedAkvamarineBirchWoodBlock;
import net.mcreator.perodiumcraft.block.StrippedAkvamarineBirchBlock;
import net.mcreator.perodiumcraft.block.SmoothPerodiumQuartzStairsBlock;
import net.mcreator.perodiumcraft.block.SmoothPerodiumQuartzSlabBlock;
import net.mcreator.perodiumcraft.block.SmoothPerodiumQuartzBlockBlock;
import net.mcreator.perodiumcraft.block.RubyPathBlock;
import net.mcreator.perodiumcraft.block.RubyOreBlock;
import net.mcreator.perodiumcraft.block.RubyOre2Block;
import net.mcreator.perodiumcraft.block.RubyMushroomStemBlock;
import net.mcreator.perodiumcraft.block.RubyMushroomBlockBlock;
import net.mcreator.perodiumcraft.block.RubyMushroomBlock;
import net.mcreator.perodiumcraft.block.RubyJungleWoodBlock;
import net.mcreator.perodiumcraft.block.RubyJungleStairsBlock;
import net.mcreator.perodiumcraft.block.RubyJungleSlabBlock;
import net.mcreator.perodiumcraft.block.RubyJunglePressurePlateBlock;
import net.mcreator.perodiumcraft.block.RubyJunglePlantBlock;
import net.mcreator.perodiumcraft.block.RubyJungleLeavesBlock;
import net.mcreator.perodiumcraft.block.RubyJungleFenceGateBlock;
import net.mcreator.perodiumcraft.block.RubyJungleFenceBlock;
import net.mcreator.perodiumcraft.block.RubyJungleDoorBlock;
import net.mcreator.perodiumcraft.block.RubyJungleButtonBlock;
import net.mcreator.perodiumcraft.block.RubyJungleBlock;
import net.mcreator.perodiumcraft.block.RubyGrassPlantBlock;
import net.mcreator.perodiumcraft.block.RubyGrassBlock;
import net.mcreator.perodiumcraft.block.RubyDirtBlock;
import net.mcreator.perodiumcraft.block.RubyDandeleonBlock;
import net.mcreator.perodiumcraft.block.RubyBoxBlock;
import net.mcreator.perodiumcraft.block.RubyBlockBlock;
import net.mcreator.perodiumcraft.block.ReinforcedPeriodiumBricksBlock;
import net.mcreator.perodiumcraft.block.RedstoneOreBlock;
import net.mcreator.perodiumcraft.block.PerodiumYellowMushroomStemBlock;
import net.mcreator.perodiumcraft.block.PerodiumYellowMushroomBlockBlock;
import net.mcreator.perodiumcraft.block.PerodiumYellowMushroomBlock;
import net.mcreator.perodiumcraft.block.PerodiumWaterBlock;
import net.mcreator.perodiumcraft.block.PerodiumTulipBlock;
import net.mcreator.perodiumcraft.block.PerodiumStoneStairsBlock;
import net.mcreator.perodiumcraft.block.PerodiumStoneSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumStonePressurePlateBlock;
import net.mcreator.perodiumcraft.block.PerodiumStoneButtonBlock;
import net.mcreator.perodiumcraft.block.PerodiumStoneBlock;
import net.mcreator.perodiumcraft.block.PerodiumSmoothStoneSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumSmoothStoneBlock;
import net.mcreator.perodiumcraft.block.PerodiumShroomlightBlock;
import net.mcreator.perodiumcraft.block.PerodiumSandstoneWallBlock;
import net.mcreator.perodiumcraft.block.PerodiumSandstoneStairsBlock;
import net.mcreator.perodiumcraft.block.PerodiumSandstoneSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumSandstoneBlock;
import net.mcreator.perodiumcraft.block.PerodiumSandBlock;
import net.mcreator.perodiumcraft.block.PerodiumRubyOreBlock;
import net.mcreator.perodiumcraft.block.PerodiumQuartzStairsBlock;
import net.mcreator.perodiumcraft.block.PerodiumQuartzSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumQuartzPillarBlock;
import net.mcreator.perodiumcraft.block.PerodiumQuartzOre2Block;
import net.mcreator.perodiumcraft.block.PerodiumQuartzBrickBlock;
import net.mcreator.perodiumcraft.block.PerodiumQuartzBlockBlock;
import net.mcreator.perodiumcraft.block.PerodiumPressurePlateBlock;
import net.mcreator.perodiumcraft.block.PerodiumPathBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakWoodBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakStairsBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakPressurePlateBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakPlantBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakLeavesBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakFenceGateBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakFenceBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakDoorBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakButtonBlock;
import net.mcreator.perodiumcraft.block.PerodiumOakBlock;
import net.mcreator.perodiumcraft.block.PerodiumMushroomStemBlock;
import net.mcreator.perodiumcraft.block.PerodiumMushroomBlockBlock;
import net.mcreator.perodiumcraft.block.PerodiumMushroomBlock;
import net.mcreator.perodiumcraft.block.PerodiumLanternBlock;
import net.mcreator.perodiumcraft.block.PerodiumLandPortalBlock;
import net.mcreator.perodiumcraft.block.PerodiumInfinitiOreBlock;
import net.mcreator.perodiumcraft.block.PerodiumHochiymOreBlock;
import net.mcreator.perodiumcraft.block.PerodiumGrassPlantBlock;
import net.mcreator.perodiumcraft.block.PerodiumGrassBlock;
import net.mcreator.perodiumcraft.block.PerodiumGlowstoneBlock;
import net.mcreator.perodiumcraft.block.PerodiumGlassPaneBlock;
import net.mcreator.perodiumcraft.block.PerodiumGlassBlock;
import net.mcreator.perodiumcraft.block.PerodiumDoorBlock;
import net.mcreator.perodiumcraft.block.PerodiumDirtBlock;
import net.mcreator.perodiumcraft.block.PerodiumDeadBushBlock;
import net.mcreator.perodiumcraft.block.PerodiumCobblestoneWallBlock;
import net.mcreator.perodiumcraft.block.PerodiumCobblestoneStairsBlock;
import net.mcreator.perodiumcraft.block.PerodiumCobblestoneSlabBlock;
import net.mcreator.perodiumcraft.block.PerodiumCobblestoneBlock;
import net.mcreator.perodiumcraft.block.PerodiumCactusBlock;
import net.mcreator.perodiumcraft.block.PerodiumBushBlock;
import net.mcreator.perodiumcraft.block.PerodiumBush2Block;
import net.mcreator.perodiumcraft.block.PerodiumBrickBlock;
import net.mcreator.perodiumcraft.block.PerodiumBoxBlock;
import net.mcreator.perodiumcraft.block.PerodiumBlockBlock;
import net.mcreator.perodiumcraft.block.PerodiumBarsBlock;
import net.mcreator.perodiumcraft.block.PerodiumAppleStage3Block;
import net.mcreator.perodiumcraft.block.PerodiumAppleStage2Block;
import net.mcreator.perodiumcraft.block.PerodiumAppleStage1Block;
import net.mcreator.perodiumcraft.block.PerodiumAkvamarineOreBlock;
import net.mcreator.perodiumcraft.block.NetherInfinitiOreBlock;
import net.mcreator.perodiumcraft.block.NetherHochiymOreBlock;
import net.mcreator.perodiumcraft.block.NetherAkvamarineOreBlock;
import net.mcreator.perodiumcraft.block.LapisLazuliOreBlock;
import net.mcreator.perodiumcraft.block.IronOreBlock;
import net.mcreator.perodiumcraft.block.InfinitiPathBlock;
import net.mcreator.perodiumcraft.block.InfinitiOreBlock;
import net.mcreator.perodiumcraft.block.InfinitiGrassPlantBlock;
import net.mcreator.perodiumcraft.block.InfinitiGrassBlock;
import net.mcreator.perodiumcraft.block.InfinitiDirtBlock;
import net.mcreator.perodiumcraft.block.InfinitiBlockBlock;
import net.mcreator.perodiumcraft.block.HochiymPathBlock;
import net.mcreator.perodiumcraft.block.HochiymOreBlock;
import net.mcreator.perodiumcraft.block.HochiymGrassPlantBlock;
import net.mcreator.perodiumcraft.block.HochiymGrassBlock;
import net.mcreator.perodiumcraft.block.HochiymDirtBlock;
import net.mcreator.perodiumcraft.block.HochiymBlockBlock;
import net.mcreator.perodiumcraft.block.GoldOreBlock;
import net.mcreator.perodiumcraft.block.EndRubyOreBlock;
import net.mcreator.perodiumcraft.block.EndInfinitiOreBlock;
import net.mcreator.perodiumcraft.block.EndHochiymOreBlock;
import net.mcreator.perodiumcraft.block.EndAkvamarineOreBlock;
import net.mcreator.perodiumcraft.block.EmeraldOreBlock;
import net.mcreator.perodiumcraft.block.DiamondoreBlock;
import net.mcreator.perodiumcraft.block.DeepslateRubyOreBlock;
import net.mcreator.perodiumcraft.block.DeepslateInfinitiOreBlock;
import net.mcreator.perodiumcraft.block.DeepslateHochiymOreBlock;
import net.mcreator.perodiumcraft.block.DeepslateAkvamarineOreBlock;
import net.mcreator.perodiumcraft.block.CopperOreBlock;
import net.mcreator.perodiumcraft.block.CoalOreBlock;
import net.mcreator.perodiumcraft.block.ChiseldPerodiumQuartzBlockBlock;
import net.mcreator.perodiumcraft.block.AkvamarinePathBlock;
import net.mcreator.perodiumcraft.block.AkvamarineOreBlock;
import net.mcreator.perodiumcraft.block.AkvamarineOakBlock;
import net.mcreator.perodiumcraft.block.AkvamarineLeavesBlock;
import net.mcreator.perodiumcraft.block.AkvamarineGrassPlantBlock;
import net.mcreator.perodiumcraft.block.AkvamarineGrassBlock;
import net.mcreator.perodiumcraft.block.AkvamarineDirtBlock;
import net.mcreator.perodiumcraft.block.AkvamarineCornflowerBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBushBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBush2Block;
import net.mcreator.perodiumcraft.block.AkvamarineBoxBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBlockBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchWoodBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchStairsBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchSlabBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchPressurePlateBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchPlanksBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchFenceGateBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchFenceBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchDoorBlock;
import net.mcreator.perodiumcraft.block.AkvamarineBirchButtonBlock;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class PerodiumcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PerodiumcraftMod.MODID);
	public static final RegistryObject<Block> PERODIUM_LAND_PORTAL = REGISTRY.register("perodium_land_portal", () -> new PerodiumLandPortalBlock());
	public static final RegistryObject<Block> PERODIUM_WATER = REGISTRY.register("perodium_water", () -> new PerodiumWaterBlock());
	public static final RegistryObject<Block> PERODIUM_BARS = REGISTRY.register("perodium_bars", () -> new PerodiumBarsBlock());
	public static final RegistryObject<Block> PERODIUM_LANTERN = REGISTRY.register("perodium_lantern", () -> new PerodiumLanternBlock());
	public static final RegistryObject<Block> PERODIUM_STONE = REGISTRY.register("perodium_stone", () -> new PerodiumStoneBlock());
	public static final RegistryObject<Block> PERODIUM_COBBLESTONE = REGISTRY.register("perodium_cobblestone", () -> new PerodiumCobblestoneBlock());
	public static final RegistryObject<Block> PERODIUM_SMOOTH_STONE = REGISTRY.register("perodium_smooth_stone",
			() -> new PerodiumSmoothStoneBlock());
	public static final RegistryObject<Block> PERODIUM_SANDSTONE = REGISTRY.register("perodium_sandstone", () -> new PerodiumSandstoneBlock());
	public static final RegistryObject<Block> PERODIUM_STONE_SLAB = REGISTRY.register("perodium_stone_slab", () -> new PerodiumStoneSlabBlock());
	public static final RegistryObject<Block> PERODIUM_COBBLESTONE_SLAB = REGISTRY.register("perodium_cobblestone_slab",
			() -> new PerodiumCobblestoneSlabBlock());
	public static final RegistryObject<Block> PERODIUM_SMOOTH_STONE_SLAB = REGISTRY.register("perodium_smooth_stone_slab",
			() -> new PerodiumSmoothStoneSlabBlock());
	public static final RegistryObject<Block> PERODIUM_SANDSTONE_SLAB = REGISTRY.register("perodium_sandstone_slab",
			() -> new PerodiumSandstoneSlabBlock());
	public static final RegistryObject<Block> PERODIUM_STONE_STAIRS = REGISTRY.register("perodium_stone_stairs",
			() -> new PerodiumStoneStairsBlock());
	public static final RegistryObject<Block> PERODIUM_COBBLESTONE_STAIRS = REGISTRY.register("perodium_cobblestone_stairs",
			() -> new PerodiumCobblestoneStairsBlock());
	public static final RegistryObject<Block> PERODIUM_SANDSTONE_STAIRS = REGISTRY.register("perodium_sandstone_stairs",
			() -> new PerodiumSandstoneStairsBlock());
	public static final RegistryObject<Block> PERODIUM_COBBLESTONE_WALL = REGISTRY.register("perodium_cobblestone_wall",
			() -> new PerodiumCobblestoneWallBlock());
	public static final RegistryObject<Block> PERODIUM_SANDSTONE_WALL = REGISTRY.register("perodium_sandstone_wall",
			() -> new PerodiumSandstoneWallBlock());
	public static final RegistryObject<Block> HOCHIYM_ORE = REGISTRY.register("hochiym_ore", () -> new HochiymOreBlock());
	public static final RegistryObject<Block> AKVAMARINE_ORE = REGISTRY.register("akvamarine_ore", () -> new AkvamarineOreBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> INFINITI_ORE = REGISTRY.register("infiniti_ore", () -> new InfinitiOreBlock());
	public static final RegistryObject<Block> NETHER_HOCHIYM_ORE = REGISTRY.register("nether_hochiym_ore", () -> new NetherHochiymOreBlock());
	public static final RegistryObject<Block> NETHER_AKVAMARINE_ORE = REGISTRY.register("nether_akvamarine_ore",
			() -> new NetherAkvamarineOreBlock());
	public static final RegistryObject<Block> RUBY_ORE_2 = REGISTRY.register("ruby_ore_2", () -> new RubyOre2Block());
	public static final RegistryObject<Block> NETHER_INFINITI_ORE = REGISTRY.register("nether_infiniti_ore", () -> new NetherInfinitiOreBlock());
	public static final RegistryObject<Block> END_HOCHIYM_ORE = REGISTRY.register("end_hochiym_ore", () -> new EndHochiymOreBlock());
	public static final RegistryObject<Block> END_AKVAMARINE_ORE = REGISTRY.register("end_akvamarine_ore", () -> new EndAkvamarineOreBlock());
	public static final RegistryObject<Block> END_RUBY_ORE = REGISTRY.register("end_ruby_ore", () -> new EndRubyOreBlock());
	public static final RegistryObject<Block> END_INFINITI_ORE = REGISTRY.register("end_infiniti_ore", () -> new EndInfinitiOreBlock());
	public static final RegistryObject<Block> PERODIUM_HOCHIYM_ORE = REGISTRY.register("perodium_hochiym_ore", () -> new PerodiumHochiymOreBlock());
	public static final RegistryObject<Block> PERODIUM_AKVAMARINE_ORE = REGISTRY.register("perodium_akvamarine_ore",
			() -> new PerodiumAkvamarineOreBlock());
	public static final RegistryObject<Block> PERODIUM_RUBY_ORE = REGISTRY.register("perodium_ruby_ore", () -> new PerodiumRubyOreBlock());
	public static final RegistryObject<Block> PERODIUM_INFINITI_ORE = REGISTRY.register("perodium_infiniti_ore",
			() -> new PerodiumInfinitiOreBlock());
	public static final RegistryObject<Block> COAL_ORE = REGISTRY.register("coal_ore", () -> new CoalOreBlock());
	public static final RegistryObject<Block> IRON_ORE = REGISTRY.register("iron_ore", () -> new IronOreBlock());
	public static final RegistryObject<Block> GOLD_ORE = REGISTRY.register("gold_ore", () -> new GoldOreBlock());
	public static final RegistryObject<Block> DIAMONDORE = REGISTRY.register("diamondore", () -> new DiamondoreBlock());
	public static final RegistryObject<Block> LAPIS_LAZULI_ORE = REGISTRY.register("lapis_lazuli_ore", () -> new LapisLazuliOreBlock());
	public static final RegistryObject<Block> EMERALD_ORE = REGISTRY.register("emerald_ore", () -> new EmeraldOreBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_ORE_2 = REGISTRY.register("perodium_quartz_ore_2", () -> new PerodiumQuartzOre2Block());
	public static final RegistryObject<Block> REDSTONE_ORE = REGISTRY.register("redstone_ore", () -> new RedstoneOreBlock());
	public static final RegistryObject<Block> COPPER_ORE = REGISTRY.register("copper_ore", () -> new CopperOreBlock());
	public static final RegistryObject<Block> HOCHIYM_BLOCK = REGISTRY.register("hochiym_block", () -> new HochiymBlockBlock());
	public static final RegistryObject<Block> AKVAMARINE_BLOCK = REGISTRY.register("akvamarine_block", () -> new AkvamarineBlockBlock());
	public static final RegistryObject<Block> INFINITI_BLOCK = REGISTRY.register("infiniti_block", () -> new InfinitiBlockBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> PERODIUM_BLOCK = REGISTRY.register("perodium_block", () -> new PerodiumBlockBlock());
	public static final RegistryObject<Block> PERODIUM_BRICK = REGISTRY.register("perodium_brick", () -> new PerodiumBrickBlock());
	public static final RegistryObject<Block> REINFORCED_PERIODIUM_BRICKS = REGISTRY.register("reinforced_periodium_bricks",
			() -> new ReinforcedPeriodiumBricksBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_BLOCK = REGISTRY.register("perodium_quartz_block",
			() -> new PerodiumQuartzBlockBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_STAIRS = REGISTRY.register("perodium_quartz_stairs",
			() -> new PerodiumQuartzStairsBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_SLAB = REGISTRY.register("perodium_quartz_slab", () -> new PerodiumQuartzSlabBlock());
	public static final RegistryObject<Block> SMOOTH_PERODIUM_QUARTZ_BLOCK = REGISTRY.register("smooth_perodium_quartz_block",
			() -> new SmoothPerodiumQuartzBlockBlock());
	public static final RegistryObject<Block> SMOOTH_PERODIUM_QUARTZ_STAIRS = REGISTRY.register("smooth_perodium_quartz_stairs",
			() -> new SmoothPerodiumQuartzStairsBlock());
	public static final RegistryObject<Block> SMOOTH_PERODIUM_QUARTZ_SLAB = REGISTRY.register("smooth_perodium_quartz_slab",
			() -> new SmoothPerodiumQuartzSlabBlock());
	public static final RegistryObject<Block> CHISELD_PERODIUM_QUARTZ_BLOCK = REGISTRY.register("chiseld_perodium_quartz_block",
			() -> new ChiseldPerodiumQuartzBlockBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_BRICK = REGISTRY.register("perodium_quartz_brick",
			() -> new PerodiumQuartzBrickBlock());
	public static final RegistryObject<Block> PERODIUM_QUARTZ_PILLAR = REGISTRY.register("perodium_quartz_pillar",
			() -> new PerodiumQuartzPillarBlock());
	public static final RegistryObject<Block> PERODIUM_GRASS = REGISTRY.register("perodium_grass", () -> new PerodiumGrassBlock());
	public static final RegistryObject<Block> HOCHIYM_GRASS = REGISTRY.register("hochiym_grass", () -> new HochiymGrassBlock());
	public static final RegistryObject<Block> AKVAMARINE_GRASS = REGISTRY.register("akvamarine_grass", () -> new AkvamarineGrassBlock());
	public static final RegistryObject<Block> INFINITI_GRASS = REGISTRY.register("infiniti_grass", () -> new InfinitiGrassBlock());
	public static final RegistryObject<Block> RUBY_GRASS = REGISTRY.register("ruby_grass", () -> new RubyGrassBlock());
	public static final RegistryObject<Block> PERODIUM_DIRT = REGISTRY.register("perodium_dirt", () -> new PerodiumDirtBlock());
	public static final RegistryObject<Block> PERODIUM_SAND = REGISTRY.register("perodium_sand", () -> new PerodiumSandBlock());
	public static final RegistryObject<Block> HOCHIYM_DIRT = REGISTRY.register("hochiym_dirt", () -> new HochiymDirtBlock());
	public static final RegistryObject<Block> AKVAMARINE_DIRT = REGISTRY.register("akvamarine_dirt", () -> new AkvamarineDirtBlock());
	public static final RegistryObject<Block> INFINITI_DIRT = REGISTRY.register("infiniti_dirt", () -> new InfinitiDirtBlock());
	public static final RegistryObject<Block> RUBY_DIRT = REGISTRY.register("ruby_dirt", () -> new RubyDirtBlock());
	public static final RegistryObject<Block> PERODIUM_PATH = REGISTRY.register("perodium_path", () -> new PerodiumPathBlock());
	public static final RegistryObject<Block> HOCHIYM_PATH = REGISTRY.register("hochiym_path", () -> new HochiymPathBlock());
	public static final RegistryObject<Block> AKVAMARINE_PATH = REGISTRY.register("akvamarine_path", () -> new AkvamarinePathBlock());
	public static final RegistryObject<Block> INFINITI_PATH = REGISTRY.register("infiniti_path", () -> new InfinitiPathBlock());
	public static final RegistryObject<Block> RUBY_PATH = REGISTRY.register("ruby_path", () -> new RubyPathBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_LEAVES = REGISTRY.register("perodium_oak_leaves", () -> new PerodiumOakLeavesBlock());
	public static final RegistryObject<Block> AKVAMARINE_LEAVES = REGISTRY.register("akvamarine_leaves", () -> new AkvamarineLeavesBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_LEAVES = REGISTRY.register("ruby_jungle_leaves", () -> new RubyJungleLeavesBlock());
	public static final RegistryObject<Block> PERODIUM_OAK = REGISTRY.register("perodium_oak", () -> new PerodiumOakBlock());
	public static final RegistryObject<Block> STRIPPED_PERODIUM_OAK = REGISTRY.register("stripped_perodium_oak",
			() -> new StrippedPerodiumOakBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_WOOD = REGISTRY.register("perodium_oak_wood", () -> new PerodiumOakWoodBlock());
	public static final RegistryObject<Block> STRIPPED_PERODIUM_OAK_WOOD = REGISTRY.register("stripped_perodium_oak_wood",
			() -> new StrippedPerodiumOakWoodBlock());
	public static final RegistryObject<Block> AKVAMARINE_OAK = REGISTRY.register("akvamarine_oak", () -> new AkvamarineOakBlock());
	public static final RegistryObject<Block> STRIPPED_AKVAMARINE_BIRCH = REGISTRY.register("stripped_akvamarine_birch",
			() -> new StrippedAkvamarineBirchBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_WOOD = REGISTRY.register("akvamarine_birch_wood",
			() -> new AkvamarineBirchWoodBlock());
	public static final RegistryObject<Block> STRIPPED_AKVAMARINE_BIRCH_WOOD = REGISTRY.register("stripped_akvamarine_birch_wood",
			() -> new StrippedAkvamarineBirchWoodBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE = REGISTRY.register("ruby_jungle", () -> new RubyJungleBlock());
	public static final RegistryObject<Block> STRIPPED_RUBY_JUNGLE = REGISTRY.register("stripped_ruby_jungle", () -> new StrippedRubyJungleBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_WOOD = REGISTRY.register("ruby_jungle_wood", () -> new RubyJungleWoodBlock());
	public static final RegistryObject<Block> STRIPPED_RUBY_JUNGLE_WOOD = REGISTRY.register("stripped_ruby_jungle_wood",
			() -> new StrippedRubyJungleWoodBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_PLANT = REGISTRY.register("perodium_oak_plant", () -> new PerodiumOakPlantBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_PLANKS = REGISTRY.register("akvamarine_birch_planks",
			() -> new AkvamarineBirchPlanksBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_PLANT = REGISTRY.register("ruby_jungle_plant", () -> new RubyJunglePlantBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_STAIRS = REGISTRY.register("perodium_oak_stairs", () -> new PerodiumOakStairsBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_STAIRS = REGISTRY.register("akvamarine_birch_stairs",
			() -> new AkvamarineBirchStairsBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_STAIRS = REGISTRY.register("ruby_jungle_stairs", () -> new RubyJungleStairsBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_SLAB = REGISTRY.register("perodium_oak_slab", () -> new PerodiumOakSlabBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_SLAB = REGISTRY.register("akvamarine_birch_slab",
			() -> new AkvamarineBirchSlabBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_SLAB = REGISTRY.register("ruby_jungle_slab", () -> new RubyJungleSlabBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_FENCE = REGISTRY.register("perodium_oak_fence", () -> new PerodiumOakFenceBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_FENCE = REGISTRY.register("akvamarine_birch_fence",
			() -> new AkvamarineBirchFenceBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_FENCE = REGISTRY.register("ruby_jungle_fence", () -> new RubyJungleFenceBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_FENCE_GATE = REGISTRY.register("perodium_oak_fence_gate",
			() -> new PerodiumOakFenceGateBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_FENCE_GATE = REGISTRY.register("akvamarine_birch_fence_gate",
			() -> new AkvamarineBirchFenceGateBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_FENCE_GATE = REGISTRY.register("ruby_jungle_fence_gate",
			() -> new RubyJungleFenceGateBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_BUTTON = REGISTRY.register("perodium_oak_button", () -> new PerodiumOakButtonBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_BUTTON = REGISTRY.register("akvamarine_birch_button",
			() -> new AkvamarineBirchButtonBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_BUTTON = REGISTRY.register("ruby_jungle_button", () -> new RubyJungleButtonBlock());
	public static final RegistryObject<Block> PERODIUM_STONE_BUTTON = REGISTRY.register("perodium_stone_button",
			() -> new PerodiumStoneButtonBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_PRESSURE_PLATE = REGISTRY.register("perodium_oak_pressure_plate",
			() -> new PerodiumOakPressurePlateBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_PRESSURE_PLATE = REGISTRY.register("akvamarine_birch_pressure_plate",
			() -> new AkvamarineBirchPressurePlateBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_PRESSURE_PLATE = REGISTRY.register("ruby_jungle_pressure_plate",
			() -> new RubyJunglePressurePlateBlock());
	public static final RegistryObject<Block> PERODIUM_STONE_PRESSURE_PLATE = REGISTRY.register("perodium_stone_pressure_plate",
			() -> new PerodiumStonePressurePlateBlock());
	public static final RegistryObject<Block> PERODIUM_PRESSURE_PLATE = REGISTRY.register("perodium_pressure_plate",
			() -> new PerodiumPressurePlateBlock());
	public static final RegistryObject<Block> PERODIUM_OAK_DOOR = REGISTRY.register("perodium_oak_door", () -> new PerodiumOakDoorBlock());
	public static final RegistryObject<Block> AKVAMARINE_BIRCH_DOOR = REGISTRY.register("akvamarine_birch_door",
			() -> new AkvamarineBirchDoorBlock());
	public static final RegistryObject<Block> RUBY_JUNGLE_DOOR = REGISTRY.register("ruby_jungle_door", () -> new RubyJungleDoorBlock());
	public static final RegistryObject<Block> PERODIUM_DOOR = REGISTRY.register("perodium_door", () -> new PerodiumDoorBlock());
	public static final RegistryObject<Block> PERODIUM_GLASS = REGISTRY.register("perodium_glass", () -> new PerodiumGlassBlock());
	public static final RegistryObject<Block> PERODIUM_GLASS_PANE = REGISTRY.register("perodium_glass_pane", () -> new PerodiumGlassPaneBlock());
	public static final RegistryObject<Block> PERODIUM_GLOWSTONE = REGISTRY.register("perodium_glowstone", () -> new PerodiumGlowstoneBlock());
	public static final RegistryObject<Block> PERODIUM_SHROOMLIGHT = REGISTRY.register("perodium_shroomlight", () -> new PerodiumShroomlightBlock());
	public static final RegistryObject<Block> DEEPSLATE_HOCHIYM_ORE = REGISTRY.register("deepslate_hochiym_ore",
			() -> new DeepslateHochiymOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_AKVAMARINE_ORE = REGISTRY.register("deepslate_akvamarine_ore",
			() -> new DeepslateAkvamarineOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_INFINITI_ORE = REGISTRY.register("deepslate_infiniti_ore",
			() -> new DeepslateInfinitiOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", () -> new DeepslateRubyOreBlock());
	public static final RegistryObject<Block> PERODIUM_BOX = REGISTRY.register("perodium_box", () -> new PerodiumBoxBlock());
	public static final RegistryObject<Block> AKVAMARINE_BOX = REGISTRY.register("akvamarine_box", () -> new AkvamarineBoxBlock());
	public static final RegistryObject<Block> RUBY_BOX = REGISTRY.register("ruby_box", () -> new RubyBoxBlock());
	public static final RegistryObject<Block> HOCHIYM_GRASS_PLANT = REGISTRY.register("hochiym_grass_plant", () -> new HochiymGrassPlantBlock());
	public static final RegistryObject<Block> AKVAMARINE_GRASS_PLANT = REGISTRY.register("akvamarine_grass_plant",
			() -> new AkvamarineGrassPlantBlock());
	public static final RegistryObject<Block> INFINITI_GRASS_PLANT = REGISTRY.register("infiniti_grass_plant", () -> new InfinitiGrassPlantBlock());
	public static final RegistryObject<Block> RUBY_GRASS_PLANT = REGISTRY.register("ruby_grass_plant", () -> new RubyGrassPlantBlock());
	public static final RegistryObject<Block> PERODIUM_GRASS_PLANT = REGISTRY.register("perodium_grass_plant", () -> new PerodiumGrassPlantBlock());
	public static final RegistryObject<Block> PERODIUM_DEAD_BUSH = REGISTRY.register("perodium_dead_bush", () -> new PerodiumDeadBushBlock());
	public static final RegistryObject<Block> AKVAMARINE_BUSH = REGISTRY.register("akvamarine_bush", () -> new AkvamarineBushBlock());
	public static final RegistryObject<Block> PERODIUM_TULIP = REGISTRY.register("perodium_tulip", () -> new PerodiumTulipBlock());
	public static final RegistryObject<Block> AKVAMARINE_CORNFLOWER = REGISTRY.register("akvamarine_cornflower",
			() -> new AkvamarineCornflowerBlock());
	public static final RegistryObject<Block> RUBY_DANDELEON = REGISTRY.register("ruby_dandeleon", () -> new RubyDandeleonBlock());
	public static final RegistryObject<Block> PERODIUM_BUSH = REGISTRY.register("perodium_bush", () -> new PerodiumBushBlock());
	public static final RegistryObject<Block> PERODIUM_YELLOW_MUSHROOM = REGISTRY.register("perodium_yellow_mushroom",
			() -> new PerodiumYellowMushroomBlock());
	public static final RegistryObject<Block> PERODIUM_MUSHROOM = REGISTRY.register("perodium_mushroom", () -> new PerodiumMushroomBlock());
	public static final RegistryObject<Block> RUBY_MUSHROOM = REGISTRY.register("ruby_mushroom", () -> new RubyMushroomBlock());
	public static final RegistryObject<Block> PERODIUM_APPLE_STAGE_1 = REGISTRY.register("perodium_apple_stage_1",
			() -> new PerodiumAppleStage1Block());
	public static final RegistryObject<Block> PERODIUM_CACTUS = REGISTRY.register("perodium_cactus", () -> new PerodiumCactusBlock());
	public static final RegistryObject<Block> PERODIUM_MUSHROOM_STEM = REGISTRY.register("perodium_mushroom_stem",
			() -> new PerodiumMushroomStemBlock());
	public static final RegistryObject<Block> PERODIUM_MUSHROOM_BLOCK = REGISTRY.register("perodium_mushroom_block",
			() -> new PerodiumMushroomBlockBlock());
	public static final RegistryObject<Block> PERODIUM_YELLOW_MUSHROOM_STEM = REGISTRY.register("perodium_yellow_mushroom_stem",
			() -> new PerodiumYellowMushroomStemBlock());
	public static final RegistryObject<Block> PERODIUM_YELLOW_MUSHROOM_BLOCK = REGISTRY.register("perodium_yellow_mushroom_block",
			() -> new PerodiumYellowMushroomBlockBlock());
	public static final RegistryObject<Block> RUBY_MUSHROOM_STEM = REGISTRY.register("ruby_mushroom_stem", () -> new RubyMushroomStemBlock());
	public static final RegistryObject<Block> RUBY_MUSHROOM_BLOCK = REGISTRY.register("ruby_mushroom_block", () -> new RubyMushroomBlockBlock());
	public static final RegistryObject<Block> AKVAMARINE_BUSH_2 = REGISTRY.register("akvamarine_bush_2", () -> new AkvamarineBush2Block());
	public static final RegistryObject<Block> PERODIUM_BUSH_2 = REGISTRY.register("perodium_bush_2", () -> new PerodiumBush2Block());
	public static final RegistryObject<Block> PERODIUM_APPLE_STAGE_2 = REGISTRY.register("perodium_apple_stage_2",
			() -> new PerodiumAppleStage2Block());
	public static final RegistryObject<Block> PERODIUM_APPLE_STAGE_3 = REGISTRY.register("perodium_apple_stage_3",
			() -> new PerodiumAppleStage3Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PerodiumBarsBlock.registerRenderLayer();
			PerodiumLanternBlock.registerRenderLayer();
			PerodiumCobblestoneWallBlock.registerRenderLayer();
			PerodiumSandstoneWallBlock.registerRenderLayer();
			PerodiumPathBlock.registerRenderLayer();
			HochiymPathBlock.registerRenderLayer();
			AkvamarinePathBlock.registerRenderLayer();
			InfinitiPathBlock.registerRenderLayer();
			RubyPathBlock.registerRenderLayer();
			PerodiumOakLeavesBlock.registerRenderLayer();
			PerodiumOakFenceBlock.registerRenderLayer();
			AkvamarineBirchFenceBlock.registerRenderLayer();
			RubyJungleFenceBlock.registerRenderLayer();
			PerodiumOakFenceGateBlock.registerRenderLayer();
			AkvamarineBirchFenceGateBlock.registerRenderLayer();
			RubyJungleFenceGateBlock.registerRenderLayer();
			PerodiumOakButtonBlock.registerRenderLayer();
			AkvamarineBirchButtonBlock.registerRenderLayer();
			RubyJungleButtonBlock.registerRenderLayer();
			PerodiumStoneButtonBlock.registerRenderLayer();
			PerodiumOakPressurePlateBlock.registerRenderLayer();
			AkvamarineBirchPressurePlateBlock.registerRenderLayer();
			RubyJunglePressurePlateBlock.registerRenderLayer();
			PerodiumStonePressurePlateBlock.registerRenderLayer();
			PerodiumPressurePlateBlock.registerRenderLayer();
			PerodiumOakDoorBlock.registerRenderLayer();
			AkvamarineBirchDoorBlock.registerRenderLayer();
			RubyJungleDoorBlock.registerRenderLayer();
			PerodiumDoorBlock.registerRenderLayer();
			PerodiumGlassBlock.registerRenderLayer();
			PerodiumGlassPaneBlock.registerRenderLayer();
			PerodiumBoxBlock.registerRenderLayer();
			AkvamarineBoxBlock.registerRenderLayer();
			RubyBoxBlock.registerRenderLayer();
			HochiymGrassPlantBlock.registerRenderLayer();
			AkvamarineGrassPlantBlock.registerRenderLayer();
			InfinitiGrassPlantBlock.registerRenderLayer();
			RubyGrassPlantBlock.registerRenderLayer();
			PerodiumGrassPlantBlock.registerRenderLayer();
			PerodiumDeadBushBlock.registerRenderLayer();
			AkvamarineBushBlock.registerRenderLayer();
			PerodiumTulipBlock.registerRenderLayer();
			AkvamarineCornflowerBlock.registerRenderLayer();
			RubyDandeleonBlock.registerRenderLayer();
			PerodiumBushBlock.registerRenderLayer();
			PerodiumYellowMushroomBlock.registerRenderLayer();
			PerodiumMushroomBlock.registerRenderLayer();
			RubyMushroomBlock.registerRenderLayer();
			PerodiumAppleStage1Block.registerRenderLayer();
			PerodiumCactusBlock.registerRenderLayer();
			AkvamarineBush2Block.registerRenderLayer();
			PerodiumBush2Block.registerRenderLayer();
			PerodiumAppleStage2Block.registerRenderLayer();
			PerodiumAppleStage3Block.registerRenderLayer();
		}
	}
}
