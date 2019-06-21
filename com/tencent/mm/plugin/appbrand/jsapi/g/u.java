package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.g;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u extends a
{
  public static final int CTRL_INDEX = 200;
  public static final String NAME = "translateMapMarker";
  private List<Runnable> hMO;
  private AtomicBoolean hMP;

  public u()
  {
    AppMethodBeat.i(93874);
    this.hMO = new ArrayList();
    this.hMP = new AtomicBoolean(false);
    AppMethodBeat.o(93874);
  }

  private void a(c paramc, int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93878);
    a(paramc, paramInt, j(paramString, null), paramString.equals("ok"), paramBoolean);
    this.hMP.set(false);
    aDM();
    AppMethodBeat.o(93878);
  }

  private void aDM()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(93876);
        if (this.hMP.get())
        {
          AppMethodBeat.o(93876);
          return;
        }
        if (this.hMO.size() == 0)
        {
          AppMethodBeat.o(93876);
          continue;
        }
      }
      finally
      {
      }
      Runnable localRunnable = (Runnable)this.hMO.remove(0);
      if (localRunnable != null)
        com.tencent.mm.plugin.appbrand.r.m.aNS().aa(localRunnable);
      AppMethodBeat.o(93876);
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93875);
    super.a(paramc, paramJSONObject, paramInt);
    paramc = new u.1(this, paramc, paramJSONObject, paramInt);
    this.hMO.add(paramc);
    aDM();
    AppMethodBeat.o(93875);
  }

  protected final void d(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93877);
    this.hMP.set(true);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiTranslateMapMarker", "data is invalid, err");
      a(paramc, paramInt, "fail:invalid data", false);
      AppMethodBeat.o(93877);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.JsApiTranslateMapMarker", "data:%s", new Object[] { paramJSONObject.toString() });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiTranslateMapMarker", "mapView is null, return");
        a(paramc, paramInt, String.format("fail:internal error %s", new Object[] { "mapview is null" }), false);
        AppMethodBeat.o(93877);
      }
      else
      {
        String str1 = paramJSONObject.optString("markerId");
        try
        {
          localObject = new org/json/JSONArray;
          ((JSONArray)localObject).<init>(paramJSONObject.optString("keyFrames"));
          paramJSONObject = new java/util/LinkedList;
          paramJSONObject.<init>();
          ab.d("MicroMsg.JsApiTranslateMapMarker", "keyFramesArray size :%d", new Object[] { Integer.valueOf(((JSONArray)localObject).length()) });
          int i = 0;
          if (i >= ((JSONArray)localObject).length())
            break label362;
          JSONObject localJSONObject = (JSONObject)((JSONArray)localObject).get(i);
          b.g localg = new com/tencent/mm/plugin/appbrand/jsapi/g/a/b$g;
          localg.<init>();
          localg.duration = localJSONObject.optInt("duration", 0);
          if (localg.duration == 0)
            ab.e("MicroMsg.JsApiTranslateMapMarker", "keyFrame.duration is zero, err continue");
          while (true)
          {
            i++;
            break;
            localg.rotate = ((float)localJSONObject.optDouble("rotate", 0.0D));
            String str2 = localJSONObject.optString("latitude");
            if (!bo.isNullOrNil(str2))
              localg.latitude = bo.getFloat(str2, 0.0F);
            str2 = localJSONObject.optString("longitude");
            if (!bo.isNullOrNil(str2))
              localg.longitude = bo.getFloat(str2, 0.0F);
            paramJSONObject.add(localg);
          }
        }
        catch (JSONException paramJSONObject)
        {
          ab.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", new Object[] { paramJSONObject });
          a(paramc, paramInt, String.format("fail:internal error %s", new Object[] { "parse json fail" }), localb.aDU());
          AppMethodBeat.o(93877);
        }
        continue;
        label362: Object localObject = new com/tencent/mm/plugin/appbrand/jsapi/g/u$2;
        ((u.2)localObject).<init>(this, paramc, paramInt, localb);
        localb.a(str1, paramJSONObject, (b.o)localObject);
        AppMethodBeat.o(93877);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.u
 * JD-Core Version:    0.6.2
 */