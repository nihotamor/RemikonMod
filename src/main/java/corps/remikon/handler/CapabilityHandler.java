package corps.remikon.handler;

import corps.remikon.Reference;
import corps.remikon.capability.RemikonStateProvider;
import corps.remikon.entity.EntityRemikon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {
    public static final ResourceLocation REMIKON_CAP = new ResourceLocation(Reference.MODID, "remikon_state");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<EntityRemikon> event) {
        event.addCapability(REMIKON_CAP, new RemikonStateProvider());
    }
}
