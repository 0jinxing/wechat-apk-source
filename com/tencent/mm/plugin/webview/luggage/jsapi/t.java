package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public class t extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6315);
    ab.i("MicroMsg.JsApiHideMenuItems", "invokeInOwn");
    JSONArray localJSONArray = parama.bPa.bOf.optJSONArray("menuList");
    if (localJSONArray == null)
    {
      ab.i("MicroMsg.JsApiHideMenuItems", "data is null");
      parama.a("invalid_data", null);
      AppMethodBeat.o(6315);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.luggage.k localk = ((d)parama.bOZ).cWH();
      if (localk != null)
        localk.H(localJSONArray);
      parama.a("", null);
      AppMethodBeat.o(6315);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "hideMenuItems";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.t
 * JD-Core Version:    0.6.2
 */