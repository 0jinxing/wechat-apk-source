package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class gs
  implements Cloneable
{
  private int a;
  private gs.a b;
  private Rect c;
  private int d;
  private double e;
  private double f;
  private double g;
  private double h;
  private double i;
  private double j;
  private double k;
  private double l;
  private GeoPoint m;
  private Rect n;
  private gm o;
  private gh p;
  private Integer q;
  private DoublePoint r;
  private b s;

  public gs(gm paramgm)
  {
    AppMethodBeat.i(99455);
    this.g = 0.0D;
    this.h = 1.0D;
    this.i = 0.0D;
    this.j = 1.0D;
    this.k = 0.0D;
    this.l = 1.0D;
    this.q = Integer.valueOf(0);
    this.a = -1;
    this.b = new gs.a();
    this.c = new Rect();
    this.m = new GeoPoint();
    this.r = new DoublePoint();
    this.o = paramgm;
    this.p = paramgm.f();
    AppMethodBeat.o(99455);
  }

  private boolean b(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 == paramInt2)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((paramInt1 == 11) && (paramInt2 != 13))
      {
        bool2 = false;
      }
      else if ((paramInt1 == 13) && (paramInt2 != 11))
      {
        bool2 = false;
      }
      else if ((paramInt2 == 11) && (paramInt1 != 13))
      {
        bool2 = false;
      }
      else
      {
        bool2 = bool1;
        if (paramInt2 == 13)
        {
          bool2 = bool1;
          if (paramInt1 != 11)
            bool2 = false;
        }
      }
    }
  }

  private void d(int paramInt)
  {
    double d1 = (1 << paramInt) * 256;
    this.d = ((int)d1);
    this.e = (d1 / 360.0D);
    this.f = (d1 / 6.283185307179586D);
  }

  public float a(float paramFloat)
  {
    AppMethodBeat.i(99461);
    if (this.p.x() == paramFloat)
      AppMethodBeat.o(99461);
    while (true)
    {
      return paramFloat;
      float f1 = paramFloat % 360.0F;
      double d1 = Math.toRadians(paramFloat);
      this.g = Math.sin(d1);
      this.h = Math.cos(d1);
      if (this.p != null)
        this.p.a(f1);
      AppMethodBeat.o(99461);
      paramFloat = f1;
    }
  }

  public void a()
  {
    AppMethodBeat.i(99458);
    if (this.o == null)
    {
      AppMethodBeat.o(99458);
      return;
    }
    this.m = this.p.q();
    int i1 = this.p.s();
    float f1 = this.p.r();
    if (i1 != j())
      this.o.a().a(c.c);
    while (true)
    {
      if (this.b != null)
        this.b.a(i1, f1);
      this.a = this.p.y();
      AppMethodBeat.o(99458);
      break;
      if (f1 != i())
        this.o.a().a(c.b);
    }
  }

  public void a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99482);
    this.r.set(paramDouble1, paramDouble2);
    AppMethodBeat.o(99482);
  }

  public void a(Rect paramRect)
  {
    AppMethodBeat.i(99478);
    this.c.set(paramRect);
    AppMethodBeat.o(99478);
  }

  public void a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99457);
    this.n = paramRect;
    this.c = gi.a(2);
    b(paramInt3);
    a(0);
    a(paramInt1, paramInt2, false);
    AppMethodBeat.o(99457);
  }

  public void a(gs paramgs)
  {
    AppMethodBeat.i(99456);
    this.a = paramgs.a;
    this.b.a(paramgs.b);
    this.c.set(paramgs.c);
    this.d = paramgs.d;
    this.e = paramgs.e;
    this.f = paramgs.f;
    this.g = paramgs.g;
    this.h = paramgs.h;
    this.i = paramgs.i;
    this.j = paramgs.j;
    this.k = paramgs.k;
    this.l = paramgs.l;
    this.m.setGeoPoint(paramgs.m);
    this.r.set(paramgs.r.x, paramgs.r.y);
    this.n = paramgs.n;
    AppMethodBeat.o(99456);
  }

  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(99483);
    if (this.s == null)
      this.s = new b(paramFloat1, paramFloat2);
    while (true)
    {
      this.o.a(paramFloat1, paramFloat2, paramBoolean);
      AppMethodBeat.o(99483);
      return true;
      this.s.a(paramFloat1, paramFloat2);
    }
  }

  public boolean a(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(99459);
    if (this.p == null)
      AppMethodBeat.o(99459);
    while (true)
    {
      return bool;
      int i1 = this.p.y();
      if (i1 == paramInt)
      {
        AppMethodBeat.o(99459);
      }
      else
      {
        if (i1 == 11)
          this.o.c(false);
        if (paramInt == 11)
          this.o.c(true);
        this.a = paramInt;
        this.p.c(paramInt, b(i1, paramInt));
        AppMethodBeat.o(99459);
        bool = true;
      }
    }
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99481);
    int i1 = 1 << 20 - j();
    int i2;
    if (131072 > i1)
    {
      i2 = (this.n.width() * 131072 - this.n.width() * i1) / 2;
      i1 = (this.n.height() * 131072 - i1 * this.n.height()) / 2;
    }
    while (true)
    {
      int i3 = this.c.left - i2;
      i2 = this.c.right + i2;
      int i4 = this.c.top - i1;
      int i5 = i1 + this.c.bottom;
      if (paramInt1 < i4)
        paramInt1 = i4;
      while (true)
      {
        i1 = paramInt1;
        if (paramInt1 > i5)
          i1 = i5;
        if (paramInt2 < i3);
        for (paramInt1 = i3; ; paramInt1 = paramInt2)
        {
          paramInt2 = paramInt1;
          if (paramInt1 > i2)
            paramInt2 = i2;
          GeoPoint localGeoPoint = new GeoPoint(i1, paramInt2);
          this.p.d(localGeoPoint);
          AppMethodBeat.o(99481);
          return true;
        }
      }
      i1 = 0;
      i2 = 0;
    }
  }

  public boolean a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(99480);
    int i1;
    int i2;
    if (1 << 20 - j() < 0)
    {
      i1 = 0;
      if (131072 <= i1)
        break label279;
      i2 = (this.n.width() * 131072 - this.n.width() * i1) / 2;
      i1 = (this.n.height() * 131072 - i1 * this.n.height()) / 2;
    }
    while (true)
    {
      int i3 = this.c.left - i2;
      i2 += this.c.right;
      int i4 = this.c.top - i1;
      int i5 = i1 + this.c.bottom;
      if (paramInt1 < i4)
        paramInt1 = i4;
      while (true)
      {
        i1 = paramInt1;
        if (paramInt1 > i5)
          i1 = i5;
        if (paramInt2 < i3);
        for (paramInt1 = i3; ; paramInt1 = paramInt2)
        {
          paramInt2 = paramInt1;
          if (paramInt1 > i2)
            paramInt2 = i2;
          if ((i1 != this.m.getLatitudeE6()) || (paramInt2 != this.m.getLongitudeE6()))
            bool = true;
          this.m.setLatitudeE6(i1);
          this.m.setLongitudeE6(paramInt2);
          DoublePoint localDoublePoint = fp.a(this, this.m);
          a(localDoublePoint.x, localDoublePoint.y);
          this.p.a(this.m, paramBoolean);
          AppMethodBeat.o(99480);
          return bool;
          i1 = 20 - j();
          break;
        }
      }
      label279: i1 = 0;
      i2 = 0;
    }
  }

  public boolean a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99479);
    boolean bool = a(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    AppMethodBeat.o(99479);
    return bool;
  }

  public float b(float paramFloat)
  {
    AppMethodBeat.i(99463);
    if (this.p.w() == paramFloat)
      AppMethodBeat.o(99463);
    while (true)
    {
      return paramFloat;
      float f1 = Math.max(0.0F, Math.min(40.0F, paramFloat));
      double d1 = Math.toRadians(paramFloat);
      this.i = Math.sin(d1);
      this.j = Math.cos(d1);
      d1 = 1.570796326794897D - d1;
      this.l = Math.cos(d1);
      this.k = Math.sin(d1);
      if (this.p != null)
        this.p.b(f1);
      AppMethodBeat.o(99463);
      paramFloat = f1;
    }
  }

  public int b()
  {
    AppMethodBeat.i(99460);
    int i1;
    if (this.p == null)
    {
      i1 = this.a;
      AppMethodBeat.o(99460);
    }
    while (true)
    {
      return i1;
      i1 = this.p.y();
      AppMethodBeat.o(99460);
    }
  }

  public boolean b(int paramInt)
  {
    AppMethodBeat.i(99468);
    boolean bool;
    if (c(this.b.a(paramInt)) == c.c)
    {
      bool = true;
      AppMethodBeat.o(99468);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99468);
    }
  }

  public float c()
  {
    AppMethodBeat.i(99462);
    float f1 = this.p.x();
    AppMethodBeat.o(99462);
    return f1;
  }

  public c c(float paramFloat)
  {
    AppMethodBeat.i(99465);
    c localc = c.a;
    float f1 = this.b.a();
    int i1 = this.b.b();
    int i2;
    if (this.p != null)
    {
      this.p.a(paramFloat, false);
      paramFloat = this.p.r();
      i2 = this.p.s();
    }
    while (true)
    {
      this.b.a(i2, paramFloat);
      if (i2 != i1)
        localc = c.c;
      label170: 
      while (true)
      {
        switch (gs.1.a[localc.ordinal()])
        {
        default:
        case 1:
        }
        while (true)
        {
          DoublePoint localDoublePoint = fp.a(this, p());
          this.r.set(localDoublePoint.x, localDoublePoint.y);
          AppMethodBeat.o(99465);
          return localc;
          if (paramFloat == f1)
            break label170;
          localc = c.b;
          break;
          d(this.b.b());
        }
      }
      i2 = i1;
      paramFloat = f1;
    }
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(99475);
    this.b.b(paramInt);
    AppMethodBeat.o(99475);
  }

  public Object clone()
  {
    AppMethodBeat.i(99487);
    gs localgs = (gs)super.clone();
    localgs.c = new Rect(this.c);
    localgs.b = ((gs.a)this.b.clone());
    localgs.m = new GeoPoint(this.m);
    localgs.r = new DoublePoint(this.r.x, this.r.y);
    AppMethodBeat.o(99487);
    return localgs;
  }

  public float d()
  {
    AppMethodBeat.i(99464);
    float f1 = this.p.w();
    AppMethodBeat.o(99464);
    return f1;
  }

  public c d(float paramFloat)
  {
    AppMethodBeat.i(99467);
    if (this.p != null)
      this.p.a(paramFloat);
    this.b.a(paramFloat);
    c localc = c.c;
    AppMethodBeat.o(99467);
    return localc;
  }

  public void e()
  {
    AppMethodBeat.i(99466);
    d(this.b.b());
    DoublePoint localDoublePoint = fp.a(this, p());
    this.r.set(localDoublePoint.x, localDoublePoint.y);
    AppMethodBeat.o(99466);
  }

  public void e(float paramFloat)
  {
    AppMethodBeat.i(99477);
    this.b.b(paramFloat);
    AppMethodBeat.o(99477);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(99485);
    if (!(paramObject instanceof gs))
      AppMethodBeat.o(99485);
    while (true)
    {
      return bool;
      paramObject = (gs)paramObject;
      if (!paramObject.m.equals(this.m))
      {
        AppMethodBeat.o(99485);
      }
      else if (!paramObject.b.equals(this.b))
      {
        AppMethodBeat.o(99485);
      }
      else if (paramObject.a != this.a)
      {
        AppMethodBeat.o(99485);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(99485);
      }
    }
  }

  public int f()
  {
    return this.d;
  }

  public double g()
  {
    return this.e;
  }

  public double h()
  {
    return this.f;
  }

  public int hashCode()
  {
    AppMethodBeat.i(99484);
    int i1 = toString().hashCode();
    AppMethodBeat.o(99484);
    return i1;
  }

  public float i()
  {
    AppMethodBeat.i(99469);
    float f1 = this.b.a();
    AppMethodBeat.o(99469);
    return f1;
  }

  public int j()
  {
    AppMethodBeat.i(99470);
    int i1 = this.b.b();
    AppMethodBeat.o(99470);
    return i1;
  }

  public float k()
  {
    AppMethodBeat.i(99471);
    float f1 = this.b.c();
    AppMethodBeat.o(99471);
    return f1;
  }

  public int l()
  {
    AppMethodBeat.i(99472);
    int i1 = this.b.d();
    AppMethodBeat.o(99472);
    return i1;
  }

  public int m()
  {
    AppMethodBeat.i(99473);
    int i1 = this.b.e();
    AppMethodBeat.o(99473);
    return i1;
  }

  public int n()
  {
    AppMethodBeat.i(99474);
    int i1 = this.b.f();
    AppMethodBeat.o(99474);
    return i1;
  }

  public float o()
  {
    AppMethodBeat.i(99476);
    float f1 = this.b.g();
    AppMethodBeat.o(99476);
    return f1;
  }

  public GeoPoint p()
  {
    return this.m;
  }

  public b q()
  {
    return this.s;
  }

  public byte[] r()
  {
    return null;
  }

  public String toString()
  {
    AppMethodBeat.i(99486);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = p();
    localStringBuilder.append("mapParam: ");
    localStringBuilder.append("center:" + ((GeoPoint)localObject).toString() + " ");
    localStringBuilder.append("mode:" + this.a + " ");
    localStringBuilder.append("mapScale:" + this.b.toString() + " ");
    localStringBuilder.append("screenRect:" + this.n.toString() + " ");
    localObject = localStringBuilder.toString();
    AppMethodBeat.o(99486);
    return localObject;
  }

  public static class b
  {
    private float a = 0.0F;
    private float b = 0.0F;

    public b(float paramFloat1, float paramFloat2)
    {
      this.a = paramFloat1;
      this.b = paramFloat2;
    }

    public float a()
    {
      return this.a;
    }

    public void a(float paramFloat1, float paramFloat2)
    {
      this.a = paramFloat1;
      this.b = paramFloat2;
    }

    public float b()
    {
      return this.b;
    }
  }

  public static enum c
  {
    static
    {
      AppMethodBeat.i(99454);
      a = new c("NO_CHANGED", 0);
      b = new c("SCALE_CHANGED", 1);
      c = new c("SCALE_LEVEL_CHANGED", 2);
      d = new c[] { a, b, c };
      AppMethodBeat.o(99454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gs
 * JD-Core Version:    0.6.2
 */