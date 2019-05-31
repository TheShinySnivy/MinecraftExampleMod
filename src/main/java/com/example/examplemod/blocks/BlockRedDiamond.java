package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRedDiamond extends Block {

    public static final String name = "red_diamond_ore";
    //public static final PropertyInteger


    public BlockRedDiamond() {
        super(Material.rock);
        setUnlocalizedName(name);

        setHardness(3.0f);
        setResistance(15f);
        setLightLevel(50f);

        GameRegistry.registerBlock(this, name);
        setCreativeTab(CreativeTabs.tabBlock);
    }



}
