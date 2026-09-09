package name.modid.rubymod.item;

import name.modid.rubymod.RubyMod;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;


public class ModBlockItemIds {
    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name);
        return BlockItemId.create(id, id);
    }

    public static final BlockItemId RUBY_ORE = create("ruby_ore");

}
