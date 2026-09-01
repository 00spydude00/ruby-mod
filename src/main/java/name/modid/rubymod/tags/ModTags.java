package name.modid.rubymod.tags;

import name.modid.rubymod.RubyMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = TagKey.create(
        BuiltInRegistries.ITEM.key(),
        Identifier.fromNamespaceAndPath(
            RubyMod.MOD_ID,
            "repairs_ruby_armor"
        )
    );

}
