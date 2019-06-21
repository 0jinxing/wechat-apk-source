package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.r;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.r.a;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.r.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends a
{
  public static final int CTRL_INDEX = 133;
  public static final String NAME = "addMapMarkers";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93842);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiAddMapMarkers", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93842);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiAddMapMarkers", "data:%s", new Object[] { paramJSONObject });
      com.tencent.mm.plugin.appbrand.jsapi.g.a.b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiAddMapMarkers", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93842);
      }
      else
      {
        boolean bool = paramJSONObject.optBoolean("clear", true);
        ab.i("MicroMsg.JsApiAddMapMarkers", "clear:%b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
          localb.aDZ();
        if (paramJSONObject.has("markers"))
        {
          Object localObject1;
          int i;
          try
          {
            localObject1 = new org/json/JSONArray;
            ((JSONArray)localObject1).<init>(paramJSONObject.optString("markers"));
            paramJSONObject = (JSONObject)localObject1;
            if (paramJSONObject == null)
            {
              ab.e("MicroMsg.JsApiAddMapMarkers", "markersArray is null, return");
              paramc.M(paramInt, j("fail:internal error", null));
              AppMethodBeat.o(93842);
            }
          }
          catch (JSONException paramJSONObject)
          {
            while (true)
              paramJSONObject = null;
            i = 0;
          }
          while (true)
            if (i < paramJSONObject.length())
              try
              {
                localObject1 = (JSONObject)paramJSONObject.get(i);
                if (localObject1 != null)
                {
                  localr = new b.r();
                  str1 = ((JSONObject)localObject1).optString("id");
                  float f1 = bo.getFloat(((JSONObject)localObject1).optString("latitude"), 0.0F);
                  float f2 = bo.getFloat(((JSONObject)localObject1).optString("longitude"), 0.0F);
                  double d1 = f1;
                  double d2 = f2;
                  localr.latitude = d1;
                  localr.longitude = d2;
                  localObject3 = ((JSONObject)localObject1).optString("iconPath");
                  f1 = g.a((JSONObject)localObject1, "width", 0.0F);
                  f2 = g.a((JSONObject)localObject1, "height", 0.0F);
                  if ((!bo.isNullOrNil((String)localObject3)) && (paramc.B(com.tencent.mm.plugin.appbrand.d.b.class) != null))
                  {
                    localr.hNN = ((com.tencent.mm.plugin.appbrand.d.b)paramc.B(com.tencent.mm.plugin.appbrand.d.b.class)).b(paramc, (String)localObject3);
                    localr.hOb = f1;
                    localr.hOc = f2;
                  }
                  localr.rotate = ((float)((JSONObject)localObject1).optDouble("rotate", 0.0D));
                  localr.alpha = ((float)((JSONObject)localObject1).optDouble("alpha", 1.0D));
                  localr.data = ((JSONObject)localObject1).optString("data");
                  localr.hOd = ((JSONObject)localObject1).optString("ariaLabel");
                  if (!((JSONObject)localObject1).has("anchor"));
                }
              }
              catch (JSONException localJSONException3)
              {
                try
                {
                  localObject3 = new org/json/JSONObject;
                  ((JSONObject)localObject3).<init>(((JSONObject)localObject1).optString("anchor"));
                  if (localObject3 != null)
                  {
                    localr.K((float)((JSONObject)localObject3).optDouble("x", 0.5D), (float)((JSONObject)localObject3).optDouble("y", 1.0D));
                    localr.zIndex = ((JSONObject)localObject1).optInt("zIndex", 0);
                    str2 = ((JSONObject)localObject1).optString("label");
                    if (bo.isNullOrNil(str2));
                  }
                }
                catch (JSONException localJSONException3)
                {
                  try
                  {
                    localObject3 = new org/json/JSONObject;
                    ((JSONObject)localObject3).<init>(str2);
                    if (localObject3 != null)
                    {
                      str2 = ((JSONObject)localObject3).optString("content");
                      j = g.by(((JSONObject)localObject3).optString("color", "#000000"), Color.parseColor("#000000"));
                      int k = ((JSONObject)localObject3).optInt("fontSize", 12);
                      m = g.a((JSONObject)localObject3, "anchorX", g.a((JSONObject)localObject3, "x", 0));
                      int n = g.a((JSONObject)localObject3, "anchorY", g.a((JSONObject)localObject3, "y", 0));
                      i1 = ((JSONObject)localObject3).optInt("borderRadius", 0);
                      i2 = g.f((JSONObject)localObject3, "borderWidth");
                      i3 = g.Ee(((JSONObject)localObject3).optString("borderColor"));
                      int i4 = g.by(((JSONObject)localObject3).optString("bgColor", ""), Color.parseColor("#000000"));
                      int i5 = g.a((JSONObject)localObject3, "padding", 0);
                      localr.hOf = new b.r.b(str2, j, k, m, n, i4, i1, i2, i3, ((JSONObject)localObject3).optString("textAlign", ""), i5);
                    }
                    str2 = ((JSONObject)localObject1).optString("callout");
                    if (bo.isNullOrNil(str2));
                  }
                  catch (JSONException localJSONException3)
                  {
                    try
                    {
                      while (true)
                      {
                        b.r localr;
                        String str1;
                        String str2;
                        int j;
                        int m;
                        int i1;
                        int i2;
                        int i3;
                        Object localObject3 = new org/json/JSONObject;
                        ((JSONObject)localObject3).<init>(str2);
                        if (localObject3 != null)
                        {
                          str2 = ((JSONObject)localObject3).optString("content");
                          i1 = g.by(((JSONObject)localObject3).optString("color", "#000000"), Color.parseColor("#000000"));
                          m = ((JSONObject)localObject3).optInt("fontSize", 12);
                          j = ((JSONObject)localObject3).optInt("borderRadius", 0);
                          i3 = g.f((JSONObject)localObject3, "borderWidth");
                          i2 = g.Ee(((JSONObject)localObject3).optString("borderColor"));
                          localr.hOe = new b.r.a(str2, i1, m, j, g.by(((JSONObject)localObject3).optString("bgColor", "#000000"), Color.parseColor("#000000")), i3, i2, g.a((JSONObject)localObject3, "padding", 0), g.by(((JSONObject)localObject3).optString("shadowColor", "#000000"), Color.parseColor("#000000")), ((JSONObject)localObject3).optInt("shadowOpacity"), ((JSONObject)localObject3).optInt("shadowOffsetX"), ((JSONObject)localObject3).optInt("shadowOffsetY"), ((JSONObject)localObject3).optInt("display", 0), ((JSONObject)localObject3).optString("textAlign", ""));
                        }
                        localObject3 = ((JSONObject)localObject1).optString("buildingId");
                        localObject1 = ((JSONObject)localObject1).optString("floorName");
                        localr.buildingId = ((String)localObject3);
                        localr.floorName = ((String)localObject1);
                        localb.a(str1, localr, (com.tencent.mm.plugin.appbrand.d.a)paramc.B(com.tencent.mm.plugin.appbrand.d.a.class));
                        i++;
                        break;
                        localJSONException1 = localJSONException1;
                        ab.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", localJSONException1, "", new Object[0]);
                        Object localObject2 = null;
                        continue;
                        localJSONException2 = localJSONException2;
                        Object localObject4 = null;
                        continue;
                        localr.K(0.5F, 1.0F);
                      }
                      localJSONException3 = localJSONException3;
                      Object localObject5 = null;
                    }
                    catch (JSONException localJSONException4)
                    {
                      while (true)
                        Object localObject6 = null;
                    }
                  }
                }
              }
        }
        else
        {
          a(paramc, paramInt, j("ok", null), true, localb.aDU());
          AppMethodBeat.o(93842);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.e
 * JD-Core Version:    0.6.2
 */