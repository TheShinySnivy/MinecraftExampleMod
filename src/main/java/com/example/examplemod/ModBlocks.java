package com.example.examplemod;

import com.example.examplemod.blocks.BlockRedDiamond;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block red_diamond_ore;

    public static void preInit() {
        red_diamond_ore = new BlockRedDiamond();
    }

    public static void init() {
        //GameRegistry.registerBlock(red_diamond_ore, BlockRedDiamond.name);
        registerModel(red_diamond_ore);
    }

    public static void registerModel(Block block) {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        mesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ExampleMod.MODID.toLowerCase(), block.getUnlocalizedName().substring(5)), "inventory"));
    }
}
