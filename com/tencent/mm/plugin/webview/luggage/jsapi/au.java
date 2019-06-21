package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class au extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6375);
    ab.i("MicroMsg.JsApiSetPageTitle", "invokeInOwn");
    String str = parama.bPa.bOf.optString("title");
    if (!bo.isNullOrNil(parama.bPa.bOf.optString("color")))
    {
      int i = g.bx(parama.bPa.bOf.optString("color"), ((d)parama.bOZ).mContext.getResources().getColor(2131689640));
      ((d)parama.bOZ).cl(str, i);
    }
    while (true)
    {
      parama.a("", null);
      AppMethodBeat.o(6375);
      return;
      ((d)parama.bOZ).cl(str, 0);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "setPageTitle";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.au
 * JD-Core Version:    0.6.2
 */