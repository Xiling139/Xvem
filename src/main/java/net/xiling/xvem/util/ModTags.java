package net.xiling.xvem.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.xiling.xvem.XilingsMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_STAR_TOOL
                = tag("needs_star_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(XilingsMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
     }
}
