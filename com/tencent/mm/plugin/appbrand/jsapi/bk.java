package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class bk extends a
{
  public static final int CTRL_INDEX = 65;
  public static final String NAME = "systemLog";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(114331);
    paramJSONObject = paramJSONObject.optString("message");
    ab.i("AppBrandLog." + paramc.getAppId(), paramJSONObject);
    AppMethodBeat.o(114331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bk
 * JD-Core Version:    0.6.2
 */