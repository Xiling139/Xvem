package net.xiling.xvem.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.block.ModBlocks;
import net.xiling.xvem.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADVENCED_POWER_CORE.get())
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('P', ModItems.POWER_CORE.get())
                .unlockedBy(getHasName(ModItems.POWER_CORE.get()), has(ModItems.POWER_CORE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COAL_GENERATOR.get())
                .pattern("CCC")
                .pattern("CMC")
                .pattern("CPC")
                .define('C', Items.COAL_BLOCK)
                .define('M', ModBlocks.MACHINE_FRAME.get())
                .define('P', ModItems.POWER_CORE.get())
                .unlockedBy(getHasName(Items.COAL_BLOCK), has(Items.COAL_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_STICK.get())
                .pattern("D")
                .pattern("D")
                .pattern("D")
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, ModItems.EXPRESS_TRAIN.get())
                .pattern(" P ")
                .pattern("GMG")
                .pattern("GGG")
                .define('P', ModItems.POWER_CORE.get())
                .define('M', Items.MINECART)
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.MINECART), has(Items.MINECART))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MACHINE_FRAME.get())
                .pattern("S S")
                .pattern(" # ")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('#', Items.STONE)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POWER_CORE.get())
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('R', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STAR_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.STAR_INGOT.get()), has(ModItems.STAR_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STAR_INGOT.get(), 9)
                .requires(ModBlocks.STAR_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STAR_BLOCK.get()), has(ModBlocks.STAR_BLOCK.get()))
                .save(pWriter,  new ResourceLocation(XilingsMod.MOD_ID, getItemName(ModItems.STAR_INGOT.get()) + "_from_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAR_INGOT.get())
                .pattern("NN")
                .define('N', Items.NETHER_STAR)
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAR_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("GUG")
                .pattern("NDN")
                .pattern("GSG")
                .define('G', Items.GOLD_INGOT)
                .define('U', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .define('N', Items.NETHERITE_INGOT)
                .define('D', Items.DIAMOND_BLOCK)
                .define('S', ModItems.DIAMOND_STICK.get())
                .unlockedBy(getHasName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter, new ResourceLocation(XilingsMod.MOD_ID, getItemName(ModItems.STEEL_INGOT.get()) + "_from_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 4)
                .pattern(" I ")
                .pattern("ICI")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('C', Items.COAL)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, ModItems.SUPER_EXPRESS_TRAIN.get())
                .pattern(" A ")
                .pattern("DED")
                .pattern("DDD")
                .define('A', ModItems.ADVENCED_POWER_CORE.get())
                .define('E', ModItems.EXPRESS_TRAIN.get())
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.EXPRESS_TRAIN.get()), has(ModItems.EXPRESS_TRAIN.get()))
                .save(pWriter);

        StarSmithing(pWriter, Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.STAR_AXE.get());
        StarSmithing(pWriter, Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.STAR_HOE.get());
        StarSmithing(pWriter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.STAR_PICKAXE.get());
        StarSmithing(pWriter, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.STAR_SHOVEL.get());
        StarSmithing(pWriter, Items.NETHERITE_SWORD, RecipeCategory.COMBAT, ModItems.STAR_SWORD.get());
    }

    protected static void StarSmithing(Consumer<FinishedRecipe> p_251614_, Item p_250046_, RecipeCategory p_248986_, Item p_250389_) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.STAR_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(p_250046_), Ingredient.of(ModItems.STAR_INGOT.get()), p_248986_, p_250389_)
                .unlocks("has_star_ingot", has(ModItems.STAR_INGOT.get()))
                .save(p_251614_, new ResourceLocation(XilingsMod.MOD_ID, getItemName(p_250389_) + "_smithing"));
    }
}
