
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.perodiumcraft.world.biome.RubyZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.RubyPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.RubyJungleForestBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumOakPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumOakMegaForestBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumOakForestBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumMountainBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumDesertBiome;
import net.mcreator.perodiumcraft.world.biome.InfinitiSwampBiome;
import net.mcreator.perodiumcraft.world.biome.HochiymPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarineZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarinePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarineBirchMegaForestBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarineBirchForestBiome;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PerodiumcraftMod.MODID);
	public static final RegistryObject<Biome> AKVAMARINE_PLAINS = REGISTRY.register("akvamarine_plains", () -> AkvamarinePlainsBiome.createBiome());
	public static final RegistryObject<Biome> HOCHIYM_PLAINS = REGISTRY.register("hochiym_plains", () -> HochiymPlainsBiome.createBiome());
	public static final RegistryObject<Biome> AKVAMARINE_ZOMBIE_PLAINS = REGISTRY.register("akvamarine_zombie_plains",
			() -> AkvamarineZombiePlainsBiome.createBiome());
	public static final RegistryObject<Biome> INFINITI_SWAMP = REGISTRY.register("infiniti_swamp", () -> InfinitiSwampBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_DESERT = REGISTRY.register("perodium_desert", () -> PerodiumDesertBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_OAK_PLAINS = REGISTRY.register("perodium_oak_plains",
			() -> PerodiumOakPlainsBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_ZOMBIE_PLAINS = REGISTRY.register("perodium_zombie_plains",
			() -> PerodiumZombiePlainsBiome.createBiome());
	public static final RegistryObject<Biome> RUBY_ZOMBIE_PLAINS = REGISTRY.register("ruby_zombie_plains", () -> RubyZombiePlainsBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_OAK_FOREST = REGISTRY.register("perodium_oak_forest",
			() -> PerodiumOakForestBiome.createBiome());
	public static final RegistryObject<Biome> AKVAMARINE_BIRCH_FOREST = REGISTRY.register("akvamarine_birch_forest",
			() -> AkvamarineBirchForestBiome.createBiome());
	public static final RegistryObject<Biome> RUBY_JUNGLE_FOREST = REGISTRY.register("ruby_jungle_forest", () -> RubyJungleForestBiome.createBiome());
	public static final RegistryObject<Biome> RUBY_PLAINS = REGISTRY.register("ruby_plains", () -> RubyPlainsBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_MOUNTAIN = REGISTRY.register("perodium_mountain", () -> PerodiumMountainBiome.createBiome());
	public static final RegistryObject<Biome> PERODIUM_OAK_MEGA_FOREST = REGISTRY.register("perodium_oak_mega_forest",
			() -> PerodiumOakMegaForestBiome.createBiome());
	public static final RegistryObject<Biome> AKVAMARINE_BIRCH_MEGA_FOREST = REGISTRY.register("akvamarine_birch_mega_forest",
			() -> AkvamarineBirchMegaForestBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AkvamarinePlainsBiome.init();
			HochiymPlainsBiome.init();
			AkvamarineZombiePlainsBiome.init();
			InfinitiSwampBiome.init();
			PerodiumDesertBiome.init();
			PerodiumOakPlainsBiome.init();
			PerodiumZombiePlainsBiome.init();
			RubyZombiePlainsBiome.init();
			PerodiumOakForestBiome.init();
			AkvamarineBirchForestBiome.init();
			RubyJungleForestBiome.init();
			RubyPlainsBiome.init();
			PerodiumMountainBiome.init();
			PerodiumOakMegaForestBiome.init();
			AkvamarineBirchMegaForestBiome.init();
		});
	}
}
