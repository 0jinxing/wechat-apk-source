package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.m;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.l.i;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends b
{
  public static final int CTRL_INDEX = 272;
  public static final String NAME = "createUploadTask";

  static void a(c paramc, String paramString1, String paramString2)
  {
    AppMethodBeat.i(108058);
    HashMap localHashMap = new HashMap();
    localHashMap.put("uploadTaskId", paramString1);
    localHashMap.put("state", "fail");
    localHashMap.put("errMsg", paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    new a().j(paramc).AM(paramString1).aCj();
    AppMethodBeat.o(108058);
  }

  public final String OA()
  {
    return "uploadTaskId";
  }

  public final void a(final c paramc, JSONObject paramJSONObject, final String paramString)
  {
    AppMethodBeat.i(108057);
    ab.d("MicroMsg.JsApiCreateUploadTask", "JsApiCreateUploadTask");
    String str1 = paramc.getAppId();
    String str2 = paramJSONObject.optString("filePath");
    if (bo.isNullOrNil(str2))
    {
      a(paramc, paramString, "filePath is null");
      AppMethodBeat.o(108057);
    }
    Object localObject;
    final String str3;
    String str4;
    com.tencent.mm.plugin.appbrand.l.g.a local1;
    com.tencent.mm.plugin.appbrand.l.a locala;
    Map localMap;
    while (true)
    {
      return;
      localObject = paramc.asE().yg(str2);
      if ((localObject == null) || (!((File)localObject).exists()))
      {
        ab.e("MicroMsg.JsApiCreateUploadTask", "upload appId(%s) tempFilePath(%s), found no real file", new Object[] { paramc.getAppId(), str2 });
        a(paramc, paramString, "fail:file doesn't exist");
        AppMethodBeat.o(108057);
      }
      else
      {
        str3 = ((File)localObject).getAbsolutePath();
        str4 = com.tencent.mm.sdk.f.b.ako(str2);
        ab.i("MicroMsg.JsApiCreateUploadTask", "upload appId(%s) tempFilePath(%s) realFilePath(%s)", new Object[] { paramc.getAppId(), str2, str3 });
        local1 = new com.tencent.mm.plugin.appbrand.l.g.a()
        {
          private JSONObject hRr;
          private JSONArray hRs;

          public final void BC(String paramAnonymousString)
          {
            AppMethodBeat.i(108052);
            if (g.j(paramc, paramString))
              AppMethodBeat.o(108052);
            while (true)
            {
              return;
              g.a(paramc, paramString, paramAnonymousString);
              AppMethodBeat.o(108052);
            }
          }

          public final void g(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
          {
            AppMethodBeat.i(108053);
            if (paramAnonymousInt1 == 0)
            {
              ab.d("MicroMsg.JsApiCreateUploadTask", "success: file name %s, result %s , errMsg %d", new Object[] { str3, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
              HashMap localHashMap = new HashMap();
              localHashMap.put("data", paramAnonymousString);
              localHashMap.put("statusCode", Integer.valueOf(paramAnonymousInt2));
              localHashMap.put("uploadTaskId", paramString);
              localHashMap.put("state", "success");
              if (this.hRr != null)
                localHashMap.put("header", this.hRr);
              if (this.hRs != null)
                localHashMap.put("cookies", this.hRs);
              paramAnonymousString = new JSONObject(localHashMap).toString();
              new g.a().j(paramc).AM(paramAnonymousString).aCj();
              AppMethodBeat.o(108053);
            }
            while (true)
            {
              return;
              if (g.j(paramc, paramString))
              {
                AppMethodBeat.o(108053);
              }
              else
              {
                ab.e("MicroMsg.JsApiCreateUploadTask", "error: file name %s, result %s , errMsg %d", new Object[] { str3, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
                g.a(paramc, paramString, paramAnonymousString);
                AppMethodBeat.o(108053);
              }
            }
          }

          public final void h(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
          {
            AppMethodBeat.i(108054);
            Object localObject = new HashMap();
            ((Map)localObject).put("uploadTaskId", paramString);
            ((Map)localObject).put("state", "progressUpdate");
            ((Map)localObject).put("progress", Integer.valueOf(paramAnonymousInt));
            ((Map)localObject).put("totalBytesSent", Long.valueOf(paramAnonymousLong1));
            ((Map)localObject).put("totalBytesExpectedToSend", Long.valueOf(paramAnonymousLong2));
            localObject = new JSONObject((Map)localObject).toString();
            new g.a().j(paramc).AM((String)localObject).aCj();
            AppMethodBeat.o(108054);
          }

          public final void p(JSONObject paramAnonymousJSONObject)
          {
            AppMethodBeat.i(108055);
            if (paramAnonymousJSONObject == null)
              AppMethodBeat.o(108055);
            while (true)
            {
              return;
              if (paramAnonymousJSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__"))
              {
                if (!((com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class)).bQf)
                {
                  AppMethodBeat.o(108055);
                }
                else
                {
                  paramAnonymousJSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                  m localm = new m();
                  localm.csn.cso = "upload";
                  localm.csn.csq = paramAnonymousJSONObject;
                  localm.csn.csp = paramString;
                  com.tencent.mm.sdk.b.a.xxA.m(localm);
                  AppMethodBeat.o(108055);
                }
              }
              else
              {
                this.hRr = paramAnonymousJSONObject;
                this.hRs = this.hRr.optJSONArray("cookies");
                paramAnonymousJSONObject = new HashMap();
                paramAnonymousJSONObject.put("uploadTaskId", paramString);
                paramAnonymousJSONObject.put("state", "headersReceived");
                paramAnonymousJSONObject.put("header", this.hRr);
                if (this.hRs != null)
                  paramAnonymousJSONObject.put("cookies", this.hRs);
                paramAnonymousJSONObject = new JSONObject(paramAnonymousJSONObject).toString();
                new g.a().j(paramc).AM(paramAnonymousJSONObject).aCj();
                AppMethodBeat.o(108055);
              }
            }
          }
        };
        locala = (com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class);
        localMap = j.a(paramJSONObject, locala);
        localObject = paramJSONObject.optString("url");
        if (!bo.isNullOrNil((String)localObject))
          break;
        ab.i("MicroMsg.JsApiCreateUploadTask", "url is null");
        a(paramc, paramString, "url is null or nil");
        AppMethodBeat.o(108057);
      }
    }
    if ((locala.ioe) && (paramJSONObject.optBoolean("__skipDomainCheck__")))
    {
      i = 1;
      label254: if (i == 0)
        break label317;
    }
    label317: for (boolean bool = false; ; bool = locala.iof)
    {
      if ((!bool) || (j.c(locala.bQH, (String)localObject)))
        break label327;
      ab.i("MicroMsg.JsApiCreateUploadTask", "not in domain url %s", new Object[] { localObject });
      a(paramc, paramString, "url not in domain list");
      AppMethodBeat.o(108057);
      break;
      i = 0;
      break label254;
    }
    label327: if (locala.bQx <= 0)
      ab.i("MicroMsg.JsApiCreateUploadTask", "concurrent <= 0 ");
    int j = paramJSONObject.optInt("timeout", 0);
    int i = j;
    if (j <= 0)
      i = j.a(locala, 2);
    if (i > 0);
    while (true)
    {
      if (i.aIG().CO(str1) == null)
      {
        localObject = new com.tencent.mm.plugin.appbrand.l.g(paramc);
        i locali = i.aIG();
        paramc = (c)localObject;
        if (!locali.hGk.containsKey(str1))
          locali.hGk.put(str1, localObject);
      }
      for (paramc = (c)localObject; ; paramc = i.aIG().CO(str1))
      {
        localObject = org.apache.commons.a.b.getName(str2);
        if (paramc == null)
          break label540;
        ab.i("MicroMsg.JsApiCreateUploadTask", "before do upload, checkDomains = %b, timeout %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
        if (bool)
          break label515;
        paramc.a(i, str4, str3, paramJSONObject, localMap, null, local1, paramString, "createUploadTask", (String)localObject);
        AppMethodBeat.o(108057);
        break;
      }
      label515: paramc.a(i, str4, str3, paramJSONObject, localMap, locala.bQH, local1, paramString, "createUploadTask", (String)localObject);
      label540: AppMethodBeat.o(108057);
      break;
      i = 60000;
    }
  }

  public final String aBA()
  {
    AppMethodBeat.i(108056);
    Object localObject = new StringBuilder();
    i.aIG();
    localObject = i.aIA();
    AppMethodBeat.o(108056);
    return localObject;
  }

  public static final class a extends ah
  {
    public static final int CTRL_INDEX = 274;
    public static final String NAME = "onUploadTaskStateChange";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.g
 * JD-Core Version:    0.6.2
 */