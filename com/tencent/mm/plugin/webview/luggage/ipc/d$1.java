package com.tencent.mm.plugin.webview.luggage.ipc;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import org.json.JSONObject;

final class d$1 extends bc.a
{
  d$1(d paramd, a parama)
  {
  }

  public final void d(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(6253);
    Bundle localBundle = new Bundle();
    localBundle.putString("err_msg", paramString);
    if (paramJSONObject != null);
    for (paramString = paramJSONObject.toString(); ; paramString = "")
    {
      localBundle.putString("data", paramString);
      this.uiR.l(localBundle);
      AppMethodBeat.o(6253);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.d.1
 * JD-Core Version:    0.6.2
 */