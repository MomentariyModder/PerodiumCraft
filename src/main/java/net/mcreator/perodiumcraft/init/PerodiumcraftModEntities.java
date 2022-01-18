
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<PerodiumHuskEntity> PERODIUM_HUSK = register("perodium_husk",
			EntityType.Builder.<PerodiumHuskEntity>of(PerodiumHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<AkvamarineHuskEntity> AKVAMARINE_HUSK = register("akvamarine_husk",
			EntityType.Builder.<AkvamarineHuskEntity>of(AkvamarineHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AkvamarineHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<RubyHuskEntity> RUBY_HUSK = register("ruby_husk",
			EntityType.Builder.<RubyHuskEntity>of(RubyHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RubyHuskEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<PerodiumCowEntity> PERODIUM_COW = register("perodium_cow",
			EntityType.Builder.<PerodiumCowEntity>of(PerodiumCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumCowEntity::new).sized(0.9f, 1.4f));
	public static final EntityType<PerodiumPistolEntity> PERODIUM_PISTOL = register("entitybulletperodium_pistol",
			EntityType.Builder.<PerodiumPistolEntity>of(PerodiumPistolEntity::new, MobCategory.MISC).setCustomClientFactory(PerodiumPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PerodiumManEntity> PERODIUM_MAN = register("perodium_man",
			EntityType.Builder.<PerodiumManEntity>of(PerodiumManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumManEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<PerodiumSlimeEntity> PERODIUM_SLIME = register("perodium_slime",
			EntityType.Builder.<PerodiumSlimeEntity>of(PerodiumSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerodiumSlimeEntity::new).sized(1f, 1f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
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
		event.put(PERODIUM_HUSK, PerodiumHuskEntity.createAttributes().build());
		event.put(AKVAMARINE_HUSK, AkvamarineHuskEntity.createAttributes().build());
		event.put(RUBY_HUSK, RubyHuskEntity.createAttributes().build());
		event.put(PERODIUM_COW, PerodiumCowEntity.createAttributes().build());
		event.put(PERODIUM_MAN, PerodiumManEntity.createAttributes().build());
		event.put(PERODIUM_SLIME, PerodiumSlimeEntity.createAttributes().build());
	}
}
