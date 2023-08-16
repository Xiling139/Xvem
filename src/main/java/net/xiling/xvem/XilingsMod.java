package net.xiling.xvem;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xiling.xvem.block.ModBlocks;
import net.xiling.xvem.block.VanillaBlocks;
import net.xiling.xvem.entity.ModEntityTypes;
import net.xiling.xvem.entity.client.ExpressTrainModel;
import net.xiling.xvem.entity.client.ExpressTrainRenderer;
import net.xiling.xvem.entity.client.SuperExpressTrainModel;
import net.xiling.xvem.entity.client.SuperExpressTrainRenderer;
import net.xiling.xvem.item.ModCreativeModeTab;
import net.xiling.xvem.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(XilingsMod.MOD_ID)
public class XilingsMod {

    public static final String MOD_ID = "xvem";
    private static final Logger LOGGER = LogUtils.getLogger();

    //Very Important Comment
    public XilingsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTab.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        VanillaBlocks.register(modEventBus);

        ModEntityTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTab.MATERIAL_TAB.get()) {
            event.accept(ModItems.RUBY);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModItems.DIAMOND_STICK);
            event.accept(ModItems.STAR_INGOT);
            event.accept(ModBlocks.STAR_BLOCK);
            event.accept(ModItems.STAR_UPGRADE_SMITHING_TEMPLATE);

        }

        if(event.getTab() == ModCreativeModeTab.INDUSTRY_TAB.get()) {
            event.accept(ModItems.POWER_CORE);
            event.accept(ModItems.ADVENCED_POWER_CORE);
            event.accept(ModItems.EXPRESS_TRAIN);
            event.accept(ModItems.SUPER_EXPRESS_TRAIN);

        }

        if(event.getTab() == ModCreativeModeTab.SUPER_TOOLS_TAB.get()) {
            event.accept(ModItems.STAR_SWORD);
            event.accept(ModItems.STAR_PICKAXE);
            event.accept(ModItems.STAR_AXE);
            event.accept(ModItems.STAR_SHOVEL);
            event.accept(ModItems.STAR_HOE);


        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.EXPRESS_TRAIN.get(), ExpressTrainRenderer::new);
            EntityRenderers.register(ModEntityTypes.SUPER_EXPRESS_TRAIN.get(), SuperExpressTrainRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(ExpressTrainModel.EXPRESS_LAYER, ExpressTrainModel::createBodyLayer);
            event.registerLayerDefinition(SuperExpressTrainModel.SUPER_EXPRESS_LAYER, SuperExpressTrainModel::createBodyLayer);
        }
    }
}
