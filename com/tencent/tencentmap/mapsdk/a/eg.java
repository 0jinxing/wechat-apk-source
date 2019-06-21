package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.map.Projection;

public class eg
  implements Projection
{
  private ai a;
  private aj b;

  public eg(aj paramaj)
  {
    AppMethodBeat.i(101445);
    this.a = paramaj.m();
    this.b = paramaj;
    AppMethodBeat.o(101445);
  }

  public double distanceBetween(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    AppMethodBeat.i(101449);
    double d = dz.a(paramLatLng1, paramLatLng2);
    AppMethodBeat.o(101449);
    return d;
  }

  public LatLng fromScreenLocation(Point paramPoint)
  {
    AppMethodBeat.i(101446);
    paramPoint = ej.a(this.a.a(paramPoint));
    AppMethodBeat.o(101446);
    return paramPoint;
  }

  public double getLatitudeSpan()
  {
    AppMethodBeat.i(101452);
    do localdo = this.a.b();
    double d;
    if (localdo == null)
    {
      d = -1.0D;
      AppMethodBeat.o(101452);
    }
    while (true)
    {
      return d;
      d = localdo.e.a.a - localdo.e.b.a;
      AppMethodBeat.o(101452);
    }
  }

  public double getLongitudeSpan()
  {
    AppMethodBeat.i(101453);
    do localdo = this.a.b();
    double d;
    if (localdo == null)
    {
      d = -1.0D;
      AppMethodBeat.o(101453);
    }
    while (true)
    {
      return d;
      d = localdo.e.a.b - localdo.e.b.b;
      AppMethodBeat.o(101453);
    }
  }

  public float getScalePerPixel()
  {
    AppMethodBeat.i(101454);
    float f = (float)this.a.a(this.b.d().a.a);
    AppMethodBeat.o(101454);
    return f;
  }

  public VisibleRegion getVisibleRegion()
  {
    AppMethodBeat.i(101448);
    VisibleRegion localVisibleRegion = ej.a(this.a.b());
    AppMethodBeat.o(101448);
    return localVisibleRegion;
  }

  public float metersToEquatorPixels(float paramFloat)
  {
    AppMethodBeat.i(101450);
    dy.a("call metersToEquatorPixels");
    paramFloat = metersToPixels(0.0D, paramFloat);
    AppMethodBeat.o(101450);
    return paramFloat;
  }

  public float metersToPixels(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(101451);
    dy.a("call metersToPixels");
    float f = (float)(paramDouble2 / this.a.a(paramDouble1));
    AppMethodBeat.o(101451);
    return f;
  }

  @Deprecated
  public Point toPixels(GeoPoint paramGeoPoint, Point paramPoint)
  {
    AppMethodBeat.i(101455);
    paramGeoPoint = GeoPoint.g2l(paramGeoPoint);
    if (paramGeoPoint == null)
    {
      paramGeoPoint = null;
      AppMethodBeat.o(101455);
    }
    while (true)
    {
      return paramGeoPoint;
      paramGeoPoint = toScreenLocation(paramGeoPoint);
      AppMethodBeat.o(101455);
    }
  }

  public Point toScreenLocation(LatLng paramLatLng)
  {
    AppMethodBeat.i(101447);
    paramLatLng = this.a.a(ej.a(paramLatLng));
    AppMethodBeat.o(101447);
    return paramLatLng;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.eg
 * JD-Core Version:    0.6.2
 */