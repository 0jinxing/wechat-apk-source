package com.tencent.mm.plugin.emojicapture.ui;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.ui.b.i;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureRenderSurface;", "", "texture", "Landroid/graphics/SurfaceTexture;", "renderer", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiVideoPlayTextureRenderer;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Landroid/graphics/SurfaceTexture;Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiVideoPlayTextureRenderer;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "mEglContext", "Landroid/opengl/EGLContext;", "mEglDisplay", "Landroid/opengl/EGLDisplay;", "kotlin.jvm.PlatformType", "mEglSurface", "Landroid/opengl/EGLSurface;", "needRender", "", "pauseRender", "renderHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "renderThread", "Landroid/os/HandlerThread;", "createEGLContext", "", "config", "Landroid/opengl/EGLConfig;", "destroyGL", "drawFrame", "pts", "", "initGL", "pause", "queue", "callback", "Lkotlin/Function0;", "releaseRender", "setNeedRender", "render", "plugin-emojicapture_release"})
public final class b
{
  final String TAG;
  HandlerThread eXa;
  private ak eXb;
  final SurfaceTexture fcm;
  EGLDisplay llp;
  EGLContext llq;
  EGLSurface llr;
  private boolean lls;
  final i llt;
  private boolean needRender;

  public b(SurfaceTexture paramSurfaceTexture, i parami, a.f.a.b<? super b, y> paramb)
  {
    AppMethodBeat.i(2903);
    this.fcm = paramSurfaceTexture;
    this.llt = parami;
    this.TAG = "MicroMsg.EmojiVideoPlayTextureRenderSurface";
    this.llp = EGL14.EGL_NO_DISPLAY;
    this.llq = EGL14.EGL_NO_CONTEXT;
    this.llr = EGL14.EGL_NO_SURFACE;
    paramSurfaceTexture = d.anM("EmojiVideoPlayTextureRenderSurface_renderThread");
    j.o(paramSurfaceTexture, "ThreadPool.newFreeHandle…derSurface_renderThread\")");
    this.eXa = paramSurfaceTexture;
    this.eXa.start();
    this.eXb = new ak(this.eXa.getLooper());
    b((a)new b.1(this, paramb));
    AppMethodBeat.o(2903);
  }

  final void b(a<y> parama)
  {
    AppMethodBeat.i(2900);
    this.eXb.post((Runnable)new c(parama));
    AppMethodBeat.o(2900);
  }

  public final void gF(boolean paramBoolean)
  {
    AppMethodBeat.i(2901);
    ab.i(this.TAG, "setNeedRender:".concat(String.valueOf(paramBoolean)));
    this.needRender = paramBoolean;
    AppMethodBeat.o(2901);
  }

  public final void gG(boolean paramBoolean)
  {
    AppMethodBeat.i(2902);
    this.lls = paramBoolean;
    b((a)new b.b(this, paramBoolean));
    AppMethodBeat.o(2902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b
 * JD-Core Version:    0.6.2
 */