package name.modid.rubymod.item;

import name.modid.rubymod.tags.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class Tools {
    public static final ToolMaterial RUBY_TOOL_MATERIAL = new ToolMaterial(
        BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
        2000,
        9.0F,
        3.0F,
        22,
        ModTags.REPAIRS_RUBY_ARMOR
    );


}
