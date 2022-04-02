
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.perodiumcraft.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.perodiumcraft.world.inventory.GuidePage2Menu;
import net.mcreator.perodiumcraft.world.inventory.GuideHomePageMenu;
import net.mcreator.perodiumcraft.world.inventory.BoxGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PerodiumcraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BoxGUIMenu> BOX_GUI = register("box_gui", (id, inv, extraData) -> new BoxGUIMenu(id, inv, extraData));
	public static final MenuType<GuideHomePageMenu> GUIDE_HOME_PAGE = register("guide_home_page",
			(id, inv, extraData) -> new GuideHomePageMenu(id, inv, extraData));
	public static final MenuType<GuidePage2Menu> GUIDE_PAGE_2 = register("guide_page_2",
			(id, inv, extraData) -> new GuidePage2Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
