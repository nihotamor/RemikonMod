package corps.remikon.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class MessageRemikon implements IMessage {
    public boolean isR18;
    public long UUIDLeast;
    public long UUIDMost;

    public MessageRemikon(boolean isR18In, long ULeast, long UMost) {
        isR18 = isR18In;
        UUIDLeast = ULeast;
        UUIDMost = UMost;
    }

    public void fromBytes(ByteBuf buf) {
        isR18 = buf.readBoolean();
        UUIDLeast = buf.readLong();
        UUIDMost = buf.readLong();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(isR18);
        buf.writeLong(UUIDLeast);
        buf.writeLong(UUIDMost);
    }
}
