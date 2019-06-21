package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

public class a extends e
  implements SurfaceTexture.OnFrameAvailableListener
{
  g a;
  a.a b;
  private final int n;
  private final int o;
  private final int p;
  private final int q;
  private b r;
  private SurfaceTexture s;
  private c t;
  private boolean u;
  private float[] v;
  private c w;
  private ArrayList<Long> x;
  private TXCYuvTextureRender y;
  private final Queue<Runnable> z;

  public a()
  {
    AppMethodBeat.i(67153);
    this.n = 0;
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.x = new ArrayList();
    this.z = new LinkedList();
    this.v = new float[16];
    AppMethodBeat.o(67153);
  }

  private boolean a(Queue<Runnable> paramQueue)
  {
    AppMethodBeat.i(67169);
    while (true)
    {
      try
      {
        if (paramQueue.isEmpty())
        {
          AppMethodBeat.o(67169);
          bool = false;
          return bool;
        }
        Runnable localRunnable = (Runnable)paramQueue.poll();
        if (localRunnable == null)
        {
          AppMethodBeat.o(67169);
          bool = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(67169);
      }
      localObject.run();
      boolean bool = true;
      AppMethodBeat.o(67169);
    }
  }

  private void r()
  {
    AppMethodBeat.i(67162);
    this.t = new c(true);
    this.y = new TXCYuvTextureRender();
    this.w = new c(false);
    AppMethodBeat.o(67162);
  }

  private boolean s()
  {
    AppMethodBeat.i(67168);
    label229: label365: 
    while (true)
    {
      long l;
      try
      {
        boolean bool;
        if (this.u)
        {
          bool = this.u;
          this.u = false;
          l = 0L;
          GLES20.glViewport(0, 0, k(), l());
          if (!bool)
            break label229;
          if (this.s != null)
          {
            this.s.updateTexImage();
            this.s.getTransformMatrix(this.v);
          }
          if (this.a != null)
          {
            this.a.a(this.t.a(), this.v);
            if ((this.i == 1) && (this.r != null))
              a(this.r.a(), this.t.a(), this.v, true);
            AppMethodBeat.o(67168);
            bool = true;
            return bool;
          }
        }
        else
        {
          if (!this.x.isEmpty())
          {
            l = ((Long)this.x.get(0)).longValue();
            this.x.remove(0);
            bool = false;
            continue;
          }
          AppMethodBeat.o(67168);
          bool = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(67168);
      }
      if (this.t != null)
      {
        this.t.a(this.s);
        continue;
        if ((l != 0L) && (this.y != null))
        {
          int i;
          if (this.b != null)
          {
            this.y.setHasFrameBuffer(this.g, this.h);
            i = this.y.drawToTexture(l);
            this.b.d(i);
          }
          while (true)
          {
            if (this.i != 1)
              break label365;
            int j = i;
            if (i == -1)
            {
              this.y.setHasFrameBuffer(this.g, this.h);
              j = this.y.drawToTexture(l);
            }
            a(this.r.a(), j, null, false);
            break;
            if (this.i == 0)
              this.y.drawFrame(l);
            i = -1;
          }
        }
      }
    }
  }

  public SurfaceTexture a()
  {
    return this.s;
  }

  protected void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67160);
    super.a(paramInt1, paramInt2);
    if (this.y != null)
      this.y.setVideoSize(paramInt1, paramInt2);
    if (this.t != null)
      this.t.a(paramInt1, paramInt2);
    AppMethodBeat.o(67160);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    AppMethodBeat.i(67156);
    GLES20.glViewport(0, 0, k(), l());
    if (this.w != null)
      this.w.a(paramInt1, paramBoolean, paramInt4);
    super.a(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4);
    AppMethodBeat.o(67156);
  }

  public void a(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67155);
    try
    {
      this.x.add(Long.valueOf(paramLong));
      super.a(paramLong, paramInt1, paramInt2);
      AppMethodBeat.o(67155);
      return;
    }
    finally
    {
      AppMethodBeat.o(67155);
    }
  }

  protected void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67158);
    g();
    AppMethodBeat.o(67158);
  }

  public void a(a.a parama)
  {
    AppMethodBeat.i(67154);
    this.b = parama;
    if ((parama != null) && (this.y != null))
      this.y.setHasFrameBuffer(this.g, this.h);
    AppMethodBeat.o(67154);
  }

  public void a(g paramg)
  {
    this.a = paramg;
  }

  public EGLContext b()
  {
    AppMethodBeat.i(67157);
    EGLContext localEGLContext;
    if (this.r != null)
    {
      localEGLContext = this.r.a();
      AppMethodBeat.o(67157);
    }
    while (true)
    {
      return localEGLContext;
      localEGLContext = null;
      AppMethodBeat.o(67157);
    }
  }

  protected void b(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67159);
    h();
    AppMethodBeat.o(67159);
  }

  void c()
  {
    AppMethodBeat.i(67161);
    r();
    if (this.d != null)
    {
      this.d.a(this.e, this.f);
      this.d.b(this.g, this.h);
    }
    if (this.t != null)
    {
      this.t.b();
      this.s = new SurfaceTexture(this.t.a());
      this.s.setOnFrameAvailableListener(this);
    }
    if (this.y != null)
      this.y.createTexture();
    if ((this.b != null) && (this.y != null))
      this.y.setHasFrameBuffer(this.g, this.h);
    if (this.w != null)
      this.w.b();
    if (this.l != null)
      this.l.a(this.s);
    AppMethodBeat.o(67161);
  }

  void d()
  {
    AppMethodBeat.i(67163);
    try
    {
      if (this.l != null)
        this.l.b(this.s);
      label26: if (this.t != null)
      {
        this.t.c();
        this.t = null;
      }
      if (this.y != null)
      {
        this.y.onSurfaceDestroy();
        this.y = null;
      }
      if (this.w != null)
      {
        this.w.c();
        this.w = null;
      }
      AppMethodBeat.o(67163);
      return;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }

  boolean e()
  {
    AppMethodBeat.i(67164);
    while (a(this.z));
    boolean bool = s();
    AppMethodBeat.o(67164);
    return bool;
  }

  SurfaceTexture f()
  {
    AppMethodBeat.i(67165);
    SurfaceTexture localSurfaceTexture;
    if (this.c != null)
    {
      localSurfaceTexture = this.c.getSurfaceTexture();
      AppMethodBeat.o(67165);
    }
    while (true)
    {
      return localSurfaceTexture;
      localSurfaceTexture = null;
      AppMethodBeat.o(67165);
    }
  }

  public void finalize()
  {
    AppMethodBeat.i(67170);
    super.finalize();
    TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when finalize");
    try
    {
      h();
      AppMethodBeat.o(67170);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67170);
    }
  }

  protected void g()
  {
    AppMethodBeat.i(67166);
    if (this.r == null)
    {
      this.r = new b(new WeakReference(this));
      this.r.start();
      TXCLog.w("TXCVideoRender", "play:vrender: start render thread");
      AppMethodBeat.o(67166);
    }
    while (true)
    {
      return;
      TXCLog.w("TXCVideoRender", "play:vrender: render thread is running");
      AppMethodBeat.o(67166);
    }
  }

  protected void h()
  {
    AppMethodBeat.i(67167);
    if (this.r != null)
    {
      this.r.b();
      this.r = null;
      TXCLog.w("TXCVideoRender", "play:vrender: quit render thread");
    }
    this.s = null;
    AppMethodBeat.o(67167);
  }

  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    try
    {
      this.u = true;
      return;
    }
    finally
    {
    }
    throw paramSurfaceTexture;
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.a
 * JD-Core Version:    0.6.2
 */