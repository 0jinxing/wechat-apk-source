package com.tencent.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86631);
    c.a(this.AIN, new a());
    a locala = c.a(this.AIN);
    if (locala.mEGLConfig != null)
      locala.mEGL.eglMakeCurrent(locala.mEGLDisplay, locala.mEGLSurface, locala.mEGLSurface, locala.mEGLContext);
    this.AIN.AIM = Thread.currentThread().getName();
    AppMethodBeat.o(86631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.view.c.1
 * JD-Core Version:    0.6.2
 */