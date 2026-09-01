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
	public static final Item RUBY_SWORD = register(ModItemIds.RUBY_SWORD, Item::new, new Item.Properties().sword(Tools.RUBY_TOOL_MATERIAL, 6f, -2.4f));
	public static final Item RUBY_PICKAXE = register(ModItemIds.RUBY_PICKAXE, Item::new, new Item.Properties().pickaxe(Tools.RUBY_TOOL_MATERIAL, 4f, -1.2f));
	public static final Item RUBY_SHOVEL = register(ModItemIds.RUBY_SHOVEL, Item::new, new Item.Properties().shovel(Tools.RUBY_TOOL_MATERIAL, 0f, 2f));
	// Get the event for modifying entries in the ingredients group.
	// And register an event handler that adds our suspicious item to the ingredients group.
	public static void initialize() {
    	CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
    			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY));
      	CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
      			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY_SWORD));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
    			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY_PICKAXE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
     			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY_SHOVEL));
	}
}
