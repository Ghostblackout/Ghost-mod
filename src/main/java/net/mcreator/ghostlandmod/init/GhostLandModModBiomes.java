
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ghostlandmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.ghostlandmod.world.biome.ThedweemBiome;
import net.mcreator.ghostlandmod.GhostLandModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhostLandModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, GhostLandModMod.MODID);
	public static final RegistryObject<Biome> THEDWEEM = REGISTRY.register("thedweem", () -> ThedweemBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ThedweemBiome.init();
		});
	}
}
