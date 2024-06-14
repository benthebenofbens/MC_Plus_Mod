package com.btbob.mcplus.datagen.loot;

import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NatureLootTables extends BlockLootSubProvider {

    public NatureLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(NatureBlocks.MUSHROOM_GROWING_BOX.get());

        //PUFFBALLS
        this.dropSelf(NatureBlocks.GIANT_PUFFBALL.get());
        this.add(NatureBlocks.POTTED_GIANT_PUFFBALL.get(), createPotFlowerItemTable(NatureBlocks.GIANT_PUFFBALL.get()));
        this.dropSelf(NatureBlocks.INDIGO_MILKCAP.get());
        this.add(NatureBlocks.POTTED_INDIGO_MILKCAP.get(), createPotFlowerItemTable(NatureBlocks.INDIGO_MILKCAP.get()));
        this.dropSelf(NatureBlocks.DESERT_SHAGGY_MANE.get());
        this.add(NatureBlocks.POTTED_DESERT_SHAGGY_MANE.get(), createPotFlowerItemTable(NatureBlocks.DESERT_SHAGGY_MANE.get()));
        this.dropSelf(NatureBlocks.PORTABELLA.get());
        this.add(NatureBlocks.POTTED_PORTABELLA.get(), createPotFlowerItemTable(NatureBlocks.PORTABELLA.get()));
        this.dropSelf(NatureBlocks.SANDY_STILTBALL.get());
        this.add(NatureBlocks.POTTED_SANDY_STILTBALL.get(), createPotFlowerItemTable(NatureBlocks.SANDY_STILTBALL.get()));
        this.dropSelf(NatureBlocks.DEATH_CAP.get());
        this.add(NatureBlocks.POTTED_DEATH_CAP.get(), createPotFlowerItemTable(NatureBlocks.DEATH_CAP.get()));
        this.dropSelf(NatureBlocks.DESTROYING_ANGEL.get());
        this.add(NatureBlocks.POTTED_DESTROYING_ANGEL.get(), createPotFlowerItemTable(NatureBlocks.DESTROYING_ANGEL.get()));
        this.dropSelf(NatureBlocks.EARTHBALL.get());
        this.add(NatureBlocks.POTTED_EARTHBALL.get(), createPotFlowerItemTable(NatureBlocks.EARTHBALL.get()));
        this.dropSelf(NatureBlocks.FALSE_DEATH_CAP.get());
        this.add(NatureBlocks.POTTED_FALSE_DEATH_CAP.get(), createPotFlowerItemTable(NatureBlocks.FALSE_DEATH_CAP.get()));
        this.dropSelf(NatureBlocks.BLACK_TRUFFLE.get());
        this.add(NatureBlocks.POTTED_BLACK_TRUFFLE.get(), createPotFlowerItemTable(NatureBlocks.BLACK_TRUFFLE.get()));
        this.dropSelf(NatureBlocks.LILAC_BONNETS.get());
        this.add(NatureBlocks.POTTED_LILAC_BONNETS.get(), createPotFlowerItemTable(NatureBlocks.LILAC_BONNETS.get()));
        this.dropSelf(NatureBlocks.BASKET_STINKHORN.get());
        this.add(NatureBlocks.POTTED_BASKET_STINKHORN.get(), createPotFlowerItemTable(NatureBlocks.BASKET_STINKHORN.get()));
        this.dropSelf(NatureBlocks.FIRE_CORAL.get());
        this.add(NatureBlocks.POTTED_FIRE_CORAL.get(), createPotFlowerItemTable(NatureBlocks.FIRE_CORAL.get()));
        this.dropSelf(NatureBlocks.GLOWING_MUSHROOMS.get());
        this.add(NatureBlocks.POTTED_GLOWING_MUSHROOMS.get(), createPotFlowerItemTable(NatureBlocks.GLOWING_MUSHROOMS.get()));
        this.dropSelf(NatureBlocks.YELLOW_PARASOLS.get());
        this.add(NatureBlocks.POTTED_YELLOW_PARASOLS.get(), createPotFlowerItemTable(NatureBlocks.YELLOW_PARASOLS.get()));
        this.dropSelf(NatureBlocks.INKY_CAP.get());
        this.add(NatureBlocks.POTTED_INKY_CAP.get(), createPotFlowerItemTable(NatureBlocks.INKY_CAP.get()));
        this.dropSelf(NatureBlocks.GRAY_MOREL.get());
        this.add(NatureBlocks.POTTED_GRAY_MOREL.get(), createPotFlowerItemTable(NatureBlocks.GRAY_MOREL.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NatureBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
