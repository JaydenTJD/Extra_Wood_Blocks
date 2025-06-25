package net.jaydentjd.extrawoodblocksultimate.block.custom.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.SmithingMenu;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class CustomSmithingMenu extends SmithingMenu {
    ContainerLevelAccess ACCESS;
    Block BLOCK;
    public CustomSmithingMenu(int pContainerId, Inventory pPlayerInventory, ContainerLevelAccess pAccess, Block pBlock) {
        super(pContainerId, pPlayerInventory, pAccess);
        BLOCK = pBlock;
        ACCESS = pAccess;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return stillValid(ACCESS, pPlayer, BLOCK);
    }
}
