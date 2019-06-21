package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import org.json.JSONObject;

public final class i extends b<e>
{
  public static final int CTRL_INDEX = 68;
  public static final String NAME = "removeCanvas";

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103856);
    int i = paramJSONObject.optInt("canvasId");
    AppMethodBeat.o(103856);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.i
 * JD-Core Version:    0.6.2
 */