package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class j extends bc<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135878);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = (String)localObject;
      if (paramString != null)
      {
        paramString = paramString.optString("appId");
        localObject = new Intent();
        ((Intent)localObject).putExtra("appId", paramString);
        ((Intent)localObject).putExtra("view_task", true);
        ((d)g.K(d.class)).a(paramContext, (Intent)localObject, new j.1(this, parama));
        AppMethodBeat.o(135878);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.JsApiJumpDownloaderWidget", paramString, "", new Object[0]);
        paramString = null;
        continue;
        paramString = "";
      }
    }
  }

  public final void b(a<e>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "jumpDownloaderWidget";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.j
 * JD-Core Version:    0.6.2
 */