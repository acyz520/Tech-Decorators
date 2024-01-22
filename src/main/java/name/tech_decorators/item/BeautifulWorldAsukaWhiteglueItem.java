
package name.tech_decorators.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.tech_decorators.init.TechDecoratorsModTabs;
import name.tech_decorators.init.TechDecoratorsModSounds;

public class BeautifulWorldAsukaWhiteglueItem extends RecordItem {
	public BeautifulWorldAsukaWhiteglueItem() {
		super(0, TechDecoratorsModSounds.BEAUTIFUL_WORLD, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6168);
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_VINYL).register(content -> content.accept(this));
	}
}
