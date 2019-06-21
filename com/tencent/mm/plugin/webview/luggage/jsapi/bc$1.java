package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.ipc.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class bc$1
  implements a
{
  bc$1(bc parambc, a.a parama)
  {
  }

  public final void l(Bundle paramBundle)
  {
    AppMethodBeat.i(6389);
    Object localObject = paramBundle.getString("err_msg");
    paramBundle = paramBundle.getString("data");
    if (!bo.isNullOrNil((String)localObject))
    {
      this.mUf.a((String)localObject, null);
      AppMethodBeat.o(6389);
    }
    while (true)
    {
      return;
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramBundle);
        this.mUf.a("", (JSONObject)localObject);
        AppMethodBeat.o(6389);
      }
      catch (Exception paramBundle)
      {
        this.mUf.a("", null);
        AppMethodBeat.o(6389);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.bc.1
 * JD-Core Version:    0.6.2
 */