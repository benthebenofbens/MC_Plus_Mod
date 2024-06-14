package com.btbob.mcplus.blocks;

import com.btbob.mcplus.MCPlus;
import com.btbob.mcplus.items.MCPlusItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class MCPlusBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCPlus.MODID);

    //GNEISS
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
    public static final RegistryObject<Block> GNEISS_STAIRS = registerBlock("gneiss_stairs", () -> new StairBlock(() -> MCPlusBlocks.GNEISS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS.get())));
    public static final RegistryObject<Block> GNEISS_SLAB = registerBlock("gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS.get())));
    public static final RegistryObject<Block> GNEISS_WALL = registerBlock("gneiss_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS.get())));
    public static final RegistryObject<Block> COBBLED_GNEISS = registerBlock("cobbled_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> COBBLED_GNEISS_STAIRS = registerBlock("cobbled_gneiss_stairs", () -> new StairBlock(() -> MCPlusBlocks.COBBLED_GNEISS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_GNEISS.get())));
    public static final RegistryObject<Block> COBBLED_GNEISS_SLAB = registerBlock("cobbled_gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_GNEISS.get())));
    public static final RegistryObject<Block> COBBLED_GNEISS_WALL = registerBlock("cobbled_gneiss_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_GNEISS.get())));
    public static final RegistryObject<Block> ENERGIZED_COBBLED_GNEISS = registerBlock("energized_cobbled_gneiss", () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> ENERGIZED_COBBLED_GNEISS_STAIRS = registerBlock("energized_cobbled_gneiss_stairs", () -> new StairBlock(() -> MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get())));
    public static final RegistryObject<Block> ENERGIZED_COBBLED_GNEISS_SLAB = registerBlock("energized_cobbled_gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get())){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> ENERGIZED_COBBLED_GNEISS_WALL = registerBlock("energized_cobbled_gneiss_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_COBBLED_GNEISS.get())){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> GNEISS_BRICKS = registerBlock("gneiss_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> GNEISS_BRICK_STAIRS = registerBlock("gneiss_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.GNEISS_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> GNEISS_BRICK_SLAB = registerBlock("gneiss_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> GNEISS_BRICK_WALL = registerBlock("gneiss_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_BRICKS = registerBlock("cracked_gneiss_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> CRACKED_GNEISS_BRICK_STAIRS = registerBlock("cracked_gneiss_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.CRACKED_GNEISS_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_BRICK_SLAB = registerBlock("cracked_gneiss_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_BRICK_WALL = registerBlock("cracked_gneiss_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_BRICKS = registerBlock("energized_gneiss_bricks", () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> ENERGIZED_GNEISS_BRICK_STAIRS = registerBlock("energized_gneiss_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_BRICK_SLAB = registerBlock("energized_gneiss_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_BRICK_WALL = registerBlock("energized_gneiss_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_GNEISS = registerBlock("polished_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> POLISHED_GNEISS_STAIRS = registerBlock("polished_gneiss_stairs", () -> new StairBlock(() -> MCPlusBlocks.POLISHED_GNEISS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_GNEISS.get())));
    public static final RegistryObject<Block> POLISHED_GNEISS_SLAB = registerBlock("polished_gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_GNEISS.get())));
    public static final RegistryObject<Block> POLISHED_GNEISS_WALL = registerBlock("polished_gneiss_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_GNEISS.get())));
    public static final RegistryObject<Block> CHISELED_GNEISS = registerBlock("chiseled_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> GNEISS_TILES = registerBlock("gneiss_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> GNEISS_TILE_STAIRS = registerBlock("gneiss_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.GNEISS_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_TILES.get())));
    public static final RegistryObject<Block> GNEISS_TILE_SLAB = registerBlock("gneiss_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_TILES.get())));
    public static final RegistryObject<Block> GNEISS_TILE_WALL = registerBlock("gneiss_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.GNEISS_TILES.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_TILES = registerBlock("cracked_gneiss_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> CRACKED_GNEISS_TILE_STAIRS = registerBlock("cracked_gneiss_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.CRACKED_GNEISS_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_TILE_SLAB = registerBlock("cracked_gneiss_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> CRACKED_GNEISS_TILE_WALL = registerBlock("cracked_gneiss_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_TILES = registerBlock("energized_gneiss_tiles", () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> ENERGIZED_GNEISS_TILE_STAIRS = registerBlock("energized_gneiss_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.ENERGIZED_GNEISS_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_TILE_SLAB = registerBlock("energized_gneiss_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_TILE_WALL = registerBlock("energized_gneiss_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.ENERGIZED_GNEISS_TILES.get())));
    public static final RegistryObject<Block> GNEISS_PILLAR = registerBlock("gneiss_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> GNEISS_PILLAR_CAPITAL = registerBlock("gneiss_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> GNEISS_PILLAR_BASE = registerBlock("gneiss_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> SMOOTH_GNEISS = registerBlock("smooth_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> SMOOTH_GNEISS_STAIRS = registerBlock("smooth_gneiss_stairs", () -> new StairBlock(() -> MCPlusBlocks.SMOOTH_GNEISS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.SMOOTH_GNEISS.get())));
    public static final RegistryObject<Block> SMOOTH_GNEISS_SLAB = registerBlock("smooth_gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> SMOOTH_GNEISS_WALL = registerBlock("smooth_gneiss_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SMOOTH_GNEISS.get())));

    //SLATE
    public static final RegistryObject<Block> SLATE = registerBlock("slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
    public static final RegistryObject<Block> SLATE_STAIRS = registerBlock("slate_stairs", () -> new StairBlock(() -> MCPlusBlocks.SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE.get())));
    public static final RegistryObject<Block> SLATE_SLAB = registerBlock("slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE.get())));
    public static final RegistryObject<Block> SLATE_WALL = registerBlock("slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE.get())));

    public static final RegistryObject<Block> COBBLED_SLATE = registerBlock("cobbled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_SLATE_STAIRS = registerBlock("cobbled_slate_stairs", () -> new StairBlock(() -> MCPlusBlocks.COBBLED_SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_SLATE.get())));
    public static final RegistryObject<Block> COBBLED_SLATE_SLAB = registerBlock("cobbled_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_SLATE.get())));
    public static final RegistryObject<Block> COBBLED_SLATE_WALL = registerBlock("cobbled_slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.COBBLED_SLATE.get())));

    public static final RegistryObject<Block> BEDAZZLED_COBBLED_SLATE = registerBlock("bedazzled_cobbled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BEDAZZLED_COBBLED_SLATE_STAIRS = registerBlock("bedazzled_cobbled_slate_stairs", () -> new StairBlock(() -> MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get())));
    public static final RegistryObject<Block> BEDAZZLED_COBBLED_SLATE_SLAB = registerBlock("bedazzled_cobbled_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get())));
    public static final RegistryObject<Block> BEDAZZLED_COBBLED_SLATE_WALL = registerBlock("bedazzled_cobbled_slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_COBBLED_SLATE.get())));
    public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_BRICKS.get())));
    public static final RegistryObject<Block> SLATE_BRICK_SLAB = registerBlock("slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_BRICKS.get())));
    public static final RegistryObject<Block> SLATE_BRICK_WALL = registerBlock("slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICKS = registerBlock("cracked_slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_STAIRS = registerBlock("cracked_slate_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.CRACKED_SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_SLAB = registerBlock("cracked_slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_WALL = registerBlock("cracked_slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_BRICKS = registerBlock("bedazzled_slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_BRICK_STAIRS = registerBlock("bedazzled_slate_brick_stairs", () -> new StairBlock(() -> MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_BRICK_SLAB = registerBlock("bedazzled_slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_BRICK_WALL = registerBlock("bedazzled_slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_SLATE = registerBlock("polished_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs", () -> new StairBlock(() -> MCPlusBlocks.POLISHED_SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_SLATE.get())));
    public static final RegistryObject<Block> POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_SLATE.get())));
    public static final RegistryObject<Block> POLISHED_SLATE_WALL = registerBlock("polished_slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.POLISHED_SLATE.get())));
    public static final RegistryObject<Block> CHISELED_SLATE = registerBlock("chiseled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SLATE_TILES = registerBlock("slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SLATE_TILE_STAIRS = registerBlock("slate_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.SLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_TILES.get())));
    public static final RegistryObject<Block> SLATE_TILE_SLAB = registerBlock("slate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_TILES.get())));
    public static final RegistryObject<Block> SLATE_TILE_WALL = registerBlock("slate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SLATE_TILES.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_TILES = registerBlock("cracked_slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_SLATE_TILE_STAIRS = registerBlock("cracked_slate_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.CRACKED_SLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_TILES.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_TILE_SLAB = registerBlock("cracked_slate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_TILES.get())));
    public static final RegistryObject<Block> CRACKED_SLATE_TILE_WALL = registerBlock("cracked_slate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.CRACKED_SLATE_TILES.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_TILES = registerBlock("bedazzled_slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_TILE_STAIRS = registerBlock("bedazzled_slate_tile_stairs", () -> new StairBlock(() -> MCPlusBlocks.BEDAZZLED_SLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_TILE_SLAB = registerBlock("bedazzled_slate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get())));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_TILE_WALL = registerBlock("bedazzled_slate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.BEDAZZLED_SLATE_TILES.get())));
    public static final RegistryObject<Block> SLATE_PILLAR = registerBlock("slate_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SLATE_PILLAR_CAPITAL = registerBlock("slate_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SLATE_PILLAR_BASE = registerBlock("slate_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_SLATE = registerBlock("smooth_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_SLATE_STAIRS = registerBlock("smooth_slate_stairs", () -> new StairBlock(() -> MCPlusBlocks.SMOOTH_SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MCPlusBlocks.SMOOTH_SLATE.get())));
    public static final RegistryObject<Block> SMOOTH_SLATE_WALL = registerBlock("smooth_slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MCPlusBlocks.SMOOTH_SLATE.get())));
    public static final RegistryObject<Block> SMOOTH_SLATE_SLAB = registerBlock("smooth_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));

    //MARBLE
    public static final RegistryObject<Block> MARBLE = registerBlock("marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
    public static final RegistryObject<Block> COBBLED_MARBLE = registerBlock("cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PAINTED_COBBLED_MARBLE = registerBlock("painted_cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_MARBLE_BRICKS = registerBlock("cracked_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PAINTED_MARBLE_BRICKS = registerBlock("painted_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_MARBLE = registerBlock("polished_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_MARBLE = registerBlock("chiseled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_MARBLE_TILES = registerBlock("cracked_marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PAINTED_MARBLE_TILES = registerBlock("painted_marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_PILLAR_CAPITAL = registerBlock("marble_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MARBLE_PILLAR_BASE = registerBlock("marble_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_MARBLE = registerBlock("smooth_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_MARBLE_SLAB = registerBlock("smooth_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    //LIMESTONE
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
    public static final RegistryObject<Block> COBBLED_LIMESTONE = registerBlock("cobbled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LICHENY_COBBLED_LIMESTONE = registerBlock("licheny_cobbled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = registerBlock("cracked_limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> LICHENY_LIMESTONE_BRICKS = registerBlock("licheny_limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_LIMESTONE = registerBlock("chiseled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_TILES = registerBlock("limestone_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_TILES = registerBlock("cracked_limestone_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LICHENY_LIMESTONE_TILES = registerBlock("licheny_limestone_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LIMESTONE_PILLAR = registerBlock("limestone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_PILLAR_CAPITAL = registerBlock("limestone_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_PILLAR_BASE = registerBlock("limestone_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_LIMESTONE = registerBlock("smooth_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_LIMESTONE_SLAB = registerBlock("smooth_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    //GABBRO
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
  //  public static final RegistryObject<Block> COBBLED_MARBLE = registerBlock("cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
  //  public static final RegistryObject<Block> PAINTED_COBBLED_MARBLE = registerBlock("painted_cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GABBRO_BRICKS = registerBlock("gabbro_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_GABBRO_BRICKS = registerBlock("cracked_gabbro_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
   // public static final RegistryObject<Block> PAINTED_MARBLE_BRICKS = registerBlock("painted_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GABBRO = registerBlock("polished_gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_GABBRO = registerBlock("chiseled_gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_TILES = registerBlock("gabbro_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_GABBRO_TILES = registerBlock("cracked_gabbro_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
  //  public static final RegistryObject<Block> PAINTED_MARBLE_TILES = registerBlock("painted_marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GABBRO_PILLAR = registerBlock("gabbro_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_PILLAR_CAPITAL = registerBlock("gabbro_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_PILLAR_BASE = registerBlock("gabbro_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_GABBRO = registerBlock("smooth_gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_GABBRO_SLAB = registerBlock("smooth_gabbro_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    //CHERT
    public static final RegistryObject<Block> CHERT = registerBlock("chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)){@Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

        public MutableComponent getDisplayName() {
            return Component.translatable(this.getDescriptionId() + ".desc");
        }});
    public static final RegistryObject<Block> COBBLED_CHERT = registerBlock("cobbled_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRYSTALLINE_COBBLED_CHERT = registerBlock("crystalline_cobbled_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHERT_BRICKS = registerBlock("chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_CHERT_BRICKS = registerBlock("cracked_chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRYSTALLINE_CHERT_BRICKS = registerBlock("crystalline_chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CHERT = registerBlock("polished_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_CHERT = registerBlock("chiseled_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHERT_TILES = registerBlock("chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_CHERT_TILES = registerBlock("cracked_chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRYSTALLINE_CHERT_TILES = registerBlock("crystalline_chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CHERT_PILLAR = registerBlock("chert_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHERT_PILLAR_CAPITAL = registerBlock("chert_pillar_capital", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHERT_PILLAR_BASE = registerBlock("chert_pillar_base", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_CHERT = registerBlock("smooth_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> SMOOTH_CHERT_SLAB = registerBlock("smooth_chert_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));



    //THE BORING STUFF
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return MCPlusItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
