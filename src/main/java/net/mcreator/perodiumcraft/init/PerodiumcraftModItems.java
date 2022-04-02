
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
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
import net.mcreator.perodiumcraft.item.PerodiumHammerItem;
import net.mcreator.perodiumcraft.item.PerodiumGuideItem;
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
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class PerodiumcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PerodiumcraftMod.MODID);
	public static final RegistryObject<Item> PERODIUM_LAND = REGISTRY.register("perodium_land", () -> new PerodiumLandItem());
	public static final RegistryObject<Item> PERODIUM_SLIMEBALL = REGISTRY.register("perodium_slimeball", () -> new PerodiumSlimeballItem());
	public static final RegistryObject<Item> HOCHIYM = REGISTRY.register("hochiym", () -> new HochiymItem());
	public static final RegistryObject<Item> AKVAMARINE = REGISTRY.register("akvamarine", () -> new AkvamarineItem());
	public static final RegistryObject<Item> INFINITI = REGISTRY.register("infiniti", () -> new InfinitiItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> PERODIUM_QUARTZ = REGISTRY.register("perodium_quartz", () -> new PerodiumQuartzItem());
	public static final RegistryObject<Item> PERODIUM_INGOT = REGISTRY.register("perodium_ingot", () -> new PerodiumIngotItem());
	public static final RegistryObject<Item> PERODIUM_NUGGETS = REGISTRY.register("perodium_nuggets", () -> new PerodiumNuggetsItem());
	public static final RegistryObject<Item> PERODIUM_PLATE = REGISTRY.register("perodium_plate", () -> new PerodiumPlateItem());
	public static final RegistryObject<Item> PERODIUM_DUST = REGISTRY.register("perodium_dust", () -> new PerodiumDustItem());
	public static final RegistryObject<Item> HOCHIYM_DUST = REGISTRY.register("hochiym_dust", () -> new HochiymDustItem());
	public static final RegistryObject<Item> AKVAMARINE_DUST = REGISTRY.register("akvamarine_dust", () -> new AkvamarineDustItem());
	public static final RegistryObject<Item> INFINITI_DUST = REGISTRY.register("infiniti_dust", () -> new InfinitiDustItem());
	public static final RegistryObject<Item> RUBY_DUST = REGISTRY.register("ruby_dust", () -> new RubyDustItem());
	public static final RegistryObject<Item> PERODIUM_POWDER = REGISTRY.register("perodium_powder", () -> new PerodiumPowderItem());
	public static final RegistryObject<Item> PERODIUM_WATER_BUCKET = REGISTRY.register("perodium_water_bucket", () -> new PerodiumWaterItem());
	public static final RegistryObject<Item> PERODIUM_HUSK = REGISTRY.register("perodium_husk_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.PERODIUM_HUSK, -13421773, -13421773,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> AKVAMARINE_HUSK = REGISTRY.register("akvamarine_husk_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.AKVAMARINE_HUSK, -16737844, -16737844,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> RUBY_HUSK = REGISTRY.register("ruby_husk_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.RUBY_HUSK, -3407872, -65536,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> PERODIUM_COW = REGISTRY.register("perodium_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.PERODIUM_COW, -13421773, -13421773,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> PERODIUM_MAN = REGISTRY.register("perodium_man_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.PERODIUM_MAN, -13421773, -13421773,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> PERODIUM_SLIME = REGISTRY.register("perodium_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(PerodiumcraftModEntities.PERODIUM_SLIME, -13421773, -13421773,
					new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_ITEM)));
	public static final RegistryObject<Item> PERODIUM_BERRIES = REGISTRY.register("perodium_berries", () -> new PerodiumBerriesItem());
	public static final RegistryObject<Item> AKVAMARINE_BERRIES = REGISTRY.register("akvamarine_berries", () -> new AkvamarineBerriesItem());
	public static final RegistryObject<Item> PERODIUM_PIE = REGISTRY.register("perodium_pie", () -> new PerodiumPieItem());
	public static final RegistryObject<Item> PERODIUM_MEAT = REGISTRY.register("perodium_meat", () -> new PerodiumMeatItem());
	public static final RegistryObject<Item> COOKED_PERODIUM_MEAT = REGISTRY.register("cooked_perodium_meat", () -> new CookedPerodiumMeatItem());
	public static final RegistryObject<Item> PERODIUM_MUSHROOM_SOUP = REGISTRY.register("perodium_mushroom_soup",
			() -> new PerodiumMushroomSoupItem());
	public static final RegistryObject<Item> PERODIUM_YELLOW_MUSHROOM_SOUP = REGISTRY.register("perodium_yellow_mushroom_soup",
			() -> new PerodiumYellowMushroomSoupItem());
	public static final RegistryObject<Item> RUBY_MUSHROOM_SOUP = REGISTRY.register("ruby_mushroom_soup", () -> new RubyMushroomSoupItem());
	public static final RegistryObject<Item> PERODIUM_APPLE = REGISTRY.register("perodium_apple", () -> new PerodiumAppleItem());
	public static final RegistryObject<Item> PERODIUM_BARS = block(PerodiumcraftModBlocks.PERODIUM_BARS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_LANTERN = block(PerodiumcraftModBlocks.PERODIUM_LANTERN,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_STONE = block(PerodiumcraftModBlocks.PERODIUM_STONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_COBBLESTONE = block(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SMOOTH_STONE = block(PerodiumcraftModBlocks.PERODIUM_SMOOTH_STONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SANDSTONE = block(PerodiumcraftModBlocks.PERODIUM_SANDSTONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_STONE_SLAB = block(PerodiumcraftModBlocks.PERODIUM_STONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_COBBLESTONE_SLAB = block(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SMOOTH_STONE_SLAB = block(PerodiumcraftModBlocks.PERODIUM_SMOOTH_STONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SANDSTONE_SLAB = block(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_STONE_STAIRS = block(PerodiumcraftModBlocks.PERODIUM_STONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_COBBLESTONE_STAIRS = block(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SANDSTONE_STAIRS = block(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_COBBLESTONE_WALL = block(PerodiumcraftModBlocks.PERODIUM_COBBLESTONE_WALL,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SANDSTONE_WALL = block(PerodiumcraftModBlocks.PERODIUM_SANDSTONE_WALL,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_ORE = block(PerodiumcraftModBlocks.HOCHIYM_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_ORE = block(PerodiumcraftModBlocks.AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_ORE = block(PerodiumcraftModBlocks.RUBY_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> INFINITI_ORE = block(PerodiumcraftModBlocks.INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> NETHER_HOCHIYM_ORE = block(PerodiumcraftModBlocks.NETHER_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> NETHER_AKVAMARINE_ORE = block(PerodiumcraftModBlocks.NETHER_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_ORE_2 = block(PerodiumcraftModBlocks.RUBY_ORE_2, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> NETHER_INFINITI_ORE = block(PerodiumcraftModBlocks.NETHER_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> END_HOCHIYM_ORE = block(PerodiumcraftModBlocks.END_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> END_AKVAMARINE_ORE = block(PerodiumcraftModBlocks.END_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> END_RUBY_ORE = block(PerodiumcraftModBlocks.END_RUBY_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> END_INFINITI_ORE = block(PerodiumcraftModBlocks.END_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_HOCHIYM_ORE = block(PerodiumcraftModBlocks.PERODIUM_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_AKVAMARINE_ORE = block(PerodiumcraftModBlocks.PERODIUM_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_RUBY_ORE = block(PerodiumcraftModBlocks.PERODIUM_RUBY_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_INFINITI_ORE = block(PerodiumcraftModBlocks.PERODIUM_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> COAL_ORE = block(PerodiumcraftModBlocks.COAL_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> IRON_ORE = block(PerodiumcraftModBlocks.IRON_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> GOLD_ORE = block(PerodiumcraftModBlocks.GOLD_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> DIAMONDORE = block(PerodiumcraftModBlocks.DIAMONDORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> LAPIS_LAZULI_ORE = block(PerodiumcraftModBlocks.LAPIS_LAZULI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> EMERALD_ORE = block(PerodiumcraftModBlocks.EMERALD_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_ORE_2 = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_ORE_2,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> REDSTONE_ORE = block(PerodiumcraftModBlocks.REDSTONE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> COPPER_ORE = block(PerodiumcraftModBlocks.COPPER_ORE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_BLOCK = block(PerodiumcraftModBlocks.HOCHIYM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BLOCK = block(PerodiumcraftModBlocks.AKVAMARINE_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> INFINITI_BLOCK = block(PerodiumcraftModBlocks.INFINITI_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(PerodiumcraftModBlocks.RUBY_BLOCK, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_BLOCK = block(PerodiumcraftModBlocks.PERODIUM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_BRICK = block(PerodiumcraftModBlocks.PERODIUM_BRICK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_PERIODIUM_BRICKS = block(PerodiumcraftModBlocks.REINFORCED_PERIODIUM_BRICKS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_BLOCK = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_STAIRS = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_SLAB = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> SMOOTH_PERODIUM_QUARTZ_BLOCK = block(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> SMOOTH_PERODIUM_QUARTZ_STAIRS = block(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> SMOOTH_PERODIUM_QUARTZ_SLAB = block(PerodiumcraftModBlocks.SMOOTH_PERODIUM_QUARTZ_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> CHISELD_PERODIUM_QUARTZ_BLOCK = block(PerodiumcraftModBlocks.CHISELD_PERODIUM_QUARTZ_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_BRICK = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_BRICK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_QUARTZ_PILLAR = block(PerodiumcraftModBlocks.PERODIUM_QUARTZ_PILLAR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_GRASS = block(PerodiumcraftModBlocks.PERODIUM_GRASS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_GRASS = block(PerodiumcraftModBlocks.HOCHIYM_GRASS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_GRASS = block(PerodiumcraftModBlocks.AKVAMARINE_GRASS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> INFINITI_GRASS = block(PerodiumcraftModBlocks.INFINITI_GRASS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_GRASS = block(PerodiumcraftModBlocks.RUBY_GRASS, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_DIRT = block(PerodiumcraftModBlocks.PERODIUM_DIRT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SAND = block(PerodiumcraftModBlocks.PERODIUM_SAND,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_DIRT = block(PerodiumcraftModBlocks.HOCHIYM_DIRT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_DIRT = block(PerodiumcraftModBlocks.AKVAMARINE_DIRT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> INFINITI_DIRT = block(PerodiumcraftModBlocks.INFINITI_DIRT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_DIRT = block(PerodiumcraftModBlocks.RUBY_DIRT, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_PATH = block(PerodiumcraftModBlocks.PERODIUM_PATH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_PATH = block(PerodiumcraftModBlocks.HOCHIYM_PATH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_PATH = block(PerodiumcraftModBlocks.AKVAMARINE_PATH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> INFINITI_PATH = block(PerodiumcraftModBlocks.INFINITI_PATH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_PATH = block(PerodiumcraftModBlocks.RUBY_PATH, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_LEAVES = block(PerodiumcraftModBlocks.PERODIUM_OAK_LEAVES,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_LEAVES = block(PerodiumcraftModBlocks.AKVAMARINE_LEAVES,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_LEAVES = block(PerodiumcraftModBlocks.RUBY_JUNGLE_LEAVES,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK = block(PerodiumcraftModBlocks.PERODIUM_OAK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_PERODIUM_OAK = block(PerodiumcraftModBlocks.STRIPPED_PERODIUM_OAK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_WOOD = block(PerodiumcraftModBlocks.PERODIUM_OAK_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_PERODIUM_OAK_WOOD = block(PerodiumcraftModBlocks.STRIPPED_PERODIUM_OAK_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_OAK = block(PerodiumcraftModBlocks.AKVAMARINE_OAK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_AKVAMARINE_BIRCH = block(PerodiumcraftModBlocks.STRIPPED_AKVAMARINE_BIRCH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_WOOD = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_AKVAMARINE_BIRCH_WOOD = block(PerodiumcraftModBlocks.STRIPPED_AKVAMARINE_BIRCH_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE = block(PerodiumcraftModBlocks.RUBY_JUNGLE, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_RUBY_JUNGLE = block(PerodiumcraftModBlocks.STRIPPED_RUBY_JUNGLE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_WOOD = block(PerodiumcraftModBlocks.RUBY_JUNGLE_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> STRIPPED_RUBY_JUNGLE_WOOD = block(PerodiumcraftModBlocks.STRIPPED_RUBY_JUNGLE_WOOD,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_PLANT = block(PerodiumcraftModBlocks.PERODIUM_OAK_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_PLANKS = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PLANKS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_PLANT = block(PerodiumcraftModBlocks.RUBY_JUNGLE_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_STAIRS = block(PerodiumcraftModBlocks.PERODIUM_OAK_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_STAIRS = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_STAIRS = block(PerodiumcraftModBlocks.RUBY_JUNGLE_STAIRS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_SLAB = block(PerodiumcraftModBlocks.PERODIUM_OAK_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_SLAB = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_SLAB = block(PerodiumcraftModBlocks.RUBY_JUNGLE_SLAB,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_FENCE = block(PerodiumcraftModBlocks.PERODIUM_OAK_FENCE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_FENCE = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_FENCE = block(PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_FENCE_GATE = block(PerodiumcraftModBlocks.PERODIUM_OAK_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_FENCE_GATE = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_FENCE_GATE = block(PerodiumcraftModBlocks.RUBY_JUNGLE_FENCE_GATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_BUTTON = block(PerodiumcraftModBlocks.PERODIUM_OAK_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_BUTTON = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_BUTTON = block(PerodiumcraftModBlocks.RUBY_JUNGLE_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_STONE_BUTTON = block(PerodiumcraftModBlocks.PERODIUM_STONE_BUTTON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_PRESSURE_PLATE = block(PerodiumcraftModBlocks.PERODIUM_OAK_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_PRESSURE_PLATE = block(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_PRESSURE_PLATE = block(PerodiumcraftModBlocks.RUBY_JUNGLE_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_STONE_PRESSURE_PLATE = block(PerodiumcraftModBlocks.PERODIUM_STONE_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_PRESSURE_PLATE = block(PerodiumcraftModBlocks.PERODIUM_PRESSURE_PLATE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_OAK_DOOR = doubleBlock(PerodiumcraftModBlocks.PERODIUM_OAK_DOOR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BIRCH_DOOR = doubleBlock(PerodiumcraftModBlocks.AKVAMARINE_BIRCH_DOOR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_JUNGLE_DOOR = doubleBlock(PerodiumcraftModBlocks.RUBY_JUNGLE_DOOR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_DOOR = doubleBlock(PerodiumcraftModBlocks.PERODIUM_DOOR,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_GLASS = block(PerodiumcraftModBlocks.PERODIUM_GLASS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_GLASS_PANE = block(PerodiumcraftModBlocks.PERODIUM_GLASS_PANE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_GLOWSTONE = block(PerodiumcraftModBlocks.PERODIUM_GLOWSTONE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_SHROOMLIGHT = block(PerodiumcraftModBlocks.PERODIUM_SHROOMLIGHT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_HOCHIYM_ORE = block(PerodiumcraftModBlocks.DEEPSLATE_HOCHIYM_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_AKVAMARINE_ORE = block(PerodiumcraftModBlocks.DEEPSLATE_AKVAMARINE_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_INFINITI_ORE = block(PerodiumcraftModBlocks.DEEPSLATE_INFINITI_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE = block(PerodiumcraftModBlocks.DEEPSLATE_RUBY_ORE,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> PERODIUM_BOX = block(PerodiumcraftModBlocks.PERODIUM_BOX,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> AKVAMARINE_BOX = block(PerodiumcraftModBlocks.AKVAMARINE_BOX,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> RUBY_BOX = block(PerodiumcraftModBlocks.RUBY_BOX, PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_BLOCKS);
	public static final RegistryObject<Item> HOCHIYM_GRASS_PLANT = block(PerodiumcraftModBlocks.HOCHIYM_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> AKVAMARINE_GRASS_PLANT = block(PerodiumcraftModBlocks.AKVAMARINE_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> INFINITI_GRASS_PLANT = block(PerodiumcraftModBlocks.INFINITI_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> RUBY_GRASS_PLANT = block(PerodiumcraftModBlocks.RUBY_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_GRASS_PLANT = block(PerodiumcraftModBlocks.PERODIUM_GRASS_PLANT,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_DEAD_BUSH = block(PerodiumcraftModBlocks.PERODIUM_DEAD_BUSH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> AKVAMARINE_BUSH = block(PerodiumcraftModBlocks.AKVAMARINE_BUSH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_TULIP = block(PerodiumcraftModBlocks.PERODIUM_TULIP,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> AKVAMARINE_CORNFLOWER = block(PerodiumcraftModBlocks.AKVAMARINE_CORNFLOWER,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> RUBY_DANDELEON = block(PerodiumcraftModBlocks.RUBY_DANDELEON,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_BUSH = block(PerodiumcraftModBlocks.PERODIUM_BUSH,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_YELLOW_MUSHROOM = block(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_MUSHROOM = block(PerodiumcraftModBlocks.PERODIUM_MUSHROOM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> RUBY_MUSHROOM = block(PerodiumcraftModBlocks.RUBY_MUSHROOM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_APPLE_STAGE_1 = block(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_1,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_CACTUS = block(PerodiumcraftModBlocks.PERODIUM_CACTUS,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_MUSHROOM_STEM = block(PerodiumcraftModBlocks.PERODIUM_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_MUSHROOM_BLOCK = block(PerodiumcraftModBlocks.PERODIUM_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_YELLOW_MUSHROOM_STEM = block(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> PERODIUM_YELLOW_MUSHROOM_BLOCK = block(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> RUBY_MUSHROOM_STEM = block(PerodiumcraftModBlocks.RUBY_MUSHROOM_STEM,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> RUBY_MUSHROOM_BLOCK = block(PerodiumcraftModBlocks.RUBY_MUSHROOM_BLOCK,
			PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_2_P_PLANT);
	public static final RegistryObject<Item> HOCHIYM_ARMOR_ARMOR_HELMET = REGISTRY.register("hochiym_armor_armor_helmet",
			() -> new HochiymArmorArmorItem.Helmet());
	public static final RegistryObject<Item> HOCHIYM_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("hochiym_armor_armor_chestplate",
			() -> new HochiymArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> HOCHIYM_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("hochiym_armor_armor_leggings",
			() -> new HochiymArmorArmorItem.Leggings());
	public static final RegistryObject<Item> HOCHIYM_ARMOR_ARMOR_BOOTS = REGISTRY.register("hochiym_armor_armor_boots",
			() -> new HochiymArmorArmorItem.Boots());
	public static final RegistryObject<Item> HOCHIYM_TOOLS_SWORD = REGISTRY.register("hochiym_tools_sword", () -> new HochiymToolsSwordItem());
	public static final RegistryObject<Item> HOCHIYM_TOOLS_PICKAXE = REGISTRY.register("hochiym_tools_pickaxe", () -> new HochiymToolsPickaxeItem());
	public static final RegistryObject<Item> HOCHIYM_TOOLS_AXE = REGISTRY.register("hochiym_tools_axe", () -> new HochiymToolsAxeItem());
	public static final RegistryObject<Item> HOCHIYM_TOOLS_SHOVEL = REGISTRY.register("hochiym_tools_shovel", () -> new HochiymToolsShovelItem());
	public static final RegistryObject<Item> HOCHIYM_TOOLS_HOE = REGISTRY.register("hochiym_tools_hoe", () -> new HochiymToolsHoeItem());
	public static final RegistryObject<Item> AKVAMARINE_2_ARMOR_HELMET = REGISTRY.register("akvamarine_2_armor_helmet",
			() -> new Akvamarine2ArmorItem.Helmet());
	public static final RegistryObject<Item> AKVAMARINE_2_ARMOR_CHESTPLATE = REGISTRY.register("akvamarine_2_armor_chestplate",
			() -> new Akvamarine2ArmorItem.Chestplate());
	public static final RegistryObject<Item> AKVAMARINE_2_ARMOR_LEGGINGS = REGISTRY.register("akvamarine_2_armor_leggings",
			() -> new Akvamarine2ArmorItem.Leggings());
	public static final RegistryObject<Item> AKVAMARINE_2_ARMOR_BOOTS = REGISTRY.register("akvamarine_2_armor_boots",
			() -> new Akvamarine2ArmorItem.Boots());
	public static final RegistryObject<Item> AKVAMARINE_1_SWORD = REGISTRY.register("akvamarine_1_sword", () -> new Akvamarine1SwordItem());
	public static final RegistryObject<Item> AKVAMARINE_1_PICKAXE = REGISTRY.register("akvamarine_1_pickaxe", () -> new Akvamarine1PickaxeItem());
	public static final RegistryObject<Item> AKVAMARINE_1_AXE = REGISTRY.register("akvamarine_1_axe", () -> new Akvamarine1AxeItem());
	public static final RegistryObject<Item> AKVAMARINE_1_SHOVEL = REGISTRY.register("akvamarine_1_shovel", () -> new Akvamarine1ShovelItem());
	public static final RegistryObject<Item> AKVAMARINE_1_HOE = REGISTRY.register("akvamarine_1_hoe", () -> new Akvamarine1HoeItem());
	public static final RegistryObject<Item> INFINITII_ARMOR_HELMET = REGISTRY.register("infinitii_armor_helmet",
			() -> new InfinitiiArmorItem.Helmet());
	public static final RegistryObject<Item> INFINITII_ARMOR_CHESTPLATE = REGISTRY.register("infinitii_armor_chestplate",
			() -> new InfinitiiArmorItem.Chestplate());
	public static final RegistryObject<Item> INFINITII_ARMOR_LEGGINGS = REGISTRY.register("infinitii_armor_leggings",
			() -> new InfinitiiArmorItem.Leggings());
	public static final RegistryObject<Item> INFINITII_ARMOR_BOOTS = REGISTRY.register("infinitii_armor_boots", () -> new InfinitiiArmorItem.Boots());
	public static final RegistryObject<Item> INFINITII_SWORD = REGISTRY.register("infinitii_sword", () -> new InfinitiiSwordItem());
	public static final RegistryObject<Item> INFINITII_PICKAXE = REGISTRY.register("infinitii_pickaxe", () -> new InfinitiiPickaxeItem());
	public static final RegistryObject<Item> INFINITII_AXE = REGISTRY.register("infinitii_axe", () -> new InfinitiiAxeItem());
	public static final RegistryObject<Item> INFINITII_SHOVEL = REGISTRY.register("infinitii_shovel", () -> new InfinitiiShovelItem());
	public static final RegistryObject<Item> INFINITII_HOE = REGISTRY.register("infinitii_hoe", () -> new InfinitiiHoeItem());
	public static final RegistryObject<Item> RUBYY_ARMOR_HELMET = REGISTRY.register("rubyy_armor_helmet", () -> new RubyyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBYY_ARMOR_CHESTPLATE = REGISTRY.register("rubyy_armor_chestplate",
			() -> new RubyyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBYY_ARMOR_LEGGINGS = REGISTRY.register("rubyy_armor_leggings", () -> new RubyyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBYY_ARMOR_BOOTS = REGISTRY.register("rubyy_armor_boots", () -> new RubyyArmorItem.Boots());
	public static final RegistryObject<Item> RUBYY_SWORD = REGISTRY.register("rubyy_sword", () -> new RubyySwordItem());
	public static final RegistryObject<Item> RUBYY_PICKAXE = REGISTRY.register("rubyy_pickaxe", () -> new RubyyPickaxeItem());
	public static final RegistryObject<Item> RUBYY_AXE = REGISTRY.register("rubyy_axe", () -> new RubyyAxeItem());
	public static final RegistryObject<Item> RUBYY_SHOVEL = REGISTRY.register("rubyy_shovel", () -> new RubyyShovelItem());
	public static final RegistryObject<Item> RUBYY_HOE = REGISTRY.register("rubyy_hoe", () -> new RubyyHoeItem());
	public static final RegistryObject<Item> PERODIUM_HELMET = REGISTRY.register("perodium_helmet", () -> new PerodiumItem.Helmet());
	public static final RegistryObject<Item> PERODIUM_CHESTPLATE = REGISTRY.register("perodium_chestplate", () -> new PerodiumItem.Chestplate());
	public static final RegistryObject<Item> PERODIUM_LEGGINGS = REGISTRY.register("perodium_leggings", () -> new PerodiumItem.Leggings());
	public static final RegistryObject<Item> PERODIUM_BOOTS = REGISTRY.register("perodium_boots", () -> new PerodiumItem.Boots());
	public static final RegistryObject<Item> PERODIUM_SWORD = REGISTRY.register("perodium_sword", () -> new PerodiumSwordItem());
	public static final RegistryObject<Item> PERODIUM_PICKAXE = REGISTRY.register("perodium_pickaxe", () -> new PerodiumPickaxeItem());
	public static final RegistryObject<Item> PERODIUM_AXE = REGISTRY.register("perodium_axe", () -> new PerodiumAxeItem());
	public static final RegistryObject<Item> PERODIUM_SHOVEL = REGISTRY.register("perodium_shovel", () -> new PerodiumShovelItem());
	public static final RegistryObject<Item> PERODIUM_HOE = REGISTRY.register("perodium_hoe", () -> new PerodiumHoeItem());
	public static final RegistryObject<Item> PERODIUM_MULTI_TOOL = REGISTRY.register("perodium_multi_tool", () -> new PerodiumMultiToolItem());
	public static final RegistryObject<Item> PERODIUM_HAMMER = REGISTRY.register("perodium_hammer", () -> new PerodiumHammerItem());
	public static final RegistryObject<Item> PERODIUM_SHEARS = REGISTRY.register("perodium_shears", () -> new PerodiumShearsItem());
	public static final RegistryObject<Item> PERODIUM_PISTOL = REGISTRY.register("perodium_pistol", () -> new PerodiumPistolItem());
	public static final RegistryObject<Item> PERODIUM_AMMO = REGISTRY.register("perodium_ammo", () -> new PerodiumAmmoItem());
	public static final RegistryObject<Item> AKVAMARINE_BUSH_2 = block(PerodiumcraftModBlocks.AKVAMARINE_BUSH_2, null);
	public static final RegistryObject<Item> PERODIUM_BUSH_2 = block(PerodiumcraftModBlocks.PERODIUM_BUSH_2, null);
	public static final RegistryObject<Item> PERODIUM_PIE_7 = REGISTRY.register("perodium_pie_7", () -> new PerodiumPie7Item());
	public static final RegistryObject<Item> PERODIUM_PIE_6 = REGISTRY.register("perodium_pie_6", () -> new PerodiumPie6Item());
	public static final RegistryObject<Item> PERODIUM_PIE_5 = REGISTRY.register("perodium_pie_5", () -> new PerodiumPie5Item());
	public static final RegistryObject<Item> PERODIUM_PIE_4 = REGISTRY.register("perodium_pie_4", () -> new PerodiumPie4Item());
	public static final RegistryObject<Item> PERODIUM_PIE_3 = REGISTRY.register("perodium_pie_3", () -> new PerodiumPie3Item());
	public static final RegistryObject<Item> PERODIUM_PIE_2 = REGISTRY.register("perodium_pie_2", () -> new PerodiumPie2Item());
	public static final RegistryObject<Item> PERODIUM_PIE_1 = REGISTRY.register("perodium_pie_1", () -> new PerodiumPie1Item());
	public static final RegistryObject<Item> PERODIUM_APPLE_STAGE_2 = block(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_2, null);
	public static final RegistryObject<Item> PERODIUM_APPLE_STAGE_3 = block(PerodiumcraftModBlocks.PERODIUM_APPLE_STAGE_3, null);
	public static final RegistryObject<Item> PERODIUM_GUIDE = REGISTRY.register("perodium_guide", () -> new PerodiumGuideItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
