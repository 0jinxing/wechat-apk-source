package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.gl.e.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class ja$2
  implements e.g
{
  ja$2(ja paramja)
  {
  }

  public EGLSurface a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject)
  {
    paramObject = null;
    AppMethodBeat.i(99986);
    try
    {
      paramEGL10 = paramEGL10.eglCreateWindowSurface(paramEGLDisplay, paramEGLConfig, ja.b(this.a), null);
      AppMethodBeat.o(99986);
      return paramEGL10;
    }
    catch (OutOfMemoryError paramEGL10)
    {
      while (true)
        paramEGL10 = paramObject;
    }
    catch (IllegalArgumentException paramEGL10)
    {
      while (true)
        paramEGL10 = paramObject;
    }
  }

  public void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
  {
    AppMethodBeat.i(99987);
    paramEGL10.eglDestroySurface(paramEGLDisplay, paramEGLSurface);
    AppMethodBeat.o(99987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ja.2
 * JD-Core Version:    0.6.2
 */