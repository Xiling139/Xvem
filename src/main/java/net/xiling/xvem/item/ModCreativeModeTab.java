package net.xiling.xvem.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.xiling.xvem.XilingsMod;

@Mod.EventBusSubscriber(modid = XilingsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab MATERIAL_TAB;
    public static CreativeModeTab INDUSTRY_TAB;
    public static CreativeModeTab SUPER_TOOLS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MATERIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(XilingsMod.MOD_ID, "material_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY.get())).title(Component.translatable("Materials")).build());

        INDUSTRY_TAB = event.registerCreativeModeTab(new ResourceLocation(XilingsMod.MOD_ID, "industry_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.POWER_CORE.get())).title(Component.translatable("Industry")).build());

        SUPER_TOOLS_TAB = event.registerCreativeModeTab(new ResourceLocation(XilingsMod.MOD_ID, "super_tools_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.POWER_CORE.get())).title(Component.translatable("Suepr Tools")).build());
    }

}
