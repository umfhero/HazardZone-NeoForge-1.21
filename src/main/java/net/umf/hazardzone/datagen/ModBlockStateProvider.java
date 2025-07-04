package net.umf.hazardzone.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.umf.hazardzone.HazardZone;
import net.umf.hazardzone.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HazardZone.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUSTY_BLOCK);

        // Iron grate and scaffold blocks with cutout render type
        simpleBlockWithItem(ModBlocks.IRON_GRATE.get(),
            models().cubeAll("iron_grate", blockTexture(ModBlocks.IRON_GRATE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.IRON_SCAFFOLD.get(),
            models().cubeAll("iron_scaffold", blockTexture(ModBlocks.IRON_SCAFFOLD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.RUSTED_IRON_GRATE.get(),
            models().cubeAll("rusted_iron_grate", blockTexture(ModBlocks.RUSTED_IRON_GRATE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.RUSTED_IRON_SCAFFOLD.get(),
            models().cubeAll("rusted_iron_scaffold", blockTexture(ModBlocks.RUSTED_IRON_SCAFFOLD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WEATHERED_IRON_GRATE.get(),
            models().cubeAll("weathered_iron_grate", blockTexture(ModBlocks.WEATHERED_IRON_GRATE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WEATHERED_IRON_SCAFFOLD.get(),
            models().cubeAll("weathered_iron_scaffold", blockTexture(ModBlocks.WEATHERED_IRON_SCAFFOLD.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}