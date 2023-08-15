package net.xiling.xvem.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.MinecartFurnace;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PoweredRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.xiling.xvem.entity.ModEntityTypes;
import net.xiling.xvem.entity.custom.ExpressTrain;
import net.xiling.xvem.entity.custom.SuperExpressTrain;

public class ModifiedPoweredRailBlock extends PoweredRailBlock {

    public ModifiedPoweredRailBlock(Properties p_55218_, boolean isPoweredRail) {
        super(p_55218_, isPoweredRail);
    }

    public ModEntityTypes entity;

    @Override
    public float getRailMaxSpeed(BlockState state, Level level, BlockPos pos, AbstractMinecart cart)
    {
        if (cart instanceof MinecartFurnace) return cart.isInWater() ? 0.15f : 0.2f;
        else if (cart instanceof ExpressTrain) return cart.isInWater() ? 0.28f : 0.55555f;
        else if (cart instanceof SuperExpressTrain) return cart.isInWater() ? 0.42f : 0.83333f;
        else return cart.isInWater() ? 0.2f : 0.4f;
    }

    @Override
    public boolean findPoweredRailSignal(Level p_55220_, BlockPos p_55221_, BlockState p_55222_, boolean p_55223_, int p_55224_) {
        if (p_55224_ >= 8) {
            return false;
        } else {
            int i = p_55221_.getX();
            int j = p_55221_.getY();
            int k = p_55221_.getZ();
            boolean flag = true;
            RailShape railshape = p_55222_.getValue(getShapeProperty());
            switch (railshape) {
                case NORTH_SOUTH:
                    if (p_55223_) {
                        ++k;
                    } else {
                        --k;
                    }
                    break;
                case EAST_WEST:
                    if (p_55223_) {
                        --i;
                    } else {
                        ++i;
                    }
                    break;
                case ASCENDING_EAST:
                    if (p_55223_) {
                        --i;
                    } else {
                        ++i;
                        ++j;
                        flag = false;
                    }

                    railshape = RailShape.EAST_WEST;
                    break;
                case ASCENDING_WEST:
                    if (p_55223_) {
                        --i;
                        ++j;
                        flag = false;
                    } else {
                        ++i;
                    }

                    railshape = RailShape.EAST_WEST;
                    break;
                case ASCENDING_NORTH:
                    if (p_55223_) {
                        ++k;
                    } else {
                        --k;
                        ++j;
                        flag = false;
                    }

                    railshape = RailShape.NORTH_SOUTH;
                    break;
                case ASCENDING_SOUTH:
                    if (p_55223_) {
                        ++k;
                        ++j;
                        flag = false;
                    } else {
                        --k;
                    }

                    railshape = RailShape.NORTH_SOUTH;
            }

            if (this.isSameRailWithPower(p_55220_, new BlockPos(i, j, k), p_55223_, p_55224_, railshape)) {
                return true;
            } else {
                return flag && this.isSameRailWithPower(p_55220_, new BlockPos(i, j - 1, k), p_55223_, p_55224_, railshape);
            }
        }
    }


}
