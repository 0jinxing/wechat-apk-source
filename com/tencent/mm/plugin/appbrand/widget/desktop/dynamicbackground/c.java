package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundManager;", "", "()V", "init", "", "context", "Landroid/content/Context;", "plugin-appbrand-integration_release"})
public final class c
{
  public static final c iZz;

  static
  {
    AppMethodBeat.i(135250);
    iZz = new c();
    AppMethodBeat.o(135250);
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(135249);
    j.p(paramContext, "context");
    Object localObject1 = e.iZE;
    localObject1 = new File(e.dn(paramContext));
    if (!((File)localObject1).exists())
      ((File)localObject1).mkdirs();
    localObject1 = e.iZE;
    Object localObject2 = new StringBuilder();
    localObject1 = e.iZE;
    e.p(paramContext, "dynamicBg/scene_shaderf.glsl", e.dn(paramContext) + "scene_shaderf.glsl");
    localObject1 = e.iZE;
    localObject1 = new StringBuilder();
    localObject2 = e.iZE;
    e.p(paramContext, "dynamicBg/scene_shaderv.glsl", e.dn(paramContext) + "scene_shaderv.glsl");
    localObject1 = e.iZE;
    localObject2 = new StringBuilder();
    localObject1 = e.iZE;
    e.p(paramContext, "dynamicBg/frag_framebuffer_plane.glsl", e.dn(paramContext) + "frag_framebuffer_plane.glsl");
    localObject1 = e.iZE;
    localObject1 = new StringBuilder();
    localObject2 = e.iZE;
    e.p(paramContext, "dynamicBg/vertex_framebuffer_plane.glsl", e.dn(paramContext) + "vertex_framebuffer_plane.glsl");
    localObject1 = e.iZE;
    localObject1 = new StringBuilder();
    localObject2 = e.iZE;
    e.p(paramContext, "dynamicBg/texture_vertex_shader.glsl", e.dn(paramContext) + "texture_vertex_shader.glsl");
    localObject1 = e.iZE;
    localObject1 = new StringBuilder();
    localObject2 = e.iZE;
    e.p(paramContext, "dynamicBg/texture_fragment_shader.glsl", e.dn(paramContext) + "texture_fragment_shader.glsl");
    localObject1 = e.iZE;
    localObject2 = new StringBuilder();
    localObject1 = e.iZE;
    e.p(paramContext, "dynamicBg/bg_gradient_vertex_shader.glsl", e.dn(paramContext) + "bg_gradient_vertex_shader.glsl");
    localObject1 = e.iZE;
    localObject2 = new StringBuilder();
    localObject1 = e.iZE;
    e.p(paramContext, "dynamicBg/bg_gradient_fragment_shader.glsl", e.dn(paramContext) + "bg_gradient_fragment_shader.glsl");
    AppMethodBeat.o(135249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.c
 * JD-Core Version:    0.6.2
 */