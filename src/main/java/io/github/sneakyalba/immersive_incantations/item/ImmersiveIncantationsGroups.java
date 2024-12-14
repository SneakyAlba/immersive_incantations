package io.github.sneakyalba.immersive_incantations.item;

import io.github.sneakyalba.immersive_incantations.ImmersiveIncantations;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ImmersiveIncantationsGroups {
	public static final ItemGroup IMMERSIVE_INCANTATIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(ImmersiveIncantations.MOD_ID, "immersive_incantations"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.immersive_incantations"))
			.icon(()-> new ItemStack(ImmersiveIncantationsItems.ATHAME)).entries((context, entries) -> {
				entries.addItem(ImmersiveIncantationsItems.ATHAME);
				entries.addItem(ImmersiveIncantationsItems.BOLINE);
				entries.addItem(ImmersiveIncantationsItems.WAND);
			}).build());

	public static void registerItemGroups() {
		ImmersiveIncantations.LOGGER.info("Registering Item Groups for "+ImmersiveIncantations.MOD_ID);
	}
}
