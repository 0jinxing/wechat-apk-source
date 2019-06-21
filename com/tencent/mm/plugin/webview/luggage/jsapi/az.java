package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.k;
import com.tencent.mm.sdk.platformtools.ab;

public class az extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6385);
    ab.i("MicroMsg.JsApiShowOptionMenu", "invoke");
    k localk = ((d)parama.bOZ).cWH();
    if (localk == null)
    {
      ab.i("MicroMsg.JsApiShowOptionMenu", "actionBar is null");
      AppMethodBeat.o(6385);
    }
    while (true)
    {
      return;
      localk.cXd();
      parama.a("", null);
      AppMethodBeat.o(6385);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "showOptionMenu";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.az
 * JD-Core Version:    0.6.2
 */