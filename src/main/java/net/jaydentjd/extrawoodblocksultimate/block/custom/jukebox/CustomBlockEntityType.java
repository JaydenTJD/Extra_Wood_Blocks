package net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox;

import com.mojang.datafixers.types.Type;
import java.util.Set;

import net.jaydentjd.extrawoodblocksultimate.ExtraWoodBlocksUltimate;
import net.jaydentjd.extrawoodblocksultimate.block.ModBlocks;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.level.block.entity.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomBlockEntityType extends BlockEntityType {

    public CustomBlockEntityType(BlockEntitySupplier pFactory, Set pValidBlocks, Type pDataType) {
        super(pFactory, pValidBlocks, pDataType);
    }

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraWoodBlocksUltimate.MOD_ID);

    public static final RegistryObject<BlockEntityType<JukeboxBlockEntity>> CUSTOM_JUKEBOX = BLOCK_ENTITY_TYPES.register("custom_jukebox", () -> Builder.of(JukeboxBlockEntity::new,
            ModBlocks.ACACIA_JUKEBOX.get(),
            ModBlocks.BAMBOO_JUKEBOX.get(),
            ModBlocks.BIRCH_JUKEBOX.get(),
            ModBlocks.CHERRY_JUKEBOX.get(),
            ModBlocks.CRIMSON_JUKEBOX.get(),
            ModBlocks.DARK_OAK_JUKEBOX.get(),
            ModBlocks.JUNGLE_JUKEBOX.get(),
            ModBlocks.MANGROVE_JUKEBOX.get(),
            ModBlocks.OAK_JUKEBOX.get(),
            ModBlocks.SPRUCE_JUKEBOX.get(),
            ModBlocks.WARPED_JUKEBOX.get()
    ).build(null));

    private static <T extends BlockEntity> BlockEntityType<T> register(String pKey, BlockEntityType.Builder<T> pBuilder) {
        Type<?> type = Util.fetchChoiceType(References.BLOCK_ENTITY, pKey);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, pKey, pBuilder.build(type));
    }
}