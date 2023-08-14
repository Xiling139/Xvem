package net.xiling.xvem.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.resources.ResourceLocation;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ModMinecartEntity;

public class ExpressTrainRenderer extends MinecartRenderer<ModMinecartEntity> {

    private static final ResourceLocation EXPRESS_TEXTURE =
            new ResourceLocation(XilingsMod.MOD_ID, "textures/entity/minecart/express.png");

    public ExpressTrainRenderer(EntityRendererProvider.Context context) {
        super(context, ExpressTrainModel.EXPRESS_LAYER);
    }

    @Override
    public ResourceLocation getTextureLocation(ModMinecartEntity entity) {
        return EXPRESS_TEXTURE;
    }


}
