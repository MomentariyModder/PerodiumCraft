package net.mcreator.perodiumcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.perodiumcraft.entity.PerodiumSlimeEntity;

public class PerodiumSlimeRenderer extends MobRenderer<PerodiumSlimeEntity, SlimeModel<PerodiumSlimeEntity>> {
	public PerodiumSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerodiumSlimeEntity entity) {
		return new ResourceLocation("perodiumcraft:textures/perodiumslime.png");
	}
}
