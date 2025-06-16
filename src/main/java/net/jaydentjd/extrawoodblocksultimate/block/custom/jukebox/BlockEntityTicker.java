package net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

@FunctionalInterface
public interface BlockEntityTicker<T extends BlockEntity> {
    void tick(Level pLevel, BlockPos pPos, BlockState pState, T pBlockEntity);
}