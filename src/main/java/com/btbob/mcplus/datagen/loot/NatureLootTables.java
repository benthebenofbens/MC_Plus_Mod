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
        LootItemCondition.Builder mushroomRottedCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NatureBlocks.AFUNGUS_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MushroomCropBlock.AGE, 4));
        LootItemCondition.Builder mushroomPerfectCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NatureBlocks.AFUNGUS_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(MushroomCropBlock.AGE, 3));


        this.dropSelf(NatureBlocks.MUSHROOM_GROWING_BOX.get());

        this.add(NatureBlocks.CHICKEN_OF_THE_WOODS.get(), createSingleItemTable(MCPlusItems.CHICKEN_OF_THE_WOODS.get()));
        this.add(NatureBlocks.CHICKEN_OF_THE_WOODS_SHELF.get(), createSingleItemTable(MCPlusItems.CHICKEN_OF_THE_WOODS.get()));
        this.add(NatureBlocks.CHICKEN_OF_THE_WOODS_CROP.get(), noDrop());

        this.add(NatureBlocks.WOODEAR.get(), createSingleItemTable(MCPlusItems.WOODEAR.get()));
        this.add(NatureBlocks.WOODEAR_SHELF.get(), createSingleItemTable(MCPlusItems.WOODEAR.get()));
        this.add(NatureBlocks.WOODEAR_CROP.get(), noDrop());

        this.add(NatureBlocks.OYSTER.get(), createSingleItemTable(MCPlusItems.OYSTER.get()));
        this.add(NatureBlocks.OYSTER_SHELF.get(), createSingleItemTable(MCPlusItems.OYSTER.get()));
        this.add(NatureBlocks.OYSTER_CROP.get(), noDrop());

        this.add(NatureBlocks.GLOWING_MUSHROOM.get(), createSingleItemTable(MCPlusItems.GLOWING_MUSHROOM.get()));
        this.add(NatureBlocks.GLOWING_MUSHROOM_WALL.get(), createSingleItemTable(MCPlusItems.GLOWING_MUSHROOM.get()));
   //     this.add(NatureBlocks.GLOWING_MUSHROOM_CROP.get(), noDrop());

        this.add(NatureBlocks.DESERT_SHAGGY_MANE.get(), createSingleItemTable(MCPlusItems.DESERT_SHAGGY_MANE.get()));
        this.add(NatureBlocks.DESERT_SHAGGY_MANE_WALL.get(), createSingleItemTable(MCPlusItems.DESERT_SHAGGY_MANE.get()));
        this.add(NatureBlocks.DESERT_SHAGGY_MANE_CROP.get(), noDrop());

        this.add(NatureBlocks.MAITAKE.get(), createSingleItemTable(MCPlusItems.MAITAKE.get()));
        this.add(NatureBlocks.MAITAKE_SHELF.get(), createSingleItemTable(MCPlusItems.MAITAKE.get()));
        this.add(NatureBlocks.MAITAKE_CROP.get(), noDrop());

        this.add(NatureBlocks.FIRE_CORAL.get(), createSingleItemTable(MCPlusItems.FIRE_CORAL.get()));
        this.add(NatureBlocks.FIRE_CORAL_WALL.get(), createSingleItemTable(MCPlusItems.FIRE_CORAL.get()));
        this.add(NatureBlocks.FIRE_CORAL_CROP.get(), noDrop());

        this.add(NatureBlocks.YAKOTAKE.get(), createSingleItemTable(MCPlusItems.YAKOTAKE.get()));
        this.add(NatureBlocks.YAKOTAKE_WALL.get(), createSingleItemTable(MCPlusItems.YAKOTAKE.get()));
        this.add(NatureBlocks.YAKOTAKE_CROP.get(), noDrop());

        this.add(NatureBlocks.GOLDEN_HALO.get(), createSingleItemTable(MCPlusItems.GOLDEN_HALO.get()));
        this.add(NatureBlocks.GOLDEN_HALO_WALL.get(), createSingleItemTable(MCPlusItems.GOLDEN_HALO.get()));
        this.add(NatureBlocks.GOLDEN_HALO_CROP.get(), noDrop());

         this.add(NatureBlocks.HONEY_FUNGUS.get(), createSingleItemTable(MCPlusItems.HONEY_FUNGUS.get()));
        this.add(NatureBlocks.HONEY_FUNGUS_WALL.get(), createSingleItemTable(MCPlusItems.HONEY_FUNGUS.get()));
        this.add(NatureBlocks.HONEY_FUNGUS_CROP.get(), noDrop());

        this.add(NatureBlocks.SUBBS.get(), createSingleItemTable(MCPlusItems.SUBBS.get()));
        this.add(NatureBlocks.SUBBS_WALL.get(), createSingleItemTable(MCPlusItems.SUBBS.get()));
        this.add(NatureBlocks.SUBBS_CROP.get(), noDrop());

        this.add(NatureBlocks.INKY_CAP.get(), createSingleItemTable(MCPlusItems.INKY_CAP.get()));
        this.add(NatureBlocks.INKY_CAP_WALL.get(), createSingleItemTable(MCPlusItems.INKY_CAP.get()));
        this.add(NatureBlocks.INKY_CAP_CROP.get(), noDrop());

        this.add(NatureBlocks.BASKET_STINKHORN.get(), createSingleItemTable(MCPlusItems.BASKET_STINKHORN.get()));
        this.add(NatureBlocks.BASKET_STINKHORN_WALL.get(), createSingleItemTable(MCPlusItems.BASKET_STINKHORN.get()));
        this.add(NatureBlocks.BASKET_STINKHORN_CROP.get(), noDrop());

        this.add(NatureBlocks.DEATH_CAP.get(), createSingleItemTable(MCPlusItems.DEATH_CAP.get()));
        this.add(NatureBlocks.DEATH_CAP_WALL.get(), createSingleItemTable(MCPlusItems.DEATH_CAP.get()));
        this.add(NatureBlocks.DEATH_CAP_CROP.get(), noDrop());

        this.add(NatureBlocks.DESTROYING_ANGEL.get(), createSingleItemTable(MCPlusItems.DESTROYING_ANGEL.get()));
        this.add(NatureBlocks.DESTROYING_ANGEL_WALL.get(), createSingleItemTable(MCPlusItems.DESTROYING_ANGEL.get()));
        this.add(NatureBlocks.DESTROYING_ANGEL_CROP.get(), noDrop());

        this.add(NatureBlocks.FALSE_DEATH_CAP.get(), createSingleItemTable(MCPlusItems.FALSE_DEATH_CAP.get()));
        this.add(NatureBlocks.FALSE_DEATH_CAP_WALL.get(), createSingleItemTable(MCPlusItems.FALSE_DEATH_CAP.get()));
        this.add(NatureBlocks.FALSE_DEATH_CAP_CROP.get(), noDrop());

        this.add(NatureBlocks.FLY_AGARIC.get(), createSingleItemTable(MCPlusItems.FLY_AGARIC.get()));
        this.add(NatureBlocks.FLY_AGARIC_WALL.get(), createSingleItemTable(MCPlusItems.FLY_AGARIC.get()));
        this.add(NatureBlocks.FLY_AGARIC_CROP.get(), noDrop());

        this.add(NatureBlocks.GRAY_MOREL.get(), createSingleItemTable(MCPlusItems.GRAY_MOREL.get()));
        this.add(NatureBlocks.GRAY_MOREL_WALL.get(), createSingleItemTable(MCPlusItems.GRAY_MOREL.get()));
        this.add(NatureBlocks.GRAY_MOREL_CROP.get(), noDrop());

        this.add(NatureBlocks.INDIGO_MILKCAP.get(), createSingleItemTable(MCPlusItems.INDIGO_MILKCAP.get()));
        this.add(NatureBlocks.INDIGO_MILKCAP_WALL.get(), createSingleItemTable(MCPlusItems.INDIGO_MILKCAP.get()));
        this.add(NatureBlocks.INDIGO_MILKCAP_CROP.get(), noDrop());

        this.add(NatureBlocks.LILAC_BONNET.get(), createSingleItemTable(MCPlusItems.LILAC_BONNET.get()));
        this.add(NatureBlocks.LILAC_BONNET_WALL.get(), createSingleItemTable(MCPlusItems.LILAC_BONNET.get()));
        this.add(NatureBlocks.LILAC_BONNET_CROP.get(), noDrop());

        this.add(NatureBlocks.PORTABELLA.get(), createSingleItemTable(MCPlusItems.PORTABELLA.get()));
        this.add(NatureBlocks.PORTABELLA_WALL.get(), createSingleItemTable(MCPlusItems.PORTABELLA.get()));
        this.add(NatureBlocks.PORTABELLA_CROP.get(), noDrop());

        this.add(NatureBlocks.SANDY_STILTBALL.get(), createSingleItemTable(MCPlusItems.SANDY_STILTBALL.get()));
        this.add(NatureBlocks.SANDY_STILTBALL_WALL.get(), createSingleItemTable(MCPlusItems.SANDY_STILTBALL.get()));
        this.add(NatureBlocks.SANDY_STILTBALL_CROP.get(), noDrop());

        this.add(NatureBlocks.YELLOW_PARASOL.get(), createSingleItemTable(MCPlusItems.YELLOW_PARASOL.get()));
        this.add(NatureBlocks.YELLOW_PARASOL_WALL.get(), createSingleItemTable(MCPlusItems.YELLOW_PARASOL.get()));
        this.add(NatureBlocks.YELLOW_PARASOL_CROP.get(), noDrop());


        this.add(NatureBlocks.AFUNGUS.get(), createSingleItemTable(MCPlusItems.AFUNGUS.get()));
         this.add(NatureBlocks.AFUNGUS_CROP.get(), createMushroomCropDrops(NatureBlocks.AFUNGUS_CROP.get(), NatureBlocks.AFUNGUS.get().asItem(), mushroomPerfectCondition, NatureBlocks.AFUNGUS.get().asItem(), mushroomRottedCondition));

        this.add(NatureBlocks.GIANT_PUFFBALL.get(), createSingleItemTable(MCPlusItems.CHICKEN_OF_THE_WOODS.get()));
        this.add(NatureBlocks.GIANT_PUFFBALL_CROP.get(), createMushroomCropDrops(NatureBlocks.GIANT_PUFFBALL_CROP.get(), MCPlusItems.GIANT_PUFFBALL.get(), mushroomPerfectCondition, MCPlusItems.GIANT_PUFFBALL_SPORES.get(), mushroomRottedCondition));

        this.add(NatureBlocks.LIONS_MANE.get(), createSingleItemTable(MCPlusItems.LIONS_MANE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NatureBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createMushroomCropDrops(Block pCropBlock, Item pGrownCropItem, LootItemCondition.Builder pDropGrownCropCondition, Item pRottenCropItem, LootItemCondition.Builder pRottenCropCondition) {
        return this.applyExplosionDecay(pCropBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pGrownCropItem).when(pDropGrownCropCondition)).add(LootItem.lootTableItem(pRottenCropItem).when(pRottenCropCondition))));
    }
}
