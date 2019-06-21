package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.im;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class ar$3$1
  implements Runnable
{
  ar$3$1(ar.3 param3, float paramFloat, GeoPoint paramGeoPoint)
  {
  }

  public void run()
  {
    double d1 = 0.0D;
    AppMethodBeat.i(100591);
    if (ar.a(this.c.d) == null)
    {
      AppMethodBeat.o(100591);
      return;
    }
    double d2;
    if (this.c.a)
    {
      d2 = (int)this.c.d.h() - Math.log(1.0F / this.a) / Math.log(2.0D) - 2.0D;
      if (d2 >= 0.0D)
        break label230;
      d2 = d1;
    }
    label230: 
    while (true)
    {
      im localim = new im(10000);
      localim.c(this.b.getLatitudeE6(), this.b.getLongitudeE6());
      localim.a((float)d2);
      localim.a(ar.b(this.c.d));
      localim.a(this.c.b);
      localim.a(this.c.c);
      ar.a(this.c.d).b().a(localim);
      AppMethodBeat.o(100591);
      break;
      ar.a(this.c.d).b().b(this.b);
      ar.a(this.c.d).b().c(this.a);
      AppMethodBeat.o(100591);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.3.1
 * JD-Core Version:    0.6.2
 */