
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.perodiumcraft.world.biome.RubyZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.RubyPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.RubyJungleForestBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumOakPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumOakForestBiome;
import net.mcreator.perodiumcraft.world.biome.PerodiumDesertBiome;
import net.mcreator.perodiumcraft.world.biome.InfinitiSwampBiome;
import net.mcreator.perodiumcraft.world.biome.HochiymPlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarineZombiePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarinePlainsBiome;
import net.mcreator.perodiumcraft.world.biome.AkvamarineBirchForestBiome;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome AKVAMARINE_PLAINS = register("akvamarine_plains", AkvamarinePlainsBiome.createBiome());
	public static Biome HOCHIYM_PLAINS = register("hochiym_plains", HochiymPlainsBiome.createBiome());
	public static Biome AKVAMARINE_ZOMBIE_PLAINS = register("akvamarine_zombie_plains", AkvamarineZombiePlainsBiome.createBiome());
	public static Biome INFINITI_SWAMP = register("infiniti_swamp", InfinitiSwampBiome.createBiome());
	public static Biome PERODIUM_DESERT = register("perodium_desert", PerodiumDesertBiome.createBiome());
	public static Biome PERODIUM_OAK_PLAINS = register("perodium_oak_plains", PerodiumOakPlainsBiome.createBiome());
	public static Biome PERODIUM_ZOMBIE_PLAINS = register("perodium_zombie_plains", PerodiumZombiePlainsBiome.createBiome());
	public static Biome RUBY_ZOMBIE_PLAINS = register("ruby_zombie_plains", RubyZombiePlainsBiome.createBiome());
	public static Biome PERODIUM_OAK_FOREST = register("perodium_oak_forest", PerodiumOakForestBiome.createBiome());
	public static Biome AKVAMARINE_BIRCH_FOREST = register("akvamarine_birch_forest", AkvamarineBirchForestBiome.createBiome());
	public static Biome RUBY_JUNGLE_FOREST = register("ruby_jungle_forest", RubyJungleForestBiome.createBiome());
	public static Biome RUBY_PLAINS = register("ruby_plains", RubyPlainsBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(PerodiumcraftMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

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
		});
	}
}
