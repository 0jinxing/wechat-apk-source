package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import org.json.JSONObject;

public final class g extends b
{
  public static final int CTRL_INDEX = 299;
  public static final String NAME = "removeHTMLWebView";

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131676);
    int i = paramJSONObject.getInt("htmlId");
    AppMethodBeat.o(131676);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.g
 * JD-Core Version:    0.6.2
 */