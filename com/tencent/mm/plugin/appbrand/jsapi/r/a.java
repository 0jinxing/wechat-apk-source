package com.tencent.mm.plugin.appbrand.jsapi.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 471;
  private static final String NAME = "hideStatusBar";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(74804);
    if ((paramc instanceof q));
    for (paramJSONObject = ((q)paramc).getCurrentPageView(); ; paramJSONObject = (u)paramc)
    {
      a(paramJSONObject.isT, paramc, paramInt);
      AppMethodBeat.o(74804);
      return;
    }
  }

  final void a(com.tencent.mm.plugin.appbrand.page.b.c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt)
  {
    AppMethodBeat.i(74805);
    if (!al.isMainThread())
    {
      al.d(new a.1(this, paramc, paramc1, paramInt));
      AppMethodBeat.o(74805);
    }
    while (true)
    {
      return;
      paramc.aBs();
      paramc1.M(paramInt, j("ok", null));
      AppMethodBeat.o(74805);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.a
 * JD-Core Version:    0.6.2
 */