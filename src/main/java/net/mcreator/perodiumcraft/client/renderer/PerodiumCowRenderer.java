package net.mcreator.perodiumcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.perodiumcraft.entity.PerodiumCowEntity;

public class PerodiumCowRenderer extends MobRenderer<PerodiumCowEntity, CowModel<PerodiumCowEntity>> {
	public PerodiumCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PerodiumCowEntity entity) {
		return new ResourceLocation("perodiumcraft:textures/perodiumcow.png");
	}
}
