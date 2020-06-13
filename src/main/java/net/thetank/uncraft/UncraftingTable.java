package net.thetank.uncraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class UncraftingTable implements ModInitializer 
{
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		// an instance of the great table
		public static final Block UNCRAFTING_TABLE = new Block(FabricBlockSettings.of(Material.STONE).build());
		[...]
	}
}
