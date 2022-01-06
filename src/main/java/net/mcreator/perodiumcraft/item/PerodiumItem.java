
package net.mcreator.perodiumcraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.perodiumcraft.init.PerodiumcraftModTabs;

public abstract class PerodiumItem extends ArmorItem {
	public PerodiumItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 15, 18, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 24;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("perodiumcraft:metalarmors"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

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
		}, slot, properties);
	}

	public static class Helmet extends PerodiumItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
			setRegistryName("perodium_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "perodiumcraft:textures/models/armor/perodium_layer_1.png";
		}
	}

	public static class Chestplate extends PerodiumItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
			setRegistryName("perodium_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "perodiumcraft:textures/models/armor/perodium_layer_1.png";
		}
	}

	public static class Leggings extends PerodiumItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
			setRegistryName("perodium_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "perodiumcraft:textures/models/armor/perodium_layer_2.png";
		}
	}

	public static class Boots extends PerodiumItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PerodiumcraftModTabs.TAB_PERODIUM_CRAFT_TOOLSAND_ARMORS));
			setRegistryName("perodium_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "perodiumcraft:textures/models/armor/perodium_layer_1.png";
		}
	}
}
