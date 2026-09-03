package name.modid.rubymod.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.HoeItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class ModItems {
    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
		Item item = itemFactory.apply(settings.setId(itemKey));
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);
		return item;
	}
	public static final Item RUBY = register(ModItemIds.RUBY, Item::new, new Item.Properties());
	public static final Item RUBY_SWORD = register(ModItemIds.RUBY_SWORD, Item::new, new Item.Properties().sword(Tools.RUBY_TOOL_MATERIAL, 6f, -2.4f));
	public static final Item RUBY_PICKAXE = register(ModItemIds.RUBY_PICKAXE, Item::new, new Item.Properties().pickaxe(Tools.RUBY_TOOL_MATERIAL, 4f, -2.6f));
	public static final Item RUBY_SHOVEL = register(ModItemIds.RUBY_SHOVEL, settings -> new ShovelItem(Tools.RUBY_TOOL_MATERIAL, 0f, -1f, settings), new Item.Properties());
	public static final Item RUBY_AXE = register(ModItemIds.RUBY_AXE, settings -> new AxeItem(Tools.RUBY_TOOL_MATERIAL, 7f, -3.3f, settings), new Item.Properties());
	public static final Item RUBY_HOE = register(ModItemIds.RUBY_HOE, settings -> new HoeItem(Tools.RUBY_TOOL_MATERIAL, -1f, 0f, settings), new Item.Properties());
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
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
     			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY_AXE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
    			.register((creativeTab) -> creativeTab.accept(ModItems.RUBY_HOE));
	}
}
