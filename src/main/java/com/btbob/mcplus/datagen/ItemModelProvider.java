package com.btbob.mcplus.datagen;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.MCPlusBlocks;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MCPlus.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(MCPlusBlocks.GNEISS_WALL, MCPlusBlocks.GNEISS);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_STAIRS);
        wallItem(MCPlusBlocks.COBBLED_GNEISS_WALL, MCPlusBlocks.COBBLED_GNEISS);
        evenSimplerBlockItem(MCPlusBlocks.COBBLED_GNEISS_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.COBBLED_GNEISS_STAIRS);
        wallItem(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_WALL, MCPlusBlocks.ENERGIZED_COBBLED_GNEISS);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS_STAIRS);
        wallItem(MCPlusBlocks.GNEISS_BRICK_WALL, MCPlusBlocks.GNEISS_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_BRICK_STAIRS);
        wallItem(MCPlusBlocks.CRACKED_GNEISS_BRICK_WALL, MCPlusBlocks.CRACKED_GNEISS_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_GNEISS_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_GNEISS_BRICK_STAIRS);
        wallItem(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_WALL, MCPlusBlocks.ENERGIZED_GNEISS_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_GNEISS_BRICK_STAIRS);
        wallItem(MCPlusBlocks.GNEISS_TILE_WALL, MCPlusBlocks.GNEISS_TILES);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.GNEISS_TILE_STAIRS);
        wallItem(MCPlusBlocks.CRACKED_GNEISS_TILE_WALL, MCPlusBlocks.CRACKED_GNEISS_TILES);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_GNEISS_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_GNEISS_TILE_STAIRS);
        wallItem(MCPlusBlocks.ENERGIZED_GNEISS_TILE_WALL, MCPlusBlocks.ENERGIZED_GNEISS_TILES);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_GNEISS_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.ENERGIZED_GNEISS_TILE_STAIRS);
        wallItem(MCPlusBlocks.POLISHED_GNEISS_WALL, MCPlusBlocks.POLISHED_GNEISS);
        evenSimplerBlockItem(MCPlusBlocks.POLISHED_GNEISS_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.POLISHED_GNEISS_STAIRS);
        wallItem(MCPlusBlocks.SMOOTH_GNEISS_WALL, MCPlusBlocks.SMOOTH_GNEISS);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_GNEISS_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_GNEISS_STAIRS);

        //SLATE
        wallItem(MCPlusBlocks.SLATE_WALL, MCPlusBlocks.SLATE);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_STAIRS);
        wallItem(MCPlusBlocks.COBBLED_SLATE_WALL, MCPlusBlocks.COBBLED_SLATE);
        evenSimplerBlockItem(MCPlusBlocks.COBBLED_SLATE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.COBBLED_SLATE_STAIRS);
        wallItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_WALL, MCPlusBlocks.BEDAZZLED_COBBLED_SLATE);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE_STAIRS);
        wallItem(MCPlusBlocks.SLATE_BRICK_WALL, MCPlusBlocks.SLATE_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_BRICK_STAIRS);
        wallItem(MCPlusBlocks.CRACKED_SLATE_BRICK_WALL, MCPlusBlocks.CRACKED_SLATE_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_SLATE_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_SLATE_BRICK_STAIRS);
        wallItem(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_WALL, MCPlusBlocks.BEDAZZLED_SLATE_BRICKS);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_SLATE_BRICK_STAIRS);
        wallItem(MCPlusBlocks.SLATE_TILE_WALL, MCPlusBlocks.SLATE_TILES);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SLATE_TILE_STAIRS);
        wallItem(MCPlusBlocks.CRACKED_SLATE_TILE_WALL, MCPlusBlocks.CRACKED_SLATE_TILES);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_SLATE_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.CRACKED_SLATE_TILE_STAIRS);
        wallItem(MCPlusBlocks.BEDAZZLED_SLATE_TILE_WALL, MCPlusBlocks.BEDAZZLED_SLATE_TILES);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_SLATE_TILE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.BEDAZZLED_SLATE_TILE_STAIRS);
        wallItem(MCPlusBlocks.POLISHED_SLATE_WALL, MCPlusBlocks.POLISHED_SLATE);
        evenSimplerBlockItem(MCPlusBlocks.POLISHED_SLATE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.POLISHED_SLATE_STAIRS);
        wallItem(MCPlusBlocks.SMOOTH_SLATE_WALL, MCPlusBlocks.SMOOTH_SLATE);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_SLATE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_SLATE_STAIRS);


        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_MARBLE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_CHERT_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_LIMESTONE_SLAB);
        evenSimplerBlockItem(MCPlusBlocks.SMOOTH_GABBRO_SLAB);

        //MUSHROOMS
        evenSimplerBlockItem(NatureBlocks.MUSHROOM_GROWING_BOX);

        mushBlockItem(MCPlusItems.FIRE_CORAL, "fire_coral_spike");
        mushBlockItem(MCPlusItems.CHICKEN_OF_THE_WOODS, "chicken_of_the_woods");
        mushBlockItem(MCPlusItems.GLOWING_MUSHROOM, "glowing_mushroom");
        mushBlockItem(MCPlusItems.GIANT_PUFFBALL, "giant_puffball");
        mushBlockItem(MCPlusItems.LIONS_MANE, "lions_mane");
        mushBlockItem(MCPlusItems.WOODEAR, "woodear");
        mushBlockItem(MCPlusItems.OYSTER, "oyster");
        mushBlockItem(MCPlusItems.MAITAKE, "maitake");
        mushBlockItem(MCPlusItems.DESERT_SHAGGY_MANE, "desert_shaggy_mane_cap");
        mushBlockItem(MCPlusItems.AFUNGUS, "afungus");
        mushBlockItem(MCPlusItems.GOLDEN_HALO, "golden_halo_cap");
        mushBlockItem(MCPlusItems.HONEY_FUNGUS, "honey_cap");
        mushBlockItem(MCPlusItems.SUBBS, "subbs_cap");
        mushBlockItem(MCPlusItems.INKY_CAP, "inky_cap");
        mushBlockItem(MCPlusItems.BASKET_STINKHORN, "basket_stinkhorn_tendrils");
        mushBlockItem(MCPlusItems.DEATH_CAP, "death_cap");
        mushBlockItem(MCPlusItems.DESTROYING_ANGEL, "destroying_angel");
        mushBlockItem(MCPlusItems.FALSE_DEATH_CAP, "false_death_cap");
        mushBlockItem(MCPlusItems.FLY_AGARIC, "fly_agaric");
        mushBlockItem(MCPlusItems.GRAY_MOREL, "gray_morel");
        mushBlockItem(MCPlusItems.INDIGO_MILKCAP, "indigo_milkcap");
        mushBlockItem(MCPlusItems.LILAC_BONNET, "lilac_bonnet_cap");
        mushBlockItem(MCPlusItems.PORTABELLA, "portabella");
        mushBlockItem(MCPlusItems.SANDY_STILTBALL, "sandy_stiltball");
        mushBlockItem(MCPlusItems.YELLOW_PARASOL, "yellow_parasol_cap");
        mushBlockItem(MCPlusItems.YAKOTAKE, "yakotake_cap");

        //MUSHROOM SPORES
        sporeItem(MCPlusItems.AFUNGUS_SPORES, "afungus");
        sporeItem(MCPlusItems.YAKOTAKE_SPORES, "yakotake");
        sporeItem(MCPlusItems.OYSTER_SPORES, "oyster");
        sporeItem(MCPlusItems.MAITAKE_SPORES, "maitake");
        sporeItem(MCPlusItems.INDIGO_MILKCAP_SPORES, "indigo_milkcap");
        sporeItem(MCPlusItems.CHICKEN_OF_THE_WOODS_SPORES, "chicken_of_the_woods");
        sporeItem(MCPlusItems.WOODEAR_SPORES, "woodear");
        sporeItem(MCPlusItems.FIRE_CORAL_SPORES, "fire_coral");
        sporeItem(MCPlusItems.GIANT_PUFFBALL_SPORES, "giant_puffball");
        sporeItem(MCPlusItems.GLOWING_MUSHROOM_SPORES, "glowing_mushroom");
        sporeItem(MCPlusItems.DESERT_SHAGGY_MANE_SPORES, "desert_shaggy_mane");
        sporeItem(MCPlusItems.LIONS_MANE_SPORES, "lions_mane");
        sporeItem(MCPlusItems.GOLDEN_HALO_SPORES, "golden_halo");
        sporeItem(MCPlusItems.HONEY_FUNGUS_SPORES, "honey");
        sporeItem(MCPlusItems.SUBBS_SPORES, "subbs");
        sporeItem(MCPlusItems.INKY_CAP_SPORES, "inky_cap");
        sporeItem(MCPlusItems.BASKET_STINKHORN_SPORES, "basket_stinkhorn");
        sporeItem(MCPlusItems.DEATH_CAP_SPORES, "death_cap");
        sporeItem(MCPlusItems.DESTROYING_ANGEL_SPORES, "destroying_angel");
        sporeItem(MCPlusItems.FALSE_DEATH_CAP_SPORES, "false_death_cap");
        sporeItem(MCPlusItems.FLY_AGARIC_SPORES, "fly_agaric");
        sporeItem(MCPlusItems.GRAY_MOREL_SPORES, "gray_morel");
        sporeItem(MCPlusItems.INDIGO_MILKCAP_SPORES, "indigo_milkcap");
        sporeItem(MCPlusItems.LILAC_BONNET_SPORES, "lilac_bonnet");
        sporeItem(MCPlusItems.PORTABELLA_SPORES, "portabella");
        sporeItem(MCPlusItems.SANDY_STILTBALL_SPORES, "sandy_stiltball");
        sporeItem(MCPlusItems.YELLOW_PARASOL_SPORES, "yellow_parasol");


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),

                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder sporeItem(RegistryObject<Item> item, String name) {
        return withExistingParent(item.getId().getPath(),

                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "item/spores/" + name));
    }


    private ItemModelBuilder bothBlockItem(RegistryObject<BlockItem> item, RegistryObject<Block> block) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder mushBlockItem(RegistryObject<BlockItem> item, String name) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "item/mushrooms/" + name));
    }

    public void bothBlockItemBlockShape(RegistryObject<BlockItem> item, RegistryObject<Block> block) {
        this.withExistingParent(MCPlus.MODID + ":" +ForgeRegistries.ITEMS.getKey(item.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    //model generator
    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "block/" + item.getId().getPath()));
    }

    //trapdoor maker
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(MCPlus.MODID + ":" +ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    //fence maker
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(MCPlus.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    //button maker
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MCPlus.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    //wall maker
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(MCPlus.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


        public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MCPlus.MODID + ":" +ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MCPlus.MODID, "item/" + item.getId().getPath()));
    }


}
