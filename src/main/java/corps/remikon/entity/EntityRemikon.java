package corps.remikon.entity;

import corps.remikon.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityRemikon extends EntityMob {
    private final AxisAlignedBB AABB = new AxisAlignedBB(-0.35, 0, -0.35, 0.35, 1.5, 0.35);
    private float jawRotation;
    private boolean isR18;

    public EntityRemikon(World worldIn) {
        super(worldIn);
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(3, new EntityAIWanderAvoidWater(this, 1.0D));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    @Override
    public boolean hitByEntity(Entity entityIn) {
        return super.hitByEntity(entityIn);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        // TODO 通常時の音を返す
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        // TODO ダメージの音を返す
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO 死亡時の音を返す
        return super.getDeathSound();
    }

    @Override
    public SoundCategory getSoundCategory() {
        return SoundCategory.NEUTRAL;
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
        setJawRotation(getJawRotation() + (Utils.RANDOM.nextFloat() / 0.02F + 0.035F));
        //System.out.println("" + this.isR18);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        NBTTagCompound tagRemikon = new NBTTagCompound();
        tagRemikon.setBoolean("R18", isR18()/*getCapability(RemikonStateProvider.CAPABILITY, null).isR18() == (byte) 1*/);

        //System.out.println("NBT Tag set R18 to " + isR18());

        compound.setTag("Remikon", tagRemikon);

        // return super.writeToNBT(compound);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        NBTTagCompound tagRemikon = compound.getCompoundTag("Remikon");
        if (tagRemikon != null) {
            //getCapability(RemikonStateProvider.CAPABILITY, null).setR18(tagRemikon.getBoolean("R18") ? (byte) 1 : 0);
            setR18(tagRemikon.getBoolean("R18"));

            // MODELをこちらから取得してみる
            System.out.println("field isR18 is set to " + isR18());
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
        return AABB;
    }

    public float getJawRotation() {
        return jawRotation;
    }

    public void setJawRotation(float jawRotation) {
        this.jawRotation = jawRotation;
    }

    public boolean isR18() {
        System.out.println(isR18);
        return isR18;
    }

    public void setR18(boolean isR18) {
        this.isR18 = isR18;
    }
}
