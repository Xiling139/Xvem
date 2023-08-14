package net.xiling.xvem.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.resources.ResourceLocation;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ExpressTrain;
import net.xiling.xvem.entity.custom.SuperExpressTrain;

public class SuperExpressTrainRenderer extends MinecartRenderer<SuperExpressTrain> {

    private static final ResourceLocation SUPER_EXPRESS_TEXTURE =
            new ResourceLocation(XilingsMod.MOD_ID, "textures/entity/minecart/super_express.png");

    public SuperExpressTrainRenderer(EntityRendererProvider.Context context) {
        super(context, SuperExpressTrainModel.SUPER_EXPRESS_LAYER);
    }

    @Override
    public ResourceLocation getTextureLocation(SuperExpressTrain entity) {
        return SUPER_EXPRESS_TEXTURE;
    }
}
