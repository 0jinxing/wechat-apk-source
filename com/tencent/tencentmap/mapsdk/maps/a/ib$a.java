package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ib$a extends GeoPoint
{
  float a = 0.0F;
  int b = 0;

  public ib$a()
  {
  }

  public ib$a(GeoPoint paramGeoPoint)
  {
    super(paramGeoPoint);
  }

  public String toString()
  {
    AppMethodBeat.i(99768);
    String str = super.toString() + "," + this.a;
    AppMethodBeat.o(99768);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ib.a
 * JD-Core Version:    0.6.2
 */