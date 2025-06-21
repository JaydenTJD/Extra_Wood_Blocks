package net.jaydentjd.extrawoodblocksultimate.mixin;

import net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox.CustomJukeboxBlock;
import net.jaydentjd.extrawoodblocksultimate.block.custom.jukebox.CustomJukeboxBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RecordItem.class)
public class JukeboxMixin {
    private RecordItem self() {
        return (RecordItem) (Object) this;
    }
    /**
     * @author
     * @reason
     */
    @Overwrite
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);
        if (blockstate.is(Blocks.JUKEBOX) && !blockstate.getValue(JukeboxBlock.HAS_RECORD)) {
            ItemStack itemstack = pContext.getItemInHand();
            if (!level.isClientSide) {
                Player player = pContext.getPlayer();
                BlockEntity blockentity = level.getBlockEntity(blockpos);
                if (blockentity instanceof JukeboxBlockEntity) {
                    JukeboxBlockEntity jukeboxblockentity = (JukeboxBlockEntity)blockentity;
                    jukeboxblockentity.setFirstItem(itemstack.copy());
                    level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, blockstate));
                }

                itemstack.shrink(1);
                if (player != null) {
                    player.awardStat(Stats.PLAY_RECORD);
                }
            }

            return InteractionResult.sidedSuccess(level.isClientSide);

        } else if (blockstate.getBlock() instanceof CustomJukeboxBlock && !blockstate.getValue(CustomJukeboxBlock.HAS_RECORD)) {
            ItemStack itemstack = pContext.getItemInHand();
            if (!level.isClientSide) {
                Player player = pContext.getPlayer();
                BlockEntity blockentity = level.getBlockEntity(blockpos);
                if (blockentity instanceof CustomJukeboxBlockEntity) {
                    CustomJukeboxBlockEntity jukeboxblockentity = (CustomJukeboxBlockEntity)blockentity;
                    jukeboxblockentity.setFirstItem(itemstack.copy());
                    level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, blockstate));
                }

                itemstack.shrink(1);
                if (player != null) {
                    player.awardStat(Stats.PLAY_RECORD);
                }
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }
}
