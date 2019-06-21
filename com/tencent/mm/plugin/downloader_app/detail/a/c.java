package com.tencent.mm.plugin.downloader_app.detail.a;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.h.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(136071);
    ab.i("MicroMsg.JsApiLaunchApplication", "invokeInMM");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject;
      if (paramString == null)
      {
        ab.e("MicroMsg.JsApiLaunchApplication", "data is null");
        parama.d("fail", null);
        AppMethodBeat.o(136071);
        return;
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiLaunchApplication", "paras data error: " + paramString.getMessage());
        paramString = null;
        continue;
        paramString = paramString.optString("appID");
        if (bo.isNullOrNil(paramString))
        {
          ab.e("MicroMsg.JsApiLaunchApplication", "appid is null or nil");
          parama.d("fail", null);
          AppMethodBeat.o(136071);
        }
        else
        {
          a.a(paramContext, paramString, new c.1(this, parama));
          AppMethodBeat.o(136071);
        }
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
    return "launchApplication";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.c
 * JD-Core Version:    0.6.2
 */