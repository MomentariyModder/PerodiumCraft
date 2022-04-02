
package net.mcreator.perodiumcraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.perodiumcraft.init.PerodiumcraftModFluids;

public class PerodiumWaterBlock extends LiquidBlock {
	public PerodiumWaterBlock() {
		super(() -> (FlowingFluid) PerodiumcraftModFluids.PERODIUM_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)

		);
	}
}
