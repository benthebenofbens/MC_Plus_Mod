package com.btbob.mcplus.blocks;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.blocks.custom.MCPlusMushroomBlock;
import com.btbob.mcplus.blocks.custom.MushroomBunchBlock;
import com.btbob.mcplus.blocks.custom.MushroomGrowingBoxBlock;
import com.btbob.mcplus.blocks.custom.MushroomShelfBlock;
import com.btbob.mcplus.blocks.custom.mushroom_crops.MushroomCropBlock;
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


    //SHELVES
    public static final RegistryObject<Block> CHICKEN_OF_THE_WOODS = registerForageableBlock("chicken_of_the_woods", () -> new MushroomShelfBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)), MCPlusFoods.EDIBLE_MUSHROOM);
    public static final RegistryObject<Block> WOODY_CHICKEN_OF_THE_WOODS = registerForageableBlock("woody_chicken_of_the_woods", () -> new MushroomShelfBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)), MCPlusFoods.INEDIBLE_MUSHROOM);

    public static final RegistryObject<Block> FIRE_CORAL = registerForageableBlock("fire_coral", () -> new MushroomBunchBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)) {@Override public void entityInside (BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity){ pEntity.makeStuckInBlock(pState, new Vec3((double) 0.95F, 0.75D, (double) 0.95F));pEntity.hurt(pLevel.damageSources().sweetBerryBush(), 1.0F); }}, MCPlusFoods.DEADLY_MUSHROOM);


    public static final RegistryObject<Block> AFUNGUS = registerForageableBlock("afungus", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)), MCPlusFoods.AFUNGUS);
    public static final RegistryObject<Block> POTTED_AFUNGUS = registerBlock("potted_afungus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), NatureBlocks.AFUNGUS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> AFUNGUS_CROP = BLOCKS.register("afungus_crop", () -> new MushroomCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> ROTTEN_AFUNGUS = registerForageableBlock("rotten_afungus", () -> new MCPlusMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)), MCPlusFoods.DEADLY_MUSHROOM);
    public static final RegistryObject<Block> POTTED_ROTTEN_AFUNGUS = registerBlock("potted_rotten_afungus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), NatureBlocks.AFUNGUS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));



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
