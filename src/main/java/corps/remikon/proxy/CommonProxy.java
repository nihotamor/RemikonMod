package corps.remikon.proxy;

import corps.remikon.capability.IRemikonState;
import corps.remikon.capability.RemikonState;
import corps.remikon.capability.RemikonStateStorage;
import corps.remikon.handler.CapabilityHandler;
import corps.remikon.init.RemikonEntities;
import corps.remikon.init.RemikonItems;
import corps.remikon.network.PacketHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class CommonProxy {
    @SuppressWarnings("deprecation")
    public void preInit(FMLPreInitializationEvent event) {
        PacketHandler.init();

        CapabilityManager.INSTANCE.register(IRemikonState.class, new RemikonStateStorage(), RemikonState.class);
    }

    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void onBlockRegister(RegistryEvent.Register<Block> event) {

    }

    public void onItemRegister(RegistryEvent.Register<Item> event) {
        RemikonItems.registerItems(event.getRegistry());
        System.out.println("Item Registered");
    }

    public void onPotionRegister(RegistryEvent.Register<Potion> event) {

    }

    public void onPotionTypeRegister(RegistryEvent.Register<PotionType> event) {

    }

    public void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event) {

    }

    public void onProfessionRegister(RegistryEvent.Register<VillagerProfession> event) {

    }

    public void onEntityRegister(RegistryEvent.Register<EntityEntry> event) {
        RemikonEntities.registerEntity(event.getRegistry());
    }
}
