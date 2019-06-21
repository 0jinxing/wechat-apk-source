package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fl.a;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class ar$3
  implements fl.a
{
  ar$3(ar paramar, boolean paramBoolean, aj.a parama, long paramLong)
  {
  }

  public void a(float paramFloat, GeoPoint paramGeoPoint, double paramDouble)
  {
    AppMethodBeat.i(100592);
    if (ar.a(this.d) == null)
      AppMethodBeat.o(100592);
    while (true)
    {
      return;
      ar.a(this.d).I.post(new ar.3.1(this, paramFloat, paramGeoPoint));
      AppMethodBeat.o(100592);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.3
 * JD-Core Version:    0.6.2
 */