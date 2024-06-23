package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.MCPlusItems;
import com.btbob.mcplus.util.MCPlusTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends ItemTagsProvider {
    public ItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, MCPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(MCPlusTags.Items.SMALL_MUSHROOMS).add(
                MCPlusItems.AFUNGUS.get().asItem(),
                MCPlusItems.GOLDEN_HALO.get().asItem(),
                MCPlusItems.HONEY_FUNGUS.get().asItem(),
                MCPlusItems.SUBBS.get().asItem(),
                MCPlusItems.GIANT_PUFFBALL.get().asItem(),
                MCPlusItems.FIRE_CORAL.get().asItem(),
                MCPlusItems.GLOWING_MUSHROOM.get().asItem(),
                MCPlusItems.MAITAKE.get().asItem(),
                MCPlusItems.DESERT_SHAGGY_MANE.get().asItem(),
                MCPlusItems.INDIGO_MILKCAP.get().asItem(),
                MCPlusItems.OYSTER.get().asItem(),
                MCPlusItems.LIONS_MANE.get().asItem(),
                MCPlusItems.BASKET_STINKHORN.get().asItem(),
                MCPlusItems.DEATH_CAP.get().asItem(),
                MCPlusItems.DESTROYING_ANGEL.get().asItem(),
                MCPlusItems.FALSE_DEATH_CAP.get().asItem(),
                MCPlusItems.FLY_AGARIC.get().asItem(),
                MCPlusItems.GRAY_MOREL.get().asItem(),
                MCPlusItems.LILAC_BONNET.get().asItem(),
                MCPlusItems.PORTABELLA.get().asItem(),
                MCPlusItems.SANDY_STILTBALL.get().asItem(),
                MCPlusItems.YELLOW_PARASOL.get().asItem(),
                MCPlusItems.YAKOTAKE.get().asItem(),
                MCPlusItems.WOODEAR.get().asItem()
        );

        this.tag(MCPlusTags.Items.SPORES).add(
                MCPlusItems.AFUNGUS_SPORES.get().asItem(),
                MCPlusItems.GOLDEN_HALO_SPORES.get().asItem(),
                MCPlusItems.HONEY_FUNGUS_SPORES.get().asItem(),
                MCPlusItems.SUBBS_SPORES.get().asItem(),
                MCPlusItems.FIRE_CORAL_SPORES.get().asItem(),
                MCPlusItems.GIANT_PUFFBALL_SPORES.get().asItem(),
                MCPlusItems.GLOWING_MUSHROOM_SPORES.get().asItem(),
                MCPlusItems.MAITAKE_SPORES.get().asItem(),
                MCPlusItems.DESERT_SHAGGY_MANE_SPORES.get().asItem(),
                MCPlusItems.OYSTER_SPORES.get().asItem(),
                MCPlusItems.LIONS_MANE_SPORES.get().asItem(),
                MCPlusItems.BASKET_STINKHORN_SPORES.get().asItem(),
                MCPlusItems.DEATH_CAP_SPORES.get().asItem(),
                MCPlusItems.DESTROYING_ANGEL_SPORES.get().asItem(),
                MCPlusItems.FALSE_DEATH_CAP_SPORES.get().asItem(),
                MCPlusItems.FLY_AGARIC_SPORES.get().asItem(),
                MCPlusItems.GRAY_MOREL_SPORES.get().asItem(),
                MCPlusItems.INDIGO_MILKCAP_SPORES.get().asItem(),
                MCPlusItems.LILAC_BONNET_SPORES.get().asItem(),
                MCPlusItems.PORTABELLA_SPORES.get().asItem(),
                MCPlusItems.SANDY_STILTBALL_SPORES.get().asItem(),
                MCPlusItems.YELLOW_PARASOL_SPORES.get().asItem(),
                MCPlusItems.YAKOTAKE_SPORES.get().asItem(),
                MCPlusItems.WOODEAR_SPORES.get().asItem()
        );


    }

}
