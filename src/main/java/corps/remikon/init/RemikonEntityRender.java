package corps.remikon.init;

import corps.remikon.client.model.ModelRemikon;
import corps.remikon.client.render.RenderRemikon;
import corps.remikon.entity.EntityRemikon;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RemikonEntityRender {
    public static void registerRender() {
        RenderingRegistry.registerEntityRenderingHandler(EntityRemikon.class, new IRenderFactory<EntityRemikon>() {
            @Override
            public Render<? super EntityRemikon> createRenderFor(RenderManager manager) {
                return new RenderRemikon(manager, new ModelRemikon(), 0.3f);
            }
        });
    }
}
