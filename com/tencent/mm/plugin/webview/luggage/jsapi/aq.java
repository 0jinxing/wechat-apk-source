package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class aq extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6371);
    ab.i("MicroMsg.JsApiSetBounceBackground", "invokeInOwn");
    String str = parama.bPa.bOf.optString("backgroundColor");
    if (bo.isNullOrNil(str))
    {
      parama.a("invalid_data", null);
      AppMethodBeat.o(6371);
    }
    while (true)
    {
      return;
      ((d)parama.bOZ).aec(str);
      parama.a("", null);
      AppMethodBeat.o(6371);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "setBounceBackground";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aq
 * JD-Core Version:    0.6.2
 */