package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

class e$c
  implements e.f
{
  private int b = 12440;

  private e$c(e parame)
  {
  }

  public EGLContext a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(98060);
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = this.b;
    arrayOfInt[1] = e.a(this.a);
    arrayOfInt[2] = 12344;
    EGLContext localEGLContext = EGL10.EGL_NO_CONTEXT;
    if (e.a(this.a) != 0);
    while (true)
    {
      paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, localEGLContext, arrayOfInt);
      AppMethodBeat.o(98060);
      return paramEGL10;
      arrayOfInt = null;
    }
  }

  public void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(98061);
    if (!paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext))
    {
      new StringBuilder("display:").append(paramEGLDisplay).append(" context: ").append(paramEGLContext);
      e.h.a("eglDestroyContex", paramEGL10.eglGetError());
    }
    AppMethodBeat.o(98061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e.c
 * JD-Core Version:    0.6.2
 */