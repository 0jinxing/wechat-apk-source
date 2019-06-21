package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;

public class f extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6285);
    ab.i("MicroMsg.JsApiCheckJsApi", "invoke");
    parama.a("fail", null);
    AppMethodBeat.o(6285);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "checkJsApi";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.f
 * JD-Core Version:    0.6.2
 */