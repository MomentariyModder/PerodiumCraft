
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.perodiumcraft.item.RubyySwordItem;
import net.mcreator.perodiumcraft.item.RubyyShovelItem;
import net.mcreator.perodiumcraft.item.RubyyPickaxeItem;
import net.mcreator.perodiumcraft.item.RubyyHoeItem;
import net.mcreator.perodiumcraft.item.RubyyAxeItem;
import net.mcreator.perodiumcraft.item.RubyyArmorItem;
import net.mcreator.perodiumcraft.item.RubyMushroomSoupItem;
import net.mcreator.perodiumcraft.item.RubyItem;
import net.mcreator.perodiumcraft.item.RubyDustItem;
import net.mcreator.perodiumcraft.item.PerodiumYellowMushroomSoupItem;
import net.mcreator.perodiumcraft.item.PerodiumWaterItem;
import net.mcreator.perodiumcraft.item.PerodiumSwordItem;
import net.mcreator.perodiumcraft.item.PerodiumSlimeballItem;
import net.mcreator.perodiumcraft.item.PerodiumShovelItem;
import net.mcreator.perodiumcraft.item.PerodiumShearsItem;
import net.mcreator.perodiumcraft.item.PerodiumQuartzItem;
import net.mcreator.perodiumcraft.item.PerodiumPowderItem;
import net.mcreator.perodiumcraft.item.PerodiumPlateItem;
import net.mcreator.perodiumcraft.item.PerodiumPistolItem;
import net.mcreator.perodiumcraft.item.PerodiumPieItem;
import net.mcreator.perodiumcraft.item.PerodiumPie7Item;
import net.mcreator.perodiumcraft.item.PerodiumPie6Item;
import net.mcreator.perodiumcraft.item.PerodiumPie5Item;
import net.mcreator.perodiumcraft.item.PerodiumPie4Item;
import net.mcreator.perodiumcraft.item.PerodiumPie3Item;
import net.mcreator.perodiumcraft.item.PerodiumPie2Item;
import net.mcreator.perodiumcraft.item.PerodiumPie1Item;
import net.mcreator.perodiumcraft.item.PerodiumPickaxeItem;
import net.mcreator.perodiumcraft.item.PerodiumNuggetsItem;
import net.mcreator.perodiumcraft.item.PerodiumMushroomSoupItem;
import net.mcreator.perodiumcraft.item.PerodiumMultiToolItem;
import net.mcreator.perodiumcraft.item.PerodiumMeatItem;
import net.mcreator.perodiumcraft.item.PerodiumLandItem;
import net.mcreator.perodiumcraft.item.PerodiumItem;
import net.mcreator.perodiumcraft.item.PerodiumIngotItem;
import net.mcreator.perodiumcraft.item.PerodiumHoeItem;
import net.mcreator.perodiumcraft.item.PerodiumDustItem;
import net.mcreator.perodiumcraft.item.PerodiumBerriesItem;
import net.mcreator.perodiumcraft.item.PerodiumAxeItem;
import net.mcreator.perodiumcraft.item.PerodiumAppleItem;
import net.mcreator.perodiumcraft.item.PerodiumAmmoItem;
import net.mcreator.perodiumcraft.item.InfinitiiSwordItem;
import net.mcreator.perodiumcraft.item.InfinitiiShovelItem;
import net.mcreator.perodiumcraft.item.InfinitiiPickaxeItem;
import net.mcreator.perodiumcraft.item.InfinitiiHoeItem;
import net.mcreator.perodiumcraft.item.InfinitiiAxeItem;
import net.mcreator.perodiumcraft.item.InfinitiiArmorItem;
import net.mcreator.perodiumcraft.item.InfinitiItem;
import net.mcreator.perodiumcraft.item.InfinitiDustItem;
import net.mcreator.perodiumcraft.item.HochiymToolsSwordItem;
import net.mcreator.perodiumcraft.item.HochiymToolsShovelItem;
import net.mcreator.perodiumcraft.item.HochiymToolsPickaxeItem;
import net.mcreator.perodiumcraft.item.HochiymToolsHoeItem;
import net.mcreator.perodiumcraft.item.HochiymToolsAxeItem;
import net.mcreator.perodiumcraft.item.HochiymItem;
import net.mcreator.perodiumcraft.item.HochiymDustItem;
import net.mcreator.perodiumcraft.item.HochiymArmorArmorItem;
import net.mcreator.perodiumcraft.item.GuideBookItem;
import net.mcreator.perodiumcraft.item.CookedPerodiumMeatItem;
import net.mcreator.perodiumcraft.item.AkvamarineItem;
import net.mcreator.perodiumcraft.item.AkvamarineDustItem;
import net.mcreator.perodiumcraft.item.AkvamarineBerriesItem;
import net.mcreator.perodiumcraft.item.Akvamarine2ArmorItem;
import net.mcreator.perodiumcraft.item.Akvamarine1SwordItem;
import net.mcreator.perodiumcraft.item.Akvamarine1ShovelItem;
import net.mcreator.perodiumcraft.item.Akvamarine1PickaxeItem;
import net.mcreator.perodiumcraft.item.Akvamarine1HoeItem;
import net.mcreator.perodiumcraft.item.Akvamarine1AxeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PERODIUM_LAND = register(new PerodiumLandItem());
	public static final Item PERODIUM_SLIMEBALL = register(new PerodiumSlimeballItem());
	public static final Item HOCHIYM = register(new HochiymItem());
	public static final Item AKVAMARINE = register(new AkvamarineItem());
	public static final Item INFINITI = register(new InfinitiItem());
	public static final Item RUBY = register(new RubyItem());
	public static final Item PERODIUM_QUARTZ = register(new PerodiumQuartzItem());
	public static final Item PERODIUM_INGOT = register(new PerodiumIngotItem());
	public static final Item PERODIUM_NUGGETS = register(new PerodiumNuggetsItem());
	public static final Item PERODIUM_PLATE = register(new PerodiumPlateItem());
	public static final Item PERODIUM_DUST = register(new PerodiumDustItem());
	public static final Item HOCHIYM_DUST = register(new HochiymDustItem());
	public static final Item AKVAMARINE_DUST = register(new AkvamarineDustItem());
	public static final Item INFINITI_DUST = register(new InfinitiDustItem());
	public static final Item RUBY_DUST = register(new RubyDustItem());
	public static final Item PERODIUM_POWDER = register(new PerodiumPowderItem());
	public static final Item PERODIUM_WATER_BUCKET = register(new PerodiumWaterItem());
	public static final Item PERODIUM_HUSK = register(new SpawnEggItem(PerodiumcraftModEntities.PERODIUM_HUSK, -13421773, -13421773,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("perodium_husk_spawn_egg"));
	public static final Item AKVAMARINE_HUSK = register(new SpawnEggItem(PerodiumcraftModEntities.AKVAMARINE_HUSK, -16737844, -16737844,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("akvamarine_husk_spawn_egg"));
	public static final Item RUBY_HUSK = register(new SpawnEggItem(PerodiumcraftModEntities.RUBY_HUSK, -3407872, -65536,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("ruby_husk_spawn_egg"));
	public static final Item PERODIUM_COW = register(new SpawnEggItem(PerodiumcraftModEntities.PERODIUM_COW, -13421773, -13421773,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("perodium_cow_spawn_egg"));
	public static final Item PERODIUM_BERRIES = register(new PerodiumBerriesItem());
	public static final Item AKVAMARINE_BERRIES = register(new AkvamarineBerriesItem());
	public static final Item PERODIUM_PIE = register(new PerodiumPieItem());
	public static final Item PERODIUM_MEAT = register(new PerodiumMeatItem());
	public static final Item COOKED_PERODIUM_MEAT = register(new CookedPerodiumMeatItem());
	public static final Item PERODIUM_MUSHROOM_SOUP = register(new PerodiumMushroomSoupItem());
	public static final Item PERODIUM_YELLOW_MUSHROOM_SOUP = register(new PerodiumYellowMushroomSoupItem());
	public static final Item RUBY_MUSHROOM_SOUP = register(new RubyMushroomSoupItem());
	public static final Item PERODIUM_APPLE = register(new PerodiumAppleItem());
	public static final Item PERODIUM_BARS = register(PerodiumcraftModBlocks.PERODIUM_BARS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_LANTERN = register(PerodiumcraftModBlocks.PERODIUM_LANTERN, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_STONE = register(PerodiumcraftModBlocks.PERODIUM_STONE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_COBBLESTONE = register(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SMOOTH_STONE = register(PerodiumcraftModBlocks.PERODIUM_SMOOTH_STONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SANDSTONE = register(PerodiumcraftModBlocks.PERODIUM_SANDSTONE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_STONE_SLAB = register(PerodiumcraftModBlocks.PERODIUM_STONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_COBBLESTONE_SLAB = register(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SMOOTH_STONE_SLAB = register(PerodiumcraftModBlocks.PERODIUM_SMOOTH_STONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SANDSTONE_SLAB = register(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_STONE_STAIRS = register(PerodiumcraftModBlocks.PERODIUM_STONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_COBBLESTONE_STAIRS = register(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SANDSTONE_STAIRS = register(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_COBBLESTONE_WALL = register(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_WALL,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SANDSTONE_WALL = register(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_WALL,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_ORE = register(PerodiumcraftModBlocks.HOCHIYM_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_ORE = register(PerodiumcraftModBlocks.AKVAMARINE_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_ORE = register(PerodiumcraftModBlocks.RUBY_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item INFINITI_ORE = register(PerodiumcraftModBlocks.INFINITI_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item NETHER_HOCHIYM_ORE = register(PerodiumcraftModBlocks.NETHER_HOCHIYM_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item NETHER_AKVAMARINE_ORE = register(PerodiumcraftModBlocks.NETHER_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_ORE_2 = register(PerodiumcraftModBlocks.RUBY_ORE_2, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item NETHER_INFINITI_ORE = register(PerodiumcraftModBlocks.NETHER_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item END_HOCHIYM_ORE = register(PerodiumcraftModBlocks.END_HOCHIYM_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item END_AKVAMARINE_ORE = register(PerodiumcraftModBlocks.END_AKVAMARINE_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item END_RUBY_ORE = register(PerodiumcraftModBlocks.END_RUBY_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item END_INFINITI_ORE = register(PerodiumcraftModBlocks.END_INFINITI_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_HOCHIYM_ORE = register(PerodiumcraftModBlocks.PERODIUM_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_AKVAMARINE_ORE = register(PerodiumcraftModBlocks.PERODIUM_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_RUBY_ORE = register(PerodiumcraftModBlocks.PERODIUM_RUBY_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_INFINITI_ORE = register(PerodiumcraftModBlocks.PERODIUM_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item COAL_ORE = register(PerodiumcraftModBlocks.COAL_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item IRON_ORE = register(PerodiumcraftModBlocks.IRON_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item GOLD_ORE = register(PerodiumcraftModBlocks.GOLD_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item DIAMONDORE = register(PerodiumcraftModBlocks.DIAMONDORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item LAPIS_LAZULI_ORE = register(PerodiumcraftModBlocks.LAPIS_LAZULI_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item EMERALD_ORE = register(PerodiumcraftModBlocks.EMERALD_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_ORE_2 = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_ORE_2,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item REDSTONE_ORE = register(PerodiumcraftModBlocks.REDSTONE_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item COPPER_ORE = register(PerodiumcraftModBlocks.COPPER_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_BLOCK = register(PerodiumcraftModBlocks.HOCHIYM_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BLOCK = register(PerodiumcraftModBlocks.AKVAMARINE_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item INFINITI_BLOCK = register(PerodiumcraftModBlocks.INFINITI_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_BLOCK = register(PerodiumcraftModBlocks.RUBY_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_BLOCK = register(PerodiumcraftModBlocks.PERODIUM_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_BRICK = register(PerodiumcraftModBlocks.PERODIUM_BRICK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item REINFORCED_PERIODIUM_BRICKS = register(PerodiumcraftModBlocks.REINFORCED_PERIODIUM_BRICKS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_BLOCK = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_STAIRS = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_SLAB = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item SMOOTH_PERODIUM_QUARTZ_BLOCK = register(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item SMOOTH_PERODIUM_QUARTZ_STAIRS = register(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item SMOOTH_PERODIUM_QUARTZ_SLAB = register(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item CHISELD_PERODIUM_QUARTZ_BLOCK = register(PerodiumcraftModBlocks.CHISELD_PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_BRICK = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_BRICK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_QUARTZ_PILLAR = register(PerodiumcraftModBlocks.PERODIUM_QUARTZ_PILLAR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_GRASS = register(PerodiumcraftModBlocks.PERODIUM_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_GRASS = register(PerodiumcraftModBlocks.HOCHIYM_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_GRASS = register(PerodiumcraftModBlocks.AKVAMARINE_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item INFINITI_GRASS = register(PerodiumcraftModBlocks.INFINITI_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_GRASS = register(PerodiumcraftModBlocks.RUBY_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_DIRT = register(PerodiumcraftModBlocks.PERODIUM_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SAND = register(PerodiumcraftModBlocks.PERODIUM_SAND, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_DIRT = register(PerodiumcraftModBlocks.HOCHIYM_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_DIRT = register(PerodiumcraftModBlocks.AKVAMARINE_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item INFINITI_DIRT = register(PerodiumcraftModBlocks.INFINITI_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_DIRT = register(PerodiumcraftModBlocks.RUBY_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_PATH = register(PerodiumcraftModBlocks.PERODIUM_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_PATH = register(PerodiumcraftModBlocks.HOCHIYM_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_PATH = register(PerodiumcraftModBlocks.AKVAMARINE_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item INFINITI_PATH = register(PerodiumcraftModBlocks.INFINITI_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_PATH = register(PerodiumcraftModBlocks.RUBY_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_LEAVES = register(PerodiumcraftModBlocks.PERODIUM_OAK_LEAVES,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_LEAVES = register(PerodiumcraftModBlocks.AKVAMARINE_LEAVES, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_LEAVES = register(PerodiumcraftModBlocks.RUBY_JUNGLE_LEAVES, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK = register(PerodiumcraftModBlocks.PERODIUM_OAK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_PERODIUM_OAK = register(PerodiumcraftModBlocks.STRIPPED_PERODIUM_OAK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_WOOD = register(PerodiumcraftModBlocks.PERODIUM_OAK_WOOD, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_PERODIUM_OAK_WOOD = register(PerodiumcraftModBlocks.STRIPPED_PERODIUM_OAK_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_OAK = register(PerodiumcraftModBlocks.AKVAMARINE_OAK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_AKVAMARINE_BIRCH = register(PerodiumcraftModBlocks.STRIPPED_AKVAMARINE_BIRCH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_WOOD = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_AKVAMARINE_BIRCH_WOOD = register(PerodiumcraftModBlocks.STRIPPED_AKVAMARINE_BIRCH_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE = register(PerodiumcraftModBlocks.RUBY_JUNGLE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_RUBY_JUNGLE = register(PerodiumcraftModBlocks.STRIPPED_RUBY_JUNGLE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_WOOD = register(PerodiumcraftModBlocks.RUBY_JUNGLE_WOOD, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item STRIPPED_RUBY_JUNGLE_WOOD = register(PerodiumcraftModBlocks.STRIPPED_RUBY_JUNGLE_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_PLANT = register(PerodiumcraftModBlocks.PERODIUM_OAK_PLANT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_PLANKS = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PLANKS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_PLANT = register(PerodiumcraftModBlocks.RUBY_JUNGLE_PLANT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_STAIRS = register(PerodiumcraftModBlocks.PERODIUM_OAK_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_STAIRS = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_STAIRS = register(PerodiumcraftModBlocks.RUBY_JUNGLE_STAIRS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_SLAB = register(PerodiumcraftModBlocks.PERODIUM_OAK_SLAB, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_SLAB = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_SLAB = register(PerodiumcraftModBlocks.RUBY_JUNGLE_SLAB, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_FENCE = register(PerodiumcraftModBlocks.PERODIUM_OAK_FENCE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_FENCE = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_FENCE = register(PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_FENCE_GATE = register(PerodiumcraftModBlocks.PERODIUM_OAK_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_FENCE_GATE = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_FENCE_GATE = register(PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_BUTTON = register(PerodiumcraftModBlocks.PERODIUM_OAK_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_BUTTON = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_BUTTON = register(PerodiumcraftModBlocks.RUBY_JUNGLE_BUTTON, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_STONE_BUTTON = register(PerodiumcraftModBlocks.PERODIUM_STONE_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_PRESSURE_PLATE = register(PerodiumcraftModBlocks.PERODIUM_OAK_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_PRESSURE_PLATE = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_PRESSURE_PLATE = register(PerodiumcraftModBlocks.RUBY_JUNGLE_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_STONE_PRESSURE_PLATE = register(PerodiumcraftModBlocks.PERODIUM_STONE_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_PRESSURE_PLATE = register(PerodiumcraftModBlocks.PERODIUM_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_OAK_DOOR = register(PerodiumcraftModBlocks.PERODIUM_OAK_DOOR, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item AKVAMARINE_BIRCH_DOOR = register(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_DOOR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item RUBY_JUNGLE_DOOR = register(PerodiumcraftModBlocks.RUBY_JUNGLE_DOOR, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_DOOR = register(PerodiumcraftModBlocks.PERODIUM_DOOR, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_GLASS = register(PerodiumcraftModBlocks.PERODIUM_GLASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_GLASS_PANE = register(PerodiumcraftModBlocks.PERODIUM_GLASS_PANE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_GLOWSTONE = register(PerodiumcraftModBlocks.PERODIUM_GLOWSTONE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item PERODIUM_SHROOMLIGHT = register(PerodiumcraftModBlocks.PERODIUM_SHROOMLIGHT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item HOCHIYM_GRASS_PLANT = register(PerodiumcraftModBlocks.HOCHIYM_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item AKVAMARINE_GRASS_PLANT = register(PerodiumcraftModBlocks.AKVAMARINE_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item INFINITI_GRASS_PLANT = register(PerodiumcraftModBlocks.INFINITI_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item RUBY_GRASS_PLANT = register(PerodiumcraftModBlocks.RUBY_GRASS_PLANT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_GRASS_PLANT = register(PerodiumcraftModBlocks.PERODIUM_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_DEAD_BUSH = register(PerodiumcraftModBlocks.PERODIUM_DEAD_BUSH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item AKVAMARINE_BUSH = register(PerodiumcraftModBlocks.AKVAMARINE_BUSH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_TULIP = register(PerodiumcraftModBlocks.PERODIUM_TULIP, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item AKVAMARINE_CORNFLOWER = register(PerodiumcraftModBlocks.AKVAMARINE_CORNFLOWER,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item RUBY_DANDELEON = register(PerodiumcraftModBlocks.RUBY_DANDELEON, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_BUSH = register(PerodiumcraftModBlocks.PERODIUM_BUSH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_YELLOW_MUSHROOM = register(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_MUSHROOM = register(PerodiumcraftModBlocks.PERODIUM_MUSHROOM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item RUBY_MUSHROOM = register(PerodiumcraftModBlocks.RUBY_MUSHROOM, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_APPLE_STAGE_1 = register(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_1,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_CACTUS = register(PerodiumcraftModBlocks.PERODIUM_CACTUS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_MUSHROOM_STEM = register(PerodiumcraftModBlocks.PERODIUM_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_MUSHROOM_BLOCK = register(PerodiumcraftModBlocks.PERODIUM_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_YELLOW_MUSHROOM_STEM = register(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item PERODIUM_YELLOW_MUSHROOM_BLOCK = register(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item RUBY_MUSHROOM_STEM = register(PerodiumcraftModBlocks.RUBY_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item RUBY_MUSHROOM_BLOCK = register(PerodiumcraftModBlocks.RUBY_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final Item HOCHIYM_ARMOR_ARMOR_HELMET = register(new HochiymArmorArmorItem.Helmet());
	public static final Item HOCHIYM_ARMOR_ARMOR_CHESTPLATE = register(new HochiymArmorArmorItem.Chestplate());
	public static final Item HOCHIYM_ARMOR_ARMOR_LEGGINGS = register(new HochiymArmorArmorItem.Leggings());
	public static final Item HOCHIYM_ARMOR_ARMOR_BOOTS = register(new HochiymArmorArmorItem.Boots());
	public static final Item HOCHIYM_TOOLS_SWORD = register(new HochiymToolsSwordItem());
	public static final Item HOCHIYM_TOOLS_PICKAXE = register(new HochiymToolsPickaxeItem());
	public static final Item HOCHIYM_TOOLS_AXE = register(new HochiymToolsAxeItem());
	public static final Item HOCHIYM_TOOLS_SHOVEL = register(new HochiymToolsShovelItem());
	public static final Item HOCHIYM_TOOLS_HOE = register(new HochiymToolsHoeItem());
	public static final Item AKVAMARINE_2_ARMOR_HELMET = register(new Akvamarine2ArmorItem.Helmet());
	public static final Item AKVAMARINE_2_ARMOR_CHESTPLATE = register(new Akvamarine2ArmorItem.Chestplate());
	public static final Item AKVAMARINE_2_ARMOR_LEGGINGS = register(new Akvamarine2ArmorItem.Leggings());
	public static final Item AKVAMARINE_2_ARMOR_BOOTS = register(new Akvamarine2ArmorItem.Boots());
	public static final Item AKVAMARINE_1_SWORD = register(new Akvamarine1SwordItem());
	public static final Item AKVAMARINE_1_PICKAXE = register(new Akvamarine1PickaxeItem());
	public static final Item AKVAMARINE_1_AXE = register(new Akvamarine1AxeItem());
	public static final Item AKVAMARINE_1_SHOVEL = register(new Akvamarine1ShovelItem());
	public static final Item AKVAMARINE_1_HOE = register(new Akvamarine1HoeItem());
	public static final Item INFINITII_ARMOR_HELMET = register(new InfinitiiArmorItem.Helmet());
	public static final Item INFINITII_ARMOR_CHESTPLATE = register(new InfinitiiArmorItem.Chestplate());
	public static final Item INFINITII_ARMOR_LEGGINGS = register(new InfinitiiArmorItem.Leggings());
	public static final Item INFINITII_ARMOR_BOOTS = register(new InfinitiiArmorItem.Boots());
	public static final Item INFINITII_SWORD = register(new InfinitiiSwordItem());
	public static final Item INFINITII_PICKAXE = register(new InfinitiiPickaxeItem());
	public static final Item INFINITII_AXE = register(new InfinitiiAxeItem());
	public static final Item INFINITII_SHOVEL = register(new InfinitiiShovelItem());
	public static final Item INFINITII_HOE = register(new InfinitiiHoeItem());
	public static final Item RUBYY_ARMOR_HELMET = register(new RubyyArmorItem.Helmet());
	public static final Item RUBYY_ARMOR_CHESTPLATE = register(new RubyyArmorItem.Chestplate());
	public static final Item RUBYY_ARMOR_LEGGINGS = register(new RubyyArmorItem.Leggings());
	public static final Item RUBYY_ARMOR_BOOTS = register(new RubyyArmorItem.Boots());
	public static final Item RUBYY_SWORD = register(new RubyySwordItem());
	public static final Item RUBYY_PICKAXE = register(new RubyyPickaxeItem());
	public static final Item RUBYY_AXE = register(new RubyyAxeItem());
	public static final Item RUBYY_SHOVEL = register(new RubyyShovelItem());
	public static final Item RUBYY_HOE = register(new RubyyHoeItem());
	public static final Item PERODIUM_HELMET = register(new PerodiumItem.Helmet());
	public static final Item PERODIUM_CHESTPLATE = register(new PerodiumItem.Chestplate());
	public static final Item PERODIUM_LEGGINGS = register(new PerodiumItem.Leggings());
	public static final Item PERODIUM_BOOTS = register(new PerodiumItem.Boots());
	public static final Item PERODIUM_SWORD = register(new PerodiumSwordItem());
	public static final Item PERODIUM_PICKAXE = register(new PerodiumPickaxeItem());
	public static final Item PERODIUM_AXE = register(new PerodiumAxeItem());
	public static final Item PERODIUM_SHOVEL = register(new PerodiumShovelItem());
	public static final Item PERODIUM_HOE = register(new PerodiumHoeItem());
	public static final Item PERODIUM_MULTI_TOOL = register(new PerodiumMultiToolItem());
	public static final Item PERODIUM_SHEARS = register(new PerodiumShearsItem());
	public static final Item PERODIUM_PISTOL = register(new PerodiumPistolItem());
	public static final Item PERODIUM_AMMO = register(new PerodiumAmmoItem());
	public static final Item AKVAMARINE_BUSH_2 = register(PerodiumcraftModBlocks.AKVAMARINE_BUSH_2, null);
	public static final Item PERODIUM_BUSH_2 = register(PerodiumcraftModBlocks.PERODIUM_BUSH_2, null);
	public static final Item PERODIUM_PIE_7 = register(new PerodiumPie7Item());
	public static final Item PERODIUM_PIE_6 = register(new PerodiumPie6Item());
	public static final Item PERODIUM_PIE_5 = register(new PerodiumPie5Item());
	public static final Item PERODIUM_PIE_4 = register(new PerodiumPie4Item());
	public static final Item PERODIUM_PIE_3 = register(new PerodiumPie3Item());
	public static final Item PERODIUM_PIE_2 = register(new PerodiumPie2Item());
	public static final Item PERODIUM_PIE_1 = register(new PerodiumPie1Item());
	public static final Item PERODIUM_APPLE_STAGE_2 = register(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_2, null);
	public static final Item PERODIUM_APPLE_STAGE_3 = register(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_3, null);
	public static final Item GUIDE_BOOK = register(new GuideBookItem());
	public static final Item PERODIUM_MAN = register(new SpawnEggItem(PerodiumcraftModEntities.PERODIUM_MAN, -13421773, -13421773,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("perodium_man_spawn_egg"));
	public static final Item PERODIUM_SLIME = register(new SpawnEggItem(PerodiumcraftModEntities.PERODIUM_SLIME, -13421773, -13421773,
			new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)).setRegistryName("perodium_slime_spawn_egg"));
	public static final Item DEEPSLATE_HOCHIYM_ORE = register(PerodiumcraftModBlocks.DEEPSLATE_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item DEEPSLATE_AKVAMARINE_ORE = register(PerodiumcraftModBlocks.DEEPSLATE_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item DEEPSLATE_INFINITI_ORE = register(PerodiumcraftModBlocks.DEEPSLATE_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final Item DEEPSLATE_RUBY_ORE = register(PerodiumcraftModBlocks.DEEPSLATE_RUBY_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
