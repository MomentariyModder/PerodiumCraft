
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.perodiumcraft.fluid.PerodiumWaterFluid;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModFluids {
	private static final List<Fluid> REGISTRY = new ArrayList<>();
	public static final FlowingFluid PERODIUM_WATER = register(new PerodiumWaterFluid.Source());
	public static final FlowingFluid FLOWING_PERODIUM_WATER = register(new PerodiumWaterFluid.Flowing());

	private static FlowingFluid register(FlowingFluid fluid) {
		REGISTRY.add(fluid);
		return fluid;
	}

	@SubscribeEvent
	public static void registerFluids(RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Fluid[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PERODIUM_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PERODIUM_WATER, renderType -> renderType == RenderType.translucent());
		}
	}
}
