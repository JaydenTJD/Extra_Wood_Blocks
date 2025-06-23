package net.jaydentjd.extrawoodblocksultimate.util;

import net.jaydentjd.extrawoodblocksultimate.ExtraWoodBlocksUltimate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> JUKEBOXES = tag("custom_jukeboxes");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ExtraWoodBlocksUltimate.MOD_ID, name));
        }
    }
}
