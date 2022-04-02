
package net.mcreator.perodiumcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.perodiumcraft.world.inventory.GuidePage2Menu;
import net.mcreator.perodiumcraft.network.GuidePage2ButtonMessage;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuidePage2Screen extends AbstractContainerScreen<GuidePage2Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuidePage2Screen(GuidePage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/bestiary.png"));
		this.blit(ms, this.leftPos + -38, this.topPos + 7, 0, 0, 256, 160, 256, 160);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/rec5.png"));
		this.blit(ms, this.leftPos + -29, this.topPos + 43, 0, 0, 93, 18, 93, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/pportal.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 34, 0, 0, 91, 40, 91, 40);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Reinforced Perodium", -29, 25, -13421773);
		this.font.draw(poseStack, "Perodium Portal", 114, 25, -13421773);
		this.font.draw(poseStack, "Smithing Table", -11, 16, -13421773);
		this.font.draw(poseStack, "brick", -29, 34, -13421773);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 151, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				PerodiumcraftMod.PACKET_HANDLER.sendToServer(new GuidePage2ButtonMessage(0, x, y, z));
				GuidePage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
