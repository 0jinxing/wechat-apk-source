package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.p;
import java.util.Map;

final class i$1$1
  implements Runnable
{
  i$1$1(i.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108061);
    synchronized (this.hRM.hRL.gPL)
    {
      if (!this.hRM.hRL.gPL.containsKey(i.k(this.hRM.hIt, this.hRM.hRJ)))
      {
        d.i("MicroMsg.JsApiOperateLocalServicesScan", "scan task not exist, cancel auto stop");
        AppMethodBeat.o(108061);
        return;
      }
      p.ipp.a(this.hRM.hRK);
      this.hRM.hRL.gPL.remove(i.k(this.hRM.hIt, this.hRM.hRJ));
      AppMethodBeat.o(108061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.i.1.1
 * JD-Core Version:    0.6.2
 */