package corps.remikon.init;

import corps.remikon.Reference;
import corps.remikon.entity.EntityRemikon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class RemikonEntities {
    private static int ID = 0;
    public static void registerEntity(IForgeRegistry<EntityEntry> registry) {
        registry.registerAll(//
                EntityEntryBuilder.create()//
                .entity(EntityRemikon.class)//
                .id(new ResourceLocation(Reference.MODID, "remikon"), ID++).name("remikon")//
                .egg(0x000000, 0xffc700).tracker(64, 1, false).build()
                );
    }

    @ObjectHolder("remikon")
    public static final EntityEntry remikon = null;
}
