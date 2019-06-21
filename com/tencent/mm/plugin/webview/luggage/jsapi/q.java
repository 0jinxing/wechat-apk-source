package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import java.util.HashMap;
import java.util.Map;

public class q extends bc<n>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<n>.a parama)
  {
    AppMethodBeat.i(6312);
    ab.i("MicroMsg.JsApiGetNetworkType", "invoke");
    if (!at.isConnected(((n)parama.bOZ).mContext))
    {
      ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, not connected");
      parama.a("network_type:fail", null);
      AppMethodBeat.o(6312);
    }
    HashMap localHashMap;
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, type = ".concat(String.valueOf(at.getNetType(((n)parama.bOZ).mContext))));
      localHashMap = new HashMap();
      if (!at.isWifi(((n)parama.bOZ).mContext))
        break;
      ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, wifi");
      parama.a("network_type:wifi", null);
      AppMethodBeat.o(6312);
    }
    if (at.is2G(((n)parama.bOZ).mContext))
    {
      ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 2g");
      localHashMap.put("subtype", "2g");
    }
    while (true)
    {
      parama.c("network_type:wwan", localHashMap);
      AppMethodBeat.o(6312);
      break;
      if (at.is3G(((n)parama.bOZ).mContext))
      {
        ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 3g");
        localHashMap.put("subtype", "3g");
      }
      else if (at.is4G(((n)parama.bOZ).mContext))
      {
        ab.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 4g");
        localHashMap.put("subtype", "4g");
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "getNetworkType";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.q
 * JD-Core Version:    0.6.2
 */