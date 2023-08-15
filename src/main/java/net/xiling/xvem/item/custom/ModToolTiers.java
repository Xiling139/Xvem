package net.xiling.xvem.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static Tier STAR;

    static {
        STAR = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2649, 13.0F, 7.0F, 24,
                        ModTags.Blocks.NEEDS_STAR_TOOL,  () -> Ingredient.of(Items.NETHER_STAR)),
                new ResourceLocation(XilingsMod.MOD_ID, "star"), List.of(Tiers.NETHERITE), List.of()
        );
    }
}
