
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ghostlandmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhostLandModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("ghost_land_mod", "drip"), new SoundEvent(new ResourceLocation("ghost_land_mod", "drip")));
		REGISTRY.put(new ResourceLocation("ghost_land_mod", "dripy"), new SoundEvent(new ResourceLocation("ghost_land_mod", "dripy")));
		REGISTRY.put(new ResourceLocation("ghost_land_mod", "dweem"), new SoundEvent(new ResourceLocation("ghost_land_mod", "dweem")));
		REGISTRY.put(new ResourceLocation("ghost_land_mod", "amungdrip"), new SoundEvent(new ResourceLocation("ghost_land_mod", "amungdrip")));
		REGISTRY.put(new ResourceLocation("ghost_land_mod", "cofindanc"), new SoundEvent(new ResourceLocation("ghost_land_mod", "cofindanc")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
