package example.testrender.client.render;

import example.testrender.client.render.buffer.BufferManager;
import example.testrender.client.render.shader.ShaderManager;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RenderSystem {
    public void init() {
        BufferManager.init();
        ShaderManager.init();
    }
}
