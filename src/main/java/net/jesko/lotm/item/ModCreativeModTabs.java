package net.jesko.lotm.item;

import net.jesko.lotm.LOTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB , LOTM.MODID);
    public static final RegistryObject<CreativeModeTab> LOTM_TAB = CREATIVE_MODE_TABS.register("lotm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.hunter_potion.get()))
                    .title(Component.translatable("creativetab.lotm_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.hunter_potion.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

