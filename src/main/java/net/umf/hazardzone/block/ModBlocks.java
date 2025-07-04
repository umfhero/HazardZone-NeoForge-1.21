package net.umf.hazardzone.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.umf.hazardzone.HazardZone;
import net.umf.hazardzone.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HazardZone.MOD_ID);




    public static final DeferredBlock<Block> RUSTY_BLOCK = registerBlock("rusty_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO).strength(3f).requiresCorrectToolForDrops()));




    public static final DeferredBlock<Block> IRON_GRATE = registerBlock("iron_grate",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> IRON_SCAFFOLD = registerBlock("iron_scaffold",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(4f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> RUSTED_IRON_GRATE = registerBlock("rusted_iron_grate",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> RUSTED_IRON_SCAFFOLD = registerBlock("rusted_iron_scaffold",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> WEATHERED_IRON_GRATE = registerBlock("weathered_iron_grate",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2.5f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> WEATHERED_IRON_SCAFFOLD = registerBlock("weathered_iron_scaffold",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2.5f).requiresCorrectToolForDrops().noOcclusion()));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
