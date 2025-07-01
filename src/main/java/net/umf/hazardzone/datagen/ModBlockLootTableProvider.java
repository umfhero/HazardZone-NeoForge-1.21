package net.umf.hazardzone.datagen;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.umf.hazardzone.HazardZone;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider{
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        dropSelf(HazardZone.RUSTY_BLOCK.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return HazardZone.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
