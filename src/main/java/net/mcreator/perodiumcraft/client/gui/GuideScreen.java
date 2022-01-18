
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

import net.mcreator.perodiumcraft.world.inventory.GuideMenu;
import net.mcreator.perodiumcraft.network.GuideButtonMessage;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuideScreen extends AbstractContainerScreen<GuideMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuideScreen(GuideMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 206;
		this.imageHeight = 197;
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guibackground.png"));
		this.blit(ms, this.leftPos + -14, this.topPos + 40, 0, 0, 234, 126, 234, 126);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideplus.png"));
		this.blit(ms, this.leftPos + 75, this.topPos + 94, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideravno.png"));
		this.blit(ms, this.leftPos + 111, this.topPos + 94, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 58, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 147, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 130, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guidekey.png"));
		this.blit(ms, this.leftPos + 93, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 57, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 130, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 147, this.topPos + 130, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 130, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 57, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 57, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 147, this.topPos + 58, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 58, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 58, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 147, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 147, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideportal.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 183, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 183, this.topPos + 94, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guiderpb.png"));
		this.blit(ms, this.leftPos + 183, this.topPos + 112, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Portal To Perodium Land", 39, 49, -13421773);
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
		this.addRenderableWidget(new Button(this.leftPos + 66, this.topPos + 130, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				PerodiumcraftMod.PACKET_HANDLER.sendToServer(new GuideButtonMessage(0, x, y, z));
				GuideButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 130, 30, 20, new TextComponent(">"), e -> {
			if (true) {
				PerodiumcraftMod.PACKET_HANDLER.sendToServer(new GuideButtonMessage(1, x, y, z));
				GuideButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
