package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.g.d.b;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue$execute$task$1", "Lcom/tencent/mm/sdk/thread/runnable/KeyRunnable;", "getKey", "", "run", "", "plugin-appbrand-integration_release"})
public final class a$c
  implements b
{
  a$c(h paramh, f paramf, JSONObject paramJSONObject, int paramInt, String paramString)
  {
  }

  public final String getKey()
  {
    return this.hBF;
  }

  public final void run()
  {
    AppMethodBeat.i(134649);
    if (this.hBB.isRunning())
    {
      this.hBC.a(this.hBB, this.hBD, this.hBE, (d)new a.c.a(this));
      AppMethodBeat.o(134649);
    }
    while (true)
    {
      return;
      a.a(this.hBA);
      AppMethodBeat.o(134649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a.c
 * JD-Core Version:    0.6.2
 */