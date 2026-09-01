package name.modid.rubymod.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import name.modid.rubymod.RubyMod;

public class ModItemIds {
    public static ResourceKey<Item> create(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name));
	}
	public static final ResourceKey<Item> RUBY = create("ruby");
	public static final ResourceKey<Item> RUBY_SWORD = create("ruby_sword");
	public static final ResourceKey<Item> RUBY_PICKAXE = create("ruby_pickaxe");
	public static void initialize() {

	}
}
