package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.im.a;
import com.tencent.tencentmap.mapsdk.maps.a.iz;

class ar$2
  implements im.a
{
  ar$2(ar paramar)
  {
  }

  public float a()
  {
    AppMethodBeat.i(100587);
    float f;
    if (ar.a(this.a) == null)
    {
      f = 0.0F;
      AppMethodBeat.o(100587);
    }
    while (true)
    {
      return f;
      f = this.a.s();
      AppMethodBeat.o(100587);
    }
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(100590);
    if (paramRunnable == null)
      AppMethodBeat.o(100590);
    while (true)
    {
      return;
      if ((ar.a(this.a) == null) || (ar.a(this.a).I == null))
      {
        AppMethodBeat.o(100590);
      }
      else
      {
        ar.a(this.a).I.postDelayed(paramRunnable, 100L);
        AppMethodBeat.o(100590);
      }
    }
  }

  public int b()
  {
    AppMethodBeat.i(100583);
    int i;
    if (ar.a(this.a) == null)
    {
      i = 0;
      AppMethodBeat.o(100583);
    }
    while (true)
    {
      return i;
      i = ar.a(this.a).b().c();
      AppMethodBeat.o(100583);
    }
  }

  public GeoPoint c()
  {
    AppMethodBeat.i(100584);
    GeoPoint localGeoPoint;
    if (ar.a(this.a) == null)
    {
      localGeoPoint = null;
      AppMethodBeat.o(100584);
    }
    while (true)
    {
      return localGeoPoint;
      localGeoPoint = ar.a(this.a).b().f();
      AppMethodBeat.o(100584);
    }
  }

  public float d()
  {
    AppMethodBeat.i(100585);
    float f;
    if (ar.a(this.a) == null)
    {
      f = 0.0F;
      AppMethodBeat.o(100585);
    }
    while (true)
    {
      return f;
      f = ar.a(this.a).b().q();
      AppMethodBeat.o(100585);
    }
  }

  public float e()
  {
    AppMethodBeat.i(100586);
    float f;
    if (ar.a(this.a) == null)
    {
      f = 0.0F;
      AppMethodBeat.o(100586);
    }
    while (true)
    {
      return f;
      f = ar.a(this.a).b().r();
      AppMethodBeat.o(100586);
    }
  }

  public GeoPoint f()
  {
    AppMethodBeat.i(100588);
    GeoPoint localGeoPoint;
    if (ar.a(this.a) == null)
    {
      localGeoPoint = null;
      AppMethodBeat.o(100588);
    }
    while (true)
    {
      return localGeoPoint;
      localGeoPoint = ar.a(this.a).F();
      AppMethodBeat.o(100588);
    }
  }

  public boolean g()
  {
    AppMethodBeat.i(100589);
    boolean bool;
    if (ar.a(this.a) == null)
    {
      bool = false;
      AppMethodBeat.o(100589);
    }
    while (true)
    {
      return bool;
      bool = ar.a(this.a).E().a();
      AppMethodBeat.o(100589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.2
 * JD-Core Version:    0.6.2
 */