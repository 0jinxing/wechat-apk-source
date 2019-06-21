package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

class gk$3
  implements Runnable
{
  gk$3(gk paramgk, gs.c paramc)
  {
  }

  public void run()
  {
    AppMethodBeat.i(99181);
    Iterator localIterator = gk.b(this.b).iterator();
    while (localIterator.hasNext())
    {
      ft localft = (ft)localIterator.next();
      if (localft != null)
        localft.a(this.a);
    }
    gk.c(this.b);
    AppMethodBeat.o(99181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gk.3
 * JD-Core Version:    0.6.2
 */