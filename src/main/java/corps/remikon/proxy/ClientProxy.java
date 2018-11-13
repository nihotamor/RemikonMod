package corps.remikon.proxy;

import corps.remikon.Reference;
import corps.remikon.init.RemikonEntityRender;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

@EventBusSubscriber(modid = Reference.MODID)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        RemikonEntityRender.registerRender();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void onBlockRegister(Register<Block> event) {
        super.onBlockRegister(event);
    }

    @Override
    public void onItemRegister(Register<Item> event) {
        super.onItemRegister(event);
    }

    @Override
    public void onPotionRegister(Register<Potion> event) {
        super.onPotionRegister(event);
    }

    @Override
    public void onPotionTypeRegister(Register<PotionType> event) {
        super.onPotionTypeRegister(event);
    }

    @Override
    public void onEnchantmentRegister(Register<Enchantment> event) {
        super.onEnchantmentRegister(event);
    }

    @Override
    public void onProfessionRegister(Register<VillagerProfession> event) {
        super.onProfessionRegister(event);
    }

    @Override
    public void onEntityRegister(Register<EntityEntry> event) {
        super.onEntityRegister(event);
    }

    @SubscribeEvent
    public static void onRenderRegister(ModelRegistryEvent event) {

    }

}
