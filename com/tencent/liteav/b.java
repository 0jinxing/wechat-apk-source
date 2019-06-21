package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.tencent.liteav.basic.e.m;
import com.tencent.liteav.basic.g.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

public class b
  implements com.tencent.liteav.basic.d.a, m, k
{
  WeakReference<com.tencent.liteav.basic.d.a> a;
  private Context b;
  private com.tencent.liteav.capturer.a c;
  private l d;
  private boolean e;
  private f f;
  private int g;
  private boolean h;
  private int i;
  private int j;
  private com.tencent.liteav.basic.e.l k;
  private boolean l;

  public b(Context paramContext, f paramf, com.tencent.liteav.basic.e.l paraml)
  {
    AppMethodBeat.i(67655);
    this.c = null;
    this.g = 0;
    this.h = false;
    this.i = -1;
    this.j = -1;
    this.k = null;
    this.l = false;
    this.c = new com.tencent.liteav.capturer.a();
    try
    {
      this.f = ((f)paramf.clone());
      this.b = paramContext;
      this.k = paraml;
      this.k.setSurfaceTextureListener(this);
      AppMethodBeat.o(67655);
      return;
    }
    catch (CloneNotSupportedException paramf)
    {
      while (true)
        this.f = new f();
    }
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(67676);
    com.tencent.liteav.basic.util.b.a(this.a, paramInt, paramString);
    AppMethodBeat.o(67676);
  }

  private void c(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67675);
    if ((paramSurfaceTexture != null) && (!this.e) && (this.c != null))
    {
      this.c.a(paramSurfaceTexture);
      this.c.b(this.f.h);
      this.c.d(this.f.l);
      this.c.b(this.f.D);
      this.c.a(g());
      if (this.c.c(this.f.m) == 0)
      {
        this.e = true;
        a(1003, "打开摄像头成功");
        this.l = false;
        if ((!this.h) || (com.tencent.liteav.audio.b.a().c()))
          break label172;
        com.tencent.liteav.audio.b.a().a(this.b);
        this.h = false;
        AppMethodBeat.o(67675);
      }
    }
    while (true)
    {
      return;
      this.e = false;
      a(-1301, "打开摄像头失败，请确认摄像头权限是否打开");
      label172: AppMethodBeat.o(67675);
    }
  }

  private int g()
  {
    int m = 7;
    int n = m;
    if (!this.f.M)
    {
      n = m;
      switch (this.f.k)
      {
      default:
        n = m;
      case 3:
      case 4:
      case 5:
      case 0:
      case 1:
      case 2:
      case 6:
      }
    }
    while (true)
    {
      return n;
      n = 4;
      continue;
      n = 5;
      continue;
      n = 6;
      continue;
      n = 3;
    }
  }

  private void h()
  {
    AppMethodBeat.i(67680);
    a(new b.2(this));
    AppMethodBeat.o(67680);
  }

  public int a(int paramInt, float[] paramArrayOfFloat)
  {
    boolean bool = true;
    AppMethodBeat.i(67679);
    if (!this.e)
    {
      AppMethodBeat.o(67679);
      return 0;
    }
    if (!this.l)
    {
      com.tencent.liteav.basic.util.b.a(this.a, 1007, "首帧画面采集完成");
      this.l = true;
    }
    c localc;
    if (this.d != null)
    {
      localc = new c();
      localc.d = this.c.e();
      localc.e = this.c.f();
      localc.f = this.f.a;
      localc.g = this.f.b;
      localc.i = this.c.c();
      if (!this.c.d())
        break label273;
      if (this.f.L)
        break label268;
      label141: localc.h = bool;
      localc.a = paramInt;
      localc.c = paramArrayOfFloat;
      localc.j = this.g;
      localc.b = 4;
      if ((localc.i != 0) && (localc.i != 180))
        break label284;
      localc.f = this.f.b;
    }
    for (localc.g = this.f.a; ; localc.g = this.f.b)
    {
      localc.k = com.tencent.liteav.basic.util.b.a(localc.d, localc.e, this.f.b, this.f.a);
      this.d.b(localc);
      AppMethodBeat.o(67679);
      break;
      label268: bool = false;
      break label141;
      label273: bool = this.f.L;
      break label141;
      label284: localc.f = this.f.a;
    }
  }

  public void a()
  {
    AppMethodBeat.i(67656);
    this.k.a(this.f.h);
    c(this.k.getSurfaceTexture());
    AppMethodBeat.o(67656);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(67663);
    this.c.a(paramFloat);
    AppMethodBeat.o(67663);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(67674);
    if ((this.c != null) && (this.f.D))
      this.c.a(paramFloat1, paramFloat2);
    AppMethodBeat.o(67674);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.f.a = paramInt1;
    this.f.b = paramInt2;
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67677);
    c(paramSurfaceTexture);
    if (this.d != null)
      this.d.a(paramSurfaceTexture);
    AppMethodBeat.o(67677);
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(67671);
    this.a = new WeakReference(parama);
    AppMethodBeat.o(67671);
  }

  public void a(c paramc)
  {
    AppMethodBeat.i(67667);
    if (this.k != null)
      this.k.a(paramc.a, paramc.h, this.g, paramc.d, paramc.e);
    AppMethodBeat.o(67667);
  }

  public void a(l paraml)
  {
    this.d = paraml;
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(67668);
    this.k.a(paramRunnable);
    AppMethodBeat.o(67668);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(67657);
    c();
    this.k.a();
    AppMethodBeat.o(67657);
  }

  public boolean a(int paramInt)
  {
    AppMethodBeat.i(67662);
    boolean bool = this.c.c(paramInt);
    AppMethodBeat.o(67662);
    return bool;
  }

  public void b()
  {
    AppMethodBeat.i(67658);
    c(this.k.getSurfaceTexture());
    AppMethodBeat.o(67658);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(67664);
    this.i = paramInt;
    h();
    AppMethodBeat.o(67664);
  }

  public void b(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(67678);
    if (this.d != null)
      this.d.r();
    AppMethodBeat.o(67678);
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(67660);
    if ((this.e) && (this.c != null))
    {
      f localf = this.f;
      if (!paramBoolean)
        break label138;
      if (this.f.m)
        break label133;
      paramBoolean = true;
      localf.m = paramBoolean;
      this.c.b();
      this.k.a(false);
      this.c.a(g());
      this.c.a(this.k.getSurfaceTexture());
      if (this.c.c(this.f.m) != 0)
        break label149;
      this.e = true;
      a(1003, "打开摄像头成功");
    }
    while (true)
    {
      this.l = false;
      AppMethodBeat.o(67660);
      return;
      label133: paramBoolean = false;
      break;
      label138: paramBoolean = this.f.m;
      break;
      label149: this.e = false;
      a(-1301, "打开摄像头失败，请确认摄像头权限是否打开");
    }
  }

  public void c()
  {
    AppMethodBeat.i(67659);
    this.c.b();
    this.e = false;
    AppMethodBeat.o(67659);
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(67672);
    this.j = paramInt;
    h();
    AppMethodBeat.o(67672);
  }

  public void c(boolean paramBoolean)
  {
    AppMethodBeat.i(67665);
    a(new b.1(this, paramBoolean));
    AppMethodBeat.o(67665);
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(67673);
    this.f.k = paramInt;
    this.f.a();
    AppMethodBeat.o(67673);
  }

  public boolean d()
  {
    return this.e;
  }

  public boolean d(boolean paramBoolean)
  {
    AppMethodBeat.i(67666);
    paramBoolean = this.c.a(paramBoolean);
    AppMethodBeat.o(67666);
    return paramBoolean;
  }

  public int e()
  {
    AppMethodBeat.i(67661);
    int m = this.c.a();
    AppMethodBeat.o(67661);
    return m;
  }

  public void e(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public EGLContext f()
  {
    AppMethodBeat.i(67669);
    EGLContext localEGLContext = this.k.getGLContext();
    AppMethodBeat.o(67669);
    return localEGLContext;
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(67670);
    com.tencent.liteav.basic.util.b.a(this.a, paramInt, paramBundle);
    AppMethodBeat.o(67670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.b
 * JD-Core Version:    0.6.2
 */