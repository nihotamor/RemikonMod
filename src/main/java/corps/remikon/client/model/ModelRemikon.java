package corps.remikon.client.model;

import corps.remikon.entity.EntityRemikon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelRemikon extends ModelBase {
    private ModelRenderer body;
    private ModelRenderer eyel;
    private ModelRenderer eyer;
    private ModelRenderer arml;
    private ModelRenderer armr;
    private ModelRenderer legl;
    private ModelRenderer legr;
    private ModelRenderer lip;
    private ModelRenderer jaw;
    private ModelRenderer hair1;
    private ModelRenderer hair2;
    private ModelRenderer hair3;
    private ModelRenderer R18;

    private boolean isR18;

    public ModelRemikon() {
        textureWidth = 64;
        textureHeight = 64;
        isR18 = false;
        body = new ModelRenderer(this, 0, 0);
        body.addBox(-4f, -12f, -4f, 8, 12, 8);
        body.setRotationPoint(0f, 18f, 0f);
        eyel = new ModelRenderer(this, 24, 0);
        eyel.addBox(-3.5f, -2f, -6f, 3, 3, 3);
        eyel.setRotationPoint(0f, 6f, 0f);
        eyer = new ModelRenderer(this, 36, 0);
        eyer.addBox(0.5f, -2f, -6f, 3, 3, 3);
        eyer.setRotationPoint(0f, 6f, 0f);
        arml = new ModelRenderer(this, 0, 20);
        arml.addBox(-7f, 0f, -2f, 3, 8, 4);
        arml.setRotationPoint(0f, 10f, 0f);
        armr = new ModelRenderer(this, 14, 20);
        armr.addBox(4f, 0f, -2f, 3, 8, 4);
        armr.setRotationPoint(0f, 10f, 0f);
        legl = new ModelRenderer(this, 28, 20);
        legl.addBox(-4.5f, 0f, -2f, 4, 6, 4);
        legl.setRotationPoint(0f, 18f, 0f);
        legr = new ModelRenderer(this, 44, 20);
        legr.addBox(0.5f, 0f, -2f, 4, 6, 4);
        legr.setRotationPoint(0f, 18f, 0f);
        lip = new ModelRenderer(this, 32, 6);
        lip.addBox(-3f, -1f, -7f, 6, 1, 4);
        lip.setRotationPoint(0f, 9f, 0f);
        jaw = new ModelRenderer(this, 32, 12);
        jaw.addBox(-3f, 0f, -7f, 6, 1, 4);
        jaw.setRotationPoint(0f, 9f, 0f);
        hair1 = new ModelRenderer(this, 52, 0);
        hair1.addBox(-0.5f, 3f, 0f, 1, 5, 1);
        hair1.setRotationPoint(0f, 6f, 0f);
        hair2 = new ModelRenderer(this, 56, 0);
        hair2.addBox(-0.5f, 4.5f, 0f, 1, 5, 1);
        hair2.setRotationPoint(0f, 6f, 0f);
        hair3 = new ModelRenderer(this, 60, 0);
        hair3.addBox(-0.5f, 7f, 0f, 1, 5, 1);
        hair3.setRotationPoint(0f, 6f, 0f);
        R18 = new ModelRenderer(this, 0, 32);
        R18.addBox(-16f, 0f, -16.1f, 32, 32, 0);
        R18.setRotationPoint(0f, 55f, 0f);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body.render(f5);
        eyel.render(f5);
        eyer.render(f5);
        arml.render(f5);
        armr.render(f5);
        legl.render(f5);
        legr.render(f5);
        lip.render(f5);
        jaw.render(f5);
        hair1.render(f5);
        hair2.render(f5);
        hair3.render(f5);
        if (isR18) {
            R18.render(f5 * 0.25f);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entityIn, float limbSwing, float limbSwingAmount,
            float partialTicks) {
        isR18 = ((EntityRemikon)entityIn).isR18();
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, //
            float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        isR18 = ((EntityRemikon) entityIn).isR18();
        eyel.rotateAngleX = headPitch * 0.036F;
        eyer.rotateAngleX = headPitch * 0.036F;
        this.jaw.rotateAngleX = -MathHelper.sin(((EntityRemikon) entityIn).getJawRotation() * 0.0024F) * 0.054f;
        this.arml.rotateAngleX = MathHelper.cos(limbSwing * 0.3462F) * 1.4F * limbSwingAmount;
        this.armr.rotateAngleX = MathHelper.cos(limbSwing * 0.3462F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.legl.rotateAngleX = MathHelper.cos(limbSwing * 0.3462F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.legr.rotateAngleX = MathHelper.cos(limbSwing * 0.3462F) * 1.4F * limbSwingAmount;
        this.hair1.rotateAngleX = 2.24f + MathHelper.sin(ageInTicks * 0.054F) * 0.0873F;
        this.hair2.rotateAngleX = 1.56f + MathHelper.sin(ageInTicks * 0.054F) * 0.0873F;
        this.hair3.rotateAngleX = 0.81f + MathHelper.sin(ageInTicks * 0.054F) * 0.0873F;
    }
}
