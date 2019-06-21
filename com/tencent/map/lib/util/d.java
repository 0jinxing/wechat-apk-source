package com.tencent.map.lib.util;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
{
  public static GeoPoint a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98248);
    double d = paramInt1 / 42722829.723526977D;
    GeoPoint localGeoPoint = new GeoPoint((int)(Math.toDegrees((Math.atan(Math.exp(3.141592653589793D - paramInt2 / 42722829.723526977D)) - 0.7853981633974483D) * 2.0D) * 1000000.0D), (int)(Math.toDegrees(d - 3.141592653589793D) * 1000000.0D));
    AppMethodBeat.o(98248);
    return localGeoPoint;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.d
 * JD-Core Version:    0.6.2
 */