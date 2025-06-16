package net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;

import com.mojang.serialization.Lifecycle;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.piston.PistonMovingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;

public class CustomBlockEntityType<T extends BlockEntity> {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final net.minecraft.world.level.block.entity.BlockEntityType<FurnaceBlockEntity> FURNACE = register("furnace", CustomBlockEntityType.Builder.of(FurnaceBlockEntity::new, Blocks.FURNACE));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<ChestBlockEntity> CHEST = register("chest", CustomBlockEntityType.Builder.of(ChestBlockEntity::new, Blocks.CHEST));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<TrappedChestBlockEntity> TRAPPED_CHEST = register("trapped_chest", CustomBlockEntityType.Builder.of(TrappedChestBlockEntity::new, Blocks.TRAPPED_CHEST));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<EnderChestBlockEntity> ENDER_CHEST = register("ender_chest", CustomBlockEntityType.Builder.of(EnderChestBlockEntity::new, Blocks.ENDER_CHEST));
    public static final CustomBlockEntityType<CustomJukeboxBlockEntity> JUKEBOX = customRegister("jukebox", BlockEntityType.Builder.of(CustomJukeboxBlockEntity::new, Blocks.JUKEBOX), CustomBlockEntityType.Builder.of(CustomJukeboxBlockEntity::new, Blocks.JUKEBOX));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<DispenserBlockEntity> DISPENSER = register("dispenser", CustomBlockEntityType.Builder.of(DispenserBlockEntity::new, Blocks.DISPENSER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<DropperBlockEntity> DROPPER = register("dropper", CustomBlockEntityType.Builder.of(DropperBlockEntity::new, Blocks.DROPPER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SignBlockEntity> SIGN = register("sign", CustomBlockEntityType.Builder.of(SignBlockEntity::new, Blocks.OAK_SIGN, Blocks.SPRUCE_SIGN, Blocks.BIRCH_SIGN, Blocks.ACACIA_SIGN, Blocks.CHERRY_SIGN, Blocks.JUNGLE_SIGN, Blocks.DARK_OAK_SIGN, Blocks.OAK_WALL_SIGN, Blocks.SPRUCE_WALL_SIGN, Blocks.BIRCH_WALL_SIGN, Blocks.ACACIA_WALL_SIGN, Blocks.CHERRY_WALL_SIGN, Blocks.JUNGLE_WALL_SIGN, Blocks.DARK_OAK_WALL_SIGN, Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN, Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN, Blocks.MANGROVE_SIGN, Blocks.MANGROVE_WALL_SIGN, Blocks.BAMBOO_SIGN, Blocks.BAMBOO_WALL_SIGN));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<HangingSignBlockEntity> HANGING_SIGN = register("hanging_sign", CustomBlockEntityType.Builder.of(HangingSignBlockEntity::new, Blocks.OAK_HANGING_SIGN, Blocks.SPRUCE_HANGING_SIGN, Blocks.BIRCH_HANGING_SIGN, Blocks.ACACIA_HANGING_SIGN, Blocks.CHERRY_HANGING_SIGN, Blocks.JUNGLE_HANGING_SIGN, Blocks.DARK_OAK_HANGING_SIGN, Blocks.CRIMSON_HANGING_SIGN, Blocks.WARPED_HANGING_SIGN, Blocks.MANGROVE_HANGING_SIGN, Blocks.BAMBOO_HANGING_SIGN, Blocks.OAK_WALL_HANGING_SIGN, Blocks.SPRUCE_WALL_HANGING_SIGN, Blocks.BIRCH_WALL_HANGING_SIGN, Blocks.ACACIA_WALL_HANGING_SIGN, Blocks.CHERRY_WALL_HANGING_SIGN, Blocks.JUNGLE_WALL_HANGING_SIGN, Blocks.DARK_OAK_WALL_HANGING_SIGN, Blocks.CRIMSON_WALL_HANGING_SIGN, Blocks.WARPED_WALL_HANGING_SIGN, Blocks.MANGROVE_WALL_HANGING_SIGN, Blocks.BAMBOO_WALL_HANGING_SIGN));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SpawnerBlockEntity> MOB_SPAWNER = register("mob_spawner", CustomBlockEntityType.Builder.of(SpawnerBlockEntity::new, Blocks.SPAWNER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<PistonMovingBlockEntity> PISTON = register("piston", CustomBlockEntityType.Builder.of(PistonMovingBlockEntity::new, Blocks.MOVING_PISTON));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BrewingStandBlockEntity> BREWING_STAND = register("brewing_stand", CustomBlockEntityType.Builder.of(BrewingStandBlockEntity::new, Blocks.BREWING_STAND));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<EnchantmentTableBlockEntity> ENCHANTING_TABLE = register("enchanting_table", CustomBlockEntityType.Builder.of(EnchantmentTableBlockEntity::new, Blocks.ENCHANTING_TABLE));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<TheEndPortalBlockEntity> END_PORTAL = register("end_portal", CustomBlockEntityType.Builder.of(TheEndPortalBlockEntity::new, Blocks.END_PORTAL));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BeaconBlockEntity> BEACON = register("beacon", CustomBlockEntityType.Builder.of(BeaconBlockEntity::new, Blocks.BEACON));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SkullBlockEntity> SKULL = register("skull", CustomBlockEntityType.Builder.of(SkullBlockEntity::new, Blocks.SKELETON_SKULL, Blocks.SKELETON_WALL_SKULL, Blocks.CREEPER_HEAD, Blocks.CREEPER_WALL_HEAD, Blocks.DRAGON_HEAD, Blocks.DRAGON_WALL_HEAD, Blocks.ZOMBIE_HEAD, Blocks.ZOMBIE_WALL_HEAD, Blocks.WITHER_SKELETON_SKULL, Blocks.WITHER_SKELETON_WALL_SKULL, Blocks.PLAYER_HEAD, Blocks.PLAYER_WALL_HEAD, Blocks.PIGLIN_HEAD, Blocks.PIGLIN_WALL_HEAD));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<DaylightDetectorBlockEntity> DAYLIGHT_DETECTOR = register("daylight_detector", CustomBlockEntityType.Builder.of(DaylightDetectorBlockEntity::new, Blocks.DAYLIGHT_DETECTOR));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<HopperBlockEntity> HOPPER = register("hopper", CustomBlockEntityType.Builder.of(HopperBlockEntity::new, Blocks.HOPPER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<ComparatorBlockEntity> COMPARATOR = register("comparator", CustomBlockEntityType.Builder.of(ComparatorBlockEntity::new, Blocks.COMPARATOR));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BannerBlockEntity> BANNER = register("banner", CustomBlockEntityType.Builder.of(BannerBlockEntity::new, Blocks.WHITE_BANNER, Blocks.ORANGE_BANNER, Blocks.MAGENTA_BANNER, Blocks.LIGHT_BLUE_BANNER, Blocks.YELLOW_BANNER, Blocks.LIME_BANNER, Blocks.PINK_BANNER, Blocks.GRAY_BANNER, Blocks.LIGHT_GRAY_BANNER, Blocks.CYAN_BANNER, Blocks.PURPLE_BANNER, Blocks.BLUE_BANNER, Blocks.BROWN_BANNER, Blocks.GREEN_BANNER, Blocks.RED_BANNER, Blocks.BLACK_BANNER, Blocks.WHITE_WALL_BANNER, Blocks.ORANGE_WALL_BANNER, Blocks.MAGENTA_WALL_BANNER, Blocks.LIGHT_BLUE_WALL_BANNER, Blocks.YELLOW_WALL_BANNER, Blocks.LIME_WALL_BANNER, Blocks.PINK_WALL_BANNER, Blocks.GRAY_WALL_BANNER, Blocks.LIGHT_GRAY_WALL_BANNER, Blocks.CYAN_WALL_BANNER, Blocks.PURPLE_WALL_BANNER, Blocks.BLUE_WALL_BANNER, Blocks.BROWN_WALL_BANNER, Blocks.GREEN_WALL_BANNER, Blocks.RED_WALL_BANNER, Blocks.BLACK_WALL_BANNER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<StructureBlockEntity> STRUCTURE_BLOCK = register("structure_block", CustomBlockEntityType.Builder.of(StructureBlockEntity::new, Blocks.STRUCTURE_BLOCK));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<TheEndGatewayBlockEntity> END_GATEWAY = register("end_gateway", CustomBlockEntityType.Builder.of(TheEndGatewayBlockEntity::new, Blocks.END_GATEWAY));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<CommandBlockEntity> COMMAND_BLOCK = register("command_block", CustomBlockEntityType.Builder.of(CommandBlockEntity::new, Blocks.COMMAND_BLOCK, Blocks.CHAIN_COMMAND_BLOCK, Blocks.REPEATING_COMMAND_BLOCK));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<ShulkerBoxBlockEntity> SHULKER_BOX = register("shulker_box", CustomBlockEntityType.Builder.of(ShulkerBoxBlockEntity::new, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BedBlockEntity> BED = register("bed", CustomBlockEntityType.Builder.of(BedBlockEntity::new, Blocks.RED_BED, Blocks.BLACK_BED, Blocks.BLUE_BED, Blocks.BROWN_BED, Blocks.CYAN_BED, Blocks.GRAY_BED, Blocks.GREEN_BED, Blocks.LIGHT_BLUE_BED, Blocks.LIGHT_GRAY_BED, Blocks.LIME_BED, Blocks.MAGENTA_BED, Blocks.ORANGE_BED, Blocks.PINK_BED, Blocks.PURPLE_BED, Blocks.WHITE_BED, Blocks.YELLOW_BED));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<ConduitBlockEntity> CONDUIT = register("conduit", CustomBlockEntityType.Builder.of(ConduitBlockEntity::new, Blocks.CONDUIT));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BarrelBlockEntity> BARREL = register("barrel", CustomBlockEntityType.Builder.of(BarrelBlockEntity::new, Blocks.BARREL));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SmokerBlockEntity> SMOKER = register("smoker", CustomBlockEntityType.Builder.of(SmokerBlockEntity::new, Blocks.SMOKER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BlastFurnaceBlockEntity> BLAST_FURNACE = register("blast_furnace", CustomBlockEntityType.Builder.of(BlastFurnaceBlockEntity::new, Blocks.BLAST_FURNACE));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<LecternBlockEntity> LECTERN = register("lectern", CustomBlockEntityType.Builder.of(LecternBlockEntity::new, Blocks.LECTERN));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BellBlockEntity> BELL = register("bell", CustomBlockEntityType.Builder.of(BellBlockEntity::new, Blocks.BELL));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<JigsawBlockEntity> JIGSAW = register("jigsaw", CustomBlockEntityType.Builder.of(JigsawBlockEntity::new, Blocks.JIGSAW));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<CampfireBlockEntity> CAMPFIRE = register("campfire", CustomBlockEntityType.Builder.of(CampfireBlockEntity::new, Blocks.CAMPFIRE, Blocks.SOUL_CAMPFIRE));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BeehiveBlockEntity> BEEHIVE = register("beehive", CustomBlockEntityType.Builder.of(BeehiveBlockEntity::new, Blocks.BEE_NEST, Blocks.BEEHIVE));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SculkSensorBlockEntity> SCULK_SENSOR = register("sculk_sensor", CustomBlockEntityType.Builder.of(SculkSensorBlockEntity::new, Blocks.SCULK_SENSOR));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<CalibratedSculkSensorBlockEntity> CALIBRATED_SCULK_SENSOR = register("calibrated_sculk_sensor", CustomBlockEntityType.Builder.of(CalibratedSculkSensorBlockEntity::new, Blocks.CALIBRATED_SCULK_SENSOR));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SculkCatalystBlockEntity> SCULK_CATALYST = register("sculk_catalyst", CustomBlockEntityType.Builder.of(SculkCatalystBlockEntity::new, Blocks.SCULK_CATALYST));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<SculkShriekerBlockEntity> SCULK_SHRIEKER = register("sculk_shrieker", CustomBlockEntityType.Builder.of(SculkShriekerBlockEntity::new, Blocks.SCULK_SHRIEKER));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<ChiseledBookShelfBlockEntity> CHISELED_BOOKSHELF = register("chiseled_bookshelf", CustomBlockEntityType.Builder.of(ChiseledBookShelfBlockEntity::new, Blocks.CHISELED_BOOKSHELF));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<BrushableBlockEntity> BRUSHABLE_BLOCK = register("brushable_block", CustomBlockEntityType.Builder.of(BrushableBlockEntity::new, Blocks.SUSPICIOUS_SAND, Blocks.SUSPICIOUS_GRAVEL));
    public static final net.minecraft.world.level.block.entity.BlockEntityType<DecoratedPotBlockEntity> DECORATED_POT = register("decorated_pot", CustomBlockEntityType.Builder.of(DecoratedPotBlockEntity::new, Blocks.DECORATED_POT));
    private final net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<? extends T> factory;
    private final Set<Block> validBlocks;
    private final Type<?> dataType;

    @Nullable
    public static ResourceLocation getKey(net.minecraft.world.level.block.entity.BlockEntityType<?> pBlockEntityType) {
        return BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(pBlockEntityType);
    }

    private static <T extends BlockEntity> CustomBlockEntityType<T> customRegister(String pKey, BlockEntityType.Builder<T> pBuilder, CustomBlockEntityType.Builder<T> pBuilder2) {
        Type<?> type = Util.fetchChoiceType(References.BLOCK_ENTITY, pKey);
        ((WritableRegistry) BuiltInRegistries.BLOCK_ENTITY_TYPE).register(ResourceKey.create(BuiltInRegistries.BLOCK_ENTITY_TYPE.key(), new ResourceLocation(pKey)), pBuilder2.customBuild(type), Lifecycle.stable());
//        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, pKey, pBuilder2.customBuild(type));
        return pBuilder2.customBuild(type);
    }

    private static <T extends BlockEntity> BlockEntityType<T> register(String pKey, CustomBlockEntityType.Builder<T> pBuilder) {
        if (pBuilder.validBlocks.isEmpty()) {
            LOGGER.warn("Block entity type {} requires at least one valid block to be defined!", (Object)pKey);
        }

        Type<?> type = Util.fetchChoiceType(References.BLOCK_ENTITY, pKey);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, pKey, pBuilder.build(type));
    }

    public CustomBlockEntityType(net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<? extends T> pFactory, Set<Block> pValidBlocks, Type<?> pDataType) {
        this.factory = pFactory;
        this.validBlocks = pValidBlocks;
        this.dataType = pDataType;
    }

    @Nullable
    public T create(BlockPos pPos, BlockState pState) {
        return this.factory.create(pPos, pState);
    }

    public boolean isValid(BlockState pState) {
        return true;
    }

//    @Nullable
//    public T getBlockEntity(BlockGetter pLevel, BlockPos pPos) {
//        BlockEntity blockentity = pLevel.getBlockEntity(pPos);
//        return (T)(blockentity != null && blockentity.getType() == this ? blockentity : null);
//    }

    @FunctionalInterface
    public interface BlockEntitySupplier<T extends BlockEntity> {
        T create(BlockPos pPos, BlockState pState);
    }

    public static final class Builder<T extends BlockEntity> {
        private final net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<? extends T> factory;
        final Set<Block> validBlocks;

        private Builder(net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<? extends T> pFactory, Set<Block> pValidBlocks) {
            this.factory = pFactory;
            this.validBlocks = pValidBlocks;
        }

        public static <T extends BlockEntity> Builder<? extends T> of(BlockEntityType.BlockEntitySupplier<? extends T> pFactory, Block... pValidBlocks) {
            return new CustomBlockEntityType.Builder<>(pFactory, ImmutableSet.copyOf(pValidBlocks));
        }

        public net.minecraft.world.level.block.entity.BlockEntityType<T> build(Type<?> pDataType) {
            return new net.minecraft.world.level.block.entity.BlockEntityType<>(this.factory, this.validBlocks, pDataType);
        }
        public CustomBlockEntityType<T> customBuild(Type<?> pDataType) {
            return new CustomBlockEntityType<>(this.factory, this.validBlocks, pDataType);
        }
    }
}