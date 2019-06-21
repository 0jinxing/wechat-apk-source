package com.tencent.liteav.basic.e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class d
  implements f.a
{
  private volatile HandlerThread a = null;
  private volatile f b = null;
  private g c = null;
  private int d = 0;
  private boolean e = false;
  private float f = 1.0F;
  private float g = 1.0F;
  private int h = 0;
  private int i = 0;
  private boolean j = true;
  private n k = null;
  private boolean l = false;

  private void a(int paramInt)
  {
    AppMethodBeat.i(66223);
    try
    {
      if (this.b != null)
        this.b.sendEmptyMessage(paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(66223);
    }
  }

  private void b(int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2)
  {
    AppMethodBeat.i(66224);
    if ((paramInt4 == 0) || (paramInt3 == 0) || (paramInt5 == 0) || (paramInt6 == 0) || (this.c == null))
      AppMethodBeat.o(66224);
    while (true)
    {
      return;
      if (!this.l)
        break;
      this.l = false;
      AppMethodBeat.o(66224);
    }
    if (paramBoolean2)
    {
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GLES20.glClear(16640);
      GLES20.glBindFramebuffer(36160, 0);
      if (this.b != null)
        this.b.c();
      this.l = true;
    }
    this.h = paramInt3;
    this.i = paramInt4;
    GLES20.glViewport(0, 0, paramInt3, paramInt4);
    float f1;
    label136: float f2;
    label150: label239: int n;
    if (paramInt4 != 0)
    {
      f1 = paramInt3 / paramInt4;
      if (paramInt6 == 0)
        break label381;
      f2 = paramInt5 / paramInt6;
      if ((this.e != paramBoolean1) || (this.d != paramInt2) || (this.f != f1) || (this.g != f2))
      {
        this.e = paramBoolean1;
        this.d = paramInt2;
        this.f = f1;
        this.g = f2;
        int m = (720 - this.d) % 360;
        if ((m != 90) && (m != 270))
          break label387;
        paramInt2 = 1;
        if (paramInt2 == 0)
          break label392;
        n = paramInt4;
        label247: if (paramInt2 == 0)
          break label399;
        label251: g localg = this.c;
        float[] arrayOfFloat = k.a(j.a, false, true);
        f1 = n / paramInt3;
        if (paramInt2 == 0)
          break label406;
        paramBoolean1 = false;
        label282: if (paramInt2 == 0)
          break label414;
        paramBoolean2 = this.e;
        label292: localg.a(paramInt5, paramInt6, m, arrayOfFloat, f1, paramBoolean1, paramBoolean2);
        if (paramInt2 == 0)
          break label420;
        this.c.g();
      }
    }
    while (true)
    {
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GLES20.glClear(16640);
      GLES20.glBindFramebuffer(36160, 0);
      this.c.a(paramInt1);
      g();
      if (this.b != null)
        this.b.c();
      AppMethodBeat.o(66224);
      break;
      f1 = 1.0F;
      break label136;
      label381: f2 = 1.0F;
      break label150;
      label387: paramInt2 = 0;
      break label239;
      label392: n = paramInt3;
      break label247;
      label399: paramInt3 = paramInt4;
      break label251;
      label406: paramBoolean1 = this.e;
      break label282;
      label414: paramBoolean2 = false;
      break label292;
      label420: this.c.h();
    }
  }

  private void b(EGLContext paramEGLContext, Surface paramSurface)
  {
    AppMethodBeat.i(66221);
    f();
    try
    {
      Object localObject = new android/os/HandlerThread;
      ((HandlerThread)localObject).<init>("TXGLSurfaceRenderThread");
      this.a = ((HandlerThread)localObject);
      this.a.start();
      localObject = new com/tencent/liteav/basic/e/f;
      ((f)localObject).<init>(this.a.getLooper());
      this.b = ((f)localObject);
      this.b.a(this);
      this.b.d = paramEGLContext;
      this.b.c = paramSurface;
      paramEGLContext = new java/lang/StringBuilder;
      paramEGLContext.<init>("create gl thread ");
      TXCLog.w("TXGLSurfaceRenderThread", this.a.getName());
      a(100);
      AppMethodBeat.o(66221);
      return;
    }
    finally
    {
      AppMethodBeat.o(66221);
    }
    throw paramEGLContext;
  }

  private void f()
  {
    AppMethodBeat.i(66222);
    try
    {
      if (this.b != null)
      {
        f.a(this.b, this.a);
        TXCLog.w("TXGLSurfaceRenderThread", "destroy gl thread");
      }
      this.b = null;
      this.a = null;
      return;
    }
    finally
    {
      AppMethodBeat.o(66222);
    }
  }

  private void g()
  {
    AppMethodBeat.i(66225);
    int m;
    int n;
    label55: int i1;
    if (this.j)
      if ((this.h != 0) && (this.i != 0))
      {
        if (this.h > this.i)
          break label158;
        m = 1;
        if (this.i < this.h)
          break label163;
        n = this.i;
        if (this.i < this.h)
          break label171;
        i1 = this.h;
        label71: if (m == 0)
          break label179;
        m = i1;
        i1 = n;
        n = m;
      }
    label158: label163: label171: label179: 
    while (true)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(n * i1 * 4);
      Bitmap localBitmap = Bitmap.createBitmap(n, i1, Bitmap.Config.ARGB_8888);
      localByteBuffer.position(0);
      GLES20.glReadPixels(0, 0, n, i1, 6408, 5121, localByteBuffer);
      new Thread(new d.2(this, localByteBuffer, localBitmap, n, i1)).start();
      this.j = false;
      AppMethodBeat.o(66225);
      return;
      m = 0;
      break;
      n = this.h;
      break label55;
      i1 = this.i;
      break label71;
    }
  }

  public void a()
  {
    AppMethodBeat.i(66215);
    f();
    AppMethodBeat.o(66215);
  }

  public void a(int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2)
  {
    AppMethodBeat.i(66218);
    GLES20.glFinish();
    try
    {
      if (this.b != null)
      {
        f localf = this.b;
        d.1 local1 = new com/tencent/liteav/basic/e/d$1;
        local1.<init>(this, paramInt1, paramBoolean1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean2);
        localf.post(local1);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(66218);
    }
  }

  public void a(n paramn)
  {
    this.k = paramn;
    this.j = true;
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(66217);
    try
    {
      if (this.b != null)
        this.b.post(paramRunnable);
      return;
    }
    finally
    {
      AppMethodBeat.o(66217);
    }
    throw paramRunnable;
  }

  public void a(EGLContext paramEGLContext, Surface paramSurface)
  {
    AppMethodBeat.i(66214);
    b(paramEGLContext, paramSurface);
    AppMethodBeat.o(66214);
  }

  public Surface b()
  {
    AppMethodBeat.i(66216);
    try
    {
      if (this.b != null);
      for (Surface localSurface = this.b.b(); ; localSurface = null)
        return localSurface;
    }
    finally
    {
      AppMethodBeat.o(66216);
    }
  }

  public void c()
  {
    AppMethodBeat.i(66219);
    TXCLog.w("TXGLSurfaceRenderThread", "create egl context ");
    this.c = new g();
    if (!this.c.a())
      AppMethodBeat.o(66219);
    while (true)
    {
      return;
      this.c.a(k.e, k.a(j.a, false, false));
      AppMethodBeat.o(66219);
    }
  }

  public void d()
  {
  }

  public void e()
  {
    AppMethodBeat.i(66220);
    TXCLog.w("TXGLSurfaceRenderThread", "destroy egl context ");
    if (this.c != null)
    {
      this.c.d();
      this.c = null;
    }
    AppMethodBeat.o(66220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.d
 * JD-Core Version:    0.6.2
 */