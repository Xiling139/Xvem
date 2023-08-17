package net.xiling.xvem.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, XilingsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ADVENCED_POWER_CORE);
        simpleItem(ModItems.DIAMOND_STICK);
        simpleItem(ModItems.EXPRESS_TRAIN);
        simpleItem(ModItems.POWER_CORE);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.STAR_INGOT);
        simpleItem(ModItems.STAR_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.SUPER_EXPRESS_TRAIN);

        toolItem(ModItems.STAR_AXE);
        toolItem(ModItems.STAR_HOE);
        toolItem(ModItems.STAR_PICKAXE);
        toolItem(ModItems.STAR_SHOVEL);
        toolItem(ModItems.STAR_SWORD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(XilingsMod.MOD_ID, "item/" + item.getId().getPath()));

    }

    private ItemModelBuilder toolItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(XilingsMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
