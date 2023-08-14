package net.xiling.xvem.entity.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.xiling.xvem.item.ModItems;

public class SuperExpressTrain extends AbstractMinecart {
    public SuperExpressTrain(EntityType<?> p_38087_, Level p_38088_) {
        super(p_38087_, p_38088_);
    }

    public SuperExpressTrain(EntityType<?> p_38090_, Level p_38091_, double p_38092_, double p_38093_, double p_38094_) {
        this(p_38090_, p_38091_);
        this.setPos(p_38092_, p_38093_, p_38094_);
        this.xo = p_38092_;
        this.yo = p_38093_;
        this.zo = p_38094_;
    }

    public InteractionResult interact(Player p_38483_, InteractionHand p_38484_) {
        InteractionResult ret = super.interact(p_38483_, p_38484_);
        if (ret.consumesAction()) return ret;
        if (p_38483_.isSecondaryUseActive()) {
            return InteractionResult.PASS;
        } else if (this.isVehicle()) {
            return InteractionResult.PASS;
        } else if (!this.level.isClientSide) {
            return p_38483_.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    @Override
    protected Item getDropItem() {
        return ModItems.SUPER_EXPRESS_TRAIN.get();
    }

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
        return Type.RIDEABLE;
    }
}
