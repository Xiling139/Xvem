package net.xiling.xvem.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.xiling.xvem.item.ModItems;

public class ModMinecartEntity extends Minecart {
    public ModMinecartEntity(EntityType<?> p_38470_, Level p_38471_) {
        super(p_38470_, p_38471_);
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
}
