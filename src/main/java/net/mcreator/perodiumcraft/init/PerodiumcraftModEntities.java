
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.perodiumcraft.entity.RubyHuskEntity;
import net.mcreator.perodiumcraft.entity.PerodiumSlimeEntity;
import net.mcreator.perodiumcraft.entity.PerodiumPistolEntity;
import net.mcreator.perodiumcraft.entity.PerodiumManEntity;
import net.mcreator.perodiumcraft.entity.PerodiumHuskEntity;
import net.mcreator.perodiumcraft.entity.PerodiumCowEntity;
import net.mcreator.perodiumcraft.entity.AkvamarineHuskEntity;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PerodiumcraftMod.MODID);
	public static final RegistryObject<EntityType<PerodiumHuskEntity>> PERODIUM_HUSK = register("perodium_husk",
			EntityType.Builder.<PerodiumHuskEntity>of(PerodiumHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AkvamarineHuskEntity>> AKVAMARINE_HUSK = register("akvamarine_husk",
			EntityType.Builder.<AkvamarineHuskEntity>of(AkvamarineHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AkvamarineHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RubyHuskEntity>> RUBY_HUSK = register("ruby_husk",
			EntityType.Builder.<RubyHuskEntity>of(RubyHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RubyHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerodiumCowEntity>> PERODIUM_COW = register("perodium_cow",
			EntityType.Builder.<PerodiumCowEntity>of(PerodiumCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<PerodiumManEntity>> PERODIUM_MAN = register("perodium_man",
			EntityType.Builder.<PerodiumManEntity>of(PerodiumManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumManEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerodiumSlimeEntity>> PERODIUM_SLIME = register("perodium_slime",
			EntityType.Builder.<PerodiumSlimeEntity>of(PerodiumSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumSlimeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<PerodiumPistolEntity>> PERODIUM_PISTOL = register("projectile_perodium_pistol",
			EntityType.Builder.<PerodiumPistolEntity>of(PerodiumPistolEntity::new, MobCategory.MISC).setCustomClientFactory(PerodiumPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PerodiumHuskEntity.init();
			AkvamarineHuskEntity.init();
			RubyHuskEntity.init();
			PerodiumCowEntity.init();
			PerodiumManEntity.init();
			PerodiumSlimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PERODIUM_HUSK.get(), PerodiumHuskEntity.createAttributes().build());
		event.put(AKVAMARINE_HUSK.get(), AkvamarineHuskEntity.createAttributes().build());
		event.put(RUBY_HUSK.get(), RubyHuskEntity.createAttributes().build());
		event.put(PERODIUM_COW.get(), PerodiumCowEntity.createAttributes().build());
		event.put(PERODIUM_MAN.get(), PerodiumManEntity.createAttributes().build());
		event.put(PERODIUM_SLIME.get(), PerodiumSlimeEntity.createAttributes().build());
	}
}
