package corps.remikon.client.render;

import corps.remikon.Reference;
import corps.remikon.entity.EntityRemikon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRemikon extends RenderLiving<EntityRemikon> {

    private static final ResourceLocation texture = new ResourceLocation(Reference.MODID,
            "textures/entity/remikon.png");

    public RenderRemikon(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
    }

    @Override
    public void doRender(EntityRemikon entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.bindTexture(texture);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityRemikon entity) {
        return texture;
    }

}
