package net.jaydentjd.extrawoodblocksultimate.block.custom;

import net.jaydentjd.extrawoodblocksultimate.block.custom.menu.CustomSmithingMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CustomSmithingTableBlock extends SmithingTableBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.upgrade");
    public CustomSmithingTableBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public @NotNull MenuProvider getMenuProvider(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos) {
        return new SimpleMenuProvider((p_277304_, p_277305_, p_277306_) -> new CustomSmithingMenu(p_277304_, p_277305_, ContainerLevelAccess.create(pLevel, pPos), pLevel.getBlockState(pPos).getBlock()), CONTAINER_TITLE);
    }
}
