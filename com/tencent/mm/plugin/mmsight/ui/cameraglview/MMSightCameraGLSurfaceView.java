package com.tencent.mm.plugin.mmsight.ui.cameraglview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class MMSightCameraGLSurfaceView extends GLSurfaceView
{
  int fcf;
  private int gLF;
  int gLw;
  int gLx;
  b oDF;

  public MMSightCameraGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55326);
    this.oDF = null;
    this.gLF = 0;
    getHolder().addCallback(this);
    try
    {
      getHolder().setType(2);
      setEGLContextFactory(new b());
      setEGLConfigChooser(new MMSightCameraGLSurfaceView.a(this));
      this.oDF = new b();
      setRenderer(this.oDF);
      setRenderMode(0);
      AppMethodBeat.o(55326);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        try
        {
          getHolder().setType(1);
        }
        catch (Exception paramContext)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception paramContext)
          {
          }
        }
    }
  }

  public final void WB()
  {
    AppMethodBeat.i(55329);
    if (this.oDF != null)
    {
      this.oDF.gLA = true;
      requestRender();
    }
    AppMethodBeat.o(55329);
  }

  public final void ab(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55327);
    ab.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this });
    this.gLw = paramInt1;
    this.gLx = paramInt2;
    this.fcf = paramInt3;
    AppMethodBeat.o(55327);
  }

  public final void f(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(55328);
    if ((paramArrayOfByte != null) && (this.oDF != null) && (!this.oDF.gLv))
    {
      this.oDF.b(paramArrayOfByte, this.gLw, this.gLx, paramInt, paramBoolean);
      requestRender();
      AppMethodBeat.o(55328);
    }
    while (true)
    {
      return;
      ab.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
      AppMethodBeat.o(55328);
    }
  }

  public int getFrameHeight()
  {
    return this.gLx;
  }

  public int getFrameRotate()
  {
    return this.fcf;
  }

  public int getFrameWidth()
  {
    return this.gLw;
  }

  public b getRenderer()
  {
    return this.oDF;
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55332);
    super.surfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
    ab.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this });
    AppMethodBeat.o(55332);
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(55330);
    super.surfaceCreated(paramSurfaceHolder);
    ab.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", new Object[] { paramSurfaceHolder, this, Integer.valueOf(getId()) });
    AppMethodBeat.o(55330);
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(55331);
    super.surfaceDestroyed(paramSurfaceHolder);
    ab.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", new Object[] { paramSurfaceHolder, this });
    AppMethodBeat.o(55331);
  }

  final class b
    implements GLSurfaceView.EGLContextFactory
  {
    private int EGL_CONTEXT_CLIENT_VERSION = 12440;

    b()
    {
    }

    public final EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
    {
      AppMethodBeat.i(55324);
      ab.w("MicroMsg.MMSightCameraGLSurfaceView", "creating OpenGL ES 2.0 context");
      int i = this.EGL_CONTEXT_CLIENT_VERSION;
      paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { i, 2, 12344 });
      AppMethodBeat.o(55324);
      return paramEGL10;
    }

    public final void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
    {
      AppMethodBeat.i(55325);
      paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext);
      AppMethodBeat.o(55325);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView
 * JD-Core Version:    0.6.2
 */