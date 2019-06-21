package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.aa.h;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.launching.l;
import com.tencent.mm.protocal.protobuf.aoy;
import com.tencent.mm.protocal.protobuf.aoz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class e extends com.tencent.mm.ai.a<aoz>
{
  public final b ehh;

  public e(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129323);
    b.a locala = new b.a();
    locala.fsI = 1718;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/gettestcodedownloadinfo";
    aoy localaoy = new aoy();
    localaoy.csB = paramString1;
    if (paramInt2 != 12)
      localaoy.wsY = paramString2;
    localaoy.wsZ = paramString3;
    localaoy.vSb = paramInt1;
    localaoy.wtb = paramInt2;
    if (paramInt1 == 1)
      paramString3 = ((l)com.tencent.mm.plugin.appbrand.app.f.E(l.class)).bn(paramString1, paramInt1);
    try
    {
      long l = h.lw(paramString3).optLong("dev_key");
      paramString3 = new com/tencent/mm/a/p;
      paramString3.<init>(l);
      localaoy.wta = paramString3.intValue();
      locala.fsJ = localaoy;
      locala.fsK = new aoz();
      paramString3 = locala.acD();
      this.ehh = paramString3;
      this.ehh = paramString3;
      ab.d("MicroMsg.AppBrand.CgiGetTestCodeDownloadInfo", "appid:%s,module_name:%s,code_type:%d,package type:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(129323);
      return;
    }
    catch (Exception paramString3)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.CgiGetTestCodeDownloadInfo", "opt devKey %s", new Object[] { paramString3 });
    }
  }

  public final com.tencent.mm.ci.f<a.a<aoz>> acy()
  {
    try
    {
      AppMethodBeat.i(129324);
      long l = bo.anU();
      com.tencent.mm.ci.f localf = super.acy();
      Object localObject1 = new com/tencent/mm/plugin/appbrand/appcache/e$1;
      ((e.1)localObject1).<init>(this, l);
      localObject1 = localf.b((com.tencent.mm.vending.c.a)localObject1);
      AppMethodBeat.o(129324);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.e
 * JD-Core Version:    0.6.2
 */