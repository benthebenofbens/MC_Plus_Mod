package com.btbob.mcplus.blocks;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.custom.MCPlusGlowingMushroomBlock;
import com.btbob.mcplus.blocks.custom.MCPlusGlowingMushroomWallBlock;
import com.btbob.mcplus.blocks.custom.MCPlusMushroomBlock;
import com.btbob.mcplus.blocks.custom.MCPlusMushroomWallBlock;
import com.btbob.mcplus.blocks.custom.mushroom_crops.ground.*;
import com.btbob.mcplus.items.MCPlusFoods;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class NatureBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCPlus.MODID);

    public static final RegistryObject<Block> MUSHROOM_GROWING_BOX = registerBlock("mushroom_growing_box", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MYCELIATED_DIRT = registerBlock("myceliated_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    //SHELVES
    public static final RegistryObject<Block> CHICKEN_OF_THE_WOODS = registerBlock("chicken_of_the_woods", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> CHICKEN_OF_THE_WOODS_SHELF = registerBlock("chicken_of_the_woods_shelf", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.CHICKEN_OF_THE_WOODS.get()); }});
    public static final RegistryObject<Block> CHICKEN_OF_THE_WOODS_CROP = BLOCKS.register("chicken_of_the_woods_crop", () -> new ChickenOfTheWoodsCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WOODEAR_SHELF = registerBlock("woodear_shelf", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.WOODEAR.get()); }});
    public static final RegistryObject<Block> WOODEAR = registerBlock("woodear", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> WOODEAR_CROP = BLOCKS.register("woodear_crop", () -> new WoodearCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> OYSTER_SHELF = registerBlock("oyster_shelf", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.OYSTER.get()); }});
    public static final RegistryObject<Block> OYSTER = registerBlock("oyster", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> OYSTER_CROP = BLOCKS.register("oyster_crop", () -> new OysterCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> MAITAKE_SHELF = registerBlock("maitake_shelf", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.MAITAKE.get()); }});
    public static final RegistryObject<Block> MAITAKE = registerBlock("maitake", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> MAITAKE_CROP = BLOCKS.register("maitake_crop", () -> new MaitakeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //BUNCH
    public static final RegistryObject<Block> FIRE_CORAL = registerBlock("fire_coral", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {@Override public void entityInside (BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity){ pEntity.hurt(pLevel.damageSources().sweetBerryBush(), 1.0F); }});
    public static final RegistryObject<Block> FIRE_CORAL_WALL = registerBlock("fire_coral_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {@Override public void entityInside (BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity){ pEntity.hurt(pLevel.damageSources().sweetBerryBush(), 1.0F); }     @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.FIRE_CORAL.get()); }});
    public static final RegistryObject<Block> FIRE_CORAL_CROP = BLOCKS.register("fire_coral_crop", () -> new FireCoralCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()) {@Override public void entityInside (BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity){ pEntity.hurt(pLevel.damageSources().sweetBerryBush(), 1.0F); }});

    public static final RegistryObject<Block> GOLDEN_HALO = registerBlock("golden_halo", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> GOLDEN_HALO_WALL = registerBlock("golden_halo_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.GOLDEN_HALO.get()); }});
    public static final RegistryObject<Block> GOLDEN_HALO_CROP = BLOCKS.register("golden_halo_crop", () -> new GoldenHaloCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> DESERT_SHAGGY_MANE = registerBlock("desert_shaggy_mane", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> DESERT_SHAGGY_MANE_WALL = registerBlock("desert_shaggy_mane_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.DESERT_SHAGGY_MANE.get()); }});
    public static final RegistryObject<Block> DESERT_SHAGGY_MANE_CROP = BLOCKS.register("desert_shaggy_mane_crop", () -> new DesertShaggyManeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> HONEY_FUNGUS = registerBlock("honey_fungus", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> HONEY_FUNGUS_WALL = registerBlock("honey_fungus_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.HONEY_FUNGUS.get()); }});
    public static final RegistryObject<Block> HONEY_FUNGUS_CROP = BLOCKS.register("honey_fungus_crop", () -> new HoneyFungusCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> INKY_CAP = registerBlock("inky_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> INKY_CAP_WALL = registerBlock("inky_cap_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.INKY_CAP.get()); }});
    public static final RegistryObject<Block> INKY_CAP_CROP = BLOCKS.register("inky_cap_crop", () -> new InkyCapCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> SUBBS = registerBlock("subbs", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> SUBBS_WALL = registerBlock("subbs_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){    @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.SUBBS.get()); }});
    public static final RegistryObject<Block> SUBBS_CROP = BLOCKS.register("subbs_crop", () -> new SubbsCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //GLOWING
    public static final RegistryObject<Block> YAKOTAKE = registerBlock("yakotake", () -> new MCPlusGlowingMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> YAKOTAKE_WALL = registerBlock("yakotake_wall", () -> new MCPlusGlowingMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) { @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.YAKOTAKE.get()); }});
    public static final RegistryObject<Block> YAKOTAKE_CROP = BLOCKS.register("yakotake_crop", () -> new YakotakeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //SINGLE
    public static final RegistryObject<Block> GLOWING_MUSHROOM = registerBlock("glowing_mushroom", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> GLOWING_MUSHROOM_WALL = registerBlock("glowing_mushroom_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }     @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.GLOWING_MUSHROOM.get()); }});
    public static final RegistryObject<Block> GLOWING_MUSHROOM_CROP = BLOCKS.register("glowing_mushroom_crop", () -> new GlowingMushroomCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});

    public static final RegistryObject<Block> BASKET_STINKHORN = registerBlock("basket_stinkhorn", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> BASKET_STINKHORN_WALL = registerBlock("basket_stinkhorn_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.BASKET_STINKHORN.get()); }});
    public static final RegistryObject<Block> BASKET_STINKHORN_CROP = BLOCKS.register("basket_stinkhorn_crop", () -> new BasketStinkhornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> DEATH_CAP = registerBlock("death_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> DEATH_CAP_WALL = registerBlock("death_cap_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.DEATH_CAP.get()); }});
    public static final RegistryObject<Block> DEATH_CAP_CROP = BLOCKS.register("death_cap_crop", () -> new DeathCapCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> DESTROYING_ANGEL = registerBlock("destroying_angel", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> DESTROYING_ANGEL_WALL = registerBlock("destroying_angel_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.DESTROYING_ANGEL.get()); }});
    public static final RegistryObject<Block> DESTROYING_ANGEL_CROP = BLOCKS.register("destroying_angel_crop", () -> new DestroyingAngelCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> FALSE_DEATH_CAP = registerBlock("false_death_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> FALSE_DEATH_CAP_WALL = registerBlock("false_death_cap_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.FALSE_DEATH_CAP.get()); }});
    public static final RegistryObject<Block> FALSE_DEATH_CAP_CROP = BLOCKS.register("false_death_cap_crop", () -> new FalseDeathCapCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> FLY_AGARIC = registerBlock("fly_agaric", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> FLY_AGARIC_WALL = registerBlock("fly_agaric_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.FLY_AGARIC.get()); }});
    public static final RegistryObject<Block> FLY_AGARIC_CROP = BLOCKS.register("fly_agaric_crop", () -> new FlyAgaricCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> GRAY_MOREL = registerBlock("gray_morel", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> GRAY_MOREL_WALL = registerBlock("gray_morel_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.GRAY_MOREL.get()); }});
    public static final RegistryObject<Block> GRAY_MOREL_CROP = BLOCKS.register("gray_morel_crop", () -> new GrayMorelCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

      public static final RegistryObject<Block> INDIGO_MILKCAP = registerBlock("indigo_milkcap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> INDIGO_MILKCAP_WALL = registerBlock("indigo_milkcap_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.INDIGO_MILKCAP.get()); }});
    public static final RegistryObject<Block> INDIGO_MILKCAP_CROP = BLOCKS.register("indigo_milkcap_crop", () -> new IndigoMilkcapCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> LILAC_BONNET = registerBlock("lilac_bonnet", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> LILAC_BONNET_WALL = registerBlock("lilac_bonnet_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.LILAC_BONNET.get()); }});
    public static final RegistryObject<Block> LILAC_BONNET_CROP = BLOCKS.register("lilac_bonnet_crop", () -> new LilacBonnetCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> PORTABELLA = registerBlock("portabella", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> PORTABELLA_WALL = registerBlock("portabella_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.PORTABELLA.get()); }});
    public static final RegistryObject<Block> PORTABELLA_CROP = BLOCKS.register("portabella_crop", () -> new PortabellaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> SANDY_STILTBALL = registerBlock("sandy_stiltball", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> SANDY_STILTBALL_WALL = registerBlock("sandy_stiltball_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.SANDY_STILTBALL.get()); }});
    public static final RegistryObject<Block> SANDY_STILTBALL_CROP = BLOCKS.register("sandy_stiltball_crop", () -> new SandyStiltballCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> YELLOW_PARASOL = registerBlock("yellow_parasol", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> YELLOW_PARASOL_WALL = registerBlock("yellow_parasol_wall", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {  @Override public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) { return new ItemStack(MCPlusItems.YELLOW_PARASOL.get()); }});
    public static final RegistryObject<Block> YELLOW_PARASOL_CROP = BLOCKS.register("yellow_parasol_crop", () -> new YellowParasolCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));





    public static final RegistryObject<Block> AFUNGUS = registerForageableBlock("afungus", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)), MCPlusFoods.AFUNGUS);
    public static final RegistryObject<Block> AFUNGUS_CROP = BLOCKS.register("afungus_crop", () -> new AfungusCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //PUFFBALL
    public static final RegistryObject<Block> GIANT_PUFFBALL = registerBlock("giant_puffball", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).instabreak().noOcclusion()));
    public static final RegistryObject<Block> GIANT_PUFFBALL_CROP = BLOCKS.register("giant_puffball_crop", () -> new GiantPuffballCropBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).instabreak().noOcclusion()));

    //LIONS MANE
    public static final RegistryObject<Block> LIONS_MANE = registerBlock("lions_mane", () -> new MCPlusMushroomWallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));




    //THE BORING STUFF
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerForageableBlock(String name, Supplier<T> block, FoodProperties fFood) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerForageableBlockItem(name, toReturn, fFood);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return MCPlusItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static <T extends Block> RegistryObject<Item> registerForageableBlockItem(String name, RegistryObject<T> block, FoodProperties foodProperties) {
        return MCPlusItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().food(foodProperties)){
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
            }

            public MutableComponent getDisplayName() {
                return Component.translatable(this.getDescriptionId() + ".desc");
            }});
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
