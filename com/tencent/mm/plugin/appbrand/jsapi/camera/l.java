package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class l extends a
{
  private static final int CTRL_INDEX = 332;
  public static final String NAME = "operateCamera";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126252);
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null or nil", null));
      AppMethodBeat.o(126252);
    }
    while (true)
    {
      return;
      al.d(new l.1(this, paramJSONObject, paramc, paramInt));
      AppMethodBeat.o(126252);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.l
 * JD-Core Version:    0.6.2
 */