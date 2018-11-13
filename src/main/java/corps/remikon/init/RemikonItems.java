package corps.remikon.init;

import corps.remikon.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder("remikon")
public class RemikonItems {
    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.registerAll(new Item().setCreativeTab(CreativeTabs.MATERIALS)
                .setRegistryName(Reference.MODID, "remikon")//
                .setUnlocalizedName(Reference.MODID + ".remikon")//
                .setFull3D()//
        );
    }

    @ObjectHolder("remikon")
    public static final Item remikon = null;
}
