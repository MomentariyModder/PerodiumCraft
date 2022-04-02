
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.perodiumcraft.client.renderer.RubyHuskRenderer;
import net.mcreator.perodiumcraft.client.renderer.PerodiumSlimeRenderer;
import net.mcreator.perodiumcraft.client.renderer.PerodiumPistolRenderer;
import net.mcreator.perodiumcraft.client.renderer.PerodiumManRenderer;
import net.mcreator.perodiumcraft.client.renderer.PerodiumHuskRenderer;
import net.mcreator.perodiumcraft.client.renderer.PerodiumCowRenderer;
import net.mcreator.perodiumcraft.client.renderer.AkvamarineHuskRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PerodiumcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PerodiumcraftModEntities.PERODIUM_HUSK.get(), PerodiumHuskRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.AKVAMARINE_HUSK.get(), AkvamarineHuskRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.RUBY_HUSK.get(), RubyHuskRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.PERODIUM_COW.get(), PerodiumCowRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.PERODIUM_MAN.get(), PerodiumManRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.PERODIUM_SLIME.get(), PerodiumSlimeRenderer::new);
		event.registerEntityRenderer(PerodiumcraftModEntities.PERODIUM_PISTOL.get(), PerodiumPistolRenderer::new);
	}
}
