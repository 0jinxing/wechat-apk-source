package com.tencent.mm.plugin.downloader_app.detail.a;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(136080);
    ab.i("MicroMsg.JsApiResumeDownloadTask", "invokeInMM");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      l = localJSONObject.optLong("download_id");
      if (l <= 0L)
      {
        ab.e("MicroMsg.JsApiResumeDownloadTask", "fail, invalid downloadId = ".concat(String.valueOf(l)));
        parama.d("invalid_downloadid", null);
        AppMethodBeat.o(136080);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        long l;
        ab.e("MicroMsg.JsApiResumeDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(136080);
        continue;
        paramString = com.tencent.mm.plugin.downloader.model.c.hv(l);
        if (paramString != null)
          b.eBF.a(paramString.field_appId, paramString.field_scene, 10, paramString.field_startSize, paramString.field_downloadedSize - paramString.field_startSize, paramString.field_totalSize, paramString.field_downloadUrl, paramString.field_errCode, paramString.field_downloaderType, paramString.field_channelId, (System.currentTimeMillis() - paramString.field_startTime) / 1000L, paramString.field_startState, paramString.field_downloadId, paramString.field_extInfo, 0);
        com.tencent.mm.plugin.downloader_app.b.c.a(paramContext, paramString, null, new g.1(this, parama));
        AppMethodBeat.o(136080);
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
    return "resumeDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.g
 * JD-Core Version:    0.6.2
 */