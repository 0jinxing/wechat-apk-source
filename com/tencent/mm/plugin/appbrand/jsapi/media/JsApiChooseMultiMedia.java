package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s.b.a.b;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseMultiMedia extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 549;
  public static final String NAME = "chooseMultiMedia";
  public static final String hPC;
  double hPD;
  double hPE;
  double hPF;
  double hPG;

  static
  {
    AppMethodBeat.i(131268);
    hPC = ah.getResources().getString(2131297129);
    AppMethodBeat.o(131268);
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131266);
    if (com.tencent.mm.plugin.appbrand.n.xa(paramc.getAppId()).gPk)
    {
      paramc.M(paramInt, j("cancel", null));
      AppMethodBeat.o(131266);
    }
    while (true)
    {
      return;
      Context localContext = paramc.getContext();
      if ((localContext == null) || (!(localContext instanceof Activity)))
      {
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(131266);
      }
      else if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "chooseMedia fail, data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(131266);
      }
      else
      {
        int i = paramJSONObject.optInt("maxDuration", 10);
        ab.i("MicroMsg.JsApiChooseMultiMedia", "videoMaxDuration: %d.", new Object[] { Integer.valueOf(i) });
        if ((i <= 0) || (i > 30))
        {
          ab.e("MicroMsg.JsApiChooseMultiMedia", "chooseMedia fail, invalid maxDuration parameter");
          paramc.M(paramInt, j("fail:invalid maxDuration parameter", null));
          AppMethodBeat.o(131266);
        }
        else
        {
          localContext.getSharedPreferences(ah.doA() + "_locCache", 0).edit().putString("locStr", null).apply();
          Object localObject1 = new JsApiChooseMultiMedia.1(this, localContext);
          ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).b("wgs84", (a.b)localObject1, null);
          int j = paramJSONObject.optInt("count", 9);
          double d1 = paramJSONObject.optJSONObject("location").optDouble("longitude", 91.0D);
          double d2 = paramJSONObject.optJSONObject("location").optDouble("latitude", 181.0D);
          localObject1 = paramJSONObject.optString("poiName", hPC);
          double d3 = paramJSONObject.optDouble("locationRadius", 50.0D);
          Object localObject2 = paramJSONObject.optJSONArray("sourceType");
          boolean bool1;
          boolean bool2;
          label361: int k;
          if ((localObject2 == null) || (((JSONArray)localObject2).length() == 0))
          {
            bool1 = true;
            bool2 = true;
            if (!bool2)
              break label508;
            com.tencent.mm.plugin.appbrand.permission.n.b(paramc.getAppId(), new JsApiChooseMultiMedia.4(this, paramc, paramJSONObject, paramInt));
            paramJSONObject = paramc.getContext();
            if ((paramJSONObject != null) && ((paramJSONObject instanceof Activity)))
              break label463;
            paramc.M(paramInt, j("fail", null));
            k = 0;
          }
          while (true)
          {
            if (k != 0)
              break label508;
            AppMethodBeat.o(131266);
            break;
            bool2 = ((JSONArray)localObject2).toString().contains("camera");
            bool1 = ((JSONArray)localObject2).toString().contains("album");
            break label361;
            label463: boolean bool3 = b.a((Activity)paramJSONObject, "android.permission.CAMERA", 113, "", "");
            k = bool3;
            if (bool3)
            {
              com.tencent.mm.plugin.appbrand.permission.n.Dr(paramc.getAppId());
              k = bool3;
            }
          }
          label508: com.tencent.mm.plugin.appbrand.n.xb(paramc.getAppId()).gPk = true;
          g.a(paramc.getAppId(), new JsApiChooseMultiMedia.2(this, paramc));
          localObject2 = new JsApiChooseMultiMedia.ChooseRequest();
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).appId = paramc.getAppId();
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).count = j;
          paramJSONObject = a.a.f(d1, d2);
          this.hPE = d1;
          this.hPD = d2;
          this.hPG = paramJSONObject[0];
          this.hPF = paramJSONObject[1];
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).longitude = this.hPG;
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).latitude = this.hPF;
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).eUu = ((String)localObject1);
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).fNN = d3;
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).hOS = bool2;
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).hOT = bool1;
          ((JsApiChooseMultiMedia.ChooseRequest)localObject2).gLP = i;
          com.tencent.mm.plugin.appbrand.ipc.a.a(localContext, (AppBrandProxyUIProcessTask.ProcessRequest)localObject2, new JsApiChooseMultiMedia.3(this, paramc, paramInt));
          AppMethodBeat.o(131266);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia
 * JD-Core Version:    0.6.2
 */