package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.i;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.w;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.x;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapRegion";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93847);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetMapRegion", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93847);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetMapRegion", "data:%s", new Object[] { paramJSONObject });
      paramJSONObject = f(paramc, paramJSONObject);
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiGetMapRegion", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93847);
      }
      else
      {
        Object localObject1 = paramJSONObject.aDQ().hOo;
        if (localObject1 == null)
        {
          ab.e("MicroMsg.JsApiGetMapRegion", "visibleRegion is  null");
          paramc.M(paramInt, j("fail:visibleRegion is null", null));
          AppMethodBeat.o(93847);
        }
        else
        {
          localObject1 = ((b.x)localObject1).hOp;
          if (localObject1 == null)
          {
            ab.e("MicroMsg.JsApiGetMapRegion", "latLngBounds is  null");
            paramc.M(paramInt, j("fail:latLngBounds is null", null));
            AppMethodBeat.o(93847);
          }
          else
          {
            Object localObject2 = ((b.i)localObject1).hNT;
            Object localObject3 = ((b.i)localObject1).hNU;
            localObject1 = new HashMap();
            if (localObject2 != null)
            {
              ((Map)localObject1).put("latitude", Double.valueOf(((b.h)localObject2).latitude));
              ((Map)localObject1).put("longitude", Double.valueOf(((b.h)localObject2).longitude));
            }
            localObject2 = new HashMap();
            if (localObject3 != null)
            {
              ((Map)localObject2).put("latitude", Double.valueOf(((b.h)localObject3).latitude));
              ((Map)localObject2).put("longitude", Double.valueOf(((b.h)localObject3).longitude));
            }
            localObject3 = new HashMap();
            ((Map)localObject3).put("southwest", localObject1);
            ((Map)localObject3).put("northeast", localObject2);
            ab.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", new Object[] { localObject3.toString() });
            a(paramc, paramInt, j("ok", (Map)localObject3), true, paramJSONObject.aDU());
            AppMethodBeat.o(93847);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.j
 * JD-Core Version:    0.6.2
 */