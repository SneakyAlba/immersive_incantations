package io.github.sneakyalba.immersive_incantations.item;

import io.github.sneakyalba.immersive_incantations.ImmersiveIncantations;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ImmersiveIncantationsItems {
	public static final Item WAND = registerItem("wand", new Item(new FabricItemSettings()));
	public static final Item ATHAME = registerItem("athame", new AthameItem(ToolMaterials.GOLD,1,-2, new FabricItemSettings()));
	public static final Item BOLINE = registerItem("boline", new BolineItem(ToolMaterials.IRON, 3, -2, new FabricItemSettings()));

	private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
		entries.addItem(WAND);
	}

    private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(ImmersiveIncantations.MOD_ID, name), item);
	}

	public static void registerImmersiveIncantationsItems() {
		ImmersiveIncantations.LOGGER.info("Registering mod items for " + ImmersiveIncantations.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(ImmersiveIncantationsItems::addItemsToToolsItemGroup);
	}
}
