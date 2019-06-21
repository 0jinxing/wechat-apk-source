package com.tencent.mm.plugin.appbrand.luggage.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.f;
import com.tencent.mm.plugin.appbrand.l.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;

public final class c
  implements o
{
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(132157);
    Object localObject1 = a.wJ(paramString1);
    if (localObject1 != null);
    while (true)
    {
      try
      {
        Object localObject2 = q.encode(paramString4, "utf-8");
        paramString4 = (String)localObject2;
        int i = ((com.tencent.mm.plugin.appbrand.config.h)localObject1).hhd.gVu;
        int j = ((com.tencent.mm.plugin.appbrand.config.h)localObject1).hhd.gVt + 1;
        localObject1 = com.tencent.mm.plugin.appbrand.report.c.cV(ah.getContext());
        com.tencent.mm.plugin.report.service.h.pYm.e(14510, new Object[] { paramString1, Integer.valueOf(i), Integer.valueOf(j), localObject1, paramString2, paramString4, paramString3, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        localObject2 = new StringBuilder("report kv_14510{");
        ((StringBuilder)localObject2).append("appId='").append(paramString1).append('\'').append(", appVersion=").append(i).append(", appState=").append(j).append(", networkType='").append((String)localObject1).append('\'').append(", functionName='").append(paramString2).append('\'').append(", url='").append(paramString4).append('\'').append(", method='").append(paramString3).append('\'').append(", sentsize=").append(paramLong1).append(", receivedsize=").append(paramLong2).append(", statusCode=").append(paramInt1).append(", result=").append(paramInt2).append(", costtime=").append(paramInt3).append('}');
        ab.d("MicroMsg.AppBrand.Report.kv_14510", ((StringBuilder)localObject2).toString());
        AppMethodBeat.o(132157);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        ab.w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report UnsupportedEncodingException");
        continue;
      }
      ab.w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report config is null. %s", new Object[] { paramString1 });
      AppMethodBeat.o(132157);
    }
  }

  public final void zT(String paramString)
  {
    AppMethodBeat.i(132158);
    paramString = a.wK(paramString);
    if (paramString != null)
      f.zT(bo.nullAsNil(paramString.cst));
    AppMethodBeat.o(132158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.c.c
 * JD-Core Version:    0.6.2
 */