
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ghostlandmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ghostlandmod.GhostLandModMod;

public class GhostLandModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, GhostLandModMod.MODID);
	public static final RegistryObject<Potion> VUDCA = REGISTRY.register("vudca",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, true, true),
					new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, true, true), new MobEffectInstance(MobEffects.HARM, 3600, 0, true, true),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, true, true), new MobEffectInstance(MobEffects.HEAL, 3600, 0, true, true),
					new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, true, true)));
}
