package net.xiling.xvem.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ExpressTrain;
import net.xiling.xvem.entity.custom.SuperExpressTrain;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, XilingsMod.MOD_ID);

    public static final RegistryObject<EntityType<ExpressTrain>> EXPRESS_TRAIN =
            ENTITY_TYPES.register("express_train",
                    () -> EntityType.Builder.<ExpressTrain>of(ExpressTrain::new, MobCategory.MISC)
                            .sized(0.98f, 0.7f)
                            .build(new ResourceLocation(XilingsMod.MOD_ID, "express_train").toString()));

    public static final RegistryObject<EntityType<SuperExpressTrain>> SUPER_EXPRESS_TRAIN =
            ENTITY_TYPES.register("super_express_train",
                    () -> EntityType.Builder.<SuperExpressTrain>of(SuperExpressTrain::new, MobCategory.MISC)
                            .sized(0.98f, 0.7f)
                            .build(new ResourceLocation(XilingsMod.MOD_ID, "super_express_train").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
