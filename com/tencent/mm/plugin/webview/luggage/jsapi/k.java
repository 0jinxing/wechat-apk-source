package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;

public class k extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6305);
    ab.i("MicroMsg.JsApiCloseWindow", "invokeInOwn");
    ((d)parama.bOZ).finish();
    parama.a("", null);
    AppMethodBeat.o(6305);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "closeWindow";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.k
 * JD-Core Version:    0.6.2
 */