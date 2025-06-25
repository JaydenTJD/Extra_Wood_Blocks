package net.jaydentjd.extrawoodblocksultimate.util;

import net.jaydentjd.extrawoodblocksultimate.ExtraWoodBlocksUltimate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {


        public static final TagKey<Block> JUKEBOXES = tag("custom_jukeboxes");
        public static final TagKey<Block> LECTERNS = tag("custom_lecterns");
        public static final TagKey<Block> SMOKERS = tag("custom_smokers");
        public static final TagKey<Block> CAMPFIRES = tag("custom_campfires");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ExtraWoodBlocksUltimate.MOD_ID, name));
        }
    }
}
