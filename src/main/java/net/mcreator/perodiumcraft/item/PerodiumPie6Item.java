
package net.mcreator.perodiumcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.perodiumcraft.init.PerodiumcraftModItems;

public class PerodiumPie6Item extends Item {
	public PerodiumPie6Item() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f)

				.build()));
		setRegistryName("perodium_pie_6");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(PerodiumcraftModItems.PERODIUM_PIE_5);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
