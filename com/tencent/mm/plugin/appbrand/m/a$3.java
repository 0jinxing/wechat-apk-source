package com.tencent.mm.plugin.appbrand.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.m.b.b.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class a$3
  implements b.a
{
  public final void a(i parami, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(132324);
    try
    {
      paramJSONObject.put("notSupport", a.aIR().contains(ag.ck(parami.mAppId)));
      paramJSONObject.put("switchWebsocket", ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIW, 0));
      paramJSONObject.put("switchFs", ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIX, 0));
      AppMethodBeat.o(132324);
      return;
    }
    catch (JSONException parami)
    {
      while (true)
        AppMethodBeat.o(132324);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.a.3
 * JD-Core Version:    0.6.2
 */