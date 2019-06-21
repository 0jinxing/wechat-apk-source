package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.z.b.b.a;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  private static String hmI = "com.tencent.mm:tools";

  public a()
  {
    super("authorize", 419);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10827);
    parama = parama.Qy();
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putString("scope", paramJSONObject.getString("scope"));
      localBundle.putString("appId", parama.getString("__page_app_id", ""));
      localBundle.putString("widgetId", parama.getString("__page_view_id", ""));
      XIPCInvoker.a(parama.getString("__process_name", hmI), localBundle, a.b.class, new a.1(this, parama1));
      AppMethodBeat.o(10827);
      return;
    }
    catch (Exception parama)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiFunc_DoAuthroize", "JSON Exception[%s]", new Object[] { parama.getMessage() });
        AppMethodBeat.o(10827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a
 * JD-Core Version:    0.6.2
 */