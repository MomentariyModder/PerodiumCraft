
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.perodiumcraft.itemgroup.PerodiumCraftToolsandArmorsItemGroup;
import net.mcreator.perodiumcraft.PerodiumcraftModElements;

@PerodiumcraftModElements.ModElement.Tag
public class PerodiumItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:perodium_helmet")
	public static final Item helmet = null;
	@ObjectHolder("perodiumcraft:perodium_chestplate")
	public static final Item body = null;
	@ObjectHolder("perodiumcraft:perodium_leggings")
	public static final Item legs = null;
	@ObjectHolder("perodiumcraft:perodium_boots")
	public static final Item boots = null;
	public PerodiumItem(PerodiumcraftModElements instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{6, 15, 18, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 24;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("perodiumcraft:metalarmors"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "perodium";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.4f;
			}
		};
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/perodium_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("perodium_helmet"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/perodium_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("perodium_chestplate"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/perodium_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("perodium_leggings"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/perodium_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("perodium_boots"));
	}
}