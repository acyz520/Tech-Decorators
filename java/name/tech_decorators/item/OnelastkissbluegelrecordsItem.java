
package name.tech_decorators.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.tech_decorators.init.TechDecoratorsModTabs;
import name.tech_decorators.init.TechDecoratorsModSounds;

public class OnelastkissbluegelrecordsItem extends RecordItem {
	public OnelastkissbluegelrecordsItem() {
		super(0, TechDecoratorsModSounds.ONE_LAST_KISS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4908);
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_VINYL).register(content -> content.accept(this));
	}
}
