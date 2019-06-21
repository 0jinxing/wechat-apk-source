package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.m;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.file.ae;
import com.tencent.mm.plugin.appbrand.l.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class d$1
  implements b.a
{
  private JSONObject hRr;
  private JSONArray hRs;

  d$1(d paramd, String paramString1, c paramc, String paramString2)
  {
  }

  public final void AD(String paramString)
  {
    AppMethodBeat.i(108023);
    if (d.i(this.hxc, this.hRt))
      AppMethodBeat.o(108023);
    while (true)
    {
      return;
      d.a(this.hxc, this.hRt, paramString);
      AppMethodBeat.o(108023);
    }
  }

  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(108021);
    ab.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %s", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2) });
    if (!bo.isNullOrNil(this.fYh))
    {
      paramString1 = ae.a(this.hxc, new File(paramString2), this.fYh, null);
      if ((com.tencent.mm.plugin.appbrand.l.b.FAILED == paramInt1) || (!"ok".equals(paramString1)))
        if (d.i(this.hxc, this.hRt))
          AppMethodBeat.o(108021);
    }
    while (true)
    {
      return;
      d.a(this.hxc, this.hRt, paramString1);
      AppMethodBeat.o(108021);
      continue;
      ab.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode filePath %s", new Object[] { this.fYh });
      paramString1 = new HashMap();
      paramString1.put("downloadTaskId", this.hRt);
      paramString1.put("filePath", this.fYh);
      paramString1.put("statusCode", Integer.valueOf(paramInt2));
      paramString1.put("state", "success");
      if (this.hRr != null)
        paramString1.put("header", this.hRr);
      if (this.hRs != null)
        paramString1.put("cookies", this.hRs);
      paramString1 = new JSONObject(paramString1).toString();
      new d.a().j(this.hxc).AM(paramString1).aCj();
      AppMethodBeat.o(108021);
      continue;
      if (paramInt1 != com.tencent.mm.plugin.appbrand.l.b.FAILED)
      {
        c localc = this.hxc;
        String str1 = com.tencent.mm.sdk.f.b.ajn(paramString1);
        String str2 = str1;
        if (bo.isNullOrNil(str1))
        {
          str2 = str1;
          if ("audio/mp4".equals(paramString1))
            str2 = "mp4";
        }
        paramString1 = new com.tencent.mm.plugin.appbrand.r.j();
        if (localc.asE().a(new File(paramString2), str2, true, paramString1) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
          break label398;
        paramString1 = null;
      }
      while (true)
        if (paramString1 == null)
        {
          if (d.i(this.hxc, this.hRt))
          {
            AppMethodBeat.o(108021);
            break;
            label398: paramString1 = (String)paramString1.value;
            continue;
          }
          d.a(this.hxc, this.hRt, "download fail");
          AppMethodBeat.o(108021);
          break;
        }
      ab.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode localId %s", new Object[] { paramString1 });
      paramString2 = new HashMap();
      paramString2.put("downloadTaskId", this.hRt);
      paramString2.put("tempFilePath", paramString1);
      paramString2.put("statusCode", Integer.valueOf(paramInt2));
      paramString2.put("state", "success");
      if (this.hRr != null)
        paramString2.put("header", this.hRr);
      if (this.hRs != null)
        paramString2.put("cookies", this.hRs);
      paramString1 = new JSONObject(paramString2).toString();
      new d.a().j(this.hxc).AM(paramString1).aCj();
      AppMethodBeat.o(108021);
    }
  }

  public final void g(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(108022);
    Object localObject = new HashMap();
    ((Map)localObject).put("downloadTaskId", this.hRt);
    ((Map)localObject).put("state", "progressUpdate");
    ((Map)localObject).put("progress", Integer.valueOf(paramInt));
    ((Map)localObject).put("totalBytesWritten", Long.valueOf(paramLong1));
    ((Map)localObject).put("totalBytesExpectedToWrite", Long.valueOf(paramLong2));
    localObject = new JSONObject((Map)localObject).toString();
    new d.a().j(this.hxc).AM((String)localObject).aCj();
    AppMethodBeat.o(108022);
  }

  public final void p(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108024);
    if (paramJSONObject == null)
      AppMethodBeat.o(108024);
    while (true)
    {
      return;
      if (paramJSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__"))
      {
        if (!((com.tencent.mm.plugin.appbrand.l.a)this.hxc.aa(com.tencent.mm.plugin.appbrand.l.a.class)).bQf)
        {
          AppMethodBeat.o(108024);
        }
        else
        {
          paramJSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
          m localm = new m();
          localm.csn.cso = "download";
          localm.csn.csq = paramJSONObject;
          localm.csn.csp = this.hRt;
          com.tencent.mm.sdk.b.a.xxA.m(localm);
          AppMethodBeat.o(108024);
        }
      }
      else
      {
        this.hRr = paramJSONObject;
        this.hRs = this.hRr.optJSONArray("cookies");
        paramJSONObject = new HashMap();
        paramJSONObject.put("downloadTaskId", this.hRt);
        paramJSONObject.put("state", "headersReceived");
        paramJSONObject.put("header", this.hRr);
        if (this.hRs != null)
          paramJSONObject.put("cookies", this.hRs);
        paramJSONObject = new JSONObject(paramJSONObject).toString();
        new d.a().j(this.hxc).AM(paramJSONObject).aCj();
        AppMethodBeat.o(108024);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.d.1
 * JD-Core Version:    0.6.2
 */