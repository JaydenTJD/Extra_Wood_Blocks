package net.jaydentjd.extrawoodblocksultimate.block.custom.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.LoomMenu;
import net.minecraft.world.level.block.Block;

public class CustomLoomMenu extends LoomMenu {
    Block BLOCK;
    ContainerLevelAccess ACCESS;

    public CustomLoomMenu(int pContainerId, Inventory pPlayerInventory, ContainerLevelAccess pAccess, Block pBlock) {
        super(pContainerId, pPlayerInventory, pAccess);
        BLOCK = pBlock;
        ACCESS = pAccess;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ACCESS, pPlayer, BLOCK);
    }
}
