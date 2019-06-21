package com.tencent.tencentmap.mapsdk.maps.a;

import android.annotation.TargetApi;
import android.opengl.GLUtils;
import android.util.Log;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public class iy extends Thread
{
  private static int d = 60;
  private static long p = 1500L;
  private WeakReference<iz> a;
  private AtomicBoolean b;
  private AtomicBoolean c;
  private byte[] e;
  private WeakReference<Object> f;
  private volatile boolean g;
  private EGLConfig h;
  private EGL10 i;
  private EGLDisplay j;
  private EGLContext k;
  private EGLSurface l;
  private GL m;
  private volatile long n;
  private boolean o;

  public iy(Object paramObject, iz paramiz)
  {
    AppMethodBeat.i(99902);
    this.b = new AtomicBoolean(true);
    this.c = new AtomicBoolean(false);
    this.e = new byte[0];
    this.g = false;
    this.h = null;
    this.j = EGL10.EGL_NO_DISPLAY;
    this.k = EGL10.EGL_NO_CONTEXT;
    this.l = EGL10.EGL_NO_SURFACE;
    this.n = 0L;
    this.o = false;
    this.f = new WeakReference(paramObject);
    this.a = new WeakReference(paramiz);
    AppMethodBeat.o(99902);
  }

  @TargetApi(14)
  private void e()
  {
    AppMethodBeat.i(99907);
    if (this.b.get());
    while (true)
    {
      try
      {
        if (this.f != null)
        {
          localObject = this.f.get();
          if (localObject != null);
        }
        else
        {
          AppMethodBeat.o(99907);
          return;
        }
        Object localObject = this.f.get();
        this.i = ((EGL10)EGLContext.getEGL());
        this.j = this.i.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.j != EGL10.EGL_NO_DISPLAY)
          break label135;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("eglGetdisplay failed,mEglDisplay == EGL10.EGL_NO_DISPLAY,errorDetail:");
        ((StringBuilder)localObject).append(GLUtils.getEGLErrorString(this.i.eglGetError()));
      }
      catch (Throwable localThrowable)
      {
        new StringBuilder("initializeGLContext failed,errorDetail:").append(Log.getStackTraceString(localThrowable));
      }
      break;
      label135: int[] arrayOfInt = new int[2];
      StringBuilder localStringBuilder;
      if (!this.i.eglInitialize(this.j, arrayOfInt))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglInitialize failed,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      arrayOfInt = new int[1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      if (!this.i.eglChooseConfig(this.j, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12352, 4, 12344 }, arrayOfEGLConfig, 1, arrayOfInt))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglChooseConfig failed,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      this.h = arrayOfEGLConfig[0];
      this.l = this.i.eglCreateWindowSurface(this.j, this.h, localStringBuilder, null);
      if (this.l == EGL10.EGL_NO_SURFACE)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglCreateWindowSurface failed,mEglSurface == EGL10.EGL_NO_SURFACE,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      this.k = this.i.eglCreateContext(this.j, arrayOfEGLConfig[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
      if (this.k == EGL10.EGL_NO_CONTEXT)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglCreateContext failed,mEglContext == EGL10.EGL_NO_CONTEXT,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      if (!this.i.eglMakeCurrent(this.j, this.l, this.l, this.k))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglMakeCurrent failed,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      this.m = this.k.getGL();
      AppMethodBeat.o(99907);
      continue;
      AppMethodBeat.o(99907);
    }
  }

  @TargetApi(14)
  private void f()
  {
    AppMethodBeat.i(99910);
    if (this.b.get());
    while (true)
    {
      try
      {
        if (this.f != null)
        {
          localObject = this.f.get();
          if (localObject != null);
        }
        else
        {
          AppMethodBeat.o(99910);
          return;
        }
        this.l = this.i.eglCreateWindowSurface(this.j, this.h, this.f.get(), null);
        if (this.l != EGL10.EGL_NO_SURFACE)
          break label130;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("eglCreateWindowSurface failed,errorDetail:");
        ((StringBuilder)localObject).append(GLUtils.getEGLErrorString(this.i.eglGetError()));
      }
      catch (Throwable localThrowable)
      {
        new StringBuilder("updateSurface failed,errorDetail:").append(Log.getStackTraceString(localThrowable));
      }
      break;
      label130: if (!this.i.eglMakeCurrent(this.j, this.l, this.l, this.k))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("eglMakeCurrent failed,errorDetail:");
        localStringBuilder.append(GLUtils.getEGLErrorString(this.i.eglGetError()));
        break;
      }
      AppMethodBeat.o(99910);
      continue;
      AppMethodBeat.o(99910);
    }
  }

  private void g()
  {
    AppMethodBeat.i(99911);
    iz localiz;
    byte[] arrayOfByte;
    if ((this.a != null) && (this.a.get() != null))
    {
      localiz = (iz)this.a.get();
      arrayOfByte = new byte[1];
      localiz.a(arrayOfByte);
    }
    try
    {
      arrayOfByte.wait(1000L);
      localiz.d();
      h();
      AppMethodBeat.o(99911);
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
      AppMethodBeat.o(99911);
    }
  }

  private void h()
  {
    AppMethodBeat.i(99912);
    if ((this.l != null) && (this.l != EGL10.EGL_NO_SURFACE))
    {
      EGL10 localEGL10 = this.i;
      EGLDisplay localEGLDisplay = this.j;
      EGLSurface localEGLSurface = EGL10.EGL_NO_SURFACE;
      localEGL10.eglMakeCurrent(localEGLDisplay, localEGLSurface, localEGLSurface, EGL10.EGL_NO_CONTEXT);
      this.i.eglDestroySurface(this.j, this.l);
    }
    if ((this.k != null) && (this.k != EGL10.EGL_NO_CONTEXT))
      this.i.eglDestroyContext(this.j, this.k);
    if ((this.j != null) && (this.j != EGL10.EGL_NO_DISPLAY))
      this.i.eglTerminate(this.j);
    this.k = EGL10.EGL_NO_CONTEXT;
    this.l = EGL10.EGL_NO_SURFACE;
    this.j = EGL10.EGL_NO_DISPLAY;
    this.a = null;
    AppMethodBeat.o(99912);
  }

  public void a()
  {
    AppMethodBeat.i(99904);
    this.c.set(true);
    synchronized (this.e)
    {
      this.e.notify();
      AppMethodBeat.o(99904);
      return;
    }
  }

  public void a(Object paramObject)
  {
    AppMethodBeat.i(99908);
    this.f = new WeakReference(paramObject);
    this.g = true;
    AppMethodBeat.o(99908);
  }

  public void b()
  {
    AppMethodBeat.i(99905);
    this.c.set(false);
    synchronized (this.e)
    {
      this.e.notify();
      AppMethodBeat.o(99905);
      return;
    }
  }

  public void c()
  {
    AppMethodBeat.i(99906);
    this.b.set(false);
    this.c.set(false);
    synchronized (this.e)
    {
      this.e.notify();
      interrupt();
      AppMethodBeat.o(99906);
      return;
    }
  }

  public void d()
  {
    AppMethodBeat.i(99909);
    this.o = true;
    this.n = System.currentTimeMillis();
    AppMethodBeat.o(99909);
  }

  public void run()
  {
    AppMethodBeat.i(99903);
    super.run();
    e();
    while (this.b.get())
    {
      try
      {
        synchronized (this.e)
        {
          if (!this.c.get())
            break label101;
          this.e.wait();
        }
      }
      catch (Throwable localThrowable)
      {
      }
      if ((this.b.get()) || (!(localThrowable instanceof InterruptedException)))
      {
        new StringBuilder("TextureGLRenderThread Render Exception:").append(Log.getStackTraceString(localThrowable));
        continue;
        label101: if (this.g)
        {
          f();
          this.o = true;
          this.g = false;
          d();
        }
        if ((this.a != null) && (this.a.get() != null))
        {
          iz localiz = (iz)this.a.get();
          if ((this.o) && (System.currentTimeMillis() - this.n < p))
            if (localiz != null)
              localiz.l();
          while (true)
          {
            while (true)
            {
              if ((localiz != null) && (localiz.a((GL10)this.m)))
                this.i.eglSwapBuffers(this.j, this.l);
              try
              {
                wait(1000 / d);
                break;
              }
              finally
              {
                AppMethodBeat.o(99903);
              }
            }
            this.o = false;
            this.n = 0L;
          }
        }
      }
    }
    g();
    AppMethodBeat.o(99903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iy
 * JD-Core Version:    0.6.2
 */