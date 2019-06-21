package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class jy
{
  private double a;
  private double b;
  private double c;
  private double d;
  private gs e;
  private iz f;

  public jy(iz paramiz)
  {
    AppMethodBeat.i(100152);
    this.a = 268435456.0D;
    this.b = (this.a / 2.0D);
    this.c = (this.a / 360.0D);
    this.d = (this.a / 6.283185307179586D);
    this.f = paramiz;
    this.e = this.f.b().A();
    AppMethodBeat.o(100152);
  }

  public double a(int paramInt)
  {
    return (1 << paramInt) / 1048576.0D;
  }

  public DoublePoint a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(100153);
    double d1;
    double d2;
    double d4;
    if (paramGeoPoint != null)
    {
      d1 = Math.min(Math.max(Math.sin(paramGeoPoint.getLatitudeE6() / 1000000.0D * 0.0174532925199433D), -0.9999D), 0.9999D);
      d2 = this.b;
      d3 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
      d4 = this.c;
      d1 = (3.141592653589793D - Math.log((1.0D + d1) / (1.0D - d1)) * 0.5D) * this.d;
    }
    for (double d3 = d2 + d3 * d4; ; d3 = 0.0D)
    {
      paramGeoPoint = new DoublePoint(d3, d1);
      AppMethodBeat.o(100153);
      return paramGeoPoint;
      d1 = 0.0D;
    }
  }

  public gs a()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jy
 * JD-Core Version:    0.6.2
 */