
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package name.tech_decorators.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import name.tech_decorators.TechDecoratorsMod;

public class TechDecoratorsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_TECHDECORATORSTAB_GAMECONSOLES = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TechDecoratorsMod.MODID, "techdecoratorstab_gameconsoles"));
	public static ResourceKey<CreativeModeTab> TAB_TECHDECORATORSTABPROCESSOR = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TechDecoratorsMod.MODID, "techdecoratorstabprocessor"));
	public static ResourceKey<CreativeModeTab> TAB_TECHDECORATORSTAB_VINYL = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TechDecoratorsMod.MODID, "techdecoratorstab_vinyl"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TECHDECORATORSTAB_GAMECONSOLES,
				FabricItemGroup.builder().title(Component.translatable("item_group." + TechDecoratorsMod.MODID + ".techdecoratorstab_gameconsoles")).icon(() -> new ItemStack(TechDecoratorsModBlocks.MSXSS)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TECHDECORATORSTABPROCESSOR,
				FabricItemGroup.builder().title(Component.translatable("item_group." + TechDecoratorsMod.MODID + ".techdecoratorstabprocessor")).icon(() -> new ItemStack(TechDecoratorsModItems.INTELTOOTHPASTE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TECHDECORATORSTAB_VINYL,
				FabricItemGroup.builder().title(Component.translatable("item_group." + TechDecoratorsMod.MODID + ".techdecoratorstab_vinyl")).icon(() -> new ItemStack(TechDecoratorsModItems.BEAUTIFULWORLD_WHITEGELRECORDS)).build());
	}
}
