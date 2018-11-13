package corps.remikon.network;

import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageRemikonHandler implements IMessageHandler<MessageRemikon, IMessage> {
    @Override
    public IMessage onMessage(MessageRemikon message, MessageContext ctx) {
        long UUIDLeast = message.UUIDLeast;
        long UUIDMost = message.UUIDMost;
        World world = ctx.getServerHandler().player.getEntityWorld();
        Entity entity = world.getPlayerEntityByUUID(new UUID(UUIDLeast, UUIDMost));

        NBTTagCompound compound = entity.getEntityData();
        if(compound == null) {
            return null;
        }
        NBTTagCompound tag = compound.getCompoundTag("Remikon");
        if(tag == null) {
            return null;
        }
        tag.setBoolean("R18", message.isR18);
        return null;
    }
}
