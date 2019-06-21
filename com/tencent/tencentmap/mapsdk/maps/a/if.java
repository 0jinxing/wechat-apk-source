package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.map.lib.basemap.data.GeoPoint;

public abstract class if
{
  protected long a = 1500L;
  protected long b = 0L;
  protected if.a c = null;
  protected if.b d = null;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private Interpolator h = new LinearInterpolator();

  private long g()
  {
    return SystemClock.uptimeMillis();
  }

  public Interpolator a()
  {
    return this.h;
  }

  protected abstract void a(float paramFloat, Interpolator paramInterpolator);

  public void a(long paramLong)
  {
    this.a = paramLong;
  }

  public void a(Interpolator paramInterpolator)
  {
    this.h = paramInterpolator;
  }

  public void a(if.a parama)
  {
    this.c = parama;
  }

  public void a(if.b paramb)
  {
    this.d = paramb;
  }

  public boolean a(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.a <= 0L)
      bool2 = false;
    while (true)
    {
      return bool2;
      this.f = true;
      this.b = g();
      this.e = true;
      bool2 = bool1;
      if (this.c != null)
      {
        this.c.b();
        bool2 = bool1;
      }
    }
  }

  public void b()
  {
    this.e = false;
  }

  public boolean c()
  {
    return this.e;
  }

  public void d()
  {
    if (!this.e)
      if ((!this.g) && (this.c != null))
        this.c.a();
    while (true)
    {
      return;
      float f1 = (float)(g() - this.b) / (float)this.a;
      if (f1 > 1.0F)
      {
        this.e = false;
        a(1.0F, this.h);
        if (this.c != null)
          this.c.a();
        this.g = true;
      }
      else
      {
        a(f1, this.h);
      }
    }
  }

  public boolean e()
  {
    return this.f;
  }

  public boolean f()
  {
    return this.g;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.if
 * JD-Core Version:    0.6.2
 */