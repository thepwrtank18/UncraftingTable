package net.thetank.uncraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Uncrafting implements ModInitializer {
 
    /* Declare and initialize our custom block instance.
       We set out block material to METAL, which requires a pickaxe to efficiently break.
       Hardness represents how long the break takes to break. Stone has a hardness of 1.5f, while Obsidian has a hardness of 50.0f.
    */
    public static final Block UNCRAFTING_TABLE = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.5f));
 
    @Override
    public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("uncrafting", "uncrafting_table"), UNCRAFTING_TABLE);
    Registry.register(Registry.ITEM, new Identifier("uncrafting", "uncrafting_table"), new BlockItem(UNCRAFTING_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}


// Is VS Code giving me a hint on COMMENTS? Really?