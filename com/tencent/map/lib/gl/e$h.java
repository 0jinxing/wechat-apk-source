package com.tencent.map.lib.gl;

import android.opengl.GLDebugHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

class e$h
{
  EGL10 a;
  EGLDisplay b;
  EGLSurface c;
  EGLConfig d;
  EGLContext e;
  private WeakReference<e> f;

  public e$h(WeakReference<e> paramWeakReference)
  {
    this.f = paramWeakReference;
  }

  private void a(String paramString)
  {
    AppMethodBeat.i(98071);
    a(paramString, this.a.eglGetError());
    AppMethodBeat.o(98071);
  }

  public static void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(98072);
    paramString = new RuntimeException(b(paramString, paramInt));
    AppMethodBeat.o(98072);
    throw paramString;
  }

  public static void a(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(98073);
    b(paramString2, paramInt);
    AppMethodBeat.o(98073);
  }

  public static String b(String paramString, int paramInt)
  {
    AppMethodBeat.i(98074);
    paramString = paramString + " failed: ";
    AppMethodBeat.o(98074);
    return paramString;
  }

  private void g()
  {
    AppMethodBeat.i(98069);
    if ((this.c != null) && (this.c != EGL10.EGL_NO_SURFACE))
    {
      EGL10 localEGL10 = this.a;
      EGLDisplay localEGLDisplay = this.b;
      Object localObject = EGL10.EGL_NO_SURFACE;
      localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject, (EGLSurface)localObject, EGL10.EGL_NO_CONTEXT);
      localObject = (e)this.f.get();
      if (localObject != null)
        e.d((e)localObject).a(this.a, this.b, this.c);
      this.c = null;
    }
    AppMethodBeat.o(98069);
  }

  public void a()
  {
    AppMethodBeat.i(98064);
    this.a = ((EGL10)EGLContext.getEGL());
    this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    if (this.b == EGL10.EGL_NO_DISPLAY)
    {
      localObject = new RuntimeException("eglGetDisplay failed");
      AppMethodBeat.o(98064);
      throw ((Throwable)localObject);
    }
    Object localObject = new int[2];
    if (!this.a.eglInitialize(this.b, (int[])localObject))
    {
      localObject = new RuntimeException("eglInitialize failed");
      AppMethodBeat.o(98064);
      throw ((Throwable)localObject);
    }
    localObject = (e)this.f.get();
    if (localObject == null)
      this.d = null;
    for (this.e = null; ; this.e = e.c((e)localObject).a(this.a, this.b, this.d))
    {
      if ((this.e == null) || (this.e == EGL10.EGL_NO_CONTEXT))
      {
        this.e = null;
        a("createContext");
      }
      this.c = null;
      AppMethodBeat.o(98064);
      return;
      this.d = e.b((e)localObject).a(this.a, this.b);
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(98065);
    if (this.a == null)
    {
      localObject = new RuntimeException("egl not initialized");
      AppMethodBeat.o(98065);
      throw ((Throwable)localObject);
    }
    if (this.b == null)
    {
      localObject = new RuntimeException("eglDisplay not initialized");
      AppMethodBeat.o(98065);
      throw ((Throwable)localObject);
    }
    if (this.d == null)
    {
      localObject = new RuntimeException("mEglConfig not initialized");
      AppMethodBeat.o(98065);
      throw ((Throwable)localObject);
    }
    g();
    Object localObject = (e)this.f.get();
    boolean bool;
    if (localObject != null)
    {
      this.c = e.d((e)localObject).a(this.a, this.b, this.d, ((e)localObject).getHolder());
      if ((this.c != null) && (this.c != EGL10.EGL_NO_SURFACE))
        break label169;
      this.a.eglGetError();
      AppMethodBeat.o(98065);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.c = null;
      break;
      label169: if (!this.a.eglMakeCurrent(this.b, this.c, this.c, this.e))
      {
        a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
        AppMethodBeat.o(98065);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(98065);
      }
    }
  }

  GL c()
  {
    AppMethodBeat.i(98066);
    GL localGL1 = this.e.getGL();
    e locale = (e)this.f.get();
    Object localObject = localGL1;
    GL localGL2;
    int i;
    if (locale != null)
    {
      localGL2 = localGL1;
      if (e.e(locale) != null)
        localGL2 = e.e(locale).a(localGL1);
      localObject = localGL2;
      if ((e.f(locale) & 0x3) != 0)
      {
        i = 0;
        if ((e.f(locale) & 0x1) != 0)
          i = 1;
        if ((e.f(locale) & 0x2) == 0)
          break label112;
      }
    }
    label112: for (localObject = new e.l(); ; localObject = null)
    {
      localObject = GLDebugHelper.wrap(localGL2, i, (Writer)localObject);
      AppMethodBeat.o(98066);
      return localObject;
    }
  }

  public int d()
  {
    AppMethodBeat.i(98067);
    int i;
    if (!this.a.eglSwapBuffers(this.b, this.c))
    {
      i = this.a.eglGetError();
      AppMethodBeat.o(98067);
    }
    while (true)
    {
      return i;
      i = 12288;
      AppMethodBeat.o(98067);
    }
  }

  public void e()
  {
    AppMethodBeat.i(98068);
    g();
    AppMethodBeat.o(98068);
  }

  public void f()
  {
    AppMethodBeat.i(98070);
    if (this.e != null)
    {
      e locale = (e)this.f.get();
      if (locale != null)
        e.c(locale).a(this.a, this.b, this.e);
      this.e = null;
    }
    if (this.b != null)
    {
      this.a.eglTerminate(this.b);
      this.b = null;
    }
    AppMethodBeat.o(98070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e.h
 * JD-Core Version:    0.6.2
 */