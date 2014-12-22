package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.LogHelper;
import com.featurive.bramcraft.utility.ModRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks
{
    public static void registerBlocks()
    {
        // registerBlock(blockname, unlocalizedname);
        ModRegistry.register(BlockList.crystal_ore, Names.Block.crystal_ore);
        ModRegistry.register(BlockList.dark_block, Names.Block.dark_block);
        ModRegistry.register(BlockList.dark_ore, Names.Block.dark_ore);
        ModRegistry.register(BlockList.dark_rock, Names.Block.dark_rock);
        ModRegistry.register(BlockList.dutch_flag, Names.Block.dutch_flag);

        LogHelper.info("Registered blocks");
    }
}