package corps.remikon;

import corps.remikon.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.MOD_VER)
public class RemikonMod {

    @SidedProxy(clientSide = "corps.remikon.proxy.ClientProxy", serverSide = "corps.remikon.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SubscribeEvent
    public void onBlockRegister(Register<Block> event) {
        proxy.onBlockRegister(event);
    }

    @SubscribeEvent
    public void onItemRegister(Register<Item> event) {
        proxy.onItemRegister(event);
    }

    @SubscribeEvent
    public void onPotionRegister(Register<Potion> event) {
        proxy.onPotionRegister(event);
    }

    @SubscribeEvent
    public void onPotionTypeRegister(Register<PotionType> event) {
        proxy.onPotionTypeRegister(event);
    }

    @SubscribeEvent
    public void onEnchantmentRegister(Register<Enchantment> event) {
        proxy.onEnchantmentRegister(event);
    }

    @SubscribeEvent
    public void onProfessionRegister(Register<VillagerProfession> event) {
        proxy.onProfessionRegister(event);
    }

    @SubscribeEvent
    public void onEntityRegister(Register<EntityEntry> event) {
        proxy.onEntityRegister(event);
    }
}
