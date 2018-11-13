package corps.remikon.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class RemikonStateStorage implements IStorage<IRemikonState> {
    @Override
    public NBTBase writeNBT(Capability<IRemikonState> capability, IRemikonState instance, EnumFacing facing) {
        return new NBTTagByte(instance.isR18());
    }

    @Override
    public void readNBT(Capability<IRemikonState> capability, IRemikonState instance, EnumFacing side, NBTBase nbt) {
        instance.setR18(((NBTTagByte)nbt).getByte());
    }
}
