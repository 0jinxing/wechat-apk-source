package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.ui.tools.game.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends bc<n>
{
  private void a(JSONObject paramJSONObject, bc.a parama)
  {
    AppMethodBeat.i(6271);
    gw localgw = new gw();
    String str1 = paramJSONObject.optString("task_name");
    String str2 = paramJSONObject.optString("task_url");
    String str3 = paramJSONObject.optString("alternative_url");
    long l = paramJSONObject.optLong("task_size");
    String str4 = paramJSONObject.optString("file_md5");
    String str5 = paramJSONObject.optString("extInfo");
    String str6 = paramJSONObject.optString("fileType");
    String str7 = paramJSONObject.optString("appid");
    String str8 = paramJSONObject.optString("package_name");
    int i = paramJSONObject.optInt("scene", 1000);
    int j = paramJSONObject.optInt("downloader_type", 1);
    localgw.cBC.url = str2;
    localgw.cBC.cvZ = str4;
    localgw.cBC.extInfo = str5;
    localgw.cBC.appId = str7;
    localgw.cBC.scene = i;
    com.tencent.mm.sdk.b.a.xxA.m(localgw);
    paramJSONObject = new e.a();
    paramJSONObject.It(str2);
    paramJSONObject.Iu(str3);
    paramJSONObject.hA(l);
    paramJSONObject.Iv(str1);
    paramJSONObject.Iw(str4);
    paramJSONObject.setAppId(str7);
    paramJSONObject.cY(str8);
    paramJSONObject.ga(true);
    paramJSONObject.tN(bo.getInt(str6, 1));
    paramJSONObject.setScene(i);
    paramJSONObject = paramJSONObject.kNl;
    if (j == 1)
    {
      l = com.tencent.mm.plugin.downloader.model.d.bij().b(paramJSONObject);
      com.tencent.mm.modelstat.d.b(10, "LuggageGameWebViewUI_addDownloadTask", hashCode());
      if (l > 0L)
        break label294;
      parama.d("fail", null);
      AppMethodBeat.o(6271);
    }
    while (true)
    {
      return;
      l = com.tencent.mm.plugin.downloader.model.d.bij().a(paramJSONObject);
      break;
      try
      {
        label294: paramJSONObject = new org/json/JSONObject;
        paramJSONObject.<init>();
        paramJSONObject.put("download_id", l);
        parama.d(null, paramJSONObject);
        AppMethodBeat.o(6271);
      }
      catch (JSONException paramJSONObject)
      {
        parama.d(null, null);
        AppMethodBeat.o(6271);
      }
    }
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6270);
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.optString("task_url");
      l = localJSONObject.optLong("task_size");
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.JsApiAddDownloadTaskStraight", "url is null");
        parama.d("fail", null);
        AppMethodBeat.o(6270);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        JSONObject localJSONObject;
        long l;
        ab.e("MicroMsg.JsApiAddDownloadTaskStraight", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6270);
        continue;
        paramString = localJSONObject.optString("appid");
        int i = localJSONObject.optInt("scene", 1000);
        b.eBF.a(paramString, i, 9, -1L, "", null);
        if (localJSONObject.optBoolean("use_downloader_widget", false))
        {
          i.a(paramContext, com.tencent.mm.plugin.downloader_app.b.a.R(localJSONObject), new a.6(this, parama));
          com.tencent.mm.modelstat.d.b(10, "LuggageGameWebViewUI_addDownloadTask", hashCode());
          AppMethodBeat.o(6270);
        }
        else if (!at.isNetworkConnected(paramContext))
        {
          parama.d("fail_network_not_connected", null);
          c.runOnUiThread(new a.1(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, network not ready");
          AppMethodBeat.o(6270);
        }
        else if (!f.Mn())
        {
          parama.d("sdcard_not_ready", null);
          c.runOnUiThread(new a.2(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, sdcard not ready");
          AppMethodBeat.o(6270);
        }
        else if ((l > 0L) && (!f.eW(l)))
        {
          parama.d("has_not_enough_space", null);
          c.runOnUiThread(new a.3(this, paramContext));
          ab.i("MicroMsg.JsApiAddDownloadTaskStraight", "fail, not enough space, require size = ".concat(String.valueOf(l)));
          AppMethodBeat.o(6270);
        }
        else if (at.isWifi(paramContext))
        {
          a(localJSONObject, parama);
          AppMethodBeat.o(6270);
        }
        else
        {
          h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new a.4(this, paramContext, localJSONObject, parama), new a.5(this, parama), 2131690683);
          AppMethodBeat.o(6270);
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
    return "addDownloadTaskStraight";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.a
 * JD-Core Version:    0.6.2
 */