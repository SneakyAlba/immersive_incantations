package io.github.sneakyalba.immersive_incantations;

import io.github.sneakyalba.immersive_incantations.item.ImmersiveIncantationsGroups;
import io.github.sneakyalba.immersive_incantations.item.ImmersiveIncantationsItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveIncantations implements ModInitializer {
	public static final String MOD_ID = "immersive_incantations";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
		ImmersiveIncantationsGroups.registerItemGroups();
		ImmersiveIncantationsItems.registerImmersiveIncantationsItems();
    }
}
