package net.ash.aassets.item;

import net.ash.aassets.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier FEDERATION = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FEDERATION_TOOL,
            1, 13f, 6f, 28, () -> Ingredient.of(ModItems.FEDSWORD));

}
