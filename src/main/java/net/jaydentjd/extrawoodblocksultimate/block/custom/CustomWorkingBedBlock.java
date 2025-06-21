package net.jaydentjd.extrawoodblocksultimate.block.custom;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;

public class CustomWorkingBedBlock extends BedBlock {
    public CustomWorkingBedBlock(DyeColor pColor, Properties pProperties) {
        super(pColor, pProperties);
    }
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}
