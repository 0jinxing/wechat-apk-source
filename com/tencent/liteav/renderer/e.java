package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

public class e extends com.tencent.liteav.basic.module.a
  implements TextureView.SurfaceTextureListener
{
  private static final float[] a = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F };
  private SurfaceTexture b;
  protected TextureView c;
  protected d d;
  protected int e;
  protected int f;
  protected int g;
  protected int h;
  protected volatile int i;
  protected int j;
  protected int k;
  protected f l;
  WeakReference<com.tencent.liteav.basic.d.a> m;
  private long n;
  private int o;
  private com.tencent.liteav.basic.e.d p;
  private h q;
  private Surface r;
  private int s;
  private int t;
  private int[] u;
  private boolean v;
  private boolean w;
  private e.a x;

  public e()
  {
    AppMethodBeat.i(67273);
    this.e = 0;
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.o = 800;
    this.s = 0;
    this.i = -1;
    this.j = 0;
    this.k = 0;
    this.w = false;
    this.x = new e.a();
    this.v = false;
    AppMethodBeat.o(67273);
  }

  private long a(long paramLong)
  {
    AppMethodBeat.i(67298);
    long l1 = TXCTimeUtil.getTimeTick();
    if (paramLong > l1)
    {
      paramLong = 0L;
      AppMethodBeat.o(67298);
    }
    while (true)
    {
      return paramLong;
      paramLong = l1 - paramLong;
      AppMethodBeat.o(67298);
    }
  }

  private int[] a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(67295);
    if ((this.q != null) && (this.q.a() != paramBoolean))
    {
      this.q.c();
      this.q = null;
    }
    if (this.q == null)
    {
      this.q = new h(Boolean.valueOf(paramBoolean));
      this.q.b();
    }
    if (!paramBoolean)
      this.q.a(a);
    int i1 = this.j;
    int i2 = this.k;
    if (this.t == 0)
      this.q.a(h.a);
    while (true)
    {
      int i3 = this.s;
      this.q.b(i3);
      this.q.b(paramInt2, paramInt3);
      this.q.a(i1, i2);
      paramInt1 = this.q.d(paramInt1);
      AppMethodBeat.o(67295);
      return new int[] { paramInt1, i1, i2 };
      this.q.a(h.b);
    }
  }

  private void b()
  {
    AppMethodBeat.i(67299);
    if (!this.v)
    {
      b.a(this.m, this.n, 2003, "渲染首个视频数据包(IDR)");
      setStatusValue(6001, Long.valueOf(TXCTimeUtil.getTimeTick()));
      this.v = true;
    }
    e.a locala = this.x;
    locala.c += 1L;
    if (this.x.a == 0L)
      this.x.a = TXCTimeUtil.getTimeTick();
    while (true)
    {
      if (this.x.d != 0L)
      {
        this.x.i = a(this.x.d);
        if (this.x.i > 500L)
        {
          locala = this.x;
          locala.e += 1L;
          setStatusValue(6003, Long.valueOf(this.x.e));
          if (this.x.i > this.x.h)
          {
            this.x.h = this.x.i;
            setStatusValue(6005, Long.valueOf(this.x.h));
          }
          locala = this.x;
          locala.g += this.x.i;
          setStatusValue(6006, Long.valueOf(this.x.g));
          TXCLog.w("TXCVideoRender", "render frame count:" + this.x.c + " block time:" + this.x.i + "> 500");
        }
        if (this.x.i > this.o)
          TXCLog.w("TXCVideoRender", "render frame count:" + this.x.c + " block time:" + this.x.i + "> " + this.o);
        if (this.x.i > 1000L)
        {
          locala = this.x;
          locala.f += 1L;
          setStatusValue(6004, Long.valueOf(this.x.f));
          TXCLog.w("TXCVideoRender", "render frame count:" + this.x.c + " block time:" + this.x.i + "> 1000");
          b.a(this.m, this.n, 2105, "当前视频播放出现卡顿" + this.x.i + "ms");
        }
      }
      this.x.d = TXCTimeUtil.getTimeTick();
      this.x.k = this.h;
      this.x.j = this.g;
      AppMethodBeat.o(67299);
      return;
      long l1 = TXCTimeUtil.getTimeTick() - this.x.a;
      if (l1 >= 1000L)
      {
        setStatusValue(6002, Double.valueOf((this.x.c - this.x.b) * 1000.0D / l1));
        this.x.b = this.x.c;
        locala = this.x;
        locala.a = (l1 + locala.a);
      }
    }
  }

  private void b(Surface paramSurface)
  {
    AppMethodBeat.i(67292);
    this.i = 1;
    this.r = paramSurface;
    g();
    AppMethodBeat.o(67292);
  }

  private void b(TextureView paramTextureView)
  {
    int i1 = 0;
    AppMethodBeat.i(67287);
    this.i = 0;
    int i2;
    if ((this.c != null) || (paramTextureView == null))
    {
      i2 = i1;
      if (this.c != null)
      {
        i2 = i1;
        if (this.c.equals(paramTextureView));
      }
    }
    else
    {
      i2 = 1;
    }
    TXCLog.w("TXCVideoRender", "play:vrender: set video view @old=" + this.c + ",new=" + paramTextureView);
    if (i2 != 0)
    {
      if ((this.c != null) && (this.b == null))
        b(this.c.getSurfaceTexture());
      this.c = paramTextureView;
      if (this.c != null)
      {
        this.e = this.c.getWidth();
        this.f = this.c.getHeight();
        this.d = new d(this.c);
        this.d.b(this.g, this.h);
        this.d.a(this.e, this.f);
        this.c.setSurfaceTextureListener(this);
        if (this.b != null)
        {
          if ((Build.VERSION.SDK_INT < 16) || (this.c.getSurfaceTexture() == this.b))
            break label265;
          this.c.setSurfaceTexture(this.b);
          AppMethodBeat.o(67287);
        }
      }
    }
    while (true)
    {
      return;
      if (this.c.isAvailable())
        a(this.c.getSurfaceTexture());
      label265: AppMethodBeat.o(67287);
    }
  }

  public SurfaceTexture a()
  {
    return null;
  }

  public void a(int paramInt)
  {
    if (paramInt > 0)
      this.o = paramInt;
  }

  protected void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67288);
    if (((this.g != paramInt1) || (this.h != paramInt2)) && ((this.g != paramInt1) || (this.h != paramInt2)))
    {
      this.g = paramInt1;
      this.h = paramInt2;
      if (this.d != null)
        this.d.b(this.g, this.h);
    }
    AppMethodBeat.o(67288);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    AppMethodBeat.i(67279);
    a(paramInt2, paramInt3);
    AppMethodBeat.o(67279);
  }

  public void a(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67277);
    a(paramInt1, paramInt2);
    b();
    AppMethodBeat.o(67277);
  }

  protected void a(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67278);
    a(paramInt1, paramInt2);
    b();
    AppMethodBeat.o(67278);
  }

  public void a(Surface paramSurface)
  {
    AppMethodBeat.i(67276);
    b(paramSurface);
    AppMethodBeat.o(67276);
  }

  public void a(TextureView paramTextureView)
  {
    AppMethodBeat.i(67275);
    b(paramTextureView);
    AppMethodBeat.o(67275);
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(67274);
    this.m = new WeakReference(parama);
    AppMethodBeat.o(67274);
  }

  public void a(f paramf)
  {
    this.l = paramf;
  }

  protected void a(EGLContext paramEGLContext, int paramInt, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(67294);
    if (this.i == 1)
    {
      paramArrayOfFloat = a(paramInt, this.g, this.h, paramBoolean);
      this.u = paramArrayOfFloat;
      int i1 = paramArrayOfFloat[0];
      paramInt = paramArrayOfFloat[1];
      int i2 = paramArrayOfFloat[2];
      if (this.r != null)
      {
        if ((this.p != null) && (this.p.b() != this.r))
        {
          this.p.a();
          this.p = null;
        }
        if ((this.p == null) && (this.i == 1))
        {
          this.p = new com.tencent.liteav.basic.e.d();
          this.p.a(paramEGLContext, this.r);
        }
        if ((this.p == null) || (this.i != 1))
          break label191;
        this.p.a(i1, false, 0, this.j, this.k, paramInt, i2, false);
        AppMethodBeat.o(67294);
      }
    }
    while (true)
    {
      return;
      if (this.p != null)
      {
        this.p.a();
        this.p = null;
      }
      label191: AppMethodBeat.o(67294);
    }
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(67283);
    this.t = paramInt;
    if (this.d != null)
      this.d.a(paramInt);
    AppMethodBeat.o(67283);
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67282);
    a(paramInt1, paramInt2);
    AppMethodBeat.o(67282);
  }

  protected void b(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(67284);
    this.s = paramInt;
    if (this.d != null)
      this.d.c(paramInt);
    AppMethodBeat.o(67284);
  }

  public void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67296);
    if ((paramInt1 != this.j) || (paramInt2 != this.k))
      if ((this.p != null) && (this.i == 1) && (this.u != null))
      {
        this.p.a(new e.1(this, paramInt1, paramInt2));
        AppMethodBeat.o(67296);
      }
    while (true)
    {
      return;
      this.j = paramInt1;
      this.k = paramInt2;
      AppMethodBeat.o(67296);
    }
  }

  protected void g()
  {
  }

  protected void h()
  {
  }

  public void i()
  {
    AppMethodBeat.i(67280);
    this.w = true;
    this.v = false;
    q();
    AppMethodBeat.o(67280);
  }

  public void j()
  {
    AppMethodBeat.i(67281);
    this.v = false;
    this.w = false;
    this.u = null;
    if (this.i == 1)
    {
      this.i = -1;
      if (this.p != null)
      {
        this.p.a();
        this.p = null;
      }
    }
    AppMethodBeat.o(67281);
  }

  public int k()
  {
    AppMethodBeat.i(67285);
    int i1;
    if (this.c != null)
    {
      i1 = this.c.getWidth();
      AppMethodBeat.o(67285);
    }
    while (true)
    {
      return i1;
      if (this.r != null)
      {
        i1 = this.j;
        AppMethodBeat.o(67285);
      }
      else
      {
        i1 = 0;
        AppMethodBeat.o(67285);
      }
    }
  }

  public int l()
  {
    AppMethodBeat.i(67286);
    int i1;
    if (this.c != null)
    {
      i1 = this.c.getHeight();
      AppMethodBeat.o(67286);
    }
    while (true)
    {
      return i1;
      if (this.r != null)
      {
        i1 = this.k;
        AppMethodBeat.o(67286);
      }
      else
      {
        i1 = 0;
        AppMethodBeat.o(67286);
      }
    }
  }

  public int m()
  {
    return this.g;
  }

  public int n()
  {
    return this.h;
  }

  protected void o()
  {
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67289);
    TXCLog.w("TXCVideoRender", "play:vrender: texture available @".concat(String.valueOf(paramSurfaceTexture)));
    this.e = paramInt1;
    this.f = paramInt2;
    if (this.d != null)
      this.d.a(this.e, this.f);
    if (this.b != null)
    {
      if ((Build.VERSION.SDK_INT >= 16) && (this.c.getSurfaceTexture() != this.b))
        this.c.setSurfaceTexture(this.b);
      this.b = null;
      AppMethodBeat.o(67289);
    }
    while (true)
    {
      return;
      a(paramSurfaceTexture);
      AppMethodBeat.o(67289);
    }
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67291);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("play:vrender:  onSurfaceTextureDestroyed when need save texture : ");
      TXCLog.w("TXCVideoRender", this.w);
      if (this.w)
        this.b = paramSurfaceTexture;
      while (this.b == null)
      {
        bool = true;
        AppMethodBeat.o(67291);
        return bool;
        this.x.a = 0L;
        b(paramSurfaceTexture);
      }
    }
    catch (Exception paramSurfaceTexture)
    {
      while (true)
      {
        continue;
        boolean bool = false;
        AppMethodBeat.o(67291);
      }
    }
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67290);
    TXCLog.w("TXCVideoRender", "play:vrender: texture size change new:" + paramInt1 + "," + paramInt2 + " old:" + this.e + "," + this.f);
    this.e = paramInt1;
    this.f = paramInt2;
    if (this.d != null)
      this.d.a(this.e, this.f);
    AppMethodBeat.o(67290);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  protected void p()
  {
    AppMethodBeat.i(67293);
    if (this.p != null)
    {
      this.p.a();
      this.p = null;
    }
    if (this.q != null)
    {
      this.q.c();
      this.q = null;
    }
    AppMethodBeat.o(67293);
  }

  public void q()
  {
    AppMethodBeat.i(67297);
    this.x.a = 0L;
    this.x.b = 0L;
    this.x.c = 0L;
    this.x.d = 0L;
    this.x.e = 0L;
    this.x.f = 0L;
    this.x.g = 0L;
    this.x.h = 0L;
    this.x.i = 0L;
    this.x.j = 0;
    this.x.k = 0;
    setStatusValue(6001, Long.valueOf(0L));
    setStatusValue(6002, Double.valueOf(0.0D));
    setStatusValue(6003, Long.valueOf(0L));
    setStatusValue(6005, Long.valueOf(0L));
    setStatusValue(6006, Long.valueOf(0L));
    setStatusValue(6004, Long.valueOf(0L));
    AppMethodBeat.o(67297);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.e
 * JD-Core Version:    0.6.2
 */