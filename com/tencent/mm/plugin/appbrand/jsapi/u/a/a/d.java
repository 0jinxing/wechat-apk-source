package com.tencent.mm.plugin.appbrand.jsapi.u.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.d;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends a
{
  private static final int CTRL_INDEX = -2;
  public static final String NAME = "updateXWebMap";

  public static boolean h(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(117364);
    boolean bool;
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiUpdateXWebMap", "data is null");
      bool = false;
      AppMethodBeat.o(117364);
    }
    while (true)
    {
      return bool;
      Object localObject1 = paramc.getAppId();
      ab.i("MicroMsg.JsApiUpdateXWebMap", "data:%s", new Object[] { paramJSONObject });
      localObject1 = com.tencent.mm.plugin.appbrand.jsapi.g.a.g.cj((String)localObject1, f.g(paramc, paramJSONObject));
      if (localObject1 == null)
      {
        ab.e("MicroMsg.JsApiUpdateXWebMap", "mapView is null, return");
        bool = false;
        AppMethodBeat.o(117364);
      }
      else
      {
        Object localObject2;
        if (paramJSONObject.has("position"))
        {
          localObject2 = paramJSONObject.optJSONObject("position");
          if ((localObject2 != null) && (((JSONObject)localObject2).has("width")) && (((JSONObject)localObject2).has("height")))
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).onSizeChanged(com.tencent.mm.plugin.appbrand.r.g.a((JSONObject)localObject2, "width", 0), com.tencent.mm.plugin.appbrand.r.g.a((JSONObject)localObject2, "height", 0));
        }
        if (paramJSONObject.has("scale"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).al((float)paramJSONObject.optDouble("scale", 16.0D));
        if (paramJSONObject.has("rotate"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).am((float)paramJSONObject.optDouble("rotate", 0.0D));
        if (paramJSONObject.has("skew"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).an((float)paramJSONObject.optDouble("skew", 0.0D));
        float f1;
        float f2;
        if ((paramJSONObject.has("centerLatitude")) && (paramJSONObject.has("centerLongitude")))
        {
          f1 = bo.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
          f2 = bo.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
          if ((Math.abs(f1) <= 90.0F) && (Math.abs(f2) <= 180.0F))
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).I(f1, f2);
        }
        if (paramJSONObject.has("enableZoom"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ed(paramJSONObject.optBoolean("enableZoom", true));
        if (paramJSONObject.has("enableScroll"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ee(paramJSONObject.optBoolean("enableScroll", true));
        if (paramJSONObject.has("enableRotate"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ef(paramJSONObject.optBoolean("enableRotate", true));
        if (paramJSONObject.has("showCompass"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).eg(paramJSONObject.optBoolean("showCompass", false));
        if (paramJSONObject.has("enable3D"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).eh(paramJSONObject.optBoolean("enable3D", false));
        if (paramJSONObject.has("enableOverlooking"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ei(paramJSONObject.optBoolean("enableOverlooking", false));
        if (paramJSONObject.has("enableSatellite"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ej(paramJSONObject.optBoolean("enableSatellite", false));
        if (paramJSONObject.has("enableTraffic"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).ek(paramJSONObject.optBoolean("enableTraffic", false));
        if (paramJSONObject.has("enableIndoor"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).el(paramJSONObject.optBoolean("enableIndoor", false));
        if (paramJSONObject.has("enableIndoorLevelPick"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).em(paramJSONObject.optBoolean("enableIndoorLevelPick", false));
        if (paramJSONObject.has("showLocation"))
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).en(paramJSONObject.optBoolean("showLocation", false));
        try
        {
          if (!paramJSONObject.has("covers"))
            break label733;
          ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).aEa();
          localObject2 = new org/json/JSONArray;
          ((JSONArray)localObject2).<init>(paramJSONObject.optString("covers"));
          for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
          {
            Object localObject3 = (JSONObject)((JSONArray)localObject2).get(i);
            f1 = bo.getFloat(((JSONObject)localObject3).optString("latitude"), 0.0F);
            float f3 = bo.getFloat(((JSONObject)localObject3).optString("longitude"), 0.0F);
            paramJSONObject = ((com.tencent.mm.plugin.appbrand.d.b)paramc.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(paramc, ((JSONObject)localObject3).optString("iconPath"));
            f2 = (float)((JSONObject)localObject3).optDouble("rotate", 0.0D);
            localObject3 = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$d;
            ((b.d)localObject3).<init>();
            ((b.d)localObject3).g(f1, f3);
            ((b.d)localObject3).hNN = paramJSONObject;
            ((b.d)localObject3).rotate = f2;
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject1).a((b.d)localObject3, (com.tencent.mm.plugin.appbrand.d.a)paramc.B(com.tencent.mm.plugin.appbrand.d.a.class));
          }
        }
        catch (Exception paramc)
        {
          ab.e("MicroMsg.JsApiUpdateXWebMap", "parse covers error, exception : %s", new Object[] { paramc });
          bool = false;
          AppMethodBeat.o(117364);
        }
        continue;
        label733: bool = true;
        AppMethodBeat.o(117364);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.d
 * JD-Core Version:    0.6.2
 */