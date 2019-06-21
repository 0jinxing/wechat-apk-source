package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cl;
import com.tencent.tencentmap.mapsdk.a.df;

public class hw extends hv
{
  private boolean R;
  private Bitmap S;
  private boolean T;
  private boolean U;
  private boolean V;
  private hw.a W;
  private boolean X;
  private boolean Y;
  private boolean Z;
  private final byte[] aa;
  private boolean ab;
  private boolean ac;
  private Bitmap ad;
  private Bitmap ae;
  private Bitmap af;
  private int ag;
  private int ah;
  private int ai;

  public hw(iz paramiz)
  {
    super(paramiz);
    AppMethodBeat.i(99624);
    this.R = false;
    this.S = null;
    this.T = false;
    this.U = false;
    this.V = true;
    this.W = hw.a.a;
    this.X = false;
    this.Y = true;
    this.Z = false;
    this.aa = new byte[0];
    this.ab = false;
    this.ac = false;
    this.ag = 0;
    this.ah = 0;
    this.ai = 0;
    this.t = true;
    AppMethodBeat.o(99624);
  }

  private void f(boolean paramBoolean)
  {
    AppMethodBeat.i(99636);
    byte[] arrayOfByte = this.d;
    if (paramBoolean);
    try
    {
      if (this.ad != null)
        a(this.ad);
      while (true)
      {
        return;
        if (this.b != null)
          a(this.b);
      }
    }
    finally
    {
      AppMethodBeat.o(99636);
    }
  }

  private void g(boolean paramBoolean)
  {
    AppMethodBeat.i(99638);
    int i = this.m;
    if (this.ad != null)
      i = this.ad.getHeight();
    int j = i;
    if (i == 0)
      j = 1;
    if (paramBoolean)
    {
      this.F = (-(this.ai + 5.0F) / j);
      AppMethodBeat.o(99638);
    }
    while (true)
    {
      return;
      this.F = ((this.ag + 5.0F + j) / j);
      AppMethodBeat.o(99638);
    }
  }

  private void l()
  {
    int i = this.l;
    int j = i;
    if (i == 0)
      j = 1;
    this.E = (this.ah * 1.0F / j + 0.5F);
  }

  public Rect a(fw paramfw)
  {
    AppMethodBeat.i(99633);
    synchronized (this.aa)
    {
      if (this.a != null)
      {
        e(false);
        f(false);
        paramfw = this.a.a(paramfw);
        e(this.ac);
        f(this.ac);
        AppMethodBeat.o(99633);
        return paramfw;
      }
      paramfw = new android/graphics/Rect;
      paramfw.<init>(0, 0, 0, 0);
      AppMethodBeat.o(99633);
    }
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(99635);
    this.ah = paramInt;
    l();
    AppMethodBeat.o(99635);
  }

  public void a(GeoPoint paramGeoPoint)
  {
    this.p = paramGeoPoint;
  }

  public void a(df paramdf)
  {
    AppMethodBeat.i(99625);
    super.a(paramdf);
    this.y = paramdf;
    AppMethodBeat.o(99625);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(99626);
        d(true);
        if ((paramBoolean1) && (paramBoolean2))
        {
          this.R = false;
          if (!this.Y)
          {
            e();
            f();
            this.X = true;
            this.w.b().a();
            AppMethodBeat.o(99626);
          }
        }
        else
        {
          this.R = true;
          continue;
        }
      }
      finally
      {
      }
      if (paramBoolean1 == true)
        this.W = hw.a.a;
      if (!this.Z)
        this.W = hw.a.d;
      if ((paramBoolean1 == true) && (this.A != null) && (this.A.c()))
      {
        this.A.b();
        if (this.z != null)
          this.z.b();
      }
      if (this.W == hw.a.a)
      {
        this.W = hw.a.c;
        if (this.w.d != null)
        {
          a(this.w.d);
          g();
          AppMethodBeat.o(99626);
        }
      }
      else if (this.W == hw.a.c)
      {
        this.W = hw.a.d;
        if (this.w.f != null)
        {
          a(this.w.f);
          g();
          AppMethodBeat.o(99626);
        }
        else
        {
          e();
          f();
          this.X = true;
          this.w.b().a();
        }
      }
      else if (this.W == hw.a.d)
      {
        this.W = hw.a.b;
        if (this.w.e != null)
        {
          a(this.w.e);
          g();
          AppMethodBeat.o(99626);
        }
      }
      else
      {
        AppMethodBeat.o(99626);
      }
    }
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99634);
    this.ag = paramInt1;
    this.ai = paramInt2;
    g(false);
    AppMethodBeat.o(99634);
  }

  public void b(Bitmap arg1)
  {
    AppMethodBeat.i(99629);
    if (??? == null)
      AppMethodBeat.o(99629);
    while (true)
    {
      return;
      synchronized (this.d)
      {
        this.b = ???;
        synchronized (this.aa)
        {
          if (!this.ac)
            a(???);
        }
      }
      synchronized (this.d)
      {
        if (this.X == true)
          e();
        AppMethodBeat.o(99629);
        continue;
        ??? = finally;
        AppMethodBeat.o(99629);
        throw ???;
        ??? = finally;
        AppMethodBeat.o(99629);
        throw ???;
      }
    }
  }

  public void b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99630);
    if (paramGeoPoint == null)
    {
      AppMethodBeat.o(99630);
      return;
    }
    if (this.o == null)
      this.o = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    while (true)
    {
      if (this.a != null)
        this.a.a(this.o);
      if (this.X == true)
        f();
      AppMethodBeat.o(99630);
      break;
      this.o.setLatitudeE6(paramGeoPoint.getLatitudeE6());
      this.o.setLongitudeE6(paramGeoPoint.getLongitudeE6());
    }
  }

  public void c(boolean paramBoolean)
  {
    this.X = paramBoolean;
  }

  public void d(boolean paramBoolean)
  {
    AppMethodBeat.i(99632);
    this.U = paramBoolean;
    this.w.b().a();
    AppMethodBeat.o(99632);
  }

  public void e()
  {
    AppMethodBeat.i(99628);
    synchronized (this.d)
    {
      if ((this.af != null) && (!this.af.isRecycled()))
        this.c = true;
      AppMethodBeat.o(99628);
      return;
    }
  }

  public void e(boolean paramBoolean)
  {
    AppMethodBeat.i(99637);
    g(paramBoolean);
    if (this.a != null)
      this.a.a(this.E, this.F);
    AppMethodBeat.o(99637);
  }

  protected void h()
  {
    AppMethodBeat.i(99627);
    if (this.W == hw.a.d)
    {
      e();
      f();
      this.w.b().a();
    }
    if (this.W != hw.a.b)
    {
      a(false, false);
      AppMethodBeat.o(99627);
    }
    while (true)
    {
      return;
      this.X = true;
      this.w.b().a();
      AppMethodBeat.o(99627);
    }
  }

  public void i()
  {
    AppMethodBeat.i(99631);
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
    if (this.S != null)
    {
      this.S.recycle();
      this.S = null;
    }
    if (this.ad != null)
    {
      this.ad.recycle();
      this.ad = null;
    }
    if (this.ae != null)
    {
      this.ae.recycle();
      this.ae = null;
    }
    synchronized (this.d)
    {
      if (this.af != null)
      {
        this.af.recycle();
        this.af = null;
      }
      AppMethodBeat.o(99631);
      return;
    }
  }

  public boolean j()
  {
    return this.U;
  }

  public l k()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hw
 * JD-Core Version:    0.6.2
 */