package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.webview.ui.tools.game.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.base.h;
import org.json.JSONException;
import org.json.JSONObject;

public class ao extends bc<n>
{
  private void a(long paramLong, bc.a parama)
  {
    AppMethodBeat.i(6365);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if ((locala != null) && (locala.field_fromDownloadApp))
    {
      locala.field_fromDownloadApp = false;
      locala.field_showNotification = true;
      c.e(locala);
    }
    if (com.tencent.mm.plugin.downloader.model.d.bij().ho(paramLong))
      parama.d(null, null);
    while (true)
    {
      com.tencent.mm.modelstat.d.b(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
      AppMethodBeat.o(6365);
      return;
      parama.d("fail", null);
    }
  }

  public final void a(Context paramContext, String paramString, final bc.a parama)
  {
    AppMethodBeat.i(6364);
    ab.i("MicroMsg.JsApiResumeDownloadTask", "invokeInMM");
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      l = localJSONObject.optLong("download_id");
      if (l <= 0L)
      {
        ab.e("MicroMsg.JsApiResumeDownloadTask", "fail, invalid downloadId = ".concat(String.valueOf(l)));
        parama.d("invalid_downloadid", null);
        AppMethodBeat.o(6364);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        JSONObject localJSONObject;
        long l;
        ab.e("MicroMsg.JsApiResumeDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6364);
        continue;
        paramString = c.hv(l);
        if (paramString != null)
          b.eBF.a(paramString.field_appId, paramString.field_scene, 10, paramString.field_startSize, paramString.field_downloadedSize - paramString.field_startSize, paramString.field_totalSize, paramString.field_downloadUrl, paramString.field_errCode, paramString.field_downloaderType, paramString.field_channelId, (System.currentTimeMillis() - paramString.field_startTime) / 1000L, paramString.field_startState, paramString.field_downloadId, paramString.field_extInfo, 0);
        boolean bool1 = localJSONObject.optBoolean("use_downloader_widget", false);
        boolean bool2 = localJSONObject.optBoolean("download_in_wifi", false);
        if (bool1)
        {
          i.a(paramContext, l, bool2, new ao.3(this, parama));
          com.tencent.mm.modelstat.d.b(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
          AppMethodBeat.o(6364);
        }
        else if (at.isWifi(paramContext))
        {
          a(l, parama);
          AppMethodBeat.o(6364);
        }
        else
        {
          h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new ao.1(this, localJSONObject, l, parama), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(6362);
              paramAnonymousDialogInterface.dismiss();
              parama.d("fail_network_not_wifi", null);
              AppMethodBeat.o(6362);
            }
          }
          , 2131690683);
          AppMethodBeat.o(6364);
        }
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<n>.a parama)
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
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ao
 * JD-Core Version:    0.6.2
 */