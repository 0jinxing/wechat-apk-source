package com.tencent.mm.plugin.appbrand.jsapi.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class d extends a<com.tencent.mm.plugin.appbrand.jsapi.c>
{
  private static final int CTRL_INDEX = 470;
  private static final String NAME = "showStatusBar";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(74812);
    if ((paramc instanceof q));
    for (paramJSONObject = ((q)paramc).getCurrentPageView(); ; paramJSONObject = (u)paramc)
    {
      a(paramJSONObject.isT, paramc, paramInt);
      AppMethodBeat.o(74812);
      return;
    }
  }

  final void a(com.tencent.mm.plugin.appbrand.page.b.c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt)
  {
    AppMethodBeat.i(74813);
    if (!al.isMainThread())
    {
      al.d(new d.1(this, paramc, paramc1, paramInt));
      AppMethodBeat.o(74813);
    }
    while (true)
    {
      return;
      paramc.aBr();
      paramc1.M(paramInt, j("ok", null));
      AppMethodBeat.o(74813);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.d
 * JD-Core Version:    0.6.2
 */