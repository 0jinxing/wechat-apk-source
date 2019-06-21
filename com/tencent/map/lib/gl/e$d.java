package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class e$d
  implements e.g
{
  public EGLSurface a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(98062);
    try
    {
      paramEGL10 = paramEGL10.eglCreateWindowSurface(paramEGLDisplay, paramEGLConfig, paramObject, null);
      AppMethodBeat.o(98062);
      return paramEGL10;
    }
    catch (IllegalArgumentException paramEGL10)
    {
      while (true)
        paramEGL10 = localObject;
    }
    catch (OutOfMemoryError paramEGL10)
    {
      while (true)
        paramEGL10 = localObject;
    }
  }

  public void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
  {
    AppMethodBeat.i(98063);
    paramEGL10.eglDestroySurface(paramEGLDisplay, paramEGLSurface);
    AppMethodBeat.o(98063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e.d
 * JD-Core Version:    0.6.2
 */