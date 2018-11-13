package corps.remikon.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class RemikonStateProvider implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(IRemikonState.class)
    public static final Capability<IRemikonState> CAPABILITY = null;

    private IRemikonState instance = CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing side) {
        return capability == CAPABILITY;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing side) {
        return capability == CAPABILITY ? CAPABILITY.<T>cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return CAPABILITY.getStorage().writeNBT(CAPABILITY,  this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        CAPABILITY.getStorage().readNBT(CAPABILITY, this.instance, null, nbt);
    }
}
