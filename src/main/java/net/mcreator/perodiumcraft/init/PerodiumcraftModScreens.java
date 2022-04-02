
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.perodiumcraft.client.gui.GuidePage2Screen;
import net.mcreator.perodiumcraft.client.gui.GuideHomePageScreen;
import net.mcreator.perodiumcraft.client.gui.BoxGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PerodiumcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PerodiumcraftModMenus.BOX_GUI, BoxGUIScreen::new);
			MenuScreens.register(PerodiumcraftModMenus.GUIDE_HOME_PAGE, GuideHomePageScreen::new);
			MenuScreens.register(PerodiumcraftModMenus.GUIDE_PAGE_2, GuidePage2Screen::new);
		});
	}
}
