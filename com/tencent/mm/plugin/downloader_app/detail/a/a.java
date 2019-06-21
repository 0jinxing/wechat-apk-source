package com.tencent.mm.plugin.downloader_app.detail.a;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.plugin.downloader_app.b.c;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(136068);
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = ((JSONObject)localObject).optString("task_url");
      l = ((JSONObject)localObject).optLong("task_size");
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.JsApiAddDownloadTaskStraight", "url is null");
        parama.d("fail", null);
        AppMethodBeat.o(136068);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        Object localObject;
        long l;
        ab.e("MicroMsg.JsApiAddDownloadTaskStraight", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(136068);
        continue;
        paramString = ((JSONObject)localObject).optString("appid");
        b.eBF.a(paramString, 10000, 9, -1L, "", null);
        if (!at.isNetworkConnected(paramContext))
        {
          parama.d("fail_network_not_connected", null);
          com.tencent.mm.ce.a.q(new a.1(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, network not ready");
          AppMethodBeat.o(136068);
        }
        else if (!f.Mn())
        {
          parama.d("sdcard_not_ready", null);
          com.tencent.mm.ce.a.q(new a.2(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, sdcard not ready");
          AppMethodBeat.o(136068);
        }
        else if ((l > 0L) && (!f.eW(l)))
        {
          parama.d("has_not_enough_space", null);
          com.tencent.mm.ce.a.q(new a.3(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", "fail, not enough space, require size = ".concat(String.valueOf(l)));
          AppMethodBeat.o(136068);
        }
        else
        {
          String str1 = ((JSONObject)localObject).optString("task_name");
          String str2 = ((JSONObject)localObject).optString("task_url");
          paramString = ((JSONObject)localObject).optString("alternative_url");
          l = ((JSONObject)localObject).optLong("task_size");
          String str3 = ((JSONObject)localObject).optString("file_md5");
          String str4 = ((JSONObject)localObject).optString("extInfo");
          String str5 = ((JSONObject)localObject).optString("appid");
          String str6 = ((JSONObject)localObject).optString("package_name");
          int i = ((JSONObject)localObject).optInt("downloader_type", 1);
          localObject = new com.tencent.mm.plugin.downloader_app.b.a();
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).appName = str1;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).downloadUrl = str2;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).kOB = paramString;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).kOC = l;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).kOD = str3;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).extInfo = str4;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).appId = str5;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).packageName = str6;
          ((com.tencent.mm.plugin.downloader_app.b.a)localObject).cBA = i;
          c.a(paramContext, (com.tencent.mm.plugin.downloader_app.b.a)localObject, new a.4(this, parama));
          AppMethodBeat.o(136068);
        }
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "addDownloadTaskStraight";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.a
 * JD-Core Version:    0.6.2
 */