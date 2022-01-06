
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("perodiumcraft", "gemarmors"), new SoundEvent(new ResourceLocation("perodiumcraft", "gemarmors")));
		REGISTRY.put(new ResourceLocation("perodiumcraft", "metalarmors"), new SoundEvent(new ResourceLocation("perodiumcraft", "metalarmors")));
		REGISTRY.put(new ResourceLocation("perodiumcraft", "perodiumpistol"),
				new SoundEvent(new ResourceLocation("perodiumcraft", "perodiumpistol")));
		REGISTRY.put(new ResourceLocation("perodiumcraft", "shoot"), new SoundEvent(new ResourceLocation("perodiumcraft", "shoot")));
		REGISTRY.put(new ResourceLocation("perodiumcraft", "shoot2"), new SoundEvent(new ResourceLocation("perodiumcraft", "shoot2")));
		REGISTRY.put(new ResourceLocation("perodiumcraft", "shoot3"), new SoundEvent(new ResourceLocation("perodiumcraft", "shoot3")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
