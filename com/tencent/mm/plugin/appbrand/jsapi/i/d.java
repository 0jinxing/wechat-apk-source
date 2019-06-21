package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.plugin.appbrand.l.b.1;
import com.tencent.mm.plugin.appbrand.l.b.a;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

public class d extends b
{
  public static final int CTRL_INDEX = 269;
  public static final String NAME = "createDownloadTask";

  public static void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString1, String paramString2)
  {
    AppMethodBeat.i(108028);
    HashMap localHashMap = new HashMap();
    localHashMap.put("downloadTaskId", paramString1);
    localHashMap.put("state", "fail");
    localHashMap.put("errMsg", paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    new d.a().j(paramc).AM(paramString1).aCj();
    AppMethodBeat.o(108028);
  }

  public final String OA()
  {
    return "downloadTaskId";
  }

  public void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, a arg2, boolean paramBoolean, JSONObject paramJSONObject, int paramInt, Map<String, String> arg6, b.a parama1, String paramString)
  {
    AppMethodBeat.i(108027);
    ??? = com.tencent.mm.plugin.appbrand.l.c.aIB().CJ(paramc.getAppId());
    if (??? == null)
    {
      ??? = new com.tencent.mm.plugin.appbrand.l.b(paramc);
      com.tencent.mm.plugin.appbrand.l.c localc = com.tencent.mm.plugin.appbrand.l.c.aIB();
      paramc = paramc.getAppId();
      if (!localc.hGk.containsKey(paramc))
        localc.hGk.put(paramc, ???);
    }
    for (paramc = (com.tencent.mm.plugin.appbrand.jsapi.c)???; ; paramc = (com.tencent.mm.plugin.appbrand.jsapi.c)???)
    {
      int i;
      if (paramc != null)
      {
        ab.i("MicroMsg.JsApiCreateDownloadTask", "before do download, checkDomains = %b, timeout %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
        i = ???.hfK;
        if (paramBoolean)
        {
          ??? = ???.bQI;
          paramJSONObject = j.CS(paramJSONObject.optString("url"));
        }
      }
      while (true)
      {
        synchronized (paramc.iov)
        {
          if (paramc.iov.size() >= paramc.ioq)
          {
            parama1.AD("max_connected");
            ab.i("MicroMsg.AppBrandNetworkDownload", "max connected mDownloadTaskList.size():%d,mMaxConnected:%d", new Object[] { Integer.valueOf(paramc.iov.size()), Integer.valueOf(paramc.ioq) });
            AppMethodBeat.o(108027);
            return;
            ??? = null;
            break;
          }
          ??? = paramc.ior + ag.ck(paramJSONObject) + "temp";
          parama1 = new com.tencent.mm.plugin.appbrand.l.a.b(paramc.hvw, paramJSONObject, (String)???, paramc.ibJ, new b.1(paramc, paramString, parama1));
          parama1.ipC = ???;
          parama1.azs = paramInt;
          parama1.isRunning = true;
          parama1.ioN = ???;
          parama1.ipD = i;
          parama1.ios = paramc.ios;
          parama1.hvr = paramString;
          parama1.ioR = "createDownloadTask";
          synchronized (paramc.iov)
          {
            paramc.iov.add(parama1);
          }
        }
        synchronized (paramc.iou)
        {
          if (!paramc.iou.containsKey(paramJSONObject))
          {
            ??? = new java/util/concurrent/ConcurrentLinkedQueue;
            ???.<init>();
            paramc.iou.put(paramJSONObject, ???);
            ???.offer(parama1);
            if ((paramc.iou.get(paramJSONObject) == null) || (((ConcurrentLinkedQueue)paramc.iou.get(paramJSONObject)).size() <= 1))
              break label508;
            ab.i("MicroMsg.AppBrandNetworkDownload", "hy: more than one same url in the queue, just add and wait");
            AppMethodBeat.o(108027);
            continue;
            paramc = finally;
            AppMethodBeat.o(108027);
            throw paramc;
            paramc = finally;
            AppMethodBeat.o(108027);
            throw paramc;
          }
          ??? = (ConcurrentLinkedQueue)paramc.iou.get(paramJSONObject);
        }
        label508: paramc.CF(paramJSONObject);
        AppMethodBeat.o(108027);
      }
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(108026);
    ab.d("MicroMsg.JsApiCreateDownloadTask", "JsApiCreateDownloadTask");
    d.1 local1 = new d.1(this, paramJSONObject.optString("filePath"), paramc, paramString);
    a locala = (a)paramc.aa(a.class);
    Map localMap = j.a(paramJSONObject, locala);
    String str = paramJSONObject.optString("url");
    if (bo.isNullOrNil(str))
    {
      ab.i("MicroMsg.JsApiCreateDownloadTask", "url is null");
      a(paramc, paramString, "url is null or nil");
      AppMethodBeat.o(108026);
    }
    while (true)
    {
      return;
      if ((locala.ioe) && (paramJSONObject.optBoolean("__skipDomainCheck__")))
      {
        i = 1;
        label114: if (i == 0)
          break label180;
      }
      label180: for (boolean bool = false; ; bool = locala.iof)
      {
        if ((!bool) || (j.c(locala.bQI, str)))
          break label190;
        ab.i("MicroMsg.JsApiCreateDownloadTask", "not in domain url %s", new Object[] { str });
        a(paramc, paramString, "url not in domain list");
        AppMethodBeat.o(108026);
        break;
        i = 0;
        break label114;
      }
      label190: if (locala.bQy <= 0)
        ab.i("MicroMsg.JsApiCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
      int j = 60000;
      int k = paramJSONObject.optInt("timeout", 0);
      int i = k;
      if (k <= 0)
        i = j.a(locala, 3);
      if (i > 0)
        j = i;
      ab.i("MicroMsg.JsApiCreateDownloadTask", "lm:configTimeout: %d,timeout: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      a(paramc, locala, bool, paramJSONObject, j, localMap, local1, paramString);
      AppMethodBeat.o(108026);
    }
  }

  public final String aBA()
  {
    AppMethodBeat.i(108025);
    Object localObject = new StringBuilder();
    com.tencent.mm.plugin.appbrand.l.c.aIB();
    localObject = com.tencent.mm.plugin.appbrand.l.c.aIA();
    AppMethodBeat.o(108025);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.d
 * JD-Core Version:    0.6.2
 */