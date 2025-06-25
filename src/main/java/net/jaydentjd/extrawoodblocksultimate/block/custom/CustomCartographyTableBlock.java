package net.jaydentjd.extrawoodblocksultimate.block.custom;

import javax.annotation.Nullable;

import net.jaydentjd.extrawoodblocksultimate.block.custom.menu.CustomCartographyTableMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CartographyTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CustomCartographyTableBlock extends CartographyTableBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.cartography_table");
    public CustomCartographyTableBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    @Nullable
    public MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
        return new SimpleMenuProvider((p_51353_, p_51354_, p_51355_) -> {
            return new CustomCartographyTableMenu(p_51353_, p_51354_, ContainerLevelAccess.create(pLevel, pPos), pLevel.getBlockState(pPos).getBlock());
        }, CONTAINER_TITLE);
    }
}