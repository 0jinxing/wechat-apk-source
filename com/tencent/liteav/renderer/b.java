package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class b extends Thread
{
  private int a = 12440;
  private int b = 4;
  private WeakReference<a> c;
  private EGL10 d;
  private EGLContext e;
  private EGLDisplay f;
  private EGLSurface g;
  private EGLConfig h;
  private WeakReference<SurfaceTexture> i;
  private boolean j = false;
  private int k = 1280;
  private int l = 720;

  b(WeakReference<a> paramWeakReference)
  {
    this.c = paramWeakReference;
  }

  private EGLContext a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(67270);
    paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, paramEGLContext, new int[] { this.a, 2, 12344 });
    AppMethodBeat.o(67270);
    return paramEGL10;
  }

  private void c()
  {
    AppMethodBeat.i(67263);
    try
    {
      a locala = (a)this.c.get();
      if (locala != null)
        locala.c();
      AppMethodBeat.o(67263);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67263);
    }
  }

  private void d()
  {
    AppMethodBeat.i(67264);
    try
    {
      a locala = (a)this.c.get();
      if (locala != null)
        locala.d();
      AppMethodBeat.o(67264);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67264);
    }
  }

  private boolean e()
  {
    AppMethodBeat.i(67265);
    try
    {
      Thread.sleep(10L);
      if (this.c != null)
      {
        a locala = (a)this.c.get();
        if (locala != null)
        {
          bool = locala.e();
          AppMethodBeat.o(67265);
          return bool;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(67265);
      }
    }
  }

  private void f()
  {
    AppMethodBeat.i(67266);
    if (this.c != null)
    {
      a locala = (a)this.c.get();
      if (locala != null)
        locala.o();
    }
    AppMethodBeat.o(67266);
  }

  private void g()
  {
    AppMethodBeat.i(67267);
    if (this.c != null)
    {
      a locala = (a)this.c.get();
      if (locala != null)
        locala.p();
    }
    AppMethodBeat.o(67267);
  }

  private void h()
  {
    AppMethodBeat.i(67268);
    Object localObject1 = (a)this.c.get();
    if (localObject1 == null)
      AppMethodBeat.o(67268);
    while (true)
    {
      return;
      this.d = ((EGL10)EGLContext.getEGL());
      this.f = this.d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      Object localObject2 = new int[2];
      this.d.eglInitialize(this.f, (int[])localObject2);
      this.h = j();
      localObject1 = ((a)localObject1).f();
      if (localObject1 != null)
        this.i = new WeakReference(localObject1);
      int m;
      int n;
      for (this.g = this.d.eglCreateWindowSurface(this.f, this.h, localObject1, null); ; this.g = this.d.eglCreatePbufferSurface(this.f, this.h, new int[] { 12375, m, 12374, n, 12344 }))
      {
        this.e = a(this.d, this.f, this.h, EGL10.EGL_NO_CONTEXT);
        TXCLog.w("TXCVideoRenderThread", "vrender: init egl @context=" + this.e + ",surface=" + this.g);
        try
        {
          if ((this.g != null) && (this.g != EGL10.EGL_NO_SURFACE))
            break label317;
          localObject2 = new java/lang/RuntimeException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("GL error:");
          ((RuntimeException)localObject2).<init>(GLUtils.getEGLErrorString(this.d.eglGetError()));
          AppMethodBeat.o(67268);
          throw ((Throwable)localObject2);
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(67268);
        }
        break;
        m = this.k;
        n = this.l;
      }
      label317: if (!this.d.eglMakeCurrent(this.f, this.g, this.g, this.e))
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("GL Make current Error");
        localRuntimeException.<init>(GLUtils.getEGLErrorString(this.d.eglGetError()));
        AppMethodBeat.o(67268);
        throw localRuntimeException;
      }
      AppMethodBeat.o(67268);
    }
  }

  private void i()
  {
    AppMethodBeat.i(67269);
    EGL10 localEGL10 = this.d;
    EGLDisplay localEGLDisplay = this.f;
    EGLSurface localEGLSurface = EGL10.EGL_NO_SURFACE;
    localEGL10.eglMakeCurrent(localEGLDisplay, localEGLSurface, localEGLSurface, EGL10.EGL_NO_CONTEXT);
    this.d.eglDestroyContext(this.f, this.e);
    this.d.eglDestroySurface(this.f, this.g);
    this.d.eglTerminate(this.f);
    this.i = null;
    TXCLog.w("TXCVideoRenderThread", "vrender: uninit egl @context=" + this.e + ",surface=" + this.g);
    AppMethodBeat.o(67269);
  }

  private EGLConfig j()
  {
    AppMethodBeat.i(67271);
    int[] arrayOfInt1 = new int[1];
    Object localObject = new EGLConfig[1];
    int[] arrayOfInt2 = k();
    if (!this.d.eglChooseConfig(this.f, arrayOfInt2, (EGLConfig[])localObject, 1, arrayOfInt1))
    {
      localObject = new IllegalArgumentException("Failed to choose config:" + GLUtils.getEGLErrorString(this.d.eglGetError()));
      AppMethodBeat.o(67271);
      throw ((Throwable)localObject);
    }
    if (arrayOfInt1[0] > 0)
    {
      localObject = localObject[0];
      AppMethodBeat.o(67271);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(67271);
    }
  }

  private int[] k()
  {
    return new int[] { 12352, this.b, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 };
  }

  public EGLContext a()
  {
    return this.e;
  }

  public void b()
  {
    this.j = false;
  }

  public void run()
  {
    AppMethodBeat.i(67262);
    setName("VRender" + getId());
    try
    {
      this.j = true;
      h();
      c();
      f();
      while (this.j)
        if ((e()) && (this.d != null) && (this.f != null) && (this.g != null))
          this.d.eglSwapBuffers(this.f, this.g);
    }
    catch (Exception localException)
    {
      while (true)
      {
        return;
        g();
        d();
        i();
        AppMethodBeat.o(67262);
      }
    }
    finally
    {
      AppMethodBeat.o(67262);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.b
 * JD-Core Version:    0.6.2
 */