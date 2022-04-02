
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.perodiumcraft.fluid.PerodiumWaterFluid;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class PerodiumcraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PerodiumcraftMod.MODID);
	public static final RegistryObject<Fluid> PERODIUM_WATER = REGISTRY.register("perodium_water", () -> new PerodiumWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_PERODIUM_WATER = REGISTRY.register("flowing_perodium_water",
			() -> new PerodiumWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PERODIUM_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PERODIUM_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
