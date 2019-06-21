package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.e;
import com.tencent.map.lib.gl.JNICallback.g;
import com.tencent.map.lib.util.MathUtil;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class gk
  implements JNICallback.g, ex, fv, fz.a, gu
{
  private static int c = 116307503;
  private static int d = 39984186;
  private float A;
  private boolean B;
  private int C;
  private int D;
  private int E;
  private int F;
  private Runnable G;
  private boolean H;
  public fz a;
  public go b;
  private List<fq> e;
  private List<fm> f;
  private List<com.tencent.map.lib.gl.d> g;
  private List<fo> h;
  private List<ft> i;
  private List<fs> j;
  private List<fv> k;
  private List<gt> l;
  private List<gr> m;
  private List<fr> n;
  private List<fu> o;
  private boolean p;
  private Stack<gs> q;
  private WeakReference<ge> r;
  private fn s;
  private gs t;
  private fp u;
  private Rect v;
  private Rect w;
  private Handler x;
  private gk.a y;
  private float z;

  public gk(fn paramfn)
  {
    AppMethodBeat.i(99182);
    this.p = true;
    this.q = new Stack();
    this.x = null;
    this.y = null;
    this.z = 0.5F;
    this.A = 0.5F;
    this.B = true;
    this.C = 0;
    this.D = 0;
    this.E = 0;
    this.F = 0;
    this.H = false;
    this.s = paramfn;
    this.r = paramfn.b();
    this.t = paramfn.e();
    this.u = ((fp)paramfn.d());
    this.v = paramfn.g();
    this.a = new fz(this);
    this.a.a(this);
    a(this.a);
    this.b = new go(paramfn);
    this.i = new CopyOnWriteArrayList();
    this.j = new CopyOnWriteArrayList();
    this.e = new CopyOnWriteArrayList();
    this.f = new CopyOnWriteArrayList();
    this.g = new CopyOnWriteArrayList();
    this.m = new CopyOnWriteArrayList();
    this.n = new CopyOnWriteArrayList();
    this.o = new CopyOnWriteArrayList();
    this.k = new CopyOnWriteArrayList();
    a(gi.a(1));
    this.x = new Handler();
    AppMethodBeat.o(99182);
  }

  private PointF E()
  {
    AppMethodBeat.i(99184);
    int i1;
    int i2;
    if (this.v != null)
    {
      i1 = this.v.width();
      i2 = this.v.height();
    }
    while (true)
    {
      int i3 = this.C;
      int i4 = (i1 - i3 - this.E) / 2;
      int i5 = this.D;
      int i6 = (i2 - i5 - this.F) / 2;
      PointF localPointF;
      if ((i1 != 0) && (i2 != 0))
      {
        localPointF = new PointF((i4 + i3) * 1.0F / i1, (i6 + i5) * 1.0F / i2);
        AppMethodBeat.o(99184);
      }
      while (true)
      {
        return localPointF;
        localPointF = new PointF(0.5F, 0.5F);
        AppMethodBeat.o(99184);
      }
      i2 = 0;
      i1 = 0;
    }
  }

  private boolean F()
  {
    AppMethodBeat.i(99186);
    boolean bool;
    if ((this.v != null) && (this.v.width() > 0) && (this.v.height() > 0))
    {
      bool = true;
      AppMethodBeat.o(99186);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99186);
    }
  }

  private void G()
  {
    AppMethodBeat.i(99192);
    if (this.l == null)
      AppMethodBeat.o(99192);
    while (true)
    {
      return;
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext())
      {
        gt localgt = (gt)localIterator.next();
        if (localgt != null)
          try
          {
            localgt.a(this.t);
          }
          catch (Exception localException)
          {
          }
      }
      z();
      AppMethodBeat.o(99192);
    }
  }

  private void H()
  {
    AppMethodBeat.i(99227);
    this.t.a(0.0F);
    this.t.b(0.0F);
    a(0.0D);
    b(0.0D);
    G();
    AppMethodBeat.o(99227);
  }

  private boolean I()
  {
    AppMethodBeat.i(99243);
    boolean bool;
    if (m() < this.t.m())
    {
      bool = true;
      AppMethodBeat.o(99243);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99243);
    }
  }

  private boolean J()
  {
    AppMethodBeat.i(99244);
    boolean bool;
    if (m() > this.t.l())
    {
      bool = true;
      AppMethodBeat.o(99244);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99244);
    }
  }

  private void K()
  {
    AppMethodBeat.i(99251);
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      fq localfq = (fq)localIterator.next();
      if (localfq != null)
        try
        {
          localfq.c_();
        }
        catch (Exception localException)
        {
        }
    }
    G();
    AppMethodBeat.o(99251);
  }

  private void L()
  {
    AppMethodBeat.i(99277);
    gh localgh = this.s.f();
    if ((t()) && (this.B));
    for (boolean bool = true; ; bool = false)
    {
      localgh.c(bool);
      AppMethodBeat.o(99277);
      return;
    }
  }

  private void a(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    AppMethodBeat.i(99240);
    double d1 = k(paramDouble1 - o());
    double d2 = paramDouble2 - p();
    if ((d1 == 0.0D) && (d2 == 0.0D))
    {
      AppMethodBeat.o(99240);
      return;
    }
    com.tencent.map.lib.d.a("postRotateAndSkew distance:" + d1 + "," + d2);
    long l1 = System.currentTimeMillis();
    float f1 = (float)(0.1000000014901161D * d1);
    float f2 = (float)(0.1000000014901161D * d2);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      c(new gk.2(this, 102, new double[] { paramDouble1, paramDouble2, 0.0D, 0.0D }, paramBoolean, l1, f1, f2, d1, d2, paramDouble1, paramDouble2));
      AppMethodBeat.o(99240);
      break;
    }
  }

  private void c(int paramInt)
  {
    AppMethodBeat.i(99252);
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      fm localfm = (fm)localIterator.next();
      if (localfm != null)
        try
        {
          localfm.a(paramInt);
        }
        catch (Exception localException)
        {
        }
    }
    K();
    AppMethodBeat.o(99252);
  }

  private void d(int paramInt)
  {
    AppMethodBeat.i(99266);
    Iterator localIterator = this.m.iterator();
    while (localIterator.hasNext())
    {
      gr localgr = (gr)localIterator.next();
      if (localgr != null)
        try
        {
          localgr.a(paramInt);
        }
        catch (Exception localException)
        {
        }
    }
    G();
    AppMethodBeat.o(99266);
  }

  private void d(fx paramfx)
  {
    AppMethodBeat.i(99245);
    switch (paramfx.a)
    {
    default:
    case 2:
    case 3:
    case 100:
    case 108:
    case 101:
    case 102:
    case 103:
    case 109:
    case 110:
    case 104:
    case 4:
    case 120:
    case 6:
    case 10000:
    }
    while (true)
    {
      AppMethodBeat.o(99245);
      while (true)
      {
        return;
        if ((this.r == null) || (this.r.get() == null))
          break;
        ((ge)this.r.get()).a_();
        AppMethodBeat.o(99245);
        continue;
        a(paramfx.b[0], paramfx.b[1]);
        AppMethodBeat.o(99245);
        continue;
        g(paramfx.b[0]);
        AppMethodBeat.o(99245);
        continue;
        h(paramfx.b[0]);
        AppMethodBeat.o(99245);
        continue;
        int i1 = this.s.g().width();
        int i2 = this.s.g().height();
        int i3 = i1 / 2;
        int i4 = i2 / 2;
        gs.b localb = D().q();
        int i5 = i4;
        int i6 = i3;
        if (localb != null)
        {
          float f1 = i3;
          float f2 = localb.a();
          i6 = (int)(f1 + i1 * f2);
          i5 = (int)(i4 + localb.b() * i2);
        }
        double d1 = i6;
        double d2 = paramfx.b[1];
        double d3 = i5;
        double d4 = paramfx.b[2];
        double d5 = paramfx.b[3] - i6;
        double d6 = paramfx.b[4] - i5;
        com.tencent.map.lib.d.a("Debug ScaleFix innerPerform        before   center:" + this.t.p().toString());
        a(d1 - d2, d3 - d4);
        g(paramfx.b[0]);
        com.tencent.map.lib.d.a("Debug ScaleFix innerPerform        after      center:" + this.t.p().toString());
        a(d5, d6);
        com.tencent.map.lib.d.a("Debug ScaleFix finally scale move by:" + d5 + "," + d6 + " curCenter:" + this.t.p().toString());
        AppMethodBeat.o(99245);
        continue;
        e(paramfx.b[0]);
        c(paramfx.b[1]);
        AppMethodBeat.o(99245);
        continue;
        i6 = this.s.g().width() / 2;
        i5 = this.s.g().height() / 2;
        a(i6 - paramfx.b[1], i5 - paramfx.b[2]);
        e(paramfx.b[0]);
        a(paramfx.b[3] - i6, paramfx.b[4] - i5);
        AppMethodBeat.o(99245);
        continue;
        f(paramfx.b[0]);
        AppMethodBeat.o(99245);
        continue;
        d(paramfx.b[0]);
        AppMethodBeat.o(99245);
        continue;
        H();
        AppMethodBeat.o(99245);
        continue;
        if (paramfx.b.length > 2);
        for (i6 = (int)paramfx.b[2]; ; i6 = 1)
        {
          a((int)paramfx.b[0], (int)paramfx.b[1], i6);
          AppMethodBeat.o(99245);
          break;
        }
        h(paramfx.b[0]);
        a((int)paramfx.b[1], (int)paramfx.b[2]);
        AppMethodBeat.o(99245);
        continue;
        if (paramfx.f == null)
          break;
        paramfx.f.run();
        AppMethodBeat.o(99245);
      }
      if (this.y != null)
        this.y.a(paramfx);
    }
  }

  private void d(boolean paramBoolean)
  {
    AppMethodBeat.i(99254);
    if (this.h == null)
      AppMethodBeat.o(99254);
    while (true)
    {
      return;
      boolean bool = t();
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        fo localfo = (fo)localIterator.next();
        if (localfo != null)
          try
          {
            localfo.a(bool, paramBoolean);
          }
          catch (Exception localException)
          {
          }
      }
      AppMethodBeat.o(99254);
    }
  }

  private double k(double paramDouble)
  {
    double d1 = paramDouble % 360.0D;
    if (d1 > 180.0D)
      paramDouble = d1 - 360.0D;
    while (true)
    {
      return paramDouble;
      paramDouble = d1;
      if (d1 < -180.0D)
        paramDouble = d1 + 360.0D;
    }
  }

  public void A()
  {
    AppMethodBeat.i(99272);
    this.a.j();
    AppMethodBeat.o(99272);
  }

  public boolean B()
  {
    return this.p;
  }

  boolean C()
  {
    AppMethodBeat.i(99275);
    boolean bool = this.a.k();
    AppMethodBeat.o(99275);
    return bool;
  }

  public gs D()
  {
    return this.t;
  }

  public float a(Rect paramRect1, Rect paramRect2)
  {
    AppMethodBeat.i(99210);
    GeoPoint localGeoPoint = new GeoPoint(paramRect1.top, paramRect1.left);
    paramRect1 = new GeoPoint(paramRect1.bottom, paramRect1.right);
    Rect localRect = new Rect();
    localRect.left = Math.min(localGeoPoint.getLongitudeE6(), paramRect1.getLongitudeE6());
    localRect.right = Math.max(localGeoPoint.getLongitudeE6(), paramRect1.getLongitudeE6());
    localRect.top = Math.min(localGeoPoint.getLatitudeE6(), paramRect1.getLatitudeE6());
    localRect.bottom = Math.max(localGeoPoint.getLatitudeE6(), paramRect1.getLatitudeE6());
    float f1 = (float)this.s.f().a(localRect, paramRect2);
    AppMethodBeat.o(99210);
    return f1;
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(99183);
    this.C = paramInt1;
    this.D = paramInt2;
    this.E = paramInt3;
    this.F = paramInt4;
    if ((this.v != null) && (this.v.width() > 0) && (this.v.height() > 0))
      if ((paramInt1 + paramInt3 > this.v.width()) || (paramInt2 + paramInt4 > this.v.height()))
      {
        AppMethodBeat.o(99183);
        paramInt1 = -1;
      }
    while (true)
    {
      return paramInt1;
      Object localObject = E();
      a(((PointF)localObject).x, ((PointF)localObject).y, false);
      AppMethodBeat.o(99183);
      paramInt1 = 0;
      continue;
      a(new gk.1(this));
      if ((this.s instanceof gm))
      {
        localObject = ((gm)this.s).k();
        if ((paramInt1 + paramInt3 > SystemUtil.getWindowWidth((Context)localObject)) || (paramInt2 + paramInt4 > SystemUtil.getWindowHeight((Context)localObject)))
        {
          AppMethodBeat.o(99183);
          paramInt1 = -1;
        }
        else
        {
          AppMethodBeat.o(99183);
          paramInt1 = 0;
        }
      }
      else
      {
        paramInt1 = -2;
        AppMethodBeat.o(99183);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(99274);
    x();
    AppMethodBeat.o(99274);
  }

  public void a(double paramDouble)
  {
    AppMethodBeat.i(99199);
    L();
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext())
    {
      fr localfr = (fr)localIterator.next();
      if (localfr != null)
        try
        {
          localfr.a(paramDouble);
        }
        catch (Exception localException)
        {
        }
    }
    AppMethodBeat.o(99199);
  }

  public void a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99220);
    this.s.f().a((float)paramDouble1, (float)paramDouble2, false);
    c(1);
    G();
    AppMethodBeat.o(99220);
  }

  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    AppMethodBeat.i(99231);
    if (!t())
      AppMethodBeat.o(99231);
    while (true)
    {
      return;
      this.a.j();
      c(new fx(103, new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5 }));
      AppMethodBeat.o(99231);
    }
  }

  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, Runnable paramRunnable)
  {
    AppMethodBeat.i(99232);
    this.a.j();
    float f1 = this.s.g().width() / 2.0F;
    float f2 = this.s.g().height() / 2.0F;
    gs.b localb = D().q();
    if (this.H)
    {
      if (localb == null)
        break label181;
      paramDouble2 = f1 + localb.a() * f1 * 2.0F;
    }
    for (paramDouble3 = localb.b() * f2 * 2.0F + f2; ; paramDouble3 = f2)
    {
      paramDouble5 = paramDouble3;
      paramDouble4 = paramDouble2;
      c(new fx(101, new double[] { paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5 }));
      paramRunnable = new fx(paramRunnable);
      paramRunnable.e = false;
      paramRunnable.c = 0L;
      c(paramRunnable);
      AppMethodBeat.o(99232);
      return;
      label181: paramDouble2 = f1;
    }
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(99212);
    a(this.t.c(paramFloat));
    AppMethodBeat.o(99212);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99209);
    if (this.s != null)
    {
      gh localgh = this.s.f();
      if (localgh != null)
      {
        localgh.a(paramFloat1, paramFloat2, false);
        G();
      }
    }
    AppMethodBeat.o(99209);
  }

  public void a(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99248);
    if (this.t.a(paramFloat1 - 0.5F, paramFloat2 - 0.5F, paramBoolean))
      G();
    AppMethodBeat.o(99248);
  }

  public void a(float paramFloat1, float paramFloat2, Runnable paramRunnable)
  {
    AppMethodBeat.i(99235);
    if (this.H)
    {
      gs.b localb = D().q();
      if (localb != null)
      {
        paramFloat1 = this.s.g().width() * (localb.a() + 0.5F);
        paramFloat2 = this.s.g().height() * (localb.b() + 0.5F);
      }
    }
    else
    {
      a(paramFloat1, paramFloat2, paramRunnable, null);
      AppMethodBeat.o(99235);
    }
    while (true)
    {
      return;
      a(paramRunnable);
      AppMethodBeat.o(99235);
    }
  }

  public void a(float paramFloat1, float paramFloat2, Runnable paramRunnable, fy paramfy)
  {
    AppMethodBeat.i(99236);
    if (!I())
      AppMethodBeat.o(99236);
    while (true)
    {
      return;
      this.s.f().b(paramFloat1, paramFloat2);
      if (paramRunnable != null)
        paramRunnable.run();
      AppMethodBeat.o(99236);
    }
  }

  public void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(99247);
    this.t.a(paramFloat1 - 0.5F, paramFloat2 - 0.5F, paramBoolean);
    if (paramBoolean)
      G();
    AppMethodBeat.o(99247);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(99205);
    if (this.t.b(paramInt))
      a(gs.c.c);
    AppMethodBeat.o(99205);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99207);
    a(paramInt1, paramInt2, 1);
    AppMethodBeat.o(99207);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99208);
    this.t.a(paramInt1, paramInt2, false);
    if (paramInt3 == 1)
    {
      c(paramInt3);
      G();
    }
    AppMethodBeat.o(99208);
  }

  public void a(int paramInt, Runnable paramRunnable, boolean paramBoolean)
  {
    AppMethodBeat.i(99268);
    this.s.f().b(paramInt, true);
    if (paramRunnable != null)
      paramRunnable.run();
    AppMethodBeat.o(99268);
  }

  public void a(Rect paramRect)
  {
    AppMethodBeat.i(99196);
    if (!F())
      AppMethodBeat.o(99196);
    while (true)
    {
      return;
      float f1 = a(paramRect, this.v);
      this.t.a(paramRect);
      this.t.e(f1);
      AppMethodBeat.o(99196);
    }
  }

  public void a(Rect paramRect1, Rect paramRect2, boolean paramBoolean)
  {
    AppMethodBeat.i(99211);
    if (!F())
      AppMethodBeat.o(99211);
    while (true)
    {
      return;
      Rect localRect = new Rect(this.v);
      if (paramRect2 != null)
      {
        localRect.left += paramRect2.left;
        localRect.right -= paramRect2.right;
        localRect.top += paramRect2.top;
        localRect.bottom -= paramRect2.bottom;
      }
      paramRect2 = new GeoPoint(paramRect1.top, paramRect1.left);
      GeoPoint localGeoPoint = new GeoPoint(paramRect1.bottom, paramRect1.right);
      paramRect1 = new Rect();
      paramRect1.left = Math.min(paramRect2.getLongitudeE6(), localGeoPoint.getLongitudeE6());
      paramRect1.right = Math.max(paramRect2.getLongitudeE6(), localGeoPoint.getLongitudeE6());
      paramRect1.top = Math.min(paramRect2.getLatitudeE6(), localGeoPoint.getLatitudeE6());
      paramRect1.bottom = Math.max(paramRect2.getLatitudeE6(), localGeoPoint.getLatitudeE6());
      this.s.f().a(paramRect1, localRect, paramBoolean);
      z();
      AppMethodBeat.o(99211);
    }
  }

  public void a(e parame)
  {
    AppMethodBeat.i(99203);
    this.b.a(parame);
    AppMethodBeat.o(99203);
  }

  public void a(com.tencent.map.lib.gl.d paramd)
  {
    AppMethodBeat.i(99264);
    if (paramd == null)
      AppMethodBeat.o(99264);
    while (true)
    {
      return;
      if (!this.g.contains(paramd))
        this.g.add(paramd);
      AppMethodBeat.o(99264);
    }
  }

  public void a(fq paramfq)
  {
    AppMethodBeat.i(99262);
    if (paramfq == null)
      AppMethodBeat.o(99262);
    while (true)
    {
      return;
      synchronized (this.e)
      {
        if (!this.e.contains(paramfq))
          this.e.add(paramfq);
        AppMethodBeat.o(99262);
      }
    }
  }

  public void a(fr paramfr)
  {
    AppMethodBeat.i(99198);
    if (paramfr == null)
      AppMethodBeat.o(99198);
    while (true)
    {
      return;
      synchronized (this.n)
      {
        if (!this.n.contains(paramfr))
          this.n.add(paramfr);
        AppMethodBeat.o(99198);
      }
    }
  }

  public void a(ft paramft)
  {
    AppMethodBeat.i(99255);
    if (paramft == null)
      AppMethodBeat.o(99255);
    while (true)
    {
      return;
      synchronized (this.i)
      {
        if (!this.i.contains(paramft))
          this.i.add(paramft);
        AppMethodBeat.o(99255);
      }
    }
  }

  public void a(fu paramfu)
  {
    AppMethodBeat.i(99200);
    if (paramfu == null)
      AppMethodBeat.o(99200);
    while (true)
    {
      return;
      synchronized (this.o)
      {
        com.tencent.map.lib.d.a("skew addSkewListener");
        if (!this.o.contains(paramfu))
          this.o.add(paramfu);
        AppMethodBeat.o(99200);
      }
    }
  }

  public void a(fv paramfv)
  {
    AppMethodBeat.i(99259);
    if (paramfv == null)
      AppMethodBeat.o(99259);
    while (true)
    {
      return;
      synchronized (this.k)
      {
        if (!this.k.contains(paramfv))
          this.k.add(paramfv);
        AppMethodBeat.o(99259);
      }
    }
  }

  public void a(fx paramfx)
  {
    AppMethodBeat.i(99273);
    if (paramfx != null)
      d(paramfx);
    AppMethodBeat.o(99273);
  }

  public void a(gk.a parama)
  {
    this.y = parama;
  }

  public void a(gs.c paramc)
  {
    AppMethodBeat.i(99257);
    if (paramc == gs.c.a)
      AppMethodBeat.o(99257);
    while (true)
    {
      return;
      if (this.x != null)
        this.x.post(new gk.3(this, paramc));
      AppMethodBeat.o(99257);
    }
  }

  public void a(gt paramgt)
  {
    AppMethodBeat.i(99191);
    if (paramgt == null)
      AppMethodBeat.o(99191);
    while (true)
    {
      return;
      if (this.l == null)
        this.l = new CopyOnWriteArrayList();
      synchronized (this.l)
      {
        if (!this.l.contains(paramgt))
          this.l.add(paramgt);
        AppMethodBeat.o(99191);
      }
    }
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(99233);
    a(paramRunnable, null);
    AppMethodBeat.o(99233);
  }

  public void a(Runnable paramRunnable, fy paramfy)
  {
    AppMethodBeat.i(99234);
    if (!I())
      AppMethodBeat.o(99234);
    while (true)
    {
      return;
      float f1 = this.s.g().width() / 2.0F;
      float f2 = this.s.g().height() / 2.0F;
      this.s.f().b(f1, f2);
      if (paramRunnable != null)
        paramRunnable.run();
      AppMethodBeat.o(99234);
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(99195);
    this.B = paramBoolean;
    L();
    AppMethodBeat.o(99195);
  }

  public Rect b()
  {
    AppMethodBeat.i(99185);
    Rect localRect = new Rect(this.C, this.D, this.E, this.F);
    AppMethodBeat.o(99185);
    return localRect;
  }

  public void b(double paramDouble)
  {
    AppMethodBeat.i(99202);
    L();
    com.tencent.map.lib.d.a("skew notifySkew");
    Iterator localIterator = this.o.iterator();
    while (localIterator.hasNext())
    {
      fu localfu = (fu)localIterator.next();
      if (localfu != null)
        try
        {
          localfu.a(paramDouble);
        }
        catch (Exception localException)
        {
        }
    }
    AppMethodBeat.o(99202);
  }

  public void b(float paramFloat)
  {
    AppMethodBeat.i(99215);
    f(paramFloat);
    AppMethodBeat.o(99215);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(99246);
    if (this.t.a(paramInt))
      d(paramInt);
    AppMethodBeat.o(99246);
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99276);
    a(paramInt1, paramInt2);
    AppMethodBeat.o(99276);
  }

  public void b(Rect paramRect)
  {
    AppMethodBeat.i(99249);
    if ((this.v == null) || (paramRect == null))
      AppMethodBeat.o(99249);
    while (true)
    {
      return;
      this.w = paramRect;
      if ((this.s instanceof gm))
        ((gm)this.s).a(paramRect);
      G();
      AppMethodBeat.o(99249);
    }
  }

  public void b(Rect paramRect1, Rect paramRect2)
  {
    AppMethodBeat.i(99267);
    if (paramRect1 == null)
      AppMethodBeat.o(99267);
    while (true)
    {
      return;
      if ((paramRect1.height() > 0) || (paramRect1.width() > 0))
        a(paramRect1, paramRect2, false);
      c(1);
      AppMethodBeat.o(99267);
    }
  }

  public void b(com.tencent.map.lib.gl.d paramd)
  {
    AppMethodBeat.i(99265);
    synchronized (this.g)
    {
      this.g.remove(paramd);
      AppMethodBeat.o(99265);
      return;
    }
  }

  public void b(fq paramfq)
  {
    AppMethodBeat.i(99263);
    synchronized (this.e)
    {
      this.e.remove(paramfq);
      AppMethodBeat.o(99263);
      return;
    }
  }

  public void b(ft paramft)
  {
    AppMethodBeat.i(99256);
    synchronized (this.i)
    {
      this.i.remove(paramft);
      AppMethodBeat.o(99256);
      return;
    }
  }

  public void b(fu paramfu)
  {
    AppMethodBeat.i(99201);
    synchronized (this.o)
    {
      com.tencent.map.lib.d.a("skew addSkewListener");
      this.o.remove(paramfu);
      AppMethodBeat.o(99201);
      return;
    }
  }

  public void b(fv paramfv)
  {
    AppMethodBeat.i(99260);
    synchronized (this.k)
    {
      this.k.remove(paramfv);
      AppMethodBeat.o(99260);
      return;
    }
  }

  public void b(fx paramfx)
  {
    AppMethodBeat.i(99228);
    this.a.j();
    c(paramfx);
    AppMethodBeat.o(99228);
  }

  public void b(Runnable paramRunnable)
  {
    AppMethodBeat.i(99237);
    b(paramRunnable, null);
    AppMethodBeat.o(99237);
  }

  public void b(Runnable paramRunnable, fy paramfy)
  {
    AppMethodBeat.i(99238);
    if (!J())
      AppMethodBeat.o(99238);
    while (true)
    {
      return;
      this.s.f().t();
      if (paramRunnable != null)
        paramRunnable.run();
      AppMethodBeat.o(99238);
    }
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(99278);
    if (paramBoolean)
    {
      if (this.G != null)
      {
        this.G.run();
        this.G = null;
      }
      G();
    }
    AppMethodBeat.o(99278);
  }

  public fz c()
  {
    AppMethodBeat.i(99187);
    this.a.a();
    fz localfz = this.a;
    AppMethodBeat.o(99187);
    return localfz;
  }

  public void c(double paramDouble)
  {
    AppMethodBeat.i(99221);
    if (paramDouble == 0.0D)
      AppMethodBeat.o(99221);
    while (true)
    {
      return;
      float f1 = this.t.b(this.t.d() + (float)paramDouble);
      G();
      b(f1);
      AppMethodBeat.o(99221);
    }
  }

  public void c(float paramFloat)
  {
    AppMethodBeat.i(99217);
    d(paramFloat);
    AppMethodBeat.o(99217);
  }

  public void c(fx paramfx)
  {
    AppMethodBeat.i(99271);
    this.a.a(paramfx);
    AppMethodBeat.o(99271);
  }

  public void c(boolean paramBoolean)
  {
    this.H = paramBoolean;
  }

  public void d()
  {
    AppMethodBeat.i(99188);
    if (this.a != null)
      this.a.d();
    AppMethodBeat.o(99188);
  }

  public void d(double paramDouble)
  {
    AppMethodBeat.i(99222);
    if (paramDouble == this.t.d())
      AppMethodBeat.o(99222);
    while (true)
    {
      return;
      float f1 = this.t.b((float)paramDouble);
      G();
      b(f1);
      AppMethodBeat.o(99222);
    }
  }

  public void e()
  {
    AppMethodBeat.i(99189);
    if (this.a != null)
      this.a.c();
    AppMethodBeat.o(99189);
  }

  public void e(double paramDouble)
  {
    AppMethodBeat.i(99223);
    if (paramDouble == 0.0D)
      AppMethodBeat.o(99223);
    while (true)
    {
      return;
      float f1 = this.t.a(this.t.c() + (float)paramDouble);
      G();
      a(f1);
      AppMethodBeat.o(99223);
    }
  }

  public void f()
  {
    AppMethodBeat.i(99190);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(99190);
  }

  public void f(double paramDouble)
  {
    AppMethodBeat.i(99224);
    if (MathUtil.calShortestAngleDistance(paramDouble - this.t.c()) == 0.0D)
      AppMethodBeat.o(99224);
    while (true)
    {
      return;
      float f1 = this.t.a((float)paramDouble);
      G();
      a(f1);
      AppMethodBeat.o(99224);
    }
  }

  public fz g()
  {
    return this.a;
  }

  public void g(double paramDouble)
  {
    AppMethodBeat.i(99225);
    h(this.t.i() * (float)paramDouble);
    AppMethodBeat.o(99225);
  }

  public void h()
  {
    AppMethodBeat.i(99193);
    try
    {
      gs localgs = (gs)this.t.clone();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("mapParam stack saveMapParam:");
      com.tencent.map.lib.d.a(localgs.toString());
      this.q.push(localgs);
      AppMethodBeat.o(99193);
      return;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (true)
        AppMethodBeat.o(99193);
    }
  }

  public void h(double paramDouble)
  {
    AppMethodBeat.i(99226);
    a((float)paramDouble);
    AppMethodBeat.o(99226);
  }

  public void i()
  {
    AppMethodBeat.i(99194);
    try
    {
      gs localgs = (gs)this.q.pop();
      if (localgs.j() != this.t.j())
        a(gs.c.c);
      while (true)
      {
        if (localgs.c() != this.t.c())
          a(localgs.c());
        if (localgs.d() != this.t.d())
          b(localgs.d());
        this.t.a(localgs);
        G();
        AppMethodBeat.o(99194);
        return;
        if (localgs.i() != this.t.i())
          a(gs.c.b);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(99194);
    }
  }

  public void i(double paramDouble)
  {
    AppMethodBeat.i(99229);
    this.a.j();
    c(new fx(102, new double[] { 0.0D, paramDouble }));
    AppMethodBeat.o(99229);
  }

  public gs j()
  {
    AppMethodBeat.i(99197);
    try
    {
      gs localgs = (gs)this.t.clone();
      AppMethodBeat.o(99197);
      return localgs;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(99197);
      }
    }
  }

  public void j(double paramDouble)
  {
    AppMethodBeat.i(99230);
    this.a.j();
    c(new fx(108, new double[] { paramDouble }));
    AppMethodBeat.o(99230);
  }

  public void k()
  {
    AppMethodBeat.i(99204);
    GeoPoint localGeoPoint = new GeoPoint(d, c);
    this.t.a(this.s.g(), localGeoPoint.getLatitudeE6(), localGeoPoint.getLongitudeE6(), 13);
    G();
    L();
    AppMethodBeat.o(99204);
  }

  public float l()
  {
    AppMethodBeat.i(99206);
    float f1 = this.t.i();
    AppMethodBeat.o(99206);
    return f1;
  }

  public int m()
  {
    AppMethodBeat.i(99213);
    int i1 = this.t.j();
    AppMethodBeat.o(99213);
    return i1;
  }

  public GeoPoint n()
  {
    AppMethodBeat.i(99214);
    GeoPoint localGeoPoint = this.t.p();
    AppMethodBeat.o(99214);
    return localGeoPoint;
  }

  public float o()
  {
    AppMethodBeat.i(99216);
    float f1 = this.t.c();
    AppMethodBeat.o(99216);
    return f1;
  }

  public float p()
  {
    AppMethodBeat.i(99218);
    float f1 = this.t.d();
    AppMethodBeat.o(99218);
    return f1;
  }

  public float q()
  {
    AppMethodBeat.i(99219);
    float f1 = this.t.k();
    AppMethodBeat.o(99219);
    return f1;
  }

  public void r()
  {
    AppMethodBeat.i(99239);
    this.a.j();
    a(0.0D, 0.0D, true);
    AppMethodBeat.o(99239);
  }

  public void s()
  {
    AppMethodBeat.i(99241);
    d(false);
    r();
    AppMethodBeat.o(99241);
  }

  public boolean t()
  {
    AppMethodBeat.i(99242);
    boolean bool;
    if ((Math.abs(p()) > 1.0E-006D) || (Math.abs(o()) > 1.0F))
    {
      bool = true;
      AppMethodBeat.o(99242);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99242);
    }
  }

  public int u()
  {
    AppMethodBeat.i(99250);
    int i1 = this.t.b();
    AppMethodBeat.o(99250);
    return i1;
  }

  public void v()
  {
    AppMethodBeat.i(99253);
    b(this.w);
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.map.lib.gl.d locald = (com.tencent.map.lib.gl.d)localIterator.next();
      if (locald != null)
        try
        {
          locald.a();
        }
        catch (Exception localException)
        {
        }
    }
    AppMethodBeat.o(99253);
  }

  public void w()
  {
    AppMethodBeat.i(99258);
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      fs localfs = (fs)localIterator.next();
      if (localfs != null)
        try
        {
          localfs.a();
        }
        catch (Exception localException)
        {
        }
    }
    AppMethodBeat.o(99258);
  }

  public void x()
  {
    AppMethodBeat.i(99261);
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      fv localfv = (fv)localIterator.next();
      if (localfv != null)
        try
        {
          localfv.a();
        }
        catch (Exception localException)
        {
        }
    }
    AppMethodBeat.o(99261);
  }

  public Rect y()
  {
    AppMethodBeat.i(99269);
    Object localObject1 = new DoublePoint(this.s.g().width(), this.s.g().height());
    Object localObject2 = this.u.a((DoublePoint)localObject1);
    ((DoublePoint)localObject1).set(0.0D, 0.0D);
    localObject1 = this.u.a((DoublePoint)localObject1);
    localObject2 = new Rect(Math.min(((GeoPoint)localObject1).getLongitudeE6(), ((GeoPoint)localObject2).getLongitudeE6()), Math.min(((GeoPoint)localObject1).getLatitudeE6(), ((GeoPoint)localObject2).getLatitudeE6()), Math.max(((GeoPoint)localObject1).getLongitudeE6(), ((GeoPoint)localObject2).getLongitudeE6()), Math.max(((GeoPoint)localObject1).getLatitudeE6(), ((GeoPoint)localObject2).getLatitudeE6()));
    AppMethodBeat.o(99269);
    return localObject2;
  }

  public void z()
  {
    AppMethodBeat.i(99270);
    this.a.i();
    AppMethodBeat.o(99270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gk
 * JD-Core Version:    0.6.2
 */