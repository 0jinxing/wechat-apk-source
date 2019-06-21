package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public class m extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6307);
    ab.i("MicroMsg.JsApiDisableBounceScroll", "invoke");
    JSONArray localJSONArray = parama.bPa.bOf.optJSONArray("place");
    if (localJSONArray == null)
    {
      ab.i("MicroMsg.JsApiDisableBounceScroll", "placeArray is null");
      parama.a("fail", null);
      AppMethodBeat.o(6307);
      return;
    }
    int i = 0;
    int j = 0;
    label56: if (i < localJSONArray.length())
    {
      if (!"top".equalsIgnoreCase(localJSONArray.optString(i)))
        break label133;
      j = 1;
    }
    label133: 
    while (true)
    {
      i++;
      break label56;
      if (j == 0)
      {
        parama.a("", null);
        AppMethodBeat.o(6307);
        break;
      }
      ((d)parama.bOZ).cWJ();
      parama.a("", null);
      AppMethodBeat.o(6307);
      break;
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "disableBounceScroll";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.m
 * JD-Core Version:    0.6.2
 */