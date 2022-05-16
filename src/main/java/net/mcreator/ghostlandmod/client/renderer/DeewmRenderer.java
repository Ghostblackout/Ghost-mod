
package net.mcreator.ghostlandmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.ghostlandmod.entity.DeewmEntity;

public class DeewmRenderer extends HumanoidMobRenderer<DeewmEntity, HumanoidModel<DeewmEntity>> {
	public DeewmRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<DeewmEntity, HumanoidModel<DeewmEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ghost_land_mod:textures/dream_skin.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DeewmEntity entity) {
		return new ResourceLocation("ghost_land_mod:textures/dream_skin.png");
	}
}
