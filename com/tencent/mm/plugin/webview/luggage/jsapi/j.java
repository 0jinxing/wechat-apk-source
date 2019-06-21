package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;

public class j extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6304);
    ab.i("MicroMsg.JsApiClearBounceBackground", "invokeInOwn");
    ((d)parama.bOZ).cWI();
    parama.a("", null);
    AppMethodBeat.o(6304);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "clearBounceBackground";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.j
 * JD-Core Version:    0.6.2
 */