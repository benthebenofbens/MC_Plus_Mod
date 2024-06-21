package com.btbob.mcplus.datagen.loot;

import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NatureLootTables extends BlockLootSubProvider {

    public NatureLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(NatureBlocks.MUSHROOM_GROWING_BOX.get());
        this.add(NatureBlocks.MYCELIATED_DIRT.get(), createSingleItemTableWithSilkTouch(NatureBlocks.MYCELIATED_DIRT.get(), Blocks.DIRT));

        this.dropSelf(NatureBlocks.CHICKEN_OF_THE_WOODS.get());

        this.add(NatureBlocks.FIRE_CORAL.get(), createSingleItemTable(MCPlusItems.FIRE_CORAL.get()));
        this.add(NatureBlocks.FIRE_CORAL_WALL.get(), createSingleItemTable(MCPlusItems.FIRE_CORAL.get()));

        this.dropSelf(NatureBlocks.AFUNGUS.get());
        this.add(NatureBlocks.POTTED_AFUNGUS.get(), createPotFlowerItemTable(NatureBlocks.AFUNGUS.get()));
        LootItemCondition.Builder mushroomRottedCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NatureBlocks.AFUNGUS_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MushroomCropBlock.AGE, 4));
        LootItemCondition.Builder mushroomPerfectCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NatureBlocks.AFUNGUS_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MushroomCropBlock.AGE, 3));
        this.add(NatureBlocks.AFUNGUS_CROP.get(), createMushroomCropDrops(NatureBlocks.AFUNGUS_CROP.get(), NatureBlocks.AFUNGUS.get().asItem(), mushroomPerfectCondition, NatureBlocks.AFUNGUS.get().asItem(), mushroomRottedCondition));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NatureBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createMushroomCropDrops(Block pCropBlock, Item pGrownCropItem, LootItemCondition.Builder pDropGrownCropCondition, Item pRottenCropItem, LootItemCondition.Builder pRottenCropCondition) {
        return this.applyExplosionDecay(pCropBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pGrownCropItem).when(pDropGrownCropCondition)).add(LootItem.lootTableItem(pRottenCropItem).when(pRottenCropCondition))));
    }
}
