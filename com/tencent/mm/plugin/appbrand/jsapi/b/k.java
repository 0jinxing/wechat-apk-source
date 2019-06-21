package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import org.json.JSONObject;

public final class k extends c
{
  public static final int CTRL_INDEX = 83;
  public static final String NAME = "updateCanvas";

  public final boolean aCF()
  {
    return true;
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103857);
    int i = paramJSONObject.optInt("canvasId");
    AppMethodBeat.o(103857);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.k
 * JD-Core Version:    0.6.2
 */