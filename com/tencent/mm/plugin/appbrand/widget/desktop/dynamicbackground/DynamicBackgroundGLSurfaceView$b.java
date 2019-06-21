package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import android.content.Context;
import android.graphics.Point;
import android.opengl.EGL14;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ae;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundGLSurfaceView$GLRenderer;", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$Renderer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "drawCount", "", "hasPostAlphaAnimation", "", "isAlphaAnimating", "()Z", "setAlphaAnimating", "(Z)V", "mGradientBgView", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GradientColorBackgroundView;", "mLastDraw", "", "mNativeRenderer", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundNative;", "needCheckBlack", "needCheckCrash", "showGradientView", "surfaceView", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView;", "viewHeight", "viewWidth", "init", "", "onDestroy", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "isPaused", "onEGLCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "onEGLSurfaceChanged", "onError", "e", "", "onPause", "onResume", "onSurfaceSizeChanged", "width", "height", "release", "reset", "setGradientBackgroundView", "gradientColorBackgroundView", "setShowGradientView", "show", "setSurfaceView", "Companion", "plugin-appbrand-integration_release"})
public final class DynamicBackgroundGLSurfaceView$b
  implements GameGLSurfaceView.n
{
  private static long iZu;
  public static final DynamicBackgroundGLSurfaceView.b.a iZv;
  private Context context;
  private int eNs;
  GradientColorBackgroundView iWx;
  boolean iZj;
  private DynamicBackgroundNative iZl;
  private long iZm;
  private int iZn;
  private int iZo;
  boolean iZp;
  boolean iZq;
  GameGLSurfaceView iZr;
  private boolean iZs;
  private boolean iZt;

  static
  {
    AppMethodBeat.i(135239);
    iZv = new DynamicBackgroundGLSurfaceView.b.a((byte)0);
    iZu = 500L;
    AppMethodBeat.o(135239);
  }

  public DynamicBackgroundGLSurfaceView$b(Context paramContext)
  {
    AppMethodBeat.i(135238);
    this.iZm = -1L;
    this.iZs = true;
    this.iZt = true;
    if ((com.tencent.mm.plugin.appbrand.widget.desktop.b.aPe()) && (!d.aPS()))
      this.iZl = new DynamicBackgroundNative();
    while (true)
    {
      this.context = paramContext;
      AppMethodBeat.o(135238);
      return;
      ab.e("MicroMsg.DynamicBgSurfaceView", "alvinluo AppBrandDesktopConfig not enableNativeDynamicBackground");
    }
  }

  private final void init()
  {
    AppMethodBeat.i(135229);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender init");
    try
    {
      DynamicBackgroundNative localDynamicBackgroundNative1 = this.iZl;
      if (localDynamicBackgroundNative1 != null)
      {
        localDynamicBackgroundNative1.nativeInit();
        AppMethodBeat.o(135229);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(135229);
      }
    }
    catch (Throwable localThrowable1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DynamicBgSurfaceView", localThrowable1, "alvinluo nativeInit exception", new Object[0]);
        if ((localThrowable1 instanceof UnsatisfiedLinkError))
        {
          ab.e("MicroMsg.DynamicBgSurfaceView", "alvinluo nativeInit called failed, try to load so once more");
          try
          {
            System.loadLibrary("dynamicBg");
            DynamicBackgroundNative localDynamicBackgroundNative2 = this.iZl;
            if (localDynamicBackgroundNative2 == null)
              break label104;
            localDynamicBackgroundNative2.nativeInit();
            AppMethodBeat.o(135229);
          }
          catch (Throwable localThrowable2)
          {
            d.aPL();
          }
        }
        else
        {
          AppMethodBeat.o(135229);
          continue;
          label104: AppMethodBeat.o(135229);
        }
      }
    }
  }

  public final void aPC()
  {
    AppMethodBeat.i(135230);
    try
    {
      init();
      Object localObject1 = ae.hy(this.context);
      this.iZn = ((Point)localObject1).x;
      this.iZo = ((Point)localObject1).y;
      ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLCreated width: %d, height: %d", new Object[] { Integer.valueOf(this.iZn), Integer.valueOf(this.iZo) });
      ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo handle: %s, %s, %s", new Object[] { EGL14.eglGetCurrentContext(), EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377) });
      localObject1 = this.iZl;
      if (localObject1 != null)
        ((DynamicBackgroundNative)localObject1).surfaceCreated(this.iZn, this.iZo);
      localObject1 = this.iZl;
      if (localObject1 != null)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = e.iZE;
        localObject3 = e.dn(this.context) + "scene_shaderv.glsl";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject4 = e.iZE;
        localObject2 = e.dn(this.context) + "scene_shaderf.glsl";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        Object localObject5 = e.iZE;
        localObject4 = e.dn(this.context) + "vertex_framebuffer_plane.glsl";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        Object localObject6 = e.iZE;
        localObject5 = e.dn(this.context) + "frag_framebuffer_plane.glsl";
        Object localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        localObject6 = e.iZE;
        localObject6 = e.dn(this.context) + "texture_vertex_shader.glsl";
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        Object localObject8 = e.iZE;
        localObject7 = e.dn(this.context) + "texture_fragment_shader.glsl";
        Object localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>();
        localObject8 = e.iZE;
        localObject9 = e.dn(this.context) + "bg_gradient_vertex_shader.glsl";
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        e locale = e.iZE;
        ((DynamicBackgroundNative)localObject1).setupGlslFiles((String)localObject3, (String)localObject2, (String)localObject4, (String)localObject5, (String)localObject6, (String)localObject7, (String)localObject9, e.dn(this.context) + "bg_gradient_fragment_shader.glsl");
      }
      localObject1 = this.iZl;
      if (localObject1 != null)
        ((DynamicBackgroundNative)localObject1).initView();
      if ((com.tencent.mm.plugin.appbrand.widget.desktop.b.aPe()) && (!d.aPN()))
      {
        d.aPP();
        AppMethodBeat.o(135230);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DynamicBgSurfaceView", localThrowable, "alvinluo onEGLCreated exception", new Object[0]);
        d.aPL();
        AppMethodBeat.o(135230);
      }
    }
  }

  public final void aPD()
  {
    AppMethodBeat.i(135231);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLSurfaceChanged and do nothing");
    this.eNs = 0;
    AppMethodBeat.o(135231);
  }

  public final void aPE()
  {
    AppMethodBeat.i(135233);
    try
    {
      Object localObject = b.iZg;
      Thread.sleep(()b.aPz());
      label17: if (d.aPI())
        d.aPQ();
      try
      {
        localObject = this.iZl;
        if (localObject != null)
          ((DynamicBackgroundNative)localObject).draw();
        if (d.aPI())
        {
          this.eNs += 1;
          if (this.eNs >= 2)
            d.aPR();
        }
        if ((!this.iZj) && (!this.iZq))
        {
          this.iZq = true;
          localObject = this.iWx;
          if (localObject != null)
          {
            ((GradientColorBackgroundView)localObject).post((Runnable)new DynamicBackgroundGLSurfaceView.b.b(this));
            AppMethodBeat.o(135233);
            return;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.DynamicBgSurfaceView", localThrowable, "alvinluo onDraw exception", new Object[0]);
          com.tencent.mm.plugin.appbrand.widget.desktop.b.eT(false);
          continue;
          AppMethodBeat.o(135233);
          continue;
          if (this.iZj)
          {
            GradientColorBackgroundView localGradientColorBackgroundView = this.iWx;
            if ((localGradientColorBackgroundView == null) || (localGradientColorBackgroundView.getVisibility() != 0))
            {
              localGradientColorBackgroundView = this.iWx;
              if (localGradientColorBackgroundView != null)
              {
                localGradientColorBackgroundView.post((Runnable)new DynamicBackgroundGLSurfaceView.b.c(this));
                AppMethodBeat.o(135233);
              }
            }
          }
          else
          {
            AppMethodBeat.o(135233);
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  public final void aPF()
  {
    AppMethodBeat.i(135237);
    ab.e("MicroMsg.DynamicBgSurfaceView", "alvinluo GLSurfaceView onError");
    d.aPM();
    AppMethodBeat.o(135237);
  }

  public final void jdMethod_do(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135232);
    try
    {
      ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged width: %d, height: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((this.iZn != paramInt1) && (this.iZo != paramInt2))
      {
        init();
        this.iZn = paramInt1;
        this.iZo = paramInt2;
        ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged reCreated width: %d, height: %d", new Object[] { Integer.valueOf(this.iZn), Integer.valueOf(this.iZo) });
        DynamicBackgroundNative localDynamicBackgroundNative = this.iZl;
        if (localDynamicBackgroundNative != null)
          localDynamicBackgroundNative.surfaceCreated(this.iZn, this.iZo);
        localDynamicBackgroundNative = this.iZl;
        if (localDynamicBackgroundNative != null)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = e.iZE;
          localObject1 = e.dn(this.context) + "scene_shaderv.glsl";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          Object localObject3 = e.iZE;
          localObject2 = e.dn(this.context) + "scene_shaderf.glsl";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          Object localObject4 = e.iZE;
          localObject3 = e.dn(this.context) + "vertex_framebuffer_plane.glsl";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = e.iZE;
          localObject4 = e.dn(this.context) + "frag_framebuffer_plane.glsl";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          Object localObject6 = e.iZE;
          localObject5 = e.dn(this.context) + "texture_vertex_shader.glsl";
          Object localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          localObject6 = e.iZE;
          localObject6 = e.dn(this.context) + "texture_fragment_shader.glsl";
          Object localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject7 = e.iZE;
          localObject8 = e.dn(this.context) + "bg_gradient_vertex_shader.glsl";
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject7 = e.iZE;
          localDynamicBackgroundNative.setupGlslFiles((String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6, (String)localObject8, e.dn(this.context) + "bg_gradient_fragment_shader.glsl");
        }
        localDynamicBackgroundNative = this.iZl;
        if (localDynamicBackgroundNative != null)
          localDynamicBackgroundNative.initView();
        this.eNs = 0;
        AppMethodBeat.o(135232);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DynamicBgSurfaceView", localThrowable, "alvinluo onSurfaceSizeChanged exception", new Object[0]);
        com.tencent.mm.plugin.appbrand.widget.desktop.b.eT(false);
        AppMethodBeat.o(135232);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(135235);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onDestroy");
    try
    {
      DynamicBackgroundNative localDynamicBackgroundNative = this.iZl;
      if (localDynamicBackgroundNative != null)
      {
        localDynamicBackgroundNative.nativeRelease();
        AppMethodBeat.o(135235);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(135235);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DynamicBgSurfaceView", localThrowable, "alvinluo nativeRelease exception", new Object[0]);
        AppMethodBeat.o(135235);
      }
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(135236);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onPause");
    AppMethodBeat.o(135236);
  }

  public final void onResume()
  {
    AppMethodBeat.i(135234);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onResume");
    this.iZt = true;
    AppMethodBeat.o(135234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView.b
 * JD-Core Version:    0.6.2
 */