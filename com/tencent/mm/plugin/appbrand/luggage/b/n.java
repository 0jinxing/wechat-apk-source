package com.tencent.mm.plugin.appbrand.luggage.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends com.tencent.luggage.f.a.b
{
  public static Integer ikm;

  private static int getMapType()
  {
    AppMethodBeat.i(132110);
    int i;
    if (ikm != null)
    {
      i = ikm.intValue();
      AppMethodBeat.o(132110);
    }
    while (true)
    {
      return i;
      Object localObject = a.b.eGM;
      localObject = a.ll("100487");
      if ((localObject == null) || (!((com.tencent.mm.storage.c)localObject).isValid()))
      {
        ab.i("MicroMsg.WxaMapViewFactory", "[sMapType] item is null");
        AppMethodBeat.o(132110);
        i = 1;
      }
      else
      {
        ikm = Integer.valueOf(bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("MapType"), 1));
        ab.i("MicroMsg.WxaMapViewFactory", "sMapType:%d", new Object[] { ikm });
        i = ikm.intValue();
        AppMethodBeat.o(132110);
      }
    }
  }

  public final com.tencent.mm.plugin.appbrand.jsapi.g.a.b a(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(132112);
    if (paramContext == null)
    {
      paramContext = null;
      AppMethodBeat.o(132112);
    }
    while (true)
    {
      return paramContext;
      if (f.a(paramMap, "mapType", getMapType()) == 2)
      {
        paramContext = new com.tencent.mm.plugin.appbrand.jsapi.u.a.b(paramContext, paramString, paramMap);
        AppMethodBeat.o(132112);
      }
      else
      {
        paramContext = super.a(paramContext, paramString, paramMap);
        AppMethodBeat.o(132112);
      }
    }
  }

  public final com.tencent.mm.plugin.appbrand.jsapi.g.a.b a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(132111);
    if (paramJSONObject != null);
    try
    {
      paramJSONObject.put("mapType", getMapType());
      paramc = super.a(paramc, paramJSONObject);
      AppMethodBeat.o(132111);
      return paramc;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.c("MicroMsg.WxaMapViewFactory", "", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.n
 * JD-Core Version:    0.6.2
 */