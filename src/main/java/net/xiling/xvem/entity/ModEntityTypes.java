package net.xiling.xvem.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ModMinecartEntity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, XilingsMod.MOD_ID);

    public static final RegistryObject<EntityType<ModMinecartEntity>> EXPRESS_TRAIN =
            ENTITY_TYPES.register("express_train",
                    () -> EntityType.Builder.of(ModMinecartEntity::new, MobCategory.MISC)
                            .sized(0.98f, 0.7f)
                            .build(new ResourceLocation(XilingsMod.MOD_ID, "express_train").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
