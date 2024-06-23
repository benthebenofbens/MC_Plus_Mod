package com.btbob.mcplus.items;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.NatureBlocks;
import com.btbob.mcplus.items.custom.MushroomStandingAndWallBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MCPlusItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPlus.MODID);

    public static final RegistryObject<Item> INDIGO_MILKCAP_SPORES = ITEMS.register("indigo_milkcap_spores", () -> new ItemNameBlockItem(NatureBlocks.INDIGO_MILKCAP_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> CHICKEN_OF_THE_WOODS_SPORES = ITEMS.register("chicken_of_the_woods_spores", () -> new ItemNameBlockItem(NatureBlocks.CHICKEN_OF_THE_WOODS_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> FIRE_CORAL_SPORES = ITEMS.register("fire_coral_spores", () -> new ItemNameBlockItem(NatureBlocks.FIRE_CORAL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> GLOWING_MUSHROOM_SPORES = ITEMS.register("glowing_mushroom_spores", () -> new ItemNameBlockItem(NatureBlocks.GLOWING_MUSHROOM_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> AFUNGUS_SPORES = ITEMS.register("afungus_spores", () -> new ItemNameBlockItem(NatureBlocks.AFUNGUS_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> GIANT_PUFFBALL_SPORES = ITEMS.register("giant_puffball_spores", () -> new ItemNameBlockItem(NatureBlocks.GIANT_PUFFBALL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> LIONS_MANE_SPORES = ITEMS.register("lions_mane_spores", () -> new ItemNameBlockItem(NatureBlocks.GIANT_PUFFBALL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> WOODEAR_SPORES = ITEMS.register("woodear_spores", () -> new ItemNameBlockItem(NatureBlocks.WOODEAR_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> MAITAKE_SPORES = ITEMS.register("maitake_spores", () -> new ItemNameBlockItem(NatureBlocks.MAITAKE_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> OYSTER_SPORES = ITEMS.register("oyster_spores", () -> new ItemNameBlockItem(NatureBlocks.OYSTER_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> DESERT_SHAGGY_MANE_SPORES = ITEMS.register("desert_shaggy_mane_spores", () -> new ItemNameBlockItem(NatureBlocks.DESERT_SHAGGY_MANE_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> GOLDEN_HALO_SPORES = ITEMS.register("golden_halo_spores", () -> new ItemNameBlockItem(NatureBlocks.GOLDEN_HALO_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> INKY_CAP_SPORES = ITEMS.register("inky_cap_spores", () -> new ItemNameBlockItem(NatureBlocks.GOLDEN_HALO_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> HONEY_FUNGUS_SPORES = ITEMS.register("honey_fungus_spores", () -> new ItemNameBlockItem(NatureBlocks.GOLDEN_HALO_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> SUBBS_SPORES = ITEMS.register("subbs_spores", () -> new ItemNameBlockItem(NatureBlocks.GOLDEN_HALO_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> BASKET_STINKHORN_SPORES = ITEMS.register("basket_stinkhorn_spores", () -> new ItemNameBlockItem(NatureBlocks.BASKET_STINKHORN_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> DEATH_CAP_SPORES = ITEMS.register("death_cap_spores", () -> new ItemNameBlockItem(NatureBlocks.DEATH_CAP_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> DESTROYING_ANGEL_SPORES = ITEMS.register("destroying_angel_spores", () -> new ItemNameBlockItem(NatureBlocks.DESTROYING_ANGEL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> FALSE_DEATH_CAP_SPORES = ITEMS.register("false_death_cap_spores", () -> new ItemNameBlockItem(NatureBlocks.FALSE_DEATH_CAP_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> FLY_AGARIC_SPORES = ITEMS.register("fly_agaric_spores", () -> new ItemNameBlockItem(NatureBlocks.FLY_AGARIC_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> GRAY_MOREL_SPORES = ITEMS.register("gray_morel_spores", () -> new ItemNameBlockItem(NatureBlocks.GRAY_MOREL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> LILAC_BONNET_SPORES = ITEMS.register("lilac_bonnet_spores", () -> new ItemNameBlockItem(NatureBlocks.LILAC_BONNET_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> PORTABELLA_SPORES = ITEMS.register("portabella_spores", () -> new ItemNameBlockItem(NatureBlocks.PORTABELLA_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> SANDY_STILTBALL_SPORES = ITEMS.register("sandy_stiltball_spores", () -> new ItemNameBlockItem(NatureBlocks.SANDY_STILTBALL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> YELLOW_PARASOL_SPORES = ITEMS.register("yellow_parasol_spores", () -> new ItemNameBlockItem(NatureBlocks.YELLOW_PARASOL_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));
    public static final RegistryObject<Item> YAKOTAKE_SPORES = ITEMS.register("yakotake_spores", () -> new ItemNameBlockItem(NatureBlocks.YAKOTAKE_CROP.get(),new Item.Properties().food(MCPlusFoods.MUSHROOM_SPORES)));

    public static final RegistryObject<Item> BLACK_TRUFFLE = ITEMS.register("black_truffle", () -> new Item(new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM)) { @Override public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {  super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced); pTooltipComponents.add(this.getDisplayName().withStyle(ChatFormatting.GRAY)); } public MutableComponent getDisplayName() { return Component.translatable(this.getDescriptionId() + ".desc"); } });


    public static final RegistryObject<BlockItem> FIRE_CORAL = ITEMS.register("fire_coral_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.FIRE_CORAL.get(), NatureBlocks.FIRE_CORAL_WALL.get(), new Item.Properties().food(MCPlusFoods.DEADLY_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> YAKOTAKE = ITEMS.register("yakotake_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.YAKOTAKE.get(), NatureBlocks.YAKOTAKE_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> CHICKEN_OF_THE_WOODS = ITEMS.register("chicken_of_the_woods_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.CHICKEN_OF_THE_WOODS.get(), NatureBlocks.CHICKEN_OF_THE_WOODS_SHELF.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> OYSTER = ITEMS.register("oyster_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.OYSTER.get(), NatureBlocks.OYSTER_SHELF.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> MAITAKE = ITEMS.register("maitake_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.MAITAKE.get(), NatureBlocks.MAITAKE_SHELF.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> WOODEAR = ITEMS.register("woodear_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.WOODEAR.get(), NatureBlocks.WOODEAR_SHELF.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> GLOWING_MUSHROOM = ITEMS.register("glowing_mushroom_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.GLOWING_MUSHROOM.get(), NatureBlocks.GLOWING_MUSHROOM_WALL.get(), new Item.Properties().food(MCPlusFoods.GLOWING_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> DESERT_SHAGGY_MANE = ITEMS.register("desert_shaggy_mane_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.DESERT_SHAGGY_MANE.get(), NatureBlocks.DESERT_SHAGGY_MANE_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> GOLDEN_HALO = ITEMS.register("golden_halo_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.GOLDEN_HALO.get(), NatureBlocks.GOLDEN_HALO_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> HONEY_FUNGUS = ITEMS.register("honey_fungus_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.HONEY_FUNGUS.get(), NatureBlocks.HONEY_FUNGUS_WALL.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> SUBBS = ITEMS.register("subbs_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.SUBBS.get(), NatureBlocks.SUBBS_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> INKY_CAP = ITEMS.register("inky_cap_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.INKY_CAP.get(), NatureBlocks.INKY_CAP_WALL.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> GIANT_PUFFBALL = ITEMS.register("giant_puffball_item", () -> new BlockItem(NatureBlocks.GIANT_PUFFBALL.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM)){ @Override public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {  super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced); pTooltipComponents.add(this.getDisplayName().withStyle(ChatFormatting.GRAY)); } public MutableComponent getDisplayName() { return Component.translatable(this.getDescriptionId() + ".desc"); } });
    public static final RegistryObject<BlockItem> LIONS_MANE = ITEMS.register("lions_mane_item", () -> new BlockItem(NatureBlocks.LIONS_MANE.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM)){ @Override public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {  super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced); pTooltipComponents.add(this.getDisplayName().withStyle(ChatFormatting.GRAY)); } public MutableComponent getDisplayName() { return Component.translatable(this.getDescriptionId() + ".desc"); } });
    public static final RegistryObject<BlockItem> AFUNGUS = ITEMS.register("afungus_item", () -> new BlockItem(NatureBlocks.AFUNGUS.get(), new Item.Properties().food(MCPlusFoods.AFUNGUS)));
    public static final RegistryObject<BlockItem> BASKET_STINKHORN = ITEMS.register("basket_stinkhorn_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.BASKET_STINKHORN.get(), NatureBlocks.BASKET_STINKHORN_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> DEATH_CAP = ITEMS.register("death_cap_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.DEATH_CAP.get(), NatureBlocks.DEATH_CAP_WALL.get(), new Item.Properties().food(MCPlusFoods.DEADLY_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> DESTROYING_ANGEL = ITEMS.register("destroying_angel_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.DESTROYING_ANGEL.get(), NatureBlocks.DESTROYING_ANGEL_WALL.get(), new Item.Properties().food(MCPlusFoods.DEADLY_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> FALSE_DEATH_CAP = ITEMS.register("false_death_cap_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.FALSE_DEATH_CAP.get(), NatureBlocks.FALSE_DEATH_CAP_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> FLY_AGARIC = ITEMS.register("fly_agaric_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.FLY_AGARIC.get(), NatureBlocks.FLY_AGARIC_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> GRAY_MOREL = ITEMS.register("gray_morel_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.GRAY_MOREL.get(), NatureBlocks.GRAY_MOREL_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> INDIGO_MILKCAP = ITEMS.register("indigo_milkcap_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.INDIGO_MILKCAP.get(), NatureBlocks.INDIGO_MILKCAP_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> LILAC_BONNET = ITEMS.register("lilac_bonnet_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.LILAC_BONNET.get(), NatureBlocks.LILAC_BONNET_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> PORTABELLA = ITEMS.register("portabella_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.PORTABELLA.get(), NatureBlocks.PORTABELLA_WALL.get(), new Item.Properties().food(MCPlusFoods.EDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> SANDY_STILTBALL = ITEMS.register("sandy_stiltball_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.SANDY_STILTBALL.get(), NatureBlocks.SANDY_STILTBALL_WALL.get(), new Item.Properties().food(MCPlusFoods.INEDIBLE_MUSHROOM), Direction.DOWN));
    public static final RegistryObject<BlockItem> YELLOW_PARASOL = ITEMS.register("yellow_parasol_item", () -> new MushroomStandingAndWallBlockItem(NatureBlocks.YELLOW_PARASOL.get(), NatureBlocks.YELLOW_PARASOL_WALL.get(), new Item.Properties().food(MCPlusFoods.POISON_MUSHROOM), Direction.DOWN));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
