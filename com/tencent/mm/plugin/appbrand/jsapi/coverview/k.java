package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.s.b;
import com.tencent.mm.plugin.appbrand.widget.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class k extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateTextView";

  public final boolean c(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126320);
    ab.d("MicroMsg.JsApiUpdateTextView", "onUpdateView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiUpdateTextView", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126320);
      bool = false;
    }
    while (true)
    {
      return bool;
      d locald = (d)((CoverViewContainer)paramView).ah(d.class);
      if (locald == null)
        ab.w("MicroMsg.JsApiUpdateTextView", "the target view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      b.a(locald, paramJSONObject.optJSONObject("label"));
      com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
      bool = super.c(parame, paramInt, paramView, paramJSONObject);
      AppMethodBeat.o(126320);
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126319);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126319);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.k
 * JD-Core Version:    0.6.2
 */