package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import com.tencent.tencentmap.mapsdk.maps.a.lh;

class ar$4$1
  implements Runnable
{
  ar$4$1(ar.4 param4)
  {
  }

  public void run()
  {
    AppMethodBeat.i(100593);
    if (ar.a(this.a.c) == null)
      AppMethodBeat.o(100593);
    while (true)
    {
      return;
      ar.a(this.a.c).a(ar.a(this.a.c).b().j());
      ar.a(this.a.c).K().h();
      if (ar.a(this.a.c).q != null)
      {
        ar.a(this.a.c).q.a();
        ar.a(this.a.c).q = null;
      }
      AppMethodBeat.o(100593);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ar.4.1
 * JD-Core Version:    0.6.2
 */