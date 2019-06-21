package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.d;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class v extends c
{
  public static final int CTRL_INDEX = 4;
  public static final String NAME = "updateMap";

  public final boolean c(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93881);
    com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(3);
    boolean bool;
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiUpdateMap", "data is null");
      bool = false;
      AppMethodBeat.o(93881);
    }
    while (true)
    {
      return bool;
      paramView = parame.getAppId();
      ab.i("MicroMsg.JsApiUpdateMap", "updateView appId:%s viewId:%d data:%s", new Object[] { paramView, Integer.valueOf(paramInt), paramJSONObject });
      com.tencent.mm.plugin.appbrand.jsapi.g.a.b localb = g.cj(paramView, f.g(parame, paramJSONObject));
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiUpdateMap", "mapView is null, return");
        bool = false;
        AppMethodBeat.o(93881);
      }
      else
      {
        if (paramJSONObject.has("scale"))
          localb.al((float)paramJSONObject.optDouble("scale", 16.0D));
        if (paramJSONObject.has("rotate"))
          localb.am((float)paramJSONObject.optDouble("rotate", 0.0D));
        if (paramJSONObject.has("skew"))
          localb.an((float)paramJSONObject.optDouble("skew", 0.0D));
        float f1;
        float f2;
        if ((paramJSONObject.has("centerLatitude")) && (paramJSONObject.has("centerLongitude")))
        {
          f1 = bo.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
          f2 = bo.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
          if ((Math.abs(f1) <= 90.0F) && (Math.abs(f2) <= 180.0F))
            localb.I(f1, f2);
        }
        if (paramJSONObject.has("enableZoom"))
          localb.ed(paramJSONObject.optBoolean("enableZoom", true));
        if (paramJSONObject.has("enableScroll"))
          localb.ee(paramJSONObject.optBoolean("enableScroll", true));
        if (paramJSONObject.has("enableRotate"))
          localb.ef(paramJSONObject.optBoolean("enableRotate", true));
        if (paramJSONObject.has("showCompass"))
          localb.eg(paramJSONObject.optBoolean("showCompass", false));
        if (paramJSONObject.has("enable3D"))
          localb.eh(paramJSONObject.optBoolean("enable3D", false));
        if (paramJSONObject.has("enableOverlooking"))
          localb.ei(paramJSONObject.optBoolean("enableOverlooking", false));
        if (paramJSONObject.has("enableSatellite"))
          localb.ej(paramJSONObject.optBoolean("enableSatellite", false));
        if (paramJSONObject.has("enableTraffic"))
          localb.ek(paramJSONObject.optBoolean("enableTraffic", false));
        if (paramJSONObject.has("enableIndoor"))
          localb.el(paramJSONObject.optBoolean("enableIndoor", false));
        if (paramJSONObject.has("enableIndoorLevelPick"))
          localb.em(paramJSONObject.optBoolean("enableIndoorLevelPick", false));
        if (paramJSONObject.has("showLocation"))
          localb.en(paramJSONObject.optBoolean("showLocation", false));
        try
        {
          if (!paramJSONObject.has("covers"))
            break label739;
          localb.aEa();
          paramView = new org/json/JSONArray;
          paramView.<init>(paramJSONObject.optString("covers"));
          for (paramInt = 0; paramInt < paramView.length(); paramInt++)
          {
            Object localObject = (JSONObject)paramView.get(paramInt);
            float f3 = bo.getFloat(((JSONObject)localObject).optString("latitude"), 0.0F);
            f2 = bo.getFloat(((JSONObject)localObject).optString("longitude"), 0.0F);
            paramJSONObject = ((com.tencent.mm.plugin.appbrand.d.b)parame.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(parame, ((JSONObject)localObject).optString("iconPath"));
            f1 = (float)((JSONObject)localObject).optDouble("rotate", 0.0D);
            localObject = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$d;
            ((b.d)localObject).<init>();
            ((b.d)localObject).g(f3, f2);
            ((b.d)localObject).hNN = paramJSONObject;
            ((b.d)localObject).rotate = f1;
            localb.a((b.d)localObject, (a)parame.B(a.class));
          }
        }
        catch (Exception parame)
        {
          ab.e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", new Object[] { parame });
          bool = false;
          AppMethodBeat.o(93881);
        }
        continue;
        label739: com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(4);
        bool = true;
        AppMethodBeat.o(93881);
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93880);
    try
    {
      i = paramJSONObject.optInt("mapId");
      AppMethodBeat.o(93880);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
        int i = -1;
        AppMethodBeat.o(93880);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.v
 * JD-Core Version:    0.6.2
 */