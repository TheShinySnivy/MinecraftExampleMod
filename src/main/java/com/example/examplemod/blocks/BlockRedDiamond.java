package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRedDiamond extends Block {

    public static final String name = "red_diamond_ore";

    public BlockRedDiamond() {
        super(Material.rock);
        setUnlocalizedName(name);
        GameRegistry.registerBlock(this, name);
        setCreativeTab(CreativeTabs.tabBlock);
    }

}
