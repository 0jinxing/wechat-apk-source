package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

final class b$1
  implements Runnable
{
  b$1(b paramb, c paramc, JSONObject paramJSONObject, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108019);
    this.hRq.a(this.hyd, this.hsm, this.hvm);
    AppMethodBeat.o(108019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.b.1
 * JD-Core Version:    0.6.2
 */