package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class ab extends JsApiUploadWeRunData
{
  public static final int CTRL_INDEX = 324;
  public static final String NAME = "addWeRunData";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130391);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.JsApiAddWeRunData", "JsApiAddWeRunData!");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiAddWeRunData", "data is null");
      AppMethodBeat.o(130391);
    }
    while (true)
    {
      return;
      a(this, paramc, paramInt, paramJSONObject.optInt("step"), true);
      AppMethodBeat.o(130391);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ab
 * JD-Core Version:    0.6.2
 */