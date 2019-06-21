package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public class ba extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(com.tencent.luggage.d.a<d>.a parama)
  {
    AppMethodBeat.i(6386);
    ab.i("MicroMsg.JsApiShowSmileyPanel", "invokeInOwn");
    int i = ((d)parama.bOZ).cWF();
    if (i > 0)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("height", Integer.valueOf(com.tencent.mm.bz.a.ao(((d)parama.bOZ).mContext, i)));
      parama.c("", localHashMap);
      AppMethodBeat.o(6386);
    }
    while (true)
    {
      return;
      parama.a("fail", null);
      AppMethodBeat.o(6386);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "showSmileyPanel";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ba
 * JD-Core Version:    0.6.2
 */