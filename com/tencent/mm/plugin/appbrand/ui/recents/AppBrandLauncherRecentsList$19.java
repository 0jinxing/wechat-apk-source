package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.appusage.w.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

final class AppBrandLauncherRecentsList$19
  implements k.a
{
  AppBrandLauncherRecentsList$19(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133358);
    try
    {
      long l2;
      ArrayList localArrayList;
      if ((paramm.obj != null) && ((paramm.obj instanceof Long)))
      {
        long l1 = AppBrandLauncherRecentsList.j(this.iMV).get();
        l2 = AppBrandLauncherRecentsList.k(this.iMV).get();
        ab.d("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack ticket %d, mInitFetchTicket %d, mPagingFetchTicket %d", new Object[] { (Long)paramm.obj, Long.valueOf(l1), Long.valueOf(l2) });
        if (paramm.obj.equals(Long.valueOf(l1)))
        {
          paramString = f.auT().hap.gi(9223372036854775807L);
          if (!bo.ek(paramString))
            AppBrandLauncherRecentsList.l(this.iMV).set(((AppBrandRecentTaskInfo)paramString.get(paramString.size() - 1)).updateTime);
          localArrayList = AppBrandLauncherRecentsList.m(this.iMV).q(paramString);
          if (!paramm.obj.equals(Long.valueOf(l1)))
            break label269;
          if (!AppBrandLauncherRecentsList.i(this.iMV))
            break label241;
          paramString = new java/util/ArrayList;
          paramString.<init>(0);
          label187: paramm = this.iMV;
          AppBrandLauncherRecentsList.19.1 local1 = new com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$19$1;
          local1.<init>(this, paramString, localArrayList);
          paramm.runOnUiThread(local1);
          AppMethodBeat.o(133358);
        }
      }
      while (true)
      {
        return;
        paramString = f.auT().hap.gi(AppBrandLauncherRecentsList.l(this.iMV).get());
        break;
        label241: if (AppBrandLauncherRecentsList.n(this.iMV))
        {
          paramString = f.auU().a(af.a.haL);
          break label187;
        }
        paramString = null;
        break label187;
        label269: if (paramm.obj.equals(Long.valueOf(l2)))
        {
          AppBrandLauncherRecentsList.a.a(AppBrandLauncherRecentsList.e(this.iMV));
          paramString = new com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$19$2;
          paramString.<init>(this, localArrayList);
          AppBrandLauncherRecentsList.e(this.iMV).sendMessage(AppBrandLauncherRecentsList.e(this.iMV).obtainMessage(1, paramString));
        }
        AppMethodBeat.o(133358);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack e %s", new Object[] { paramString });
        AppMethodBeat.o(133358);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.19
 * JD-Core Version:    0.6.2
 */