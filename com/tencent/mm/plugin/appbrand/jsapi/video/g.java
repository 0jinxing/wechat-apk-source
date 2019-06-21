package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends a
{
  public static final int CTRL_INDEX = 483;
  public static final String NAME = "loadVideoResource";

  static void a(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126562);
    String str = "";
    switch (paramInt1)
    {
    default:
    case -1:
    case -2:
    case -3:
    case -4:
    case -5:
    }
    while (true)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("errMsg", str);
      localHashMap.put("resource", paramString);
      paramString = new JSONObject(localHashMap).toString();
      new k.j().j(paramc).AM(paramString).aCj();
      AppMethodBeat.o(126562);
      return;
      str = "args illegal";
      continue;
      str = "downloading";
      continue;
      str = "start download fail";
      continue;
      str = "create file fail";
      continue;
      str = "cdn download fail errCode:".concat(String.valueOf(paramInt2));
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126561);
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data nil", null));
      ab.w("MicroMsg.JsApiLoadVideoResource", "data is null");
      AppMethodBeat.o(126561);
    }
    while (true)
    {
      return;
      paramJSONObject = paramJSONObject.optJSONArray("resources");
      if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
      {
        ab.w("MicroMsg.JsApiLoadVideoResource", "dataArr nil");
        paramc.M(paramInt, j("fail:dataArr nil", null));
        AppMethodBeat.o(126561);
      }
      else
      {
        int i = 0;
        int j = 0;
        if (j < paramJSONObject.length())
        {
          String str = paramJSONObject.optString(j, "");
          ab.d("MicroMsg.JsApiLoadVideoResource", "preLoadVideo videoUrl:%s", new Object[] { str });
          int k;
          if (bo.isNullOrNil(str))
          {
            ab.w("MicroMsg.JsApiLoadVideoResource", "videoUrl i nil");
            k = i + 1;
          }
          while (true)
          {
            j++;
            i = k;
            break;
            int m = ((e)com.tencent.luggage.a.e.B(e.class)).a(str, new g.1(this, paramc));
            k = i;
            if (m != 0)
            {
              ab.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo genPreLoad fail ret = %s, videoUrl = %s", new Object[] { Integer.valueOf(m), str });
              a(paramc, str, m, 0);
              k = i + 1;
            }
          }
        }
        if ((i != 0) && (i == paramJSONObject.length()))
          paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(126561);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.g
 * JD-Core Version:    0.6.2
 */