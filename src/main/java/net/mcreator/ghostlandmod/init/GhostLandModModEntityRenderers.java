
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ghostlandmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ghostlandmod.client.renderer.DeewmRenderer;
import net.mcreator.ghostlandmod.client.renderer.AmungusRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GhostLandModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GhostLandModModEntities.DREEM.get(), DeewmRenderer::new);
		event.registerEntityRenderer(GhostLandModModEntities.AMUNGUS.get(), AmungusRenderer::new);
	}
}
