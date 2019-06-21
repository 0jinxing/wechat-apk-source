package com.tencent.mm.plugin.webview.luggage.ipc;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;

public class d
  implements c
{
  public final void a(Context paramContext, Bundle paramBundle, a parama)
  {
    AppMethodBeat.i(6254);
    Object localObject = paramBundle.getString("jsapi_name");
    paramBundle = paramBundle.getString("data");
    if (localObject == null)
    {
      ab.e("MicroMsg.JsApiMMActivityTask", "jsapi is null");
      parama.l(new Bundle());
      AppMethodBeat.o(6254);
    }
    while (true)
    {
      return;
      try
      {
        bc localbc = (bc)Class.forName((String)localObject).newInstance();
        localObject = new com/tencent/mm/plugin/webview/luggage/ipc/d$1;
        ((d.1)localObject).<init>(this, parama);
        localbc.a(paramContext, paramBundle, (bc.a)localObject);
        AppMethodBeat.o(6254);
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.JsApiMMActivityTask", paramContext, "", new Object[0]);
        parama.l(new Bundle());
        AppMethodBeat.o(6254);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.d
 * JD-Core Version:    0.6.2
 */