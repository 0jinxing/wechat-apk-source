package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

public class i
  implements k, com.tencent.liteav.screencapture.c
{
  private static final String a;
  private l b;
  private com.tencent.liteav.screencapture.a c;
  private EGLContext d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final Queue<Runnable> j;

  static
  {
    AppMethodBeat.i(66321);
    a = i.class.getSimpleName();
    AppMethodBeat.o(66321);
  }

  public i(Context paramContext, f paramf)
  {
    AppMethodBeat.i(66309);
    this.c = null;
    this.d = null;
    this.j = new LinkedList();
    this.c = new com.tencent.liteav.screencapture.a(paramContext, paramf.N);
    this.c.a(this);
    boolean bool = paramf.a();
    this.e = paramf.h;
    if ((paramf.a > 1280) || (paramf.b > 1280))
    {
      if (bool)
      {
        m = Math.max(paramf.a, paramf.b);
        this.f = m;
        if (!bool)
          break label178;
      }
      label178: for (m = Math.min(paramf.a, paramf.b); ; m = Math.max(paramf.a, paramf.b))
      {
        this.g = m;
        this.h = paramf.a;
        this.i = paramf.b;
        AppMethodBeat.o(66309);
        return;
        m = Math.min(paramf.a, paramf.b);
        break;
      }
    }
    if (bool)
    {
      m = 1280;
      label204: this.f = m;
      if (!bool)
        break label235;
    }
    label235: for (int m = k; ; m = 1280)
    {
      this.g = m;
      break;
      m = 720;
      break label204;
    }
  }

  private boolean a(Queue<Runnable> paramQueue)
  {
    AppMethodBeat.i(66316);
    while (true)
    {
      try
      {
        if (paramQueue.isEmpty())
        {
          AppMethodBeat.o(66316);
          bool = false;
          return bool;
        }
        Runnable localRunnable = (Runnable)paramQueue.poll();
        if (localRunnable == null)
        {
          AppMethodBeat.o(66316);
          bool = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(66316);
      }
      localObject.run();
      boolean bool = true;
      AppMethodBeat.o(66316);
    }
  }

  private void f(boolean paramBoolean)
  {
    AppMethodBeat.i(66320);
    if (paramBoolean)
    {
      if (this.h <= this.i)
        break label61;
      a(this.i, this.h);
      AppMethodBeat.o(66320);
    }
    while (true)
    {
      return;
      if (this.h < this.i)
        a(this.i, this.h);
      label61: AppMethodBeat.o(66320);
    }
  }

  public void a()
  {
    AppMethodBeat.i(66310);
    this.c.a(this.f, this.g, this.e);
    this.c.a(true);
    AppMethodBeat.o(66310);
  }

  public void a(float paramFloat)
  {
  }

  public void a(float paramFloat1, float paramFloat2)
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.h = paramInt1;
    this.i = paramInt2;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    AppMethodBeat.i(66318);
    while (a(this.j));
    boolean bool;
    if (paramInt1 == 0)
    {
      if (this.b == null)
        break label157;
      if (paramInt3 < paramInt4)
      {
        bool = true;
        f(bool);
        com.tencent.liteav.basic.g.c localc = new com.tencent.liteav.basic.g.c();
        localc.d = paramInt3;
        localc.e = paramInt4;
        localc.f = this.h;
        localc.g = this.i;
        localc.a = paramInt2;
        localc.b = 0;
        localc.i = 0;
        localc.k = b.a(localc.d, localc.e, this.h, this.i);
        this.b.b(localc);
        AppMethodBeat.o(66318);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      TXCLog.e(a, "onScreenCaptureFrame failed");
      label157: AppMethodBeat.o(66318);
    }
  }

  public void a(int paramInt, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(66317);
    if (paramInt == 0)
    {
      this.d = paramEGLContext;
      AppMethodBeat.o(66317);
    }
    while (true)
    {
      return;
      this.d = null;
      TXCLog.e(a, "Start screen capture failed");
      AppMethodBeat.o(66317);
    }
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(66315);
    if (this.c != null)
      this.c.a(parama);
    AppMethodBeat.o(66315);
  }

  public void a(com.tencent.liteav.basic.g.c paramc)
  {
  }

  public void a(l paraml)
  {
    this.b = paraml;
  }

  public void a(Object paramObject)
  {
    AppMethodBeat.i(66319);
    while (a(this.j));
    if (this.b != null)
      this.b.r();
    AppMethodBeat.o(66319);
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(66314);
    if (this.c != null)
      this.c.a(paramRunnable);
    AppMethodBeat.o(66314);
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(66311);
    this.c.a(null);
    this.c.a(false);
    AppMethodBeat.o(66311);
  }

  public boolean a(int paramInt)
  {
    return false;
  }

  public void b()
  {
    AppMethodBeat.i(66313);
    this.c.a(true);
    AppMethodBeat.o(66313);
  }

  public void b(int paramInt)
  {
  }

  public void b(boolean paramBoolean)
  {
  }

  public void c()
  {
    AppMethodBeat.i(66312);
    this.c.a(false);
    AppMethodBeat.o(66312);
  }

  public void c(int paramInt)
  {
  }

  public void c(boolean paramBoolean)
  {
  }

  public void d(int paramInt)
  {
  }

  public boolean d()
  {
    return true;
  }

  public boolean d(boolean paramBoolean)
  {
    return false;
  }

  public int e()
  {
    return 0;
  }

  public void e(boolean paramBoolean)
  {
  }

  public EGLContext f()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.i
 * JD-Core Version:    0.6.2
 */