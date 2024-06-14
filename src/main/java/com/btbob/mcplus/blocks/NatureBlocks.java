package com.btbob.mcplus.blocks;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.custom.MCPlusMushroomBlock;
import com.btbob.mcplus.blocks.custom.MushroomGrowingBoxBlock;
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
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class NatureBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCPlus.MODID);

    public static final RegistryObject<Block> MUSHROOM_GROWING_BOX = registerBlock("mushroom_growing_box", () -> new MushroomGrowingBoxBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    //EDIBLE
    public static final RegistryObject<Block> BLACK_TRUFFLE = registerForageableBlock("black_truffle", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.EDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_BLACK_TRUFFLE = registerBlock("potted_black_truffle", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.BLACK_TRUFFLE, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GIANT_PUFFBALL = registerForageableBlock("giant_puffball", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.EDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_GIANT_PUFFBALL = registerBlock("potted_giant_puffball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.GIANT_PUFFBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> INKY_CAP = registerForageableBlock("inky_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.EDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_INKY_CAP = registerBlock("potted_inky_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.INKY_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> PORTABELLA = registerForageableBlock("portabella", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.EDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_PORTABELLA = registerBlock("potted_portabella", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.PORTABELLA, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //INEDIBLE
    public static final RegistryObject<Block> DESERT_SHAGGY_MANE = registerForageableBlock("desert_shaggy_mane", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_DESERT_SHAGGY_MANE = registerBlock("potted_desert_shaggy_mane", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.DESERT_SHAGGY_MANE, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> FALSE_DEATH_CAP = registerForageableBlock("false_death_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_FALSE_DEATH_CAP = registerBlock("potted_false_death_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.FALSE_DEATH_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GLOWING_MUSHROOMS = registerForageableBlock("glowing_mushrooms", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }}, MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_GLOWING_MUSHROOMS = registerBlock("potted_glowing_mushrooms", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.GLOWING_MUSHROOMS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GRAY_MOREL = registerForageableBlock("gray_morel", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_GRAY_MOREL = registerBlock("potted_gray_morel", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.GRAY_MOREL, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> INDIGO_MILKCAP = registerForageableBlock("indigo_milkcap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_INDIGO_MILKCAP = registerBlock("potted_indigo_milkcap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.INDIGO_MILKCAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> SANDY_STILTBALL = registerForageableBlock("sandy_stiltball", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.INEDIBLE_MUSHROOM);
    public static final RegistryObject<Block> POTTED_SANDY_STILTBALL = registerBlock("potted_sandy_stiltball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.SANDY_STILTBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //POISONOUS
    public static final RegistryObject<Block> BASKET_STINKHORN = registerForageableBlock("basket_stinkhorn", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noOcclusion().noCollission()), MCPlusFoods.POISON_MUSHROOM);
    public static final RegistryObject<Block> POTTED_BASKET_STINKHORN = registerBlock("potted_basket_stinkhorn", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.BASKET_STINKHORN, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> EARTHBALL = registerForageableBlock("earthball", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.POISON_MUSHROOM);
    public static final RegistryObject<Block> POTTED_EARTHBALL = registerBlock("potted_earthball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.EARTHBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> LILAC_BONNETS = registerForageableBlock("lilac_bonnets", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.POISON_MUSHROOM);
    public static final RegistryObject<Block> POTTED_LILAC_BONNETS = registerBlock("potted_lilac_bonnets", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.LILAC_BONNETS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_PARASOLS = registerForageableBlock("yellow_parasols", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.POISON_MUSHROOM);
    public static final RegistryObject<Block> POTTED_YELLOW_PARASOLS = registerBlock("potted_yellow_parasols", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.YELLOW_PARASOLS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //DEADLY
    public static final RegistryObject<Block> DEATH_CAP = registerForageableBlock("death_cap", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.DEADLY_MUSHROOM);
    public static final RegistryObject<Block> POTTED_DEATH_CAP = registerBlock("potted_death_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.DEATH_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> DESTROYING_ANGEL = registerForageableBlock("destroying_angel", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()), MCPlusFoods.DEADLY_MUSHROOM);
    public static final RegistryObject<Block> POTTED_DESTROYING_ANGEL = registerBlock("potted_destroying_angel", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.DESTROYING_ANGEL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> FIRE_CORAL = registerForageableBlock("fire_coral", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()) {@Override public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) { pEntity.makeStuckInBlock(pState, new Vec3((double)0.8F, 0.75D, (double)0.8F)); pEntity.hurt(pLevel.damageSources().sweetBerryBush(), 1.0F); }}, MCPlusFoods.DEADLY_MUSHROOM);
    public static final RegistryObject<Block> POTTED_FIRE_CORAL = registerBlock("potted_fire_coral", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), NatureBlocks.FIRE_CORAL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));



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
