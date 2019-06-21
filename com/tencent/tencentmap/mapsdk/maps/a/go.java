package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewConfiguration;
import com.tencent.map.lib.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class go
  implements gf
{
  private final long a;
  private final long b;
  private float c;
  private float d;
  private fn e;
  private boolean f;
  private float g;
  private e h;
  private boolean i;
  private final float j;
  private WeakReference<ge> k;

  public go(fn paramfn)
  {
    AppMethodBeat.i(99392);
    this.a = 250L;
    this.b = 1200L;
    this.c = ViewConfiguration.getMinimumFlingVelocity();
    this.d = ViewConfiguration.getMaximumFlingVelocity();
    this.i = false;
    this.e = paramfn;
    this.k = paramfn.b();
    if ((this.k != null) && (this.k.get() != null))
    {
      ((ge)this.k.get()).a(this);
      Object localObject = ((ge)this.k.get()).i();
      if (localObject != null)
      {
        localObject = ViewConfiguration.get((Context)localObject);
        this.c = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
        this.d = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
      }
    }
    this.h = new e();
    this.j = (paramfn.h() * 2.5F);
    AppMethodBeat.o(99392);
  }

  private static float b(float paramFloat)
  {
    if (paramFloat < 5.0F);
    for (paramFloat = 0.2F + 0.8F * paramFloat / 5.0F; ; paramFloat = 1.0F + (paramFloat - 5.0F) * 4.0F / 5.0F)
      return paramFloat;
  }

  private void l(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99406);
    this.i = true;
    if (this.f)
      AppMethodBeat.o(99406);
    while (true)
    {
      return;
      float f1 = paramFloat1 / 64.0F;
      float f2 = paramFloat2 / 64.0F;
      if ((Math.abs(f1) < this.j) && (Math.abs(f2) < this.j))
      {
        AppMethodBeat.o(99406);
      }
      else
      {
        long l1 = ()((Math.max(Math.abs(paramFloat1), Math.abs(paramFloat2)) - this.c) / (this.d - this.c) * 950.0F);
        Object localObject = new PointF(f1, f2);
        long l2 = System.currentTimeMillis();
        this.f = true;
        localObject = new go.4(this, 3, new double[] { 0.0D, 0.0D }, l2, l1 + 250L, (PointF)localObject);
        this.e.a().b((fx)localObject);
        AppMethodBeat.o(99406);
      }
    }
  }

  private boolean m(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99407);
    boolean bool = this.e.c().a(this.e.d(), paramFloat1, paramFloat2);
    AppMethodBeat.o(99407);
    return bool;
  }

  public void a()
  {
  }

  public void a(e parame)
  {
    AppMethodBeat.i(99393);
    this.h = parame;
    boolean bool = parame.a();
    if ((this.k == null) || (this.k.get() != null))
      AppMethodBeat.o(99393);
    while (true)
    {
      return;
      if (bool)
      {
        ((ge)this.k.get()).b(this);
        AppMethodBeat.o(99393);
      }
      else
      {
        ((ge)this.k.get()).a(this);
        AppMethodBeat.o(99393);
      }
    }
  }

  public boolean a(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(99402);
    if (this.h.d())
      if (!this.e.a().B())
        AppMethodBeat.o(99402);
    while (true)
    {
      return bool;
      double d1 = paramFloat / 8.0F * 2.0F;
      this.e.a().i(d1);
      bool = true;
      AppMethodBeat.o(99402);
      continue;
      AppMethodBeat.o(99402);
    }
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99394);
    if (this.h.f())
    {
      gk localgk = this.e.a();
      localgk.a(paramFloat1, paramFloat2, new go.1(this, localgk));
    }
    AppMethodBeat.o(99394);
    return false;
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99404);
    if (this.h.i())
    {
      paramDouble1 = paramDouble2 / paramDouble1;
      gk localgk = this.e.a();
      localgk.a(paramDouble1, paramPointF1.x, paramPointF1.y, paramPointF2.x, paramPointF2.y, new go.3(this, localgk));
    }
    AppMethodBeat.o(99404);
    return false;
  }

  public boolean a(PointF paramPointF1, PointF paramPointF2, float paramFloat)
  {
    AppMethodBeat.i(99403);
    if ((this.h.e()) && (this.e.a().B()))
      this.e.a().a(paramFloat, paramPointF1.x, paramPointF1.y, paramPointF2.x, paramPointF2.y);
    AppMethodBeat.o(99403);
    return false;
  }

  public boolean b()
  {
    AppMethodBeat.i(99400);
    if (this.h.h())
    {
      final gk localgk = this.e.a();
      localgk.b(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(99388);
          localgk.w();
          AppMethodBeat.o(99388);
        }
      });
    }
    AppMethodBeat.o(99400);
    return false;
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99395);
    boolean bool;
    if (this.h.g())
    {
      bool = m(paramFloat1, paramFloat2);
      AppMethodBeat.o(99395);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99395);
    }
  }

  public boolean c()
  {
    AppMethodBeat.i(99401);
    if (this.f)
    {
      this.e.a().A();
      this.f = false;
    }
    AppMethodBeat.o(99401);
    return false;
  }

  public boolean c(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99396);
    if ((this.h.b()) && (this.h.c()))
      l(paramFloat1, paramFloat2);
    AppMethodBeat.o(99396);
    return false;
  }

  public boolean d()
  {
    return false;
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99397);
    if (this.h.b())
      this.e.a().a(paramFloat1, paramFloat2);
    AppMethodBeat.o(99397);
    return false;
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean f(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99398);
    if (this.h.f())
      this.g = this.e.a().l();
    AppMethodBeat.o(99398);
    return false;
  }

  public boolean g(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99399);
    if (this.h.f())
      this.e.a().j(b((1.0F - paramFloat2 / this.e.g().height()) * 10.0F) * this.g);
    AppMethodBeat.o(99399);
    return true;
  }

  public boolean h(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean i(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99405);
    this.e.a().A();
    AppMethodBeat.o(99405);
    return false;
  }

  public boolean j(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean k(float paramFloat1, float paramFloat2)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.go
 * JD-Core Version:    0.6.2
 */