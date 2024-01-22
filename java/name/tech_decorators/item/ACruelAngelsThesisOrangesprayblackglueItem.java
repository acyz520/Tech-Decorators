
package name.tech_decorators.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import name.tech_decorators.init.TechDecoratorsModTabs;
import name.tech_decorators.init.TechDecoratorsModSounds;

public class ACruelAngelsThesisOrangesprayblackglueItem extends RecordItem {
	public ACruelAngelsThesisOrangesprayblackglueItem() {
		super(0, TechDecoratorsModSounds.A_CRUEL_ANGELS_THESIS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4860);
		ItemGroupEvents.modifyEntriesEvent(TechDecoratorsModTabs.TAB_TECHDECORATORSTAB_VINYL).register(content -> content.accept(this));
	}
}
