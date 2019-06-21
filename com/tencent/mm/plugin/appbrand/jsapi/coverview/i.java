package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.s.b;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class i extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateImageView";

  public final boolean c(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126315);
    ab.d("MicroMsg.JsApiUpdateImageView", "onUpdateView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiUpdateImageView", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126315);
      bool = false;
    }
    while (true)
    {
      return bool;
      a locala = (a)((CoverViewContainer)paramView).ah(a.class);
      if (locala == null)
      {
        ab.w("MicroMsg.JsApiUpdateImageView", "the target view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(126315);
        bool = false;
      }
      else
      {
        com.tencent.mm.plugin.appbrand.jsapi.s.e.b(paramView, paramJSONObject.optJSONObject("style"));
        b.a(parame, locala, paramJSONObject);
        bool = super.c(parame, paramInt, paramView, paramJSONObject);
        AppMethodBeat.o(126315);
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126314);
    int i = paramJSONObject.getInt("viewId");
    AppMethodBeat.o(126314);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.i
 * JD-Core Version:    0.6.2
 */