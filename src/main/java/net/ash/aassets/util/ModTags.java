package net.ash.aassets.util;

import net.ash.aassets.aassets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FEDERATION_TOOL = createTag("needs_federation_tool");
        public static final TagKey<Block> INCORRECT_FOR_FEDERATION_TOOL = createTag("incorrect_for_federation_tool");

        private static TagKey<net.minecraft.world.level.block.Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(aassets.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(aassets.MODID, name));
        }
    }
}
