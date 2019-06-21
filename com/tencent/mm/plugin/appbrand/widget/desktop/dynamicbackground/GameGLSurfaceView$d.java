package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class GameGLSurfaceView$d
  implements GameGLSurfaceView.h
{
  public final EGLSurface createWindowSurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(134023);
    try
    {
      paramEGL10 = paramEGL10.eglCreateWindowSurface(paramEGLDisplay, paramEGLConfig, paramObject, null);
      AppMethodBeat.o(134023);
      return paramEGL10;
    }
    catch (IllegalArgumentException paramEGL10)
    {
      while (true)
      {
        c.c.e("MicroMsg.GameGLSurfaceView", "eglCreateWindowSurface", new Object[] { paramEGL10 });
        paramEGL10 = localObject;
      }
    }
  }

  public final void destroySurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
  {
    AppMethodBeat.i(134024);
    paramEGL10.eglDestroySurface(paramEGLDisplay, paramEGLSurface);
    AppMethodBeat.o(134024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.d
 * JD-Core Version:    0.6.2
 */