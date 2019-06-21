package com.tencent.liteav.basic.e;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(17)
public class c
{
  private static int a;
  private static final String b;
  private static int[] k;
  private static int[] l;
  private EGLDisplay c = EGL14.EGL_NO_DISPLAY;
  private EGLContext d = EGL14.EGL_NO_CONTEXT;
  private EGLConfig e = null;
  private int f = 0;
  private int g = 0;
  private boolean h;
  private EGLSurface i;
  private int j = -1;

  static
  {
    int m = 4;
    AppMethodBeat.i(66194);
    a = 2;
    b = c.class.getSimpleName();
    if (a == 2)
    {
      n = 4;
      k = new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, n, 12610, 1, 12344 };
      if (a != 2)
        break label277;
    }
    label277: for (int n = m; ; n = 68)
    {
      l = new int[] { 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, n, 12610, 1, 12344 };
      AppMethodBeat.o(66194);
      return;
      n = 68;
      break;
    }
  }

  public static c a(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66188);
    c localc = new c();
    localc.f = paramInt1;
    localc.g = paramInt2;
    if (localc.a(paramEGLConfig, paramEGLContext, paramSurface))
    {
      AppMethodBeat.o(66188);
      paramEGLConfig = localc;
    }
    while (true)
    {
      return paramEGLConfig;
      paramEGLConfig = null;
      AppMethodBeat.o(66188);
    }
  }

  private boolean a(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface)
  {
    boolean bool = false;
    AppMethodBeat.i(66192);
    this.c = EGL14.eglGetDisplay(0);
    if (this.c == EGL14.EGL_NO_DISPLAY)
    {
      paramEGLConfig = new RuntimeException("unable to get EGL14 display");
      AppMethodBeat.o(66192);
      throw paramEGLConfig;
    }
    Object localObject = new int[2];
    if (!EGL14.eglInitialize(this.c, (int[])localObject, 0, (int[])localObject, 1))
    {
      this.c = null;
      paramEGLConfig = new RuntimeException("unable to initialize EGL14");
      AppMethodBeat.o(66192);
      throw paramEGLConfig;
    }
    label104: int m;
    if (paramEGLConfig != null)
    {
      this.e = paramEGLConfig;
      if (paramEGLContext == null)
        break label236;
      this.h = true;
      m = a;
      this.d = EGL14.eglCreateContext(this.c, this.e, paramEGLContext, new int[] { 12440, m, 12344 }, 0);
      if (this.d != EGL14.EGL_NO_CONTEXT)
        break label243;
      a();
      AppMethodBeat.o(66192);
    }
    while (true)
    {
      return bool;
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      int[] arrayOfInt = new int[1];
      localObject = this.c;
      if (paramSurface == null);
      for (paramEGLConfig = l; ; paramEGLConfig = k)
      {
        if (EGL14.eglChooseConfig((EGLDisplay)localObject, paramEGLConfig, 0, arrayOfEGLConfig, 0, 1, arrayOfInt, 0))
          break label225;
        AppMethodBeat.o(66192);
        break;
      }
      label225: this.e = arrayOfEGLConfig[0];
      break;
      label236: paramEGLContext = EGL14.EGL_NO_CONTEXT;
      break label104;
      label243: int n;
      if (paramSurface == null)
      {
        m = this.f;
        n = this.g;
      }
      for (this.i = EGL14.eglCreatePbufferSurface(this.c, this.e, new int[] { 12375, m, 12374, n, 12344 }, 0); ; this.i = EGL14.eglCreateWindowSurface(this.c, this.e, paramSurface, new int[] { 12344 }, 0))
      {
        a();
        if (EGL14.eglMakeCurrent(this.c, this.i, this.i, this.d))
          break label373;
        a();
        AppMethodBeat.o(66192);
        break;
      }
      label373: AppMethodBeat.o(66192);
      bool = true;
    }
  }

  public void a()
  {
    AppMethodBeat.i(66189);
    int m = EGL14.eglGetError();
    if (m != 12288)
    {
      RuntimeException localRuntimeException = new RuntimeException(": EGL error: 0x" + Integer.toHexString(m));
      AppMethodBeat.o(66189);
      throw localRuntimeException;
    }
    AppMethodBeat.o(66189);
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(66193);
    EGLExt.eglPresentationTimeANDROID(this.c, this.i, paramLong);
    AppMethodBeat.o(66193);
  }

  public void b()
  {
    AppMethodBeat.i(66190);
    if (this.c != EGL14.EGL_NO_DISPLAY)
    {
      EGLDisplay localEGLDisplay = this.c;
      EGLSurface localEGLSurface = EGL14.EGL_NO_SURFACE;
      EGL14.eglMakeCurrent(localEGLDisplay, localEGLSurface, localEGLSurface, EGL14.EGL_NO_CONTEXT);
      EGL14.eglDestroySurface(this.c, this.i);
      EGL14.eglDestroyContext(this.c, this.d);
      this.d = EGL14.EGL_NO_CONTEXT;
      EGL14.eglReleaseThread();
      EGL14.eglTerminate(this.c);
    }
    this.c = EGL14.EGL_NO_DISPLAY;
    AppMethodBeat.o(66190);
  }

  public boolean c()
  {
    AppMethodBeat.i(66191);
    boolean bool = EGL14.eglSwapBuffers(this.c, this.i);
    AppMethodBeat.o(66191);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.c
 * JD-Core Version:    0.6.2
 */