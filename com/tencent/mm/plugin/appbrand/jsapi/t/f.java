package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.page.w;
import org.json.JSONObject;

public final class f extends a<w>
{
  public static final int CTRL_INDEX = 298;
  public static final String NAME = "insertHTMLWebView";

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131673);
    int i = paramJSONObject.getInt("htmlId");
    AppMethodBeat.o(131673);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.f
 * JD-Core Version:    0.6.2
 */