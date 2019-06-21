package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  static int hVZ;
  private j hVu;
  final List<ah> hWa;
  Runnable hWb;

  private k()
  {
    AppMethodBeat.i(126400);
    this.hWa = new LinkedList();
    hVZ = i.hVW.aEO();
    this.hWb = new k.1(this);
    this.hVu = new j(hVZ, new k.2(this));
    AppMethodBeat.o(126400);
  }

  public final boolean a(ah paramah, c arg2)
  {
    AppMethodBeat.i(126401);
    if (paramah == null)
      AppMethodBeat.o(126401);
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      if (i.hVW.a(???, paramah))
        break;
      AppMethodBeat.o(126401);
    }
    while (true)
    {
      synchronized (this.hWa)
      {
        bool = this.hWa.isEmpty();
        if (!this.hWa.isEmpty())
        {
          if (((ah)this.hWa.get(0)).equals(paramah))
          {
            this.hWa.add(0, paramah);
            this.hWa.remove(1);
            if ((bool) && (!this.hVu.l(new Object[0])))
            {
              ab.v("MicroMsg.SensorJsEventPublisher", "post delay publish event(event : %s).", new Object[] { paramah.getName() });
              m.aNS().m(this.hWb, hVZ);
            }
            AppMethodBeat.o(126401);
            bool = true;
            break;
          }
          this.hWa.remove(paramah);
          this.hWa.add(paramah);
        }
      }
      this.hWa.add(paramah);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.k
 * JD-Core Version:    0.6.2
 */