package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.webview.luggage.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class e extends bc<n>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6284);
    ab.i("MicroMsg.JsApiCancelDownloadTask", "invokeInMM");
    paramContext = b.AI(paramString);
    if (paramContext == null)
    {
      parama.d("fail", null);
      AppMethodBeat.o(6284);
    }
    while (true)
    {
      return;
      long l = paramContext.optLong("download_id");
      if (l <= 0L)
      {
        ab.e("MicroMsg.JsApiCancelDownloadTask", "fail, invalid downloadId = ".concat(String.valueOf(l)));
        parama.d("invalid_downloadid", null);
        AppMethodBeat.o(6284);
      }
      else if (d.bij().hl(l) > 0)
      {
        parama.d(null, null);
        AppMethodBeat.o(6284);
      }
      else
      {
        parama.d("fail", null);
        AppMethodBeat.o(6284);
      }
    }
  }

  public final void b(a<n>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "cancelDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.e
 * JD-Core Version:    0.6.2
 */