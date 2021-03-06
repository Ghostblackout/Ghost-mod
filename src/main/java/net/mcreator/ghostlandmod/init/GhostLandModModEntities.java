
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ghostlandmod.entity.DeewmEntity;
import net.mcreator.ghostlandmod.entity.AmungusEntity;
import net.mcreator.ghostlandmod.GhostLandModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhostLandModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, GhostLandModMod.MODID);
	public static final RegistryObject<EntityType<DeewmEntity>> DREEM = register("dreem",
			EntityType.Builder.<DeewmEntity>of(DeewmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DeewmEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmungusEntity>> AMUNGUS = register("amungus",
			EntityType.Builder.<AmungusEntity>of(AmungusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AmungusEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DeewmEntity.init();
			AmungusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DREEM.get(), DeewmEntity.createAttributes().build());
		event.put(AMUNGUS.get(), AmungusEntity.createAttributes().build());
	}
}
