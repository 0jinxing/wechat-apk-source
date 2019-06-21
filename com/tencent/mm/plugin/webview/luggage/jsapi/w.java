package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public class w extends bc<n>
{
  public final void a(Context paramContext, String paramString, final bc.a parama)
  {
    AppMethodBeat.i(6319);
    ab.i("MicroMsg.JsApiInstallDownloadTask", "invokeInOwn");
    try
    {
      paramContext = new org/json/JSONObject;
      paramContext.<init>(paramString);
      l = paramContext.optLong("download_id");
      if (l <= 0L)
      {
        ab.i("MicroMsg.JsApiInstallDownloadTask", "data is null");
        parama.d("fail_invalid_data", null);
        AppMethodBeat.o(6319);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        long l;
        ab.e("MicroMsg.JsApiInstallDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6319);
        continue;
        paramContext = d.bij().hm(l);
        if (paramContext.status == -1)
        {
          ab.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
          parama.d("fail", null);
          AppMethodBeat.o(6319);
        }
        else if (paramContext.status != 3)
        {
          ab.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + paramContext.status);
          parama.d("fail", null);
          AppMethodBeat.o(6319);
        }
        else
        {
          com.tencent.mm.plugin.downloader.h.a.a(paramContext.id, false, new com.tencent.mm.pluginsdk.permission.a()
          {
            public final void dT(boolean paramAnonymousBoolean)
            {
              AppMethodBeat.i(6318);
              if (paramAnonymousBoolean)
              {
                parama.d(null, null);
                AppMethodBeat.o(6318);
              }
              while (true)
              {
                return;
                parama.d("fail", null);
                AppMethodBeat.o(6318);
              }
            }
          });
          AppMethodBeat.o(6319);
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
    return "installDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.w
 * JD-Core Version:    0.6.2
 */