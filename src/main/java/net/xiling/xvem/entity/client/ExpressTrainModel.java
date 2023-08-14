package net.xiling.xvem.entity.client;

import net.minecraft.client.model.MinecartModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ModMinecartEntity;

public class ExpressTrainModel<T extends AbstractMinecart> extends MinecartModel<ModMinecartEntity> {
    public ExpressTrainModel(ModelPart root) {
        super(root);
    }

    public static ModelLayerLocation EXPRESS_LAYER = new ModelLayerLocation(
            new ResourceLocation(XilingsMod.MOD_ID, "express_train"), "main");

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        int i = 20;
        int j = 8;
        int k = 16;
        int l = 4;
        partdefinition.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 10).addBox(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("front", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), PartPose.offsetAndRotation(-9.0F, 4.0F, 0.0F, 0.0F, ((float)Math.PI * 1.5F), 0.0F));
        partdefinition.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), PartPose.offsetAndRotation(9.0F, 4.0F, 0.0F, 0.0F, ((float)Math.PI / 2F), 0.0F));
        partdefinition.addOrReplaceChild("left", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -7.0F, 0.0F, (float)Math.PI, 0.0F));
        partdefinition.addOrReplaceChild("right", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), PartPose.offset(0.0F, 4.0F, 7.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public ModelPart root() {
        return super.root();
    }

    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {

        event.registerLayerDefinition(EXPRESS_LAYER, ExpressTrainModel::createBodyLayer);
    }
}
