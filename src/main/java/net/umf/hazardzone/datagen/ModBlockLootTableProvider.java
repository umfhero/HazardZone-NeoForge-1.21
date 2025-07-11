package net.umf.hazardzone.datagen;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.umf.hazardzone.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider{
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUSTY_BLOCK.get());
        dropSelf(ModBlocks.IRON_GRATE.get());
        dropSelf(ModBlocks.IRON_SCAFFOLD.get());
        dropSelf(ModBlocks.RUSTED_IRON_GRATE.get());
        dropSelf(ModBlocks.RUSTED_IRON_SCAFFOLD.get());
        dropSelf(ModBlocks.WEATHERED_IRON_GRATE.get());
        dropSelf(ModBlocks.WEATHERED_IRON_SCAFFOLD.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
