package net.jaydentjd.extrawoodblocksultimate.block.custom;

import net.jaydentjd.extrawoodblocksultimate.block.custom.menu.CustomLoomMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LoomBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CustomLoomBlock extends LoomBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.loom");

    public CustomLoomBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
        return new SimpleMenuProvider((p_54783_, p_54784_, p_54785_) -> {
            return new CustomLoomMenu(p_54783_, p_54784_, ContainerLevelAccess.create(pLevel, pPos), pLevel.getBlockState(pPos).getBlock());
        }, CONTAINER_TITLE);
    }
}
