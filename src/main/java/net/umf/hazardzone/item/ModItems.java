package net.umf.hazardzone.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.umf.hazardzone.HazardZone;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazardZone.MOD_ID);



    public static final DeferredItem<Item> CROWBAR = ITEMS.register("crowbar",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.hazardzone.crowbar.tooltip"));

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    public static final DeferredItem<Item> FLAREGUN = ITEMS.register("flaregun",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEALTHKIT = ITEMS.register("healthkit",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HAZARDOUS = ITEMS.register("hazardous",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
