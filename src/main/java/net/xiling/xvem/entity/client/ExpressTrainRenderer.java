package net.xiling.xvem.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.block.state.BlockState;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.custom.ModMinecartEntity;

public class ExpressTrainRenderer extends MinecartRenderer {
    public ExpressTrainRenderer(EntityRendererProvider.Context context) {
        super(context, null);
    }

    @Override
    public ResourceLocation getTextureLocation(AbstractMinecart p_115416_) {
        return new ResourceLocation(XilingsMod.MOD_ID, "textures/entity/minecart/express.png");
    }

    @Override
    protected void renderMinecartContents(AbstractMinecart p_115424_, float p_115425_, BlockState p_115426_, PoseStack p_115427_, MultiBufferSource p_115428_, int p_115429_) {
        super.renderMinecartContents(p_115424_, p_115425_, p_115426_, p_115427_, p_115428_, p_115429_);
    }
}
