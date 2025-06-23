package net.jaydentjd.extrawoodblocksultimate.mixin;

import net.jaydentjd.extrawoodblocksultimate.util.ModTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Set;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {
    @Final
    @Shadow private Set<Block> validBlocks;

    /**
     * @author Jayden
     * @reason To make the jukeboxes work
     */
    @Overwrite
    public boolean isValid(BlockState pState) {
        if (pState.is(ModTags.Blocks.JUKEBOXES)) {
            return true;
        } else {
            return this.validBlocks.contains(pState.getBlock());
        }
    }
}
