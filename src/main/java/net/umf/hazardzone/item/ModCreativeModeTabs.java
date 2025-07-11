package net.umf.hazardzone.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.umf.hazardzone.HazardZone;
import net.umf.hazardzone.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazardZone.MOD_ID);

    public static final Supplier<CreativeModeTab> HAZARDZONE_ITEMS_TAB = CREATIVE_MODE_TAB.register("hazard_items_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.HAZARDOUS.get())).title(Component.translatable("creativetab.hazardzone_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CROWBAR);
                output.accept(ModItems.FLAREGUN);
                output.accept(ModItems.HEALTHKIT);
                output.accept(ModBlocks.RUSTY_BLOCK);
                output.accept(ModBlocks.IRON_GRATE);
                output.accept(ModBlocks.IRON_SCAFFOLD);
                output.accept(ModBlocks.RUSTED_IRON_GRATE);
                output.accept(ModBlocks.RUSTED_IRON_SCAFFOLD);
                output.accept(ModBlocks.WEATHERED_IRON_GRATE);
                output.accept(ModBlocks.WEATHERED_IRON_SCAFFOLD);

            }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
