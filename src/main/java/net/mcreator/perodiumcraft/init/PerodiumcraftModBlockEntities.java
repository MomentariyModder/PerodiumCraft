
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.perodiumcraft.block.entity.RubyBoxBlockEntity;
import net.mcreator.perodiumcraft.block.entity.PerodiumBoxBlockEntity;
import net.mcreator.perodiumcraft.block.entity.AkvamarineBoxBlockEntity;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

public class PerodiumcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			PerodiumcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PERODIUM_BOX = register("perodium_box", PerodiumcraftModBlocks.PERODIUM_BOX,
			PerodiumBoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AKVAMARINE_BOX = register("akvamarine_box", PerodiumcraftModBlocks.AKVAMARINE_BOX,
			AkvamarineBoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RUBY_BOX = register("ruby_box", PerodiumcraftModBlocks.RUBY_BOX, RubyBoxBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
