package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.df;

class hx$3
  implements if.b
{
  hx$3(hx paramhx)
  {
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(99642);
    this.a.s = paramFloat;
    if (hx.b(this.a) != null)
    {
      hx.b(this.a).a(this.a.s);
      this.a.m.b(this.a.s);
    }
    AppMethodBeat.o(99642);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(99644);
    this.a.t = paramFloat1;
    this.a.u = paramFloat2;
    if (hx.b(this.a) != null)
      hx.b(this.a).b(this.a.t, this.a.u);
    AppMethodBeat.o(99644);
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(99641);
    this.a.h = paramFloat1;
    this.a.j = paramFloat2;
    this.a.k = paramFloat3;
    this.a.l = paramFloat4;
    this.a.i = true;
    if (hx.b(this.a) != null)
      hx.b(this.a).b((int)this.a.h);
    AppMethodBeat.o(99641);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99643);
    if ((hx.c(this.a) != null) && (this.a.p != null))
    {
      GeoPoint localGeoPoint = new GeoPoint();
      if ((!hx.d(this.a)) || (hx.e(this.a) == null) || (hx.c(this.a).b() == null))
        break label255;
      Object localObject = hx.c(this.a).b().t().a(new DoublePoint(hx.f(this.a), hx.g(this.a)));
      int i = ((GeoPoint)localObject).getLatitudeE6();
      int j = hx.e(this.a).getLatitudeE6();
      int k = ((GeoPoint)localObject).getLongitudeE6();
      int m = hx.e(this.a).getLongitudeE6();
      localGeoPoint.setLatitudeE6(i - j + paramInt1);
      localGeoPoint.setLongitudeE6(k - m + paramInt2);
      localObject = hx.c(this.a).b().t().b(localGeoPoint);
      this.a.p.setLatitudeE6((int)((DoublePoint)localObject).y);
      this.a.p.setLongitudeE6((int)((DoublePoint)localObject).x);
    }
    while (true)
    {
      if (hx.b(this.a) != null)
        hx.b(this.a).a(this.a.p);
      AppMethodBeat.o(99643);
      return;
      label255: this.a.p.setLatitudeE6(paramInt1 + 0);
      this.a.p.setLongitudeE6(paramInt2 + 0);
    }
  }

  public void b(float paramFloat)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hx.3
 * JD-Core Version:    0.6.2
 */