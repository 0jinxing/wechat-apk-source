package com.tencent.mm.plugin.appbrand.page;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.a;

final class w$6
  implements d.a
{
  w$6(w paramw)
  {
  }

  public final LocalUsageInfo aJZ()
  {
    AppMethodBeat.i(132387);
    LocalUsageInfo localLocalUsageInfo;
    if (!this.itx.isRunning())
    {
      localLocalUsageInfo = null;
      AppMethodBeat.o(132387);
    }
    while (true)
    {
      return localLocalUsageInfo;
      localLocalUsageInfo = new LocalUsageInfo(this.itx.getRuntime().atI().username, this.itx.getRuntime().atH().appId, this.itx.getRuntime().atH().hhd.gVt, this.itx.getRuntime().atH().hhd.gVu, this.itx.getRuntime().atH().cwz, this.itx.getRuntime().atH().bQo, this.itx.getRuntime().atH().hgW, false, this.itx.getRuntime().atH().xE(), 0L);
      AppMethodBeat.o(132387);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.6
 * JD-Core Version:    0.6.2
 */