package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m.a;
import org.json.JSONObject;

final class ae$1
  implements Runnable
{
  ae$1(ae paramae, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102804);
    if (!this.hxc.isRunning())
      AppMethodBeat.o(102804);
    while (true)
    {
      return;
      m.a locala = ae.d(this.hxc, this.hsm);
      this.hxc.M(this.eIl, this.hJT.j(locala.aIm, locala.values));
      AppMethodBeat.o(102804);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ae.1
 * JD-Core Version:    0.6.2
 */