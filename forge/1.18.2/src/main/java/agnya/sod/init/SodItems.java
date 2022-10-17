package agnya.sod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import agnya.sod.Sod;

public class SodItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Sod.MODID);
	public static final RegistryObject<Item> DIRT_SOD_SLAB = block(SodBlocks.DIRT_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> DIRT_SOD_PATCH = block(SodBlocks.DIRT_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> GRASS_SOD_BLOCK = block(SodBlocks.GRASS_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> GRASS_SOD_SLAB = block(SodBlocks.GRASS_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> GRASS_SOD_PATCH = block(SodBlocks.GRASS_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> PATH_SOD_BLOCK = block(SodBlocks.PATH_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> PATH_SOD_SLAB = block(SodBlocks.PATH_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> PATH_SOD_PATCH = block(SodBlocks.PATH_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> MYCELIUM_SOD_BLOCK = block(SodBlocks.MYCELIUM_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> MYCELIUM_SOD_SLAB = block(SodBlocks.MYCELIUM_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> MYCELIUM_SOD_PATCH = block(SodBlocks.MYCELIUM_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> PODZOL_SOD_BLOCK = block(SodBlocks.PODZOL_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> PODZOL_SOD_SLAB = block(SodBlocks.PODZOL_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> PODZOL_SOD_PATCH = block(SodBlocks.PODZOL_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> CRIMSON_NYLIUM_SOD_BLOCK = block(SodBlocks.CRIMSON_NYLIUM_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> CRIMSON_NYLIUM_SOD_SLAB = block(SodBlocks.CRIMSON_NYLIUM_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> CRIMSON_NYLIUM_SOD_PATCH = block(SodBlocks.CRIMSON_NYLIUM_SOD_PATCH, Sod.TAB_SOD);
	public static final RegistryObject<Item> WARPED_NYLIUM_SOD_BLOCK = block(SodBlocks.WARPED_NYLIUM_SOD_BLOCK, Sod.TAB_SOD);
	public static final RegistryObject<Item> WARPED_NYLIUM_SOD_SLAB = block(SodBlocks.WARPED_NYLIUM_SOD_SLAB, Sod.TAB_SOD);
	public static final RegistryObject<Item> WARPED_NYLIUM_SOD_PATCH = block(SodBlocks.WARPED_NYLIUM_SOD_PATCH, Sod.TAB_SOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
