package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.ac;
import org.json.JSONObject;

public final class f extends b
{
  private static final int CTRL_INDEX = 255;
  public static final String NAME = "removeImageView";

  public final boolean b(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126309);
    parame.aBf().pA(paramInt);
    boolean bool = super.b(parame, paramInt, paramView, paramJSONObject);
    AppMethodBeat.o(126309);
    return bool;
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126308);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126308);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.f
 * JD-Core Version:    0.6.2
 */