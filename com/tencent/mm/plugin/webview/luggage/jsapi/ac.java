package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class ac extends bc<n>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a.a parama)
  {
    AppMethodBeat.i(6331);
    parama = parama.bPa.bOf;
    ab.i("MicroMsg.JsApiLog", "jslog : " + parama.optString("msg"));
    AppMethodBeat.o(6331);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "log";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ac
 * JD-Core Version:    0.6.2
 */