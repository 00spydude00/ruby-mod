package name.modid.rubymod.item;

import name.modid.rubymod.tags.ModTags;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAssets;
import java.util.Map;


public class Armor {
    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(
        37, // durability
        Map.of(
            ArmorType.HELMET, 3,
            ArmorType.CHESTPLATE, 8,
            ArmorType.LEGGINGS, 6,
            ArmorType.BOOTS, 3
        ), // defense
        15, // enchantability
        SoundEvents.ARMOR_EQUIP_DIAMOND,
        3.0f, // armor toughness
        0.1f, // knockback
        ModTags.REPAIRS_RUBY_ARMOR,
        ResourceKey.create(
            EquipmentAssets.ROOT_ID,
            Identifier.fromNamespaceAndPath("ruby-mod", "ruby_armor")
        )
    );


}
