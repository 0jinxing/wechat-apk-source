package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.ui.tools.game.i;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135867);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      i.a(paramContext, a.R(localJSONObject), new b.1(this, parama));
      AppMethodBeat.o(135867);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        parama.d("fail", null);
        AppMethodBeat.o(135867);
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "addGameDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.b
 * JD-Core Version:    0.6.2
 */