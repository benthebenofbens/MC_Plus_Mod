package com.btbob.mcplus.datagen.loot;

import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NatureLootTables extends BlockLootSubProvider {

    public NatureLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(NatureBlocks.MUSHROOM_GROWING_BOX.get());

        this.dropSelf(NatureBlocks.CHICKEN_OF_THE_WOODS.get());
        this.dropSelf(NatureBlocks.WOODY_CHICKEN_OF_THE_WOODS.get());
        this.dropSelf(NatureBlocks.FIRE_CORAL.get());

        this.dropSelf(NatureBlocks.AFUNGUS.get());
        this.add(NatureBlocks.POTTED_AFUNGUS.get(), createPotFlowerItemTable(NatureBlocks.AFUNGUS.get()));
        this.dropSelf(NatureBlocks.DEADLY_AFUNGUS.get());
        this.add(NatureBlocks.POTTED_DEADLY_AFUNGUS.get(), createPotFlowerItemTable(NatureBlocks.DEADLY_AFUNGUS.get()));





    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NatureBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
