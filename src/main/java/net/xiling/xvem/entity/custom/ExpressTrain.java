package net.xiling.xvem.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.item.ModItems;

public class ExpressTrain extends AbstractMinecart {
    public ExpressTrain(EntityType<?> p_38087_, Level p_38088_) {
        super(p_38087_, p_38088_);
        this.blocksBuilding = true;
    }

    public ExpressTrain(EntityType<?> p_38090_, Level p_38091_, double p_38092_, double p_38093_, double p_38094_) {
        this(p_38090_, p_38091_);
        this.setPos(p_38092_, p_38093_, p_38094_);
        this.xo = p_38092_;
        this.yo = p_38093_;
        this.zo = p_38094_;
    }


    @Override
    public Item getDropItem() {
        return ModItems.EXPRESS_TRAIN.get();
    }

    @Override
    public double getMaxSpeed() {
        return (this.isInWater() ? 4.0D : 13.9D) / 20.0D;
    }

    @Override
    public double getMaxSpeedWithRail() {
        return super.getMaxSpeedWithRail();
    }

    @Override
    public ItemStack getPickResult() {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(
                new ResourceLocation(XilingsMod.MOD_ID, "textures/entity/minecart/express.png")));
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag p_38151_) {
        super.addAdditionalSaveData(p_38151_);
    }

    @Override
    public InteractionResult interact(Player p_38483_, InteractionHand p_38484_) {
        InteractionResult ret = super.interact(p_38483_, p_38484_);
        if (ret.consumesAction()) return ret;
        if (p_38483_.isSecondaryUseActive()) {
            return InteractionResult.PASS;
        } else if (this.isVehicle()) {
            return InteractionResult.PASS;
        } else if (!this.level().isClientSide) {
            return p_38483_.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    @Override
    public void activateMinecart(int p_38478_, int p_38479_, int p_38480_, boolean p_38481_) {
        if (p_38481_) {
            if (this.isVehicle()) {
                this.ejectPassengers();
            }

            if (this.getHurtTime() == 0) {
                this.setHurtDir(-this.getHurtDir());
                this.setHurtTime(10);
                this.setDamage(50.0F);
                this.markHurt();
            }
        }

    }

    @Override
    public Type getMinecartType() {
        return AbstractMinecart.Type.RIDEABLE;
    }
}
