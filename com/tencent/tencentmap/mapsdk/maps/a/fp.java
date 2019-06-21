package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.basemap.data.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class fp
  implements fw
{
  private gs a;
  private gh b;
  private gm c;

  public fp(gs paramgs, fn paramfn)
  {
    AppMethodBeat.i(98939);
    this.a = paramgs;
    this.b = paramfn.f();
    if ((paramfn instanceof gm))
      this.c = ((gm)paramfn);
    AppMethodBeat.o(98939);
  }

  public static DoublePoint a(gs paramgs, GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98942);
    if ((paramgs == null) || (paramGeoPoint == null))
    {
      paramgs = null;
      AppMethodBeat.o(98942);
    }
    while (true)
    {
      return paramgs;
      double d1 = 0.0D;
      double d2 = 0.0D;
      int i = paramgs.f() >> 1;
      double d3 = paramgs.g();
      double d4 = paramgs.h();
      if (paramGeoPoint != null)
      {
        d2 = Math.min(Math.max(Math.sin(paramGeoPoint.getLatitudeE6() / 1000000.0D * 0.0174532925199433D), -0.9999D), 0.9999D);
        d1 = i + d3 * (paramGeoPoint.getLongitudeE6() / 1000000.0D);
        d3 = i;
        d2 = Math.log((1.0D + d2) / (1.0D - d2)) * d4 * 0.5D + d3;
      }
      paramgs = new DoublePoint(d1, d2);
      AppMethodBeat.o(98942);
    }
  }

  public static b a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98945);
    if (paramGeoPoint == null)
    {
      paramGeoPoint = null;
      AppMethodBeat.o(98945);
    }
    while (true)
    {
      return paramGeoPoint;
      double d = paramGeoPoint.getLatitudeE6() / 1000000.0D;
      paramGeoPoint = new b(paramGeoPoint.getLongitudeE6() / 1000000.0D * 20037508.34D / 180.0D, Math.log(Math.tan((d + 90.0D) * 3.141592653589793D / 360.0D)) / 0.0174532925199433D * 20037508.34D / 180.0D);
      AppMethodBeat.o(98945);
    }
  }

  public double a(double paramDouble)
  {
    AppMethodBeat.i(98943);
    float f = this.a.j();
    double d = this.a.k();
    d = 40076000.0D / (Math.pow(2.0D, (float)(f + Math.log(d) / Math.log(2.0D))) * 256.0D);
    paramDouble = Math.cos(3.141592653589793D * paramDouble / 180.0D);
    AppMethodBeat.o(98943);
    return d * paramDouble;
  }

  public double a(Point paramPoint1, Point paramPoint2)
  {
    AppMethodBeat.i(98944);
    GeoPoint localGeoPoint1 = a(new DoublePoint(paramPoint1.x, paramPoint1.y));
    GeoPoint localGeoPoint2 = a(new DoublePoint(paramPoint2.x, paramPoint2.y));
    float[] arrayOfFloat = new float[1];
    Location.distanceBetween(localGeoPoint1.getLatitudeE6() / 1000000.0D, localGeoPoint1.getLongitudeE6() / 1000000.0D, localGeoPoint2.getLatitudeE6() / 1000000.0D, localGeoPoint2.getLongitudeE6() / 1000000.0D, arrayOfFloat);
    int i = (int)Math.sqrt(Math.pow(paramPoint1.x - paramPoint2.x, 2.0D) + Math.pow(paramPoint1.y - paramPoint2.y, 2.0D));
    double d = arrayOfFloat[0] / i;
    AppMethodBeat.o(98944);
    return d;
  }

  public GeoPoint a(DoublePoint paramDoublePoint)
  {
    AppMethodBeat.i(98940);
    if (paramDoublePoint == null)
    {
      paramDoublePoint = null;
      AppMethodBeat.o(98940);
    }
    while (true)
    {
      return paramDoublePoint;
      byte[] arrayOfByte = this.a.r();
      float f1 = (float)paramDoublePoint.x;
      float f2 = (float)paramDoublePoint.y;
      float f3 = f1;
      float f4 = f2;
      if (this.c != null)
      {
        paramDoublePoint = this.c.p();
        f3 = f1;
        f4 = f2;
        if (paramDoublePoint != null)
        {
          f3 = f1 - paramDoublePoint.left;
          f4 = f2 - paramDoublePoint.top;
        }
      }
      paramDoublePoint = this.b.a(arrayOfByte, f3, f4);
      AppMethodBeat.o(98940);
    }
  }

  public DoublePoint b(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98941);
    if (paramGeoPoint == null)
    {
      paramGeoPoint = null;
      AppMethodBeat.o(98941);
    }
    while (true)
    {
      return paramGeoPoint;
      double d1 = paramGeoPoint.getLatitudeE6() / 1000000.0D;
      double d2 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
      paramGeoPoint = this.a.r();
      paramGeoPoint = this.b.a(paramGeoPoint, d1, d2);
      float f1 = paramGeoPoint.x;
      float f2 = paramGeoPoint.y;
      float f3 = f1;
      float f4 = f2;
      if (this.c != null)
      {
        paramGeoPoint = this.c.p();
        f3 = f1;
        f4 = f2;
        if (paramGeoPoint != null)
        {
          f3 = f1 + paramGeoPoint.left;
          f4 = f2 + paramGeoPoint.top;
        }
      }
      paramGeoPoint = new DoublePoint(f3, f4);
      AppMethodBeat.o(98941);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fp
 * JD-Core Version:    0.6.2
 */