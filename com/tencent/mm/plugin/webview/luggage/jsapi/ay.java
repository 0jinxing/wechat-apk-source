package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public class ay extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6384);
    ab.i("MicroMsg.JsApiShowMenuItems", "invokeInOwn");
    JSONArray localJSONArray = parama.bPa.bOf.optJSONArray("menuList");
    if (localJSONArray == null)
    {
      ab.i("MicroMsg.JsApiShowMenuItems", "data is null");
      parama.a("invalid_data", null);
      AppMethodBeat.o(6384);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.luggage.k localk = ((d)parama.bOZ).cWH();
      if (localk != null)
        localk.I(localJSONArray);
      parama.a("", null);
      AppMethodBeat.o(6384);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "showMenuItems";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ay
 * JD-Core Version:    0.6.2
 */