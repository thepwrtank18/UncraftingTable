package net.thetank.uncraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class UncraftingTable implements ModInitializer 
{
	public static final [...]
	
	public void onInitialize() { 	
		Block UNCRAFTING_TABLE = new Block(FabricBlockSettings.of(Material.STONE));
		[...]
	}
}