package name.modid.rubymod.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.equipment.ArmorType;
import name.modid.rubymod.item.Armor;
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
	public static final Item RUBY_HELMET = register(
			ModItemIds.RUBY_HELMET,
			Item::new,
			new Item.Properties().humanoidArmor(Armor.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)
					.durability(ArmorType.HELMET.getDurability(Armor.RUBY_ARMOR_MATERIAL.durability()))
	);
	public static final Item RUBY_CHESTPLATE = register(
			ModItemIds.RUBY_CHESTPLATE,
			Item::new,
			new Item.Properties().humanoidArmor(Armor.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)
					.durability(ArmorType.CHESTPLATE.getDurability(Armor.RUBY_ARMOR_MATERIAL.durability()))
	);
	public static final Item RUBY_LEGGINGS = register(
			ModItemIds.RUBY_LEGGINGS,
			Item::new,
			new Item.Properties().humanoidArmor(Armor.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)
					.durability(ArmorType.LEGGINGS.getDurability(Armor.RUBY_ARMOR_MATERIAL.durability()))
	);
	public static final Item RUBY_BOOTS = register(
			ModItemIds.RUBY_BOOTS,
			Item::new,
			new Item.Properties().humanoidArmor(Armor.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)
					.durability(ArmorType.BOOTS.getDurability(Armor.RUBY_ARMOR_MATERIAL.durability()))
	);
	// Get the event for modifying entries in the ingredients group.
	// And register an event handler that adds our suspicious item to the ingredients group.
	public static void Tabify(ResourceKey<CreativeModeTab> tab, Item item) {
	    CreativeModeTabEvents.modifyOutputEvent(tab)
 			.register((creativeTab) -> creativeTab.accept(item));
	}
	public static void initialize() {
	    Tabify(CreativeModeTabs.INGREDIENTS, RUBY);
	    Tabify(CreativeModeTabs.COMBAT, RUBY_SWORD);
	    Tabify(CreativeModeTabs.TOOLS_AND_UTILITIES, RUBY_PICKAXE);
	    Tabify(CreativeModeTabs.TOOLS_AND_UTILITIES, RUBY_SHOVEL);
	    Tabify(CreativeModeTabs.TOOLS_AND_UTILITIES, RUBY_HOE);
	    Tabify(CreativeModeTabs.COMBAT, RUBY_HELMET);
	    Tabify(CreativeModeTabs.COMBAT, RUBY_CHESTPLATE);
	    Tabify(CreativeModeTabs.COMBAT, RUBY_LEGGINGS);
	    Tabify(CreativeModeTabs.COMBAT, RUBY_BOOTS);
	}
}
