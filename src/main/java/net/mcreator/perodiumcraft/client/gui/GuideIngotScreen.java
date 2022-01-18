
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

import net.mcreator.perodiumcraft.world.inventory.GuideIngotMenu;
import net.mcreator.perodiumcraft.network.GuideIngotButtonMessage;
import net.mcreator.perodiumcraft.PerodiumcraftMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuideIngotScreen extends AbstractContainerScreen<GuideIngotMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuideIngotScreen(GuideIngotMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guibackground.png"));
		this.blit(ms, this.leftPos + -29, this.topPos + 25, 0, 0, 234, 126, 234, 126);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/iron_block.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/diamond_block.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/netherite_block.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/emerald_block.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 97, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/gold_block.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 97, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/nochiymblock.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/akvamarineblock.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/rubyblock.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/infinitiblock.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 97, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/guideravno.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 79, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("perodiumcraft:textures/perodiumingot.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 79, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Perodium Ingot", 51, 34, -13421773);
		this.font.draw(poseStack, "2", 125, 90, -13421773);
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
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 115, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				PerodiumcraftMod.PACKET_HANDLER.sendToServer(new GuideIngotButtonMessage(0, x, y, z));
				GuideIngotButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 115, 30, 20, new TextComponent(">"), e -> {
			if (true) {
				PerodiumcraftMod.PACKET_HANDLER.sendToServer(new GuideIngotButtonMessage(1, x, y, z));
				GuideIngotButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
