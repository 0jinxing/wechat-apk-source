package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.m;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.l.d;
import com.tencent.mm.plugin.appbrand.l.d.a;
import com.tencent.mm.plugin.appbrand.l.f;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.l.o;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e extends b
{
  public static final int CTRL_INDEX = 242;
  public static final String NAME = "createRequestTask";

  static void a(c paramc, String paramString1, String paramString2)
  {
    AppMethodBeat.i(108035);
    HashMap localHashMap = new HashMap();
    localHashMap.put("requestTaskId", paramString1);
    localHashMap.put("state", "fail");
    localHashMap.put("errMsg", paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    new e.a().j(paramc).AM(paramString1).aCj();
    AppMethodBeat.o(108035);
  }

  public final String OA()
  {
    return "requestTaskId";
  }

  public final void a(c paramc, JSONObject paramJSONObject, final String paramString)
  {
    AppMethodBeat.i(108034);
    ab.d("MicroMsg.JsApiCreateRequestTask", "JsApiCreateRequestTask");
    d.a local1 = new d.a()
    {
      public final void BA(String paramAnonymousString)
      {
        AppMethodBeat.i(108030);
        long l1 = System.currentTimeMillis();
        long l2 = this.hRv;
        int i;
        if (paramAnonymousString == null)
        {
          i = 0;
          ab.d("MicroMsg.JsApiCreateRequestTask", "onRequestResult, time: %d, data size: %d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(i) });
          d locald = f.aIE().CM(paramString.getAppId());
          if ((locald == null) || (!locald.CH(this.hRw)))
            break label118;
          ab.d("MicroMsg.JsApiCreateRequestTask", "request abort %s", new Object[] { this.hRw });
          AppMethodBeat.o(108030);
        }
        while (true)
        {
          return;
          i = paramAnonymousString.length();
          break;
          label118: e.a(paramString, this.hRw, paramAnonymousString);
          ((o)com.tencent.luggage.a.e.C(o.class)).zT(paramString.getAppId());
          AppMethodBeat.o(108030);
        }
      }

      public final void a(String paramAnonymousString, Object paramAnonymousObject, int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AppMethodBeat.i(108031);
        int i;
        if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof ByteBuffer)))
          i = ((ByteBuffer)paramAnonymousObject).array().length;
        while (true)
        {
          ab.d("MicroMsg.JsApiCreateRequestTask", "onRequestResult, time: %d, data size: %d, code %s,reqrestId %s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.hRv), Integer.valueOf(i), Integer.valueOf(paramAnonymousInt), this.hRw });
          HashMap localHashMap = new HashMap();
          localHashMap.put("requestTaskId", this.hRw);
          if (paramAnonymousString.equalsIgnoreCase("ok"))
          {
            localHashMap.put("state", "success");
            localHashMap.put("data", paramAnonymousObject);
            label128: localHashMap.put("statusCode", Integer.valueOf(paramAnonymousInt));
            if (paramAnonymousJSONObject != null)
              localHashMap.put("header", paramAnonymousJSONObject);
            paramAnonymousString = paramAnonymousJSONObject.optJSONArray("cookies");
            if (paramAnonymousString != null)
              localHashMap.put("cookies", paramAnonymousString);
            paramAnonymousString = new e.a();
            paramAnonymousJSONObject = q.a(paramString.aBx(), localHashMap, (q.a)paramString.aa(q.a.class));
            if (((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String))) && (paramAnonymousJSONObject != q.b.iRI))
              break label311;
            paramAnonymousObject = new JSONObject(localHashMap).toString();
            paramAnonymousString.j(paramString).AM(paramAnonymousObject).aCj();
            AppMethodBeat.o(108031);
          }
          while (true)
          {
            return;
            if ((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String)))
              break label336;
            i = ((String)paramAnonymousObject).length();
            break;
            localHashMap.put("state", "fail");
            break label128;
            label311: if (paramAnonymousJSONObject == q.b.iRJ)
              q.m(paramString, "onRequestTaskStateChange");
            AppMethodBeat.o(108031);
          }
          label336: i = 0;
        }
      }

      public final void p(JSONObject paramAnonymousJSONObject)
      {
        AppMethodBeat.i(108032);
        if (paramAnonymousJSONObject == null)
          AppMethodBeat.o(108032);
        while (true)
        {
          return;
          Object localObject;
          if (paramAnonymousJSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__"))
          {
            if (!((com.tencent.mm.plugin.appbrand.l.a)paramString.aa(com.tencent.mm.plugin.appbrand.l.a.class)).bQf)
            {
              AppMethodBeat.o(108032);
            }
            else
            {
              paramAnonymousJSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
              localObject = new m();
              ((m)localObject).csn.cso = "request";
              ((m)localObject).csn.csq = paramAnonymousJSONObject;
              ((m)localObject).csn.csp = this.hRw;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
              AppMethodBeat.o(108032);
            }
          }
          else
          {
            localObject = new HashMap();
            ((Map)localObject).put("requestTaskId", this.hRw);
            ((Map)localObject).put("state", "headersReceived");
            ((Map)localObject).put("header", paramAnonymousJSONObject);
            paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONArray("cookies");
            if (paramAnonymousJSONObject != null)
              ((Map)localObject).put("cookies", paramAnonymousJSONObject);
            paramAnonymousJSONObject = new e.a();
            localObject = new JSONObject((Map)localObject).toString();
            paramAnonymousJSONObject.j(paramString).AM((String)localObject).aCj();
            AppMethodBeat.o(108032);
          }
        }
      }
    };
    String str1 = paramJSONObject.optString("url");
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.JsApiCreateRequestTask", "url is null");
      a(paramc, paramString, "url is null or nil");
      AppMethodBeat.o(108034);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.l.a locala = (com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class);
      int i = 60000;
      int j = paramJSONObject.optInt("timeout", 0);
      ab.i("MicroMsg.JsApiCreateRequestTask", "lm:data configTimeout %d", new Object[] { Integer.valueOf(j) });
      int k = j;
      if (j <= 0)
      {
        k = j.a(locala, 0);
        ab.i("MicroMsg.JsApiCreateRequestTask", "lm:getRequiredTimeout configTimeout %d", new Object[] { Integer.valueOf(k) });
      }
      if (k > 0)
        i = k;
      ab.i("MicroMsg.JsApiCreateRequestTask", "lm:configTimeout: %d,timeout: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      if (locala.bQw <= 0)
        ab.i("MicroMsg.JsApiCreateRequestTask", "maxRequestConcurrent <= 0 use default concurrent");
      Map localMap = j.a(paramJSONObject, locala);
      if ((locala.ioe) && (paramJSONObject.optBoolean("__skipDomainCheck__")))
      {
        k = 1;
        label223: if (k == 0)
          break label286;
      }
      label286: for (boolean bool = false; ; bool = locala.iof)
      {
        if ((!bool) || (j.c(locala.bQF, str1)))
          break label296;
        ab.i("MicroMsg.JsApiCreateRequestTask", "not in domain url %s", new Object[] { str1 });
        a(paramc, paramString, "url not in domain list");
        AppMethodBeat.o(108034);
        break;
        k = 0;
        break label223;
      }
      label296: d locald1;
      if (f.aIE().CM(paramc.getAppId()) == null)
      {
        locald1 = new d(paramc);
        f localf = f.aIE();
        String str2 = paramc.getAppId();
        locald2 = locald1;
        if (!localf.hGk.containsKey(str2))
          localf.hGk.put(str2, locald1);
      }
      for (d locald2 = locald1; ; locald2 = f.aIE().CM(paramc.getAppId()))
      {
        ab.i("MicroMsg.JsApiCreateRequestTask", "request url: %s", new Object[] { str1 });
        if (locald2 == null)
          break label472;
        if (bool)
          break label443;
        ab.i("MicroMsg.JsApiCreateRequestTask", "debug type, do not verify domains");
        locald2.a(paramc, i, paramJSONObject, localMap, null, local1, paramString, "createRequestTask");
        AppMethodBeat.o(108034);
        break;
      }
      label443: locald2.a(paramc, i, paramJSONObject, localMap, locala.bQF, local1, paramString, "createRequestTask");
      AppMethodBeat.o(108034);
      continue;
      label472: a(paramc, paramString, "create request error");
      AppMethodBeat.o(108034);
    }
  }

  public final String aBA()
  {
    AppMethodBeat.i(108033);
    Object localObject = new StringBuilder();
    f.aIE();
    localObject = f.aIA();
    AppMethodBeat.o(108033);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.e
 * JD-Core Version:    0.6.2
 */