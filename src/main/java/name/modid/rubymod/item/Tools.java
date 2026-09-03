package name.modid.rubymod.item;

import name.modid.rubymod.tags.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class Tools {
    public static final ToolMaterial RUBY_TOOL_MATERIAL = new ToolMaterial(
        BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
        2000, // dura
        11.0F, // mining speed
        3.0F, // damage
        22, // enchant
        ModTags.REPAIRS_RUBY_ARMOR
    );


}
