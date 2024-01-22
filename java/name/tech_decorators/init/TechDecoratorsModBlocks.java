
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package name.tech_decorators.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import name.tech_decorators.block.TechdecoratorsMedalBlock;
import name.tech_decorators.block.TOPMOREspzBlock;
import name.tech_decorators.block.Nkz30Block;
import name.tech_decorators.block.MSXSXBlock;
import name.tech_decorators.block.MSXSSTBBlock;
import name.tech_decorators.block.MSXSSBlock;
import name.tech_decorators.block.LS3A6000Block;
import name.tech_decorators.block.KioxiaRC20Block;
import name.tech_decorators.block.Intel12i9fuBlock;
import name.tech_decorators.block.Intel12i9fhBlock;
import name.tech_decorators.block.Intel12i7fuBlock;
import name.tech_decorators.block.Intel12i7fhBlock;
import name.tech_decorators.block.Intel12i5fuBlock;
import name.tech_decorators.block.Intel12i5fhBlock;
import name.tech_decorators.block.Intel12i3fuBlock;
import name.tech_decorators.block.Intel12i3fhBlock;
import name.tech_decorators.block.AmdR556uBlock;
import name.tech_decorators.block.AmdR556hBlock;
import name.tech_decorators.block.AmdR556GuBlock;
import name.tech_decorators.block.AmdR556GhBlock;
import name.tech_decorators.block.AmdR555uBlock;
import name.tech_decorators.block.AmdR555hBlock;
import name.tech_decorators.block.AmdR341uBlock;
import name.tech_decorators.block.AmdR341hBlock;
import name.tech_decorators.TechDecoratorsMod;

public class TechDecoratorsModBlocks {
	public static Block INTEL_12I3FH;
	public static Block INTEL_12I5FH;
	public static Block INTEL_12I7FH;
	public static Block INTEL_12I_9FH;
	public static Block AMD_R_341H;
	public static Block AMD_R_555H;
	public static Block AMD_R_556H;
	public static Block AMD_R_556_GH;
	public static Block INTEL_12I_3FU;
	public static Block INTEL_12I_5FU;
	public static Block INTEL_12I_7FU;
	public static Block INTEL_12I_9FU;
	public static Block AMD_R_341U;
	public static Block AMD_R_555U;
	public static Block AMD_R_556U;
	public static Block AMD_R_556_GU;
	public static Block LS_3_A_6000;
	public static Block KIOXIA_RC_20;
	public static Block TOPMOR_ESPZ;
	public static Block NKZ_30;
	public static Block MSXSS;
	public static Block MSXSSTB;
	public static Block TECHDECORATORS_MEDAL;
	public static Block MSXSX;

	public static void load() {
		INTEL_12I3FH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i3fh"), new Intel12i3fhBlock());
		INTEL_12I5FH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i5fh"), new Intel12i5fhBlock());
		INTEL_12I7FH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i7fh"), new Intel12i7fhBlock());
		INTEL_12I_9FH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_9fh"), new Intel12i9fhBlock());
		AMD_R_341H = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_341h"), new AmdR341hBlock());
		AMD_R_555H = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_555h"), new AmdR555hBlock());
		AMD_R_556H = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556h"), new AmdR556hBlock());
		AMD_R_556_GH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556_gh"), new AmdR556GhBlock());
		INTEL_12I_3FU = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_3fu"), new Intel12i3fuBlock());
		INTEL_12I_5FU = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_5fu"), new Intel12i5fuBlock());
		INTEL_12I_7FU = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_7fu"), new Intel12i7fuBlock());
		INTEL_12I_9FU = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "intel_12i_9fu"), new Intel12i9fuBlock());
		AMD_R_341U = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_341u"), new AmdR341uBlock());
		AMD_R_555U = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_555u"), new AmdR555uBlock());
		AMD_R_556U = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556u"), new AmdR556uBlock());
		AMD_R_556_GU = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "amd_r_556_gu"), new AmdR556GuBlock());
		LS_3_A_6000 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "ls_3_a_6000"), new LS3A6000Block());
		KIOXIA_RC_20 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "kioxia_rc_20"), new KioxiaRC20Block());
		TOPMOR_ESPZ = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "topmor_espz"), new TOPMOREspzBlock());
		NKZ_30 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "nkz_30"), new Nkz30Block());
		MSXSS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "msxss"), new MSXSSBlock());
		MSXSSTB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "msxsstb"), new MSXSSTBBlock());
		TECHDECORATORS_MEDAL = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "techdecorators_medal"), new TechdecoratorsMedalBlock());
		MSXSX = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TechDecoratorsMod.MODID, "msxsx"), new MSXSXBlock());
	}

	public static void clientLoad() {
		Intel12i3fhBlock.clientInit();
		Intel12i5fhBlock.clientInit();
		Intel12i7fhBlock.clientInit();
		Intel12i9fhBlock.clientInit();
		AmdR341hBlock.clientInit();
		AmdR555hBlock.clientInit();
		AmdR556hBlock.clientInit();
		AmdR556GhBlock.clientInit();
		Intel12i3fuBlock.clientInit();
		Intel12i5fuBlock.clientInit();
		Intel12i7fuBlock.clientInit();
		Intel12i9fuBlock.clientInit();
		AmdR341uBlock.clientInit();
		AmdR555uBlock.clientInit();
		AmdR556uBlock.clientInit();
		AmdR556GuBlock.clientInit();
		LS3A6000Block.clientInit();
		KioxiaRC20Block.clientInit();
		TOPMOREspzBlock.clientInit();
		Nkz30Block.clientInit();
		MSXSSBlock.clientInit();
		MSXSSTBBlock.clientInit();
		TechdecoratorsMedalBlock.clientInit();
		MSXSXBlock.clientInit();
	}
}
