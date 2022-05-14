
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ghostlandmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.ghostlandmod.item.DweemItem;
import net.mcreator.ghostlandmod.item.CopperswordItem;
import net.mcreator.ghostlandmod.item.CoppershovelItem;
import net.mcreator.ghostlandmod.item.CopperpicaxeItem;
import net.mcreator.ghostlandmod.item.CopperhoeItem;
import net.mcreator.ghostlandmod.item.CopperAxeItem;
import net.mcreator.ghostlandmod.item.CopperArmorItem;
import net.mcreator.ghostlandmod.item.CoffindaceItem;
import net.mcreator.ghostlandmod.item.AmungusdripyItem;
import net.mcreator.ghostlandmod.GhostLandModMod;

public class GhostLandModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GhostLandModMod.MODID);
	public static final RegistryObject<Item> DWEEM = REGISTRY.register("dweem", () -> new DweemItem());
	public static final RegistryObject<Item> AMUNGUSDRIPY = REGISTRY.register("amungusdripy", () -> new AmungusdripyItem());
	public static final RegistryObject<Item> COPPERPICAXE = REGISTRY.register("copperpicaxe", () -> new CopperpicaxeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",
			() -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPERSWORD = REGISTRY.register("coppersword", () -> new CopperswordItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPERSHOVEL = REGISTRY.register("coppershovel", () -> new CoppershovelItem());
	public static final RegistryObject<Item> COPPERHOE = REGISTRY.register("copperhoe", () -> new CopperhoeItem());
	public static final RegistryObject<Item> COFFINDACE = REGISTRY.register("coffindace", () -> new CoffindaceItem());
}
