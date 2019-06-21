package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.l.b.a;
import com.tencent.mm.plugin.appbrand.l.m;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.i.d
{
  public static final int CTRL_INDEX = 269;
  public static final String NAME = "createDownloadTask";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, com.tencent.mm.plugin.appbrand.l.a parama, boolean paramBoolean, JSONObject paramJSONObject, int paramInt, Map<String, String> paramMap, b.a parama1, String paramString)
  {
    AppMethodBeat.i(130678);
    Object localObject = paramJSONObject.optString("url");
    if (bo.isNullOrNil((String)localObject))
    {
      ab.i("MicroMsg.JsApiCreateDownloadTaskGame", "url is null");
      a(paramc, paramString, "url is null or nil");
      AppMethodBeat.o(130678);
    }
    while (true)
    {
      return;
      if ((((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHn, false)) && (com.tencent.mm.plugin.appbrand.game.preload.d.aBz().isDownloading((String)localObject)))
      {
        localObject = com.tencent.mm.plugin.appbrand.game.preload.d.aBz().hto;
        if (localObject != null)
        {
          int i = parama.hfK;
          if (paramBoolean);
          for (paramc = parama.bQI; ; paramc = null)
          {
            ((m)localObject).a(paramJSONObject, paramInt, paramMap, paramc, i, parama1, paramString, "createDownloadTask");
            AppMethodBeat.o(130678);
            break;
          }
        }
      }
      super.a(paramc, parama, paramBoolean, paramJSONObject, paramInt, paramMap, parama1, paramString);
      AppMethodBeat.o(130678);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.c
 * JD-Core Version:    0.6.2
 */