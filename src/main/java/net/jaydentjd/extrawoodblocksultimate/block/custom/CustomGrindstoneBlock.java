package net.jaydentjd.extrawoodblocksultimate.block.custom;

import net.jaydentjd.extrawoodblocksultimate.block.custom.menu.CustomGrindstoneMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.GrindstoneBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CustomGrindstoneBlock extends GrindstoneBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.grindstone_title");

    public CustomGrindstoneBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
        return new SimpleMenuProvider((p_53812_, p_53813_, p_53814_) -> {
            return new CustomGrindstoneMenu(p_53812_, p_53813_, ContainerLevelAccess.create(pLevel, pPos), pLevel.getBlockState(pPos).getBlock());
        }, CONTAINER_TITLE);
    }
}