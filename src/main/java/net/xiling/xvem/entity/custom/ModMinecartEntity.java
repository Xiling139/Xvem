package net.xiling.xvem.entity.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.XilingsMod;
import net.xiling.xvem.entity.ModEntityTypes;
import net.xiling.xvem.item.ModItems;

public class ModMinecartEntity extends Minecart {
    public ModMinecartEntity(EntityType<?> p_38470_, Level p_38471_) {
        super(p_38470_, p_38471_);
    }

    public ModMinecartEntity(Level p_38473_, double p_38474_, double p_38475_, double p_38476_) {
        super(p_38473_, p_38474_, p_38475_, p_38476_);
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
}
