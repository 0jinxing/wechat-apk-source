package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class s$2
  implements n.a
{
  s$2(s params, String paramString, long paramLong)
  {
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(129066);
    ab.e("MicroMsg.AppBrandService", "Inject External Service Script Failed: %s", new Object[] { paramString });
    try
    {
      h.pYm.a(370L, 10L, 1L, false);
      c.br(this.gPV.getAppId(), 24);
      c.a(this.gPV.getAppId(), this.gPV.gOq.atH().hhd.gVu, this.gPV.gOq.atH().hhd.gVt, 370, 10);
      AppMethodBeat.o(129066);
      return;
    }
    catch (NullPointerException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandService", "Inject External Service Script Failed, report npe = %s", new Object[] { paramString });
        AppMethodBeat.o(129066);
      }
    }
  }

  public final void onSuccess(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(129065);
    if ((this.gPV.atU()) || (this.gPV.isRunning()))
    {
      paramString = this.gPV.getRuntime();
      if (paramString == null)
        break label126;
    }
    label126: for (int j = paramString.hashCode(); ; j = -1)
    {
      ab.i("MicroMsg.AppBrandService", "[QualitySystem] app-service.js runtime.hashCode = [%d]", new Object[] { Integer.valueOf(j) });
      String str1 = this.gPV.getAppId();
      String str2 = this.gPY;
      long l = this.gMV;
      j = i;
      if (paramString != null)
        j = paramString.hashCode();
      a.a(str1, "app-service.js", str2, l, j);
      h.pYm.a(370L, 11L, 1L, false);
      AppMethodBeat.o(129065);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.2
 * JD-Core Version:    0.6.2
 */