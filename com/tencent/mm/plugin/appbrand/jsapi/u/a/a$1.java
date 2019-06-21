package com.tencent.mm.plugin.appbrand.jsapi.u.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.1;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.2;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.3;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.4;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.5;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.6;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.7;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.8;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b.9;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class a$1
  implements Runnable
{
  a$1(a parama, m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117344);
    Object localObject1;
    Object localObject2;
    JSONObject localJSONObject;
    m localm;
    int i;
    if ((this.hvQ instanceof com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "Tummy insert");
      com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(9);
      localObject1 = this.idF;
      localObject2 = this.hyd;
      localJSONObject = this.hsm;
      localm = this.hvQ;
      i = this.eIl;
      if (((a)localObject1).mSurfaceTexture == null)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "remove mSurfaceTexture is null, err");
        ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).M(i, localm.j("fail:internal error", null));
        com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(11);
        AppMethodBeat.o(117344);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b localb = (com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b)localm;
      Object localObject3 = ((a)localObject1).mSurfaceTexture;
      ab.i("MicroMsg.JsApiInsertXWebMap", "insertXwebMap:%s", new Object[] { localJSONObject });
      float f1 = bo.getFloat(localJSONObject.optString("centerLatitude"), 0.0F);
      float f2 = bo.getFloat(localJSONObject.optString("centerLongitude"), 0.0F);
      int j = localJSONObject.optInt("scale", 16);
      int k = localJSONObject.optInt("rotate", 0);
      int m = localJSONObject.optInt("skew", 0);
      Object localObject4;
      if ((Math.abs(f1) > 90.0F) || (Math.abs(f2) > 180.0F))
      {
        ab.d("MicroMsg.JsApiInsertXWebMap", "centerLatitude or centerLongitude value is error!");
        localObject4 = null;
      }
      int i2;
      while (true)
      {
        ((a)localObject1).idE = ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4);
        ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).M(i, localm.j("ok", null));
        com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(10);
        AppMethodBeat.o(117344);
        break;
        String str1 = ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).getAppId();
        String str2 = localJSONObject.optString("theme", "");
        String str3 = localJSONObject.optString("subKey", "");
        localObject4 = ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).getAppId();
        int n = localJSONObject.optInt("styleId", 0);
        Object localObject5 = localJSONObject.optJSONObject("position");
        if (localObject5 == null)
        {
          ab.e("MicroMsg.JsApiInsertXWebMap", "positionObj is null, err, return");
          localObject4 = null;
        }
        else
        {
          int i1 = com.tencent.mm.plugin.appbrand.r.g.a((JSONObject)localObject5, "width", 0);
          i2 = com.tencent.mm.plugin.appbrand.r.g.a((JSONObject)localObject5, "height", 0);
          localObject5 = f.g((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2, localJSONObject);
          HashMap localHashMap = new HashMap(5);
          localHashMap.put("theme", str2);
          localHashMap.put("subKey", str3);
          localHashMap.put("subId", localObject4);
          localHashMap.put("styleId", Integer.valueOf(n));
          localHashMap.put("surface", localObject3);
          localHashMap.put("width", Integer.valueOf(i1));
          localHashMap.put("height", Integer.valueOf(i2));
          localHashMap.put("mapType", Integer.valueOf(2));
          localObject4 = ((com.tencent.mm.plugin.appbrand.jsapi.g.a.c)com.tencent.luggage.a.e.B(com.tencent.mm.plugin.appbrand.jsapi.g.a.c.class)).a(((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).getContext(), (String)localObject5, localHashMap);
          if (localObject4 == null)
          {
            ab.e("MicroMsg.JsApiInsertXWebMap", "mapView is null, return");
            localObject4 = null;
          }
          else if (!com.tencent.mm.plugin.appbrand.jsapi.g.a.g.a(str1, f.g((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2, localJSONObject), (com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4))
          {
            ab.e("MicroMsg.JsApiInsertXWebMap", "initMapView is false, return");
            localObject4 = null;
          }
          else
          {
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).ed(localJSONObject.optBoolean("enableZoom", true));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).ee(localJSONObject.optBoolean("enableScroll", true));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).ef(localJSONObject.optBoolean("enableRotate", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).eg(localJSONObject.optBoolean("showCompass", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).eh(localJSONObject.optBoolean("enable3D", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).ei(localJSONObject.optBoolean("enableOverlooking", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).ej(localJSONObject.optBoolean("enableSatellite", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).el(localJSONObject.optBoolean("enableIndoor", true));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).em(localJSONObject.optBoolean("enableIndoorLevelPick", false));
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(f1, f2, j, k, m);
            if ((localObject2 instanceof com.tencent.mm.plugin.appbrand.jsapi.e))
            {
              localObject3 = (com.tencent.mm.plugin.appbrand.jsapi.e)localObject2;
              ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject3).a(new b.1(localb, (com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4));
              ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject3).a(new b.2(localb, (com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4));
              ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject3).a(new b.3(localb, (com.tencent.mm.plugin.appbrand.jsapi.e)localObject3, str1, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2, localJSONObject));
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).getView().setVisibility(0);
            if (localObject4 == null)
            {
              ab.e("MicroMsg.JsApiInsertXWebMap", "mapView is null, error, return");
              localObject4 = null;
            }
            else
            {
              i2 = f.B(localJSONObject);
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.4(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.5(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.6(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.7(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).en(localJSONObject.optBoolean("showLocation"));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.8(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
              ((com.tencent.mm.plugin.appbrand.jsapi.g.a.b)localObject4).a(new b.9(localb, i2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2));
            }
          }
        }
      }
      if ((this.hvQ instanceof d))
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "Tummy update");
        com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(12);
        this.idF.b(this.hyd, this.hsm, this.hvQ, this.eIl);
        AppMethodBeat.o(117344);
      }
      else
      {
        if ((this.hvQ instanceof com.tencent.mm.plugin.appbrand.jsapi.u.a.a.c))
        {
          com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(15);
          localObject4 = this.hyd;
          localObject2 = this.hsm;
          localObject1 = this.hvQ;
          i2 = this.eIl;
          if (localObject2 == null)
            ab.e("MicroMsg.JsApiRemoveXWebMap", "data is null");
          for (i = 0; ; i = 1)
          {
            if (i == 0)
              break label1097;
            ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject4).M(i2, ((m)localObject1).j("ok", null));
            com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(16);
            AppMethodBeat.o(117344);
            break;
            ab.i("MicroMsg.JsApiRemoveXWebMap", "removeXWebMap:%s", new Object[] { localObject2 });
            com.tencent.mm.plugin.appbrand.jsapi.g.a.g.ck(((com.tencent.mm.plugin.appbrand.jsapi.c)localObject4).getAppId(), f.g((com.tencent.mm.plugin.appbrand.jsapi.c)localObject4, (JSONObject)localObject2));
          }
          label1097: ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "remove fail");
          com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(17);
          ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject4).M(i2, ((m)localObject1).j("fail:internal error", null));
        }
        AppMethodBeat.o(117344);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a.1
 * JD-Core Version:    0.6.2
 */