package net.xiling.xvem.item;

import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.item.custom.ExpressTrainItem;
import net.xiling.xvem.item.custom.SuperExpressTrainItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XilingsMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB)));

    public static final RegistryObject<Item> POWER_CORE = ITEMS.register("power_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB)));
    public static final RegistryObject<Item> ADVENCED_POWER_CORE = ITEMS.register("advanced_power_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB)));

    public static final RegistryObject<Item> EXPRESS_TRAIN = ITEMS.register("express_train",
            () -> new ExpressTrainItem(AbstractMinecart.Type.RIDEABLE,
                    new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SUPER_EXPRESS_TRAIN = ITEMS.register("super_express_train",
            () -> new SuperExpressTrainItem(AbstractMinecart.Type.RIDEABLE,
                    new Item.Properties().tab(ModCreativeModeTab.INDUSTRY_TAB).stacksTo(1)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

