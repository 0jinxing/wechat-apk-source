package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ik extends if
{
  private GeoPoint e;
  private GeoPoint f;
  private boolean g;

  public ik(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99846);
    this.e = null;
    this.f = null;
    this.g = false;
    if (paramGeoPoint != null)
    {
      this.f = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
      this.g = true;
    }
    AppMethodBeat.o(99846);
  }

  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    AppMethodBeat.i(99847);
    if ((this.f == null) || (this.e == null))
      AppMethodBeat.o(99847);
    while (true)
    {
      return;
      int i = this.f.getLatitudeE6();
      int j = this.e.getLatitudeE6();
      int k = this.f.getLongitudeE6();
      int m = this.e.getLongitudeE6();
      paramFloat = paramInterpolator.getInterpolation(paramFloat);
      int n = this.e.getLatitudeE6();
      i = (int)((i - j) * paramFloat);
      j = this.e.getLongitudeE6();
      k = (int)((k - m) * paramFloat);
      if (this.d != null)
        this.d.a(i + n, k + j);
      AppMethodBeat.o(99847);
    }
  }

  public boolean a(GeoPoint paramGeoPoint1, GeoPoint paramGeoPoint2)
  {
    AppMethodBeat.i(99848);
    boolean bool;
    if (!super.a(null, null))
    {
      bool = false;
      AppMethodBeat.o(99848);
    }
    while (true)
    {
      return bool;
      if (paramGeoPoint1 != null)
        this.e = new GeoPoint(paramGeoPoint1.getLatitudeE6(), paramGeoPoint1.getLongitudeE6());
      if ((!this.g) && (paramGeoPoint2 != null))
        this.f = new GeoPoint(paramGeoPoint2.getLatitudeE6(), paramGeoPoint2.getLongitudeE6());
      bool = true;
      AppMethodBeat.o(99848);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ik
 * JD-Core Version:    0.6.2
 */