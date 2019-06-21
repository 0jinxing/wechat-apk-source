package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

final class k$1
  implements Runnable
{
  k$1(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126397);
    while (true)
    {
      synchronized (this.hWc.hWa)
      {
        if (this.hWc.hWa.isEmpty())
        {
          AppMethodBeat.o(126397);
          return;
        }
        ??? = (ah)this.hWc.hWa.remove(0);
        int i = this.hWc.hWa.size();
        ((ah)???).aCj();
        ab.v("MicroMsg.SensorJsEventPublisher", "publish next event(event : %s), list size is : %d.", new Object[] { ((ah)???).getName(), Integer.valueOf(i) });
      }
      synchronized (this.hWc.hWa)
      {
        boolean bool = this.hWc.hWa.isEmpty();
        if (!bool)
          m.aNS().m(this, k.hVZ);
        AppMethodBeat.o(126397);
        continue;
        localObject3 = finally;
        AppMethodBeat.o(126397);
        throw localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.k.1
 * JD-Core Version:    0.6.2
 */