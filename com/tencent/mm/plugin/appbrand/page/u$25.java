package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;

final class u$25
  implements Runnable
{
  u$25(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87184);
    k localk = new k();
    u localu = this.ita;
    q localq = u.i(this.ita).xT();
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", localu.getURL());
    localk.s(localHashMap).a(localq, localu.hashCode()).aCj();
    AppMethodBeat.o(87184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.25
 * JD-Core Version:    0.6.2
 */