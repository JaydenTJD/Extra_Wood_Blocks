package net.jaydentjd.extrawoodblocksultimate.block;

import net.jaydentjd.extrawoodblocksultimate.ExtraWoodBlocksUltimate;
import net.jaydentjd.extrawoodblocksultimate.block.custom.CustomBedBlock;
import net.jaydentjd.extrawoodblocksultimate.block.custom.CustomCartographyTableBlock;
import net.jaydentjd.extrawoodblocksultimate.block.custom.CustomGrindstoneBlock;
import net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox.CustomJukeboxBlock;
import net.jaydentjd.extrawoodblocksultimate.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraWoodBlocksUltimate.MOD_ID);



    public static final RegistryObject<BarrelBlock> ACACIA_BARREL = registerBlock("acacia_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> BAMBOO_BARREL = registerBlock("bamboo_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> BIRCH_BARREL = registerBlock("birch_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> CHERRY_BARREL = registerBlock("cherry_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> CRIMSON_BARREL = registerBlock("crimson_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> JUNGLE_BARREL = registerBlock("jungle_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> MANGROVE_BARREL = registerBlock("mangrove_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> OAK_BARREL = registerBlock("oak_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);
    public static final RegistryObject<BarrelBlock> WARPED_BARREL = registerBlock("warped_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 64);

    public static final RegistryObject<CustomBedBlock> BLACK_ACACIA_BED = registerBlock("acacia_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_ACACIA_BED = registerBlock("acacia_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_ACACIA_BED = registerBlock("acacia_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_ACACIA_BED = registerBlock("acacia_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_ACACIA_BED = registerBlock("acacia_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_ACACIA_BED = registerBlock("acacia_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_ACACIA_BED = registerBlock("acacia_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_ACACIA_BED = registerBlock("acacia_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_ACACIA_BED = registerBlock("acacia_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_ACACIA_BED = registerBlock("acacia_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_ACACIA_BED = registerBlock("acacia_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_ACACIA_BED = registerBlock("acacia_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_ACACIA_BED = registerBlock("acacia_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_ACACIA_BED = registerBlock("acacia_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_ACACIA_BED = registerBlock("acacia_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_ACACIA_BED = registerBlock("acacia_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_BAMBOO_BED = registerBlock("bamboo_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_BAMBOO_BED = registerBlock("bamboo_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_BAMBOO_BED = registerBlock("bamboo_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_BAMBOO_BED = registerBlock("bamboo_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_BAMBOO_BED = registerBlock("bamboo_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_BAMBOO_BED = registerBlock("bamboo_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_BAMBOO_BED = registerBlock("bamboo_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_BAMBOO_BED = registerBlock("bamboo_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_BAMBOO_BED = registerBlock("bamboo_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_BAMBOO_BED = registerBlock("bamboo_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_BAMBOO_BED = registerBlock("bamboo_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_BAMBOO_BED = registerBlock("bamboo_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_BAMBOO_BED = registerBlock("bamboo_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_BAMBOO_BED = registerBlock("bamboo_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_BAMBOO_BED = registerBlock("bamboo_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_BAMBOO_BED = registerBlock("bamboo_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_BIRCH_BED = registerBlock("birch_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_BIRCH_BED = registerBlock("birch_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_BIRCH_BED = registerBlock("birch_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_BIRCH_BED = registerBlock("birch_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_BIRCH_BED = registerBlock("birch_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_BIRCH_BED = registerBlock("birch_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_BIRCH_BED = registerBlock("birch_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_BIRCH_BED = registerBlock("birch_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_BIRCH_BED = registerBlock("birch_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_BIRCH_BED = registerBlock("birch_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_BIRCH_BED = registerBlock("birch_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_BIRCH_BED = registerBlock("birch_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_BIRCH_BED = registerBlock("birch_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_BIRCH_BED = registerBlock("birch_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_BIRCH_BED = registerBlock("birch_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_BIRCH_BED = registerBlock("birch_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_CHERRY_BED = registerBlock("cherry_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_CHERRY_BED = registerBlock("cherry_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_CHERRY_BED = registerBlock("cherry_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_CHERRY_BED = registerBlock("cherry_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_CHERRY_BED = registerBlock("cherry_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_CHERRY_BED = registerBlock("cherry_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_CHERRY_BED = registerBlock("cherry_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_CHERRY_BED = registerBlock("cherry_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_CHERRY_BED = registerBlock("cherry_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_CHERRY_BED = registerBlock("cherry_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_CHERRY_BED = registerBlock("cherry_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_CHERRY_BED = registerBlock("cherry_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_CHERRY_BED = registerBlock("cherry_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_CHERRY_BED = registerBlock("cherry_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_CHERRY_BED = registerBlock("cherry_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_CHERRY_BED = registerBlock("cherry_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_CRIMSON_BED = registerBlock("crimson_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_CRIMSON_BED = registerBlock("crimson_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_CRIMSON_BED = registerBlock("crimson_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_CRIMSON_BED = registerBlock("crimson_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_CRIMSON_BED = registerBlock("crimson_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_CRIMSON_BED = registerBlock("crimson_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_CRIMSON_BED = registerBlock("crimson_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_CRIMSON_BED = registerBlock("crimson_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_CRIMSON_BED = registerBlock("crimson_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_CRIMSON_BED = registerBlock("crimson_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_CRIMSON_BED = registerBlock("crimson_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_CRIMSON_BED = registerBlock("crimson_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_CRIMSON_BED = registerBlock("crimson_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_CRIMSON_BED = registerBlock("crimson_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_CRIMSON_BED = registerBlock("crimson_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_CRIMSON_BED = registerBlock("crimson_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_DARK_OAK_BED = registerBlock("dark_oak_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_DARK_OAK_BED = registerBlock("dark_oak_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_DARK_OAK_BED = registerBlock("dark_oak_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_DARK_OAK_BED = registerBlock("dark_oak_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_DARK_OAK_BED = registerBlock("dark_oak_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_DARK_OAK_BED = registerBlock("dark_oak_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_DARK_OAK_BED = registerBlock("dark_oak_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_DARK_OAK_BED = registerBlock("dark_oak_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_DARK_OAK_BED = registerBlock("dark_oak_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_DARK_OAK_BED = registerBlock("dark_oak_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_DARK_OAK_BED = registerBlock("dark_oak_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_DARK_OAK_BED = registerBlock("dark_oak_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_DARK_OAK_BED = registerBlock("dark_oak_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_DARK_OAK_BED = registerBlock("dark_oak_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_DARK_OAK_BED = registerBlock("dark_oak_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_DARK_OAK_BED = registerBlock("dark_oak_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_JUNGLE_BED = registerBlock("jungle_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_JUNGLE_BED = registerBlock("jungle_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_JUNGLE_BED = registerBlock("jungle_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_JUNGLE_BED = registerBlock("jungle_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_JUNGLE_BED = registerBlock("jungle_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_JUNGLE_BED = registerBlock("jungle_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_JUNGLE_BED = registerBlock("jungle_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_JUNGLE_BED = registerBlock("jungle_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_JUNGLE_BED = registerBlock("jungle_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_JUNGLE_BED = registerBlock("jungle_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_JUNGLE_BED = registerBlock("jungle_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_JUNGLE_BED = registerBlock("jungle_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_JUNGLE_BED = registerBlock("jungle_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_JUNGLE_BED = registerBlock("jungle_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_JUNGLE_BED = registerBlock("jungle_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_JUNGLE_BED = registerBlock("jungle_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_MANGROVE_BED = registerBlock("mangrove_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_MANGROVE_BED = registerBlock("mangrove_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_MANGROVE_BED = registerBlock("mangrove_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_MANGROVE_BED = registerBlock("mangrove_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_MANGROVE_BED = registerBlock("mangrove_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_MANGROVE_BED = registerBlock("mangrove_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_MANGROVE_BED = registerBlock("mangrove_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_MANGROVE_BED = registerBlock("mangrove_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_MANGROVE_BED = registerBlock("mangrove_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_MANGROVE_BED = registerBlock("mangrove_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_MANGROVE_BED = registerBlock("mangrove_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_MANGROVE_BED = registerBlock("mangrove_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_MANGROVE_BED = registerBlock("mangrove_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_MANGROVE_BED = registerBlock("mangrove_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_MANGROVE_BED = registerBlock("mangrove_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_MANGROVE_BED = registerBlock("mangrove_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_SPRUCE_BED = registerBlock("spruce_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_SPRUCE_BED = registerBlock("spruce_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_SPRUCE_BED = registerBlock("spruce_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_SPRUCE_BED = registerBlock("spruce_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_SPRUCE_BED = registerBlock("spruce_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_SPRUCE_BED = registerBlock("spruce_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_SPRUCE_BED = registerBlock("spruce_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_SPRUCE_BED = registerBlock("spruce_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_SPRUCE_BED = registerBlock("spruce_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_SPRUCE_BED = registerBlock("spruce_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_SPRUCE_BED = registerBlock("spruce_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_SPRUCE_BED = registerBlock("spruce_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_SPRUCE_BED = registerBlock("spruce_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_SPRUCE_BED = registerBlock("spruce_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_SPRUCE_BED = registerBlock("spruce_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_SPRUCE_BED = registerBlock("spruce_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLACK_WARPED_BED = registerBlock("warped_black_bed",
            () -> new CustomBedBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BLUE_WARPED_BED = registerBlock("warped_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> BROWN_WARPED_BED = registerBlock("warped_brown_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> CYAN_WARPED_BED = registerBlock("warped_cyan_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GRAY_WARPED_BED = registerBlock("warped_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> GREEN_WARPED_BED = registerBlock("warped_green_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_BLUE_WARPED_BED = registerBlock("warped_light_blue_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIGHT_GRAY_WARPED_BED = registerBlock("warped_light_gray_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> LIME_WARPED_BED = registerBlock("warped_lime_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> MAGENTA_WARPED_BED = registerBlock("warped_magenta_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> ORANGE_WARPED_BED = registerBlock("warped_orange_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PINK_WARPED_BED = registerBlock("warped_pink_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> PURPLE_WARPED_BED = registerBlock("warped_purple_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> RED_WARPED_BED = registerBlock("warped_red_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> WHITE_WARPED_BED = registerBlock("warped_white_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);
    public static final RegistryObject<CustomBedBlock> YELLOW_WARPED_BED = registerBlock("warped_yellow_bed",
            () -> new CustomBedBlock(DyeColor.BLACK,BlockBehaviour.Properties.copy(Blocks.BLACK_BED)), 1);

    public static final RegistryObject<BeehiveBlock> ACACIA_BEEHIVE = registerBlock("acacia_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> BAMBOO_BEEHIVE = registerBlock("bamboo_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> BIRCH_BEEHIVE = registerBlock("birch_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> CHERRY_BEEHIVE = registerBlock("cherry_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> CRIMSON_BEEHIVE = registerBlock("crimson_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> DARK_OAK_BEEHIVE = registerBlock("dark_oak_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> JUNGLE_BEEHIVE = registerBlock("jungle_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> MANGROVE_BEEHIVE = registerBlock("mangrove_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> SPRUCE_BEEHIVE = registerBlock("spruce_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);
    public static final RegistryObject<BeehiveBlock> WARPED_BEEHIVE = registerBlock("warped_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), 64);

    public static final RegistryObject<CustomCartographyTableBlock> ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> BAMBOO_CARTOGRAPHY_TABLE = registerBlock("bamboo_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> CHERRY_CARTOGRAPHY_TABLE = registerBlock("cherry_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);
    public static final RegistryObject<CustomCartographyTableBlock> WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            () -> new CustomCartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)), 64);

    public static final RegistryObject<ComposterBlock> ACACIA_COMPOSTER = registerBlock("acacia_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> BAMBOO_COMPOSTER = registerBlock("bamboo_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> BIRCH_COMPOSTER = registerBlock("birch_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> CHERRY_COMPOSTER = registerBlock("cherry_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> CRIMSON_COMPOSTER = registerBlock("crimson_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> DARK_OAK_COMPOSTER = registerBlock("dark_oak_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> JUNGLE_COMPOSTER = registerBlock("jungle_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> MANGROVE_COMPOSTER = registerBlock("mangrove_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> OAK_COMPOSTER = registerBlock("oak_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> SPRUCE_COMPOSTER = registerBlock("spruce_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);
    public static final RegistryObject<ComposterBlock> WARPED_COMPOSTER = registerBlock("warped_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)), 64);

    public static final RegistryObject<FletchingTableBlock> ACACIA_FLETCHING_TABLE = registerBlock("acacia_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> BAMBOO_FLETCHING_TABLE = registerBlock("bamboo_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> CHERRY_FLETCHING_TABLE = registerBlock("cherry_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> CRIMSON_FLETCHING_TABLE = registerBlock("crimson_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> DARK_OAK_FLETCHING_TABLE = registerBlock("dark_oak_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> JUNGLE_FLETCHING_TABLE = registerBlock("jungle_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> MANGROVE_FLETCHING_TABLE = registerBlock("mangrove_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> OAK_FLETCHING_TABLE = registerBlock("oak_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> SPRUCE_FLETCHING_TABLE = registerBlock("spruce_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);
    public static final RegistryObject<FletchingTableBlock> WARPED_FLETCHING_TABLE = registerBlock("warped_fletching_table",
            () -> new FletchingTableBlock(BlockBehaviour.Properties.copy(Blocks.FLETCHING_TABLE)), 64);

    public static final RegistryObject<CustomGrindstoneBlock> ACACIA_BASALT_GRINDSTONE = registerBlock("acacia_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> ACACIA_DEEPSLATE_GRINDSTONE = registerBlock("acacia_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> ACACIA_GRANITE_GRINDSTONE = registerBlock("acacia_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> ACACIA_SANDSTONE_GRINDSTONE = registerBlock("acacia_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> ACACIA_STONE_GRINDSTONE = registerBlock("acacia_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BAMBOO_BASALT_GRINDSTONE = registerBlock("bamboo_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BAMBOO_DEEPSLATE_GRINDSTONE = registerBlock("bamboo_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BAMBOO_GRANITE_GRINDSTONE = registerBlock("bamboo_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BAMBOO_SANDSTONE_GRINDSTONE = registerBlock("bamboo_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BAMBOO_STONE_GRINDSTONE = registerBlock("bamboo_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BIRCH_BASALT_GRINDSTONE = registerBlock("birch_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BIRCH_DEEPSLATE_GRINDSTONE = registerBlock("birch_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BIRCH_GRANITE_GRINDSTONE = registerBlock("birch_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BIRCH_SANDSTONE_GRINDSTONE = registerBlock("birch_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> BIRCH_STONE_GRINDSTONE = registerBlock("birch_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CHERRY_BASALT_GRINDSTONE = registerBlock("cherry_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CHERRY_DEEPSLATE_GRINDSTONE = registerBlock("cherry_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CHERRY_GRANITE_GRINDSTONE = registerBlock("cherry_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CHERRY_SANDSTONE_GRINDSTONE = registerBlock("cherry_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CHERRY_STONE_GRINDSTONE = registerBlock("cherry_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CRIMSON_BASALT_GRINDSTONE = registerBlock("crimson_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CRIMSON_DEEPSLATE_GRINDSTONE = registerBlock("crimson_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CRIMSON_GRANITE_GRINDSTONE = registerBlock("crimson_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CRIMSON_SANDSTONE_GRINDSTONE = registerBlock("crimson_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> CRIMSON_STONE_GRINDSTONE = registerBlock("crimson_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> DARK_OAK_BASALT_GRINDSTONE = registerBlock("dark_oak_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> DARK_OAK_DEEPSLATE_GRINDSTONE = registerBlock("dark_oak_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> DARK_OAK_GRANITE_GRINDSTONE = registerBlock("dark_oak_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> DARK_OAK_SANDSTONE_GRINDSTONE = registerBlock("dark_oak_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> JUNGLE_BASALT_GRINDSTONE = registerBlock("jungle_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> JUNGLE_DEEPSLATE_GRINDSTONE = registerBlock("jungle_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> JUNGLE_GRANITE_GRINDSTONE = registerBlock("jungle_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> JUNGLE_SANDSTONE_GRINDSTONE = registerBlock("jungle_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> JUNGLE_STONE_GRINDSTONE = registerBlock("jungle_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> MANGROVE_BASALT_GRINDSTONE = registerBlock("mangrove_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> MANGROVE_DEEPSLATE_GRINDSTONE = registerBlock("mangrove_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> MANGROVE_GRANITE_GRINDSTONE = registerBlock("mangrove_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> MANGROVE_SANDSTONE_GRINDSTONE = registerBlock("mangrove_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> MANGROVE_STONE_GRINDSTONE = registerBlock("mangrove_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> OAK_BASALT_GRINDSTONE = registerBlock("oak_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> OAK_DEEPSLATE_GRINDSTONE = registerBlock("oak_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> OAK_GRANITE_GRINDSTONE = registerBlock("oak_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> OAK_SANDSTONE_GRINDSTONE = registerBlock("oak_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> OAK_STONE_GRINDSTONE = registerBlock("oak_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> SPRUCE_BASALT_GRINDSTONE = registerBlock("spruce_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> SPRUCE_DEEPSLATE_GRINDSTONE = registerBlock("spruce_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> SPRUCE_GRANITE_GRINDSTONE = registerBlock("spruce_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> SPRUCE_SANDSTONE_GRINDSTONE = registerBlock("spruce_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> SPRUCE_STONE_GRINDSTONE = registerBlock("spruce_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> WARPED_BASALT_GRINDSTONE = registerBlock("warped_basalt_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> WARPED_DEEPSLATE_GRINDSTONE = registerBlock("warped_deepslate_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> WARPED_GRANITE_GRINDSTONE = registerBlock("warped_granite_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> WARPED_SANDSTONE_GRINDSTONE = registerBlock("warped_sandstone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);
    public static final RegistryObject<CustomGrindstoneBlock> WARPED_STONE_GRINDSTONE = registerBlock("warped_stone_grindstone",
            () -> new CustomGrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)), 64);

    public static final RegistryObject<CustomJukeboxBlock> ACACIA_JUKEBOX = registerBlock("acacia_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> BAMBOO_JUKEBOX = registerBlock("bamboo_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> BIRCH_JUKEBOX = registerBlock("birch_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> CHERRY_JUKEBOX = registerBlock("cherry_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> CRIMSON_JUKEBOX = registerBlock("crimson_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> DARK_OAK_JUKEBOX = registerBlock("dark_oak_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> JUNGLE_JUKEBOX = registerBlock("jungle_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> MANGROVE_JUKEBOX = registerBlock("mangrove_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> OAK_JUKEBOX = registerBlock("oak_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> SPRUCE_JUKEBOX = registerBlock("spruce_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);
    public static final RegistryObject<CustomJukeboxBlock> WARPED_JUKEBOX = registerBlock("warped_jukebox",
            () -> new CustomJukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)), 64);

    public static final RegistryObject<NoteBlock> ACACIA_NOTE_BLOCK = registerBlock("acacia_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> BAMBOO_NOTE_BLOCK = registerBlock("bamboo_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> BIRCH_NOTE_BLOCK = registerBlock("birch_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> CHERRY_NOTE_BLOCK = registerBlock("cherry_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> CRIMSON_NOTE_BLOCK = registerBlock("crimson_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> DARK_OAK_NOTE_BLOCK = registerBlock("dark_oak_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> JUNGLE_NOTE_BLOCK = registerBlock("jungle_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> MANGROVE_NOTE_BLOCK = registerBlock("mangrove_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> OAK_NOTE_BLOCK = registerBlock("oak_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> SPRUCE_NOTE_BLOCK = registerBlock("spruce_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);
    public static final RegistryObject<NoteBlock> WARPED_NOTE_BLOCK = registerBlock("warped_note_block",
            () -> new NoteBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)), 64);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, int stacksTo) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, stacksTo);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, int stacksTo) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(stacksTo)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
