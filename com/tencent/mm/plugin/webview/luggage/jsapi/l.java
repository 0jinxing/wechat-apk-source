package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.bag.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class l extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6306);
    JSONObject localJSONObject = parama.bPa.bOf;
    String str = localJSONObject.optString("brandIcon");
    localJSONObject.optString("brandName");
    ab.i("MicroMsg.JsApiCurrentMpInfo", "doCurrentMpInfo brandIcon:%s", new Object[] { str });
    ((d)parama.bOZ).cWP().afX(str);
    parama.a("", null);
    AppMethodBeat.o(6306);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "currentMpInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.l
 * JD-Core Version:    0.6.2
 */