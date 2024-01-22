/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package name.tech_decorators;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import name.tech_decorators.init.TechDecoratorsModTabs;
import name.tech_decorators.init.TechDecoratorsModSounds;
import name.tech_decorators.init.TechDecoratorsModItems;
import name.tech_decorators.init.TechDecoratorsModBlocks;

public class TechDecoratorsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "tech_decorators";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TechDecoratorsMod");

		TechDecoratorsModTabs.load();

		TechDecoratorsModBlocks.load();
		TechDecoratorsModItems.load();

		TechDecoratorsModSounds.load();

	}
}
