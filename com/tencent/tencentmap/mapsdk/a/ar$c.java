package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fx;
import com.tencent.tencentmap.mapsdk.maps.a.im;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class ar$c
  implements ar.b
{
  private boolean b = false;

  public ar$c(ar paramar, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public void a()
  {
    AppMethodBeat.i(100597);
    if ((ar.a(this.a).T == 0) || (ar.a(this.a).U == 0))
      AppMethodBeat.o(100597);
    while (true)
    {
      return;
      ar.a(this.a).a(null);
      if ((ar.a(this.a).M != null) && (ar.a(this.a).N != null))
        break;
      AppMethodBeat.o(100597);
    }
    Object localObject = new GeoPoint();
    float f;
    label175: int i;
    int j;
    if ((ar.a(this.a).P == 0) && (ar.a(this.a).Q == 0) && (ar.a(this.a).R == 0) && (ar.a(this.a).S == 0))
    {
      f = this.a.a(0, 0, 0, 0, ar.a(this.a).M, ar.a(this.a).N, (GeoPoint)localObject);
      aj.a locala = ar.a(this.a).w;
      i = ((GeoPoint)localObject).getLatitudeE6();
      j = ((GeoPoint)localObject).getLongitudeE6();
      if (!this.b)
        break label426;
      localObject = new im(10000);
      ((im)localObject).c(0.0F);
      ((im)localObject).d(0.0F);
      ((im)localObject).c(i, j);
      ((im)localObject).a(f);
      ((im)localObject).a(ar.b(this.a));
      ((im)localObject).a(locala);
      ar.a(this.a).b().a((fx)localObject);
    }
    while (true)
    {
      ar.a(this.a).M = null;
      ar.a(this.a).N = null;
      ar.a(this.a).P = 0;
      ar.a(this.a).Q = 0;
      ar.a(this.a).R = 0;
      ar.a(this.a).S = 0;
      ar.a(this.a).w = null;
      AppMethodBeat.o(100597);
      break;
      f = this.a.a(ar.a(this.a).P, ar.a(this.a).Q, ar.a(this.a).R, ar.a(this.a).S, ar.a(this.a).M, ar.a(this.a).N, (GeoPoint)localObject);
      break label175;
      label426: ar.a(this.a).b().b(0.0F);
      ar.a(this.a).b().a(0.0F);
      ar.a(this.a).b().a(i, j);
      ar.a(this.a, f, false, 0L, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.c
 * JD-Core Version:    0.6.2
 */