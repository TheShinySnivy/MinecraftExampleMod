package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String NAME = "Example Mod";
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.8.9-A1";

    @Mod.Instance(ExampleMod.MODID)
    public static ExampleMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPreInitializationEvent event) {

    }


}



