
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
public class Akvamarine2ArmorItem extends PerodiumcraftModElements.ModElement {
	@ObjectHolder("perodiumcraft:akvamarine_2_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("perodiumcraft:akvamarine_2_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("perodiumcraft:akvamarine_2_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("perodiumcraft:akvamarine_2_armor_boots")
	public static final Item boots = null;
	public Akvamarine2ArmorItem(PerodiumcraftModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{6, 15, 18, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 12;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("perodiumcraft:gemarmors"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AkvamarineItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "akvamarine_2_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		};
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/akvamarine2_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("akvamarine_2_armor_helmet"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/akvamarine2_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("akvamarine_2_armor_chestplate"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/akvamarine2_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("akvamarine_2_armor_leggings"));
		elements.items.add(
				() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(PerodiumCraftToolsandArmorsItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "perodiumcraft:textures/models/armor/akvamarine2_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("akvamarine_2_armor_boots"));
	}
}
