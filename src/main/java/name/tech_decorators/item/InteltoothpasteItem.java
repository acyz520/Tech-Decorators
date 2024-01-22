
package name.tech_decorators.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.tech_decorators.init.TechDecoratorsModTabs;
import name.tech_decorators.init.TechDecoratorsModSounds;

public class InteltoothpasteItem extends RecordItem {
	public InteltoothpasteItem() {
		super(0, TechDecoratorsModSounds.INTEL_TOOTHPASTE_AUDIO_FREQUENCY, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_VINYL).register(content -> content.accept(this));
	}
}
