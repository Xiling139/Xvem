package net.xiling.xvem.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            XilingsMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> MATERIAL_TAB = CREATIVE_MODE_TABS.register("material_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get())).title(Component.translatable("Materials")).build());

    public static RegistryObject<CreativeModeTab> INDUSTRY_TAB = CREATIVE_MODE_TABS.register("industry_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POWER_CORE.get())).title(Component.translatable("Industry")).build());

    public static RegistryObject<CreativeModeTab> SUPER_TOOLS_TAB = CREATIVE_MODE_TABS.register("super_tools_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STAR_PICKAXE.get())).title(Component.translatable("Super Tools")).build());;

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
