package com.tencent.mm.plugin.appbrand.jsapi.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import org.json.JSONObject;

public final class c extends a
{
  private static final int CTRL_INDEX = 241;
  private static final String NAME = "setTopBarText";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131485);
    paramJSONObject = paramJSONObject.optString("text");
    AppBrandStickyBannerLogic.a.cQ(paramc.getAppId(), paramJSONObject);
    paramc.M(paramInt, j("ok", null));
    g.a(paramc.getAppId(), new c.1(this, paramc));
    AppMethodBeat.o(131485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.c
 * JD-Core Version:    0.6.2
 */