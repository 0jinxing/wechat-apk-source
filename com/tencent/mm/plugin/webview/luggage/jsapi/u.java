package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.k;
import com.tencent.mm.sdk.platformtools.ab;

public class u extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6316);
    ab.i("MicroMsg.JsApiHideOptionMenu", "invoke");
    k localk = ((d)parama.bOZ).cWH();
    if (localk == null)
    {
      ab.e("MicroMsg.JsApiHideOptionMenu", "actionBar is null");
      parama.a("fail", null);
      AppMethodBeat.o(6316);
    }
    while (true)
    {
      return;
      localk.cXc();
      parama.a("", null);
      AppMethodBeat.o(6316);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "hideOptionMenu";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.u
 * JD-Core Version:    0.6.2
 */