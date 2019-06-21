package com.tencent.liteav.basic.e;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class b
{
  public static final String a;
  private static int[] l;
  private static int[] m;
  private EGL10 b;
  private EGLDisplay c;
  private EGLConfig d;
  private boolean e;
  private EGLContext f;
  private boolean g;
  private EGLSurface h;
  private int i;
  private int j;
  private int[] k;

  static
  {
    AppMethodBeat.i(66186);
    a = b.class.getSimpleName();
    l = new int[] { 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344 };
    m = new int[] { 12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344 };
    AppMethodBeat.o(66186);
  }

  private b()
  {
    AppMethodBeat.i(66180);
    this.i = 0;
    this.j = 0;
    this.k = new int[2];
    AppMethodBeat.o(66180);
  }

  public static b a(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66181);
    b localb = new b();
    localb.i = paramInt1;
    localb.j = paramInt2;
    if (localb.a(paramEGLConfig, paramEGLContext, paramSurface))
    {
      AppMethodBeat.o(66181);
      paramEGLConfig = localb;
    }
    while (true)
    {
      return paramEGLConfig;
      paramEGLConfig = null;
      AppMethodBeat.o(66181);
    }
  }

  private boolean a(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface)
  {
    boolean bool = true;
    AppMethodBeat.i(66184);
    this.b = ((EGL10)EGLContext.getEGL());
    this.c = this.b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    this.b.eglInitialize(this.c, this.k);
    if (paramEGLConfig == null)
    {
      int[] arrayOfInt = new int[1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      EGL10 localEGL10 = this.b;
      EGLDisplay localEGLDisplay = this.c;
      if (paramSurface == null)
      {
        paramEGLConfig = l;
        localEGL10.eglChooseConfig(localEGLDisplay, paramEGLConfig, arrayOfEGLConfig, 1, arrayOfInt);
        this.d = arrayOfEGLConfig[0];
        this.e = true;
        label116: paramEGLConfig = new int[3];
        EGLConfig tmp121_120 = paramEGLConfig;
        tmp121_120[0] = 12440;
        EGLConfig tmp127_121 = tmp121_120;
        tmp127_121[1] = 2;
        EGLConfig tmp131_127 = tmp127_121;
        tmp131_127[2] = 12344;
        tmp131_127;
        if (paramEGLContext != null)
          break label207;
        this.f = this.b.eglCreateContext(this.c, this.d, EGL10.EGL_NO_CONTEXT, paramEGLConfig);
        label167: if (this.f != EGL10.EGL_NO_CONTEXT)
          break label238;
        d();
        AppMethodBeat.o(66184);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      paramEGLConfig = m;
      break;
      this.d = paramEGLConfig;
      break label116;
      label207: this.f = this.b.eglCreateContext(this.c, this.d, paramEGLContext, paramEGLConfig);
      this.g = true;
      break label167;
      label238: int n = this.i;
      int i1 = this.j;
      if (paramSurface == null);
      for (this.h = this.b.eglCreatePbufferSurface(this.c, this.d, new int[] { 12375, n, 12374, i1, 12344 }); ; this.h = this.b.eglCreateWindowSurface(this.c, this.d, paramSurface, null))
      {
        if (this.h != EGL10.EGL_NO_SURFACE)
          break label357;
        d();
        AppMethodBeat.o(66184);
        bool = false;
        break;
      }
      label357: if (!this.b.eglMakeCurrent(this.c, this.h, this.h, this.f))
      {
        d();
        AppMethodBeat.o(66184);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(66184);
      }
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(66182);
    boolean bool = this.b.eglSwapBuffers(this.c, this.h);
    d();
    AppMethodBeat.o(66182);
    return bool;
  }

  public void b()
  {
    AppMethodBeat.i(66183);
    EGL10 localEGL10 = this.b;
    EGLDisplay localEGLDisplay = this.c;
    EGLSurface localEGLSurface = EGL10.EGL_NO_SURFACE;
    localEGL10.eglMakeCurrent(localEGLDisplay, localEGLSurface, localEGLSurface, EGL10.EGL_NO_CONTEXT);
    if (this.h != null)
      this.b.eglDestroySurface(this.c, this.h);
    if (this.f != null)
      this.b.eglDestroyContext(this.c, this.f);
    this.b.eglTerminate(this.c);
    d();
    this.c = null;
    this.h = null;
    this.c = null;
    AppMethodBeat.o(66183);
  }

  public EGLContext c()
  {
    return this.f;
  }

  public void d()
  {
    AppMethodBeat.i(66185);
    int n = this.b.eglGetError();
    if (n != 12288)
      TXCLog.e(a, "EGL error: 0x" + Integer.toHexString(n));
    AppMethodBeat.o(66185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.b
 * JD-Core Version:    0.6.2
 */