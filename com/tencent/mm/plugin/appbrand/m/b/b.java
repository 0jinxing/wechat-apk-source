package com.tencent.mm.plugin.appbrand.m.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.appstorage.s;
import com.tencent.mm.plugin.appbrand.appstorage.w;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  private static b.a iqd = null;

  public static void a(b.a parama)
  {
    iqd = parama;
  }

  private static void b(com.tencent.mm.plugin.appbrand.i parami, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102191);
    if (!(parami.asE() instanceof s))
    {
      parami = new IllegalStateException("getFileSystem not LuggageFileSystemRegistry");
      AppMethodBeat.o(102191);
      throw parami;
    }
    JSONObject localJSONObject = new JSONObject();
    parami = ((s)parami.asE()).gYd;
    int i = 0;
    while (true)
      if (i < parami.size())
      {
        Object localObject1 = (p)parami.get(i);
        Object localObject2;
        String str;
        long l;
        if ((localObject1 instanceof w))
        {
          localObject2 = (w)localObject1;
          localObject1 = ((w)localObject2).gXQ;
          str = ((w)localObject2).gYj;
          l = ((w)localObject2).gYk;
          ab.i("MicroMsg.PrepareDataForNodeHelper", "prepareFSData rootPath:%s pathPrefix:%s quota:%d", new Object[] { localObject1, str, Long.valueOf(l) });
        }
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
          ((JSONObject)localObject2).put("rootPath", localObject1);
          ((JSONObject)localObject2).put("quota", l);
          localJSONObject.put(str, localObject2);
          i++;
        }
        catch (JSONException localJSONException)
        {
          while (true)
            ab.e("MicroMsg.PrepareDataForNodeHelper", "prepareFSData e:%s", new Object[] { localJSONException });
        }
      }
    try
    {
      paramJSONObject.put("fsData", localJSONObject);
      AppMethodBeat.o(102191);
      return;
    }
    catch (JSONException parami)
    {
      while (true)
      {
        ab.e("MicroMsg.PrepareDataForNodeHelper", "prepareFSData e:%s", new Object[] { parami });
        AppMethodBeat.o(102191);
      }
    }
  }

  public static JSONObject y(com.tencent.mm.plugin.appbrand.i parami)
  {
    AppMethodBeat.i(102190);
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("appId", parami.mAppId);
      if (parami.ye() == null)
      {
        i = 0;
        localJSONObject1.put("appversion", i);
        if (parami.ye() != null)
          break label383;
        i = 0;
        localJSONObject1.put("appstate", i);
        localObject = (a)parami.aa(a.class);
        if (localObject != null)
          localJSONObject2 = new JSONObject();
      }
    }
    catch (JSONException localJSONException2)
    {
      try
      {
        localJSONObject2.put("maxWebsocketConcurrent", ((a)localObject).iok);
        localJSONObject2.put("socketDomains", com.tencent.luggage.g.i.D(((a)localObject).bQG));
        localJSONObject2.put("websocketSkipPortCheck", ((a)localObject).bQB);
        localJSONObject2.put("websocketTimeoutMS", ((a)localObject).ioh);
        localJSONObject2.put("headerFilterMode", ((a)localObject).mode);
        localJSONObject2.put("blacklistHeaders", com.tencent.luggage.g.i.D(((a)localObject).iol));
        localJSONObject2.put("whitelistHeaders", com.tencent.luggage.g.i.D(((a)localObject).iom));
        localJSONObject2.put("referer", ((a)localObject).referer);
        localJSONObject2.put("canSkipCheckDomainsByArg", ((a)localObject).ioe);
        localJSONObject2.put("shouldCheckDomains", ((a)localObject).iof);
        localJSONObject2.put("userAgentString", ((a)localObject).ioo);
        localJSONObject1.put("networkConfig", localJSONObject2);
        localObject = (q.a)parami.aa(q.a.class);
        if (localObject != null)
          localJSONObject2 = new JSONObject();
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          while (true)
          {
            Object localObject;
            JSONObject localJSONObject2;
            localJSONObject2.put("nativeBufferSizeLimitByte", ((q.a)localObject).hfX);
            localJSONObject2.put("itemBase64", ((q.a)localObject).iRH);
            localJSONObject2.put("itemID", ((q.a)localObject).iRG);
            localJSONObject2.put("itemKey", ((q.a)localObject).iRF);
            localJSONObject2.put("outKey", ((q.a)localObject).iRE);
            localJSONObject1.put("nativeBufferConfig", localJSONObject2);
            b(parami, localJSONObject1);
            if (iqd != null)
              iqd.a(parami, localJSONObject1);
            ab.v("MicroMsg.PrepareDataForNodeHelper", "prepareDataForNode :%s", new Object[] { localJSONObject1.toString() });
            AppMethodBeat.o(102190);
            return localJSONObject1;
            int i = parami.ye().hhd.gVu;
            continue;
            label383: i = parami.ye().hhd.gVt;
            i++;
            continue;
            localJSONException1 = localJSONException1;
            ab.e("MicroMsg.PrepareDataForNodeHelper", "prepareCommonData e:%s", new Object[] { localJSONException1 });
          }
          localJSONException2 = localJSONException2;
          ab.e("MicroMsg.PrepareDataForNodeHelper", "prepareNetworkConfigData e:%s", new Object[] { localJSONException2 });
        }
        catch (JSONException localJSONException3)
        {
          while (true)
            ab.e("MicroMsg.PrepareDataForNodeHelper", "prepareNativeBufferConfigData e:%s", new Object[] { localJSONException3 });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.b.b
 * JD-Core Version:    0.6.2
 */