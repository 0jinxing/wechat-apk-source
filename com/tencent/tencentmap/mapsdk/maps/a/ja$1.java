package com.tencent.tencentmap.mapsdk.maps.a;

import android.util.Log;
import com.tencent.map.lib.d;
import com.tencent.map.lib.gl.e.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class ja$1
  implements e.f
{
  ja$1(ja paramja)
  {
  }

  public EGLContext a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(99985);
    paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
    AppMethodBeat.o(99985);
    return paramEGL10;
  }

  public void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(99984);
    Object localObject = new byte[1];
    ja.a(this.a, (byte[])localObject);
    try
    {
      localObject.wait(1000L);
      ja.a(this.a);
      localObject = EGL10.EGL_NO_SURFACE;
      paramEGL10.eglMakeCurrent(paramEGLDisplay, (EGLSurface)localObject, (EGLSurface)localObject, EGL10.EGL_NO_CONTEXT);
      paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext);
      AppMethodBeat.o(99984);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        d.b(Log.getStackTraceString(localInterruptedException));
        Thread.currentThread().interrupt();
      }
    }
    finally
    {
      AppMethodBeat.o(99984);
    }
    throw paramEGL10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ja.1
 * JD-Core Version:    0.6.2
 */