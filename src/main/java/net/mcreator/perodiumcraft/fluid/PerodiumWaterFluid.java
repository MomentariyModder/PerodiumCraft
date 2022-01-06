
package net.mcreator.perodiumcraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;
import net.mcreator.perodiumcraft.init.PerodiumcraftModFluids;
import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

public abstract class PerodiumWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PerodiumcraftModFluids.PERODIUM_WATER,
			() -> PerodiumcraftModFluids.FLOWING_PERODIUM_WATER,
			FluidAttributes.builder(new ResourceLocation("perodiumcraft:blocks/perodiumwaterstill"),
					new ResourceLocation("perodiumcraft:blocks/perodiumwaterflow")).luminosity(15)

	).explosionResistance(100f)

			.bucket(() -> PerodiumcraftModItems.PERODIUM_WATER_BUCKET).block(() -> (LiquidBlock) PerodiumcraftModBlocks.PERODIUM_WATER);

	private PerodiumWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends PerodiumWaterFluid {
		public Source() {
			super();
			setRegistryName("perodium_water");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PerodiumWaterFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_perodium_water");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
