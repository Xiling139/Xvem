package net.xiling.xvem.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.item.custom.ExpressTrainItem;
import net.xiling.xvem.item.custom.ModSmithingTemplateItem;
import net.xiling.xvem.item.custom.ModToolTiers;
import net.xiling.xvem.item.custom.SuperExpressTrainItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XilingsMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWER_CORE = ITEMS.register("power_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVENCED_POWER_CORE = ITEMS.register("advanced_power_core",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAR_INGOT = ITEMS.register("star_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_SWORD = ITEMS.register("star_sword",
            () -> new SwordItem(ModToolTiers.STAR, 4, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAR_PICKAXE = ITEMS.register("star_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STAR, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAR_AXE = ITEMS.register("star_axe",
            () -> new AxeItem(ModToolTiers.STAR, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAR_SHOVEL = ITEMS.register("star_shovel",
            () -> new ShovelItem(ModToolTiers.STAR, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAR_HOE = ITEMS.register("star_hoe",
            () -> new HoeItem(ModToolTiers.STAR, -3, -1.0F,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> STAR_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("star_upgrade_smithing_template",
            ModSmithingTemplateItem::createStarUpgradeTemplate);

    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXPRESS_TRAIN = ITEMS.register("express_train",
            () -> new ExpressTrainItem(AbstractMinecart.Type.RIDEABLE,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SUPER_EXPRESS_TRAIN = ITEMS.register("super_express_train",
            () -> new SuperExpressTrainItem(AbstractMinecart.Type.RIDEABLE,
                    new Item.Properties().stacksTo(1)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

