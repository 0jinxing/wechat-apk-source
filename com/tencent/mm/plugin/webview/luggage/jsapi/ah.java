package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public class ah extends bc<n>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6343);
    try
    {
      paramContext = new org/json/JSONObject;
      paramContext.<init>(paramString);
      l = paramContext.optLong("download_id");
      if (l <= 0L)
      {
        ab.e("MicroMsg.JsApiPauseDownloadTask", "fail, invalid downloadId = ".concat(String.valueOf(l)));
        parama.d("invalid_downloadid", null);
        AppMethodBeat.o(6343);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        long l;
        ab.e("MicroMsg.JsApiPauseDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6343);
        continue;
        paramContext = c.hv(l);
        if (paramContext == null)
        {
          parama.d(null, null);
          AppMethodBeat.o(6343);
        }
        else
        {
          if (paramContext.field_downloadInWifi)
          {
            paramContext.field_downloadInWifi = false;
            c.e(paramContext);
          }
          if (d.bij().hn(l))
          {
            parama.d(null, null);
            AppMethodBeat.o(6343);
          }
          else
          {
            parama.d("fail", null);
            AppMethodBeat.o(6343);
          }
        }
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<n>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "pauseDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ah
 * JD-Core Version:    0.6.2
 */