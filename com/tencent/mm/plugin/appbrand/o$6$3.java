package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.jsapi.version.a;
import com.tencent.mm.plugin.appbrand.jsapi.version.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class o$6$3
  implements Runnable
{
  o$6$3(o.6 param6, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128985);
    a locala = this.gPE;
    s locals = this.gPD.gPy.atK();
    ab.i("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), service %s", new Object[] { locala.hYi, locals });
    if (locals == null)
      AppMethodBeat.o(128985);
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("state", locala.hYi);
      new a.a((byte)0).i(locals).s(localHashMap).aCj();
      AppMethodBeat.o(128985);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.6.3
 * JD-Core Version:    0.6.2
 */