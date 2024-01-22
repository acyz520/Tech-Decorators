/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package name.tech_decorators.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.tech_decorators.item.OnelastkissbluegelrecordsItem;
import name.tech_decorators.item.InteltoothpasteItem;
import name.tech_decorators.item.BeautifulWorldAsukaWhiteglueItem;
import name.tech_decorators.item.ACruelAngelsThesisOrangesprayblackglueItem;
import name.tech_decorators.TechDecoratorsMod;

public class TechDecoratorsModItems {
	public static Item INTELTOOTHPASTE;
	public static Item A_CRUEL_ANGELS_THESIS_ORANGESPRAYBLACKGLUE;
	public static Item BEAUTIFULWORLD_WHITEGELRECORDS;
	public static Item ONELASTKISS_BLUEGELRECORDS;
	public static Item INTEL_12I3FH;
	public static Item INTEL_12I5FH;
	public static Item INTEL_12I7FH;
	public static Item INTEL_12I_9FH;
	public static Item AMD_R_341H;
	public static Item AMD_R_555H;
	public static Item AMD_R_556H;
	public static Item AMD_R_556_GH;
	public static Item INTEL_12I_3FU;
	public static Item INTEL_12I_5FU;
	public static Item INTEL_12I_7FU;
	public static Item INTEL_12I_9FU;
	public static Item AMD_R_341U;
	public static Item AMD_R_555U;
	public static Item AMD_R_556U;
	public static Item AMD_R_556_GU;
	public static Item LS_3_A_6000;
	public static Item KIOXIA_RC_20;
	public static Item TOPMOR_ESPZ;
	public static Item NKZ_30;
	public static Item MSXSS;
	public static Item MSXSSTB;
	public static Item TECHDECORATORS_MEDAL;
	public static Item MSXSX;

	public static void load() {
		INTELTOOTHPASTE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "inteltoothpaste"), new InteltoothpasteItem());
		A_CRUEL_ANGELS_THESIS_ORANGESPRAYBLACKGLUE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "a_cruel_angels_thesis_orangesprayblackglue"), new ACruelAngelsThesisOrangesprayblackglueItem());
		BEAUTIFULWORLD_WHITEGELRECORDS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "beautifulworld_whitegelrecords"), new BeautifulWorldAsukaWhiteglueItem());
		ONELASTKISS_BLUEGELRECORDS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "onelastkiss_bluegelrecords"), new OnelastkissbluegelrecordsItem());
		INTEL_12I3FH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i3fh"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I3FH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I3FH));
		INTEL_12I5FH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i5fh"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I5FH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I5FH));
		INTEL_12I7FH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i7fh"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I7FH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I7FH));
		INTEL_12I_9FH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_9fh"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I_9FH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I_9FH));
		AMD_R_341H = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_341h"), new BlockItem(TechDecoratorsModBlocks.AMD_R_341H, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_341H));
		AMD_R_555H = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_555h"), new BlockItem(TechDecoratorsModBlocks.AMD_R_555H, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_555H));
		AMD_R_556H = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556h"), new BlockItem(TechDecoratorsModBlocks.AMD_R_556H, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_556H));
		AMD_R_556_GH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556_gh"), new BlockItem(TechDecoratorsModBlocks.AMD_R_556_GH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_556_GH));
		INTEL_12I_3FU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_3fu"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I_3FU, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I_3FU));
		INTEL_12I_5FU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_5fu"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I_5FU, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I_5FU));
		INTEL_12I_7FU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_7fu"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I_7FU, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I_7FU));
		INTEL_12I_9FU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_9fu"), new BlockItem(TechDecoratorsModBlocks.INTEL_12I_9FU, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(INTEL_12I_9FU));
		AMD_R_341U = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_341u"), new BlockItem(TechDecoratorsModBlocks.AMD_R_341U, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_341U));
		AMD_R_555U = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_555u"), new BlockItem(TechDecoratorsModBlocks.AMD_R_555U, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_555U));
		AMD_R_556U = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556u"), new BlockItem(TechDecoratorsModBlocks.AMD_R_556U, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_556U));
		AMD_R_556_GU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556_gu"), new BlockItem(TechDecoratorsModBlocks.AMD_R_556_GU, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(AMD_R_556_GU));
		LS_3_A_6000 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "ls_3_a_6000"), new BlockItem(TechDecoratorsModBlocks.LS_3_A_6000, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(LS_3_A_6000));
		KIOXIA_RC_20 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "kioxia_rc_20"), new BlockItem(TechDecoratorsModBlocks.KIOXIA_RC_20, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(KIOXIA_RC_20));
		TOPMOR_ESPZ = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "topmor_espz"), new BlockItem(TechDecoratorsModBlocks.TOPMOR_ESPZ, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(TOPMOR_ESPZ));
		NKZ_30 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "nkz_30"), new BlockItem(TechDecoratorsModBlocks.NKZ_30, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(NKZ_30));
		MSXSS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "msxss"), new BlockItem(TechDecoratorsModBlocks.MSXSS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_GAMECONSOLES).register(content -> content.accept(MSXSS));
		MSXSSTB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "msxsstb"), new BlockItem(TechDecoratorsModBlocks.MSXSSTB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_GAMECONSOLES).register(content -> content.accept(MSXSSTB));
		TECHDECORATORS_MEDAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "techdecorators_medal"), new BlockItem(TechDecoratorsModBlocks.TECHDECORATORS_MEDAL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTABPROCESSOR).register(content -> content.accept(TECHDECORATORS_MEDAL));
		MSXSX = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TechDecoratorsMod.MODID, "msxsx"), new BlockItem(TechDecoratorsModBlocks.MSXSX, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_GAMECONSOLES).register(content -> content.accept(MSXSX));
	}

	public static void clientLoad() {
	}
}
