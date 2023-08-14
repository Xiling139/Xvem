package net.xiling.xvem.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xiling.xvem.item.custom.ModifiedPoweredRailBlock;

import java.util.function.Supplier;

public class VanillaBlocks {
    public static final DeferredRegister<Block> VANILLA_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<Block> POWERED_RAIL = registerBlock("powered_rail",
            () -> new ModifiedPoweredRailBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission().strength(0.7F).sound(SoundType.METAL), true), CreativeModeTab.TAB_REDSTONE);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = VANILLA_BLOCKS.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        VANILLA_BLOCKS.register(eventBus);
    }
}