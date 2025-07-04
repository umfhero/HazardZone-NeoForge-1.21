package net.umf.hazardzone.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.umf.hazardzone.HazardZone;
import org.jetbrains.annotations.Nullable;
import net.umf.hazardzone.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HazardZone.MOD_ID, existingFileHelper);
    }




    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUSTY_BLOCK.get())
                .add(ModBlocks.IRON_GRATE.get())
                .add(ModBlocks.IRON_SCAFFOLD.get())
                .add(ModBlocks.RUSTED_IRON_GRATE.get())
                .add(ModBlocks.RUSTED_IRON_SCAFFOLD.get())
                .add(ModBlocks.WEATHERED_IRON_GRATE.get())
                .add(ModBlocks.WEATHERED_IRON_SCAFFOLD.get());
    }
}
