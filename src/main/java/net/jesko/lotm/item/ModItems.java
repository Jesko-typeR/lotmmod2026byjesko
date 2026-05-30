package net.jesko.lotm.item;

import net.jesko.lotm.LOTM;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, LOTM.MODID);

    public static final RegistryObject<Item> hunter_potion = ITEMS.register("hunter_potion",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

