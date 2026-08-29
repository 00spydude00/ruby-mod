package name.modid.rubymod.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class ModItems {
    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
		Item item = itemFactory.apply(settings.setId(itemKey));
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);
		return item;
	}
	public static final Item RUBY = register(ModItemIds.RUBY, Item::new, new Item.Properties());
	// Get the event for modifying entries in the ingredients group.
	// And register an event handler that adds our suspicious item to the ingredients group.
	public static void initialize() {
    	CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
    			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY));
	}
}
