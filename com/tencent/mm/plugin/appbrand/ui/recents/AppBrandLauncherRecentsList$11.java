package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.j;
import com.tencent.mm.plugin.appbrand.appusage.q;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.appusage.w.c;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.protocal.protobuf.are;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

final class AppBrandLauncherRecentsList$11
  implements Runnable
{
  AppBrandLauncherRecentsList$11(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(133343);
    ArrayList localArrayList = AppBrandLauncherRecentsList.m(this.iMV).q(f.auT().hap.gi(9223372036854775807L));
    AppBrandLauncherRecentsList.t(this.iMV);
    int i = this.iMV.gOW;
    String str = this.iMV.iGQ;
    Object localObject2;
    Object localObject3;
    int j;
    if ((localArrayList == null) || (localArrayList.size() <= 0))
    {
      localObject2 = null;
      localObject3 = "";
      are localare = q.axq();
      if (localare == null)
        break label348;
      j = localare.jsN;
      localObject3 = localare.wuS;
    }
    while (true)
    {
      c.a(i, "", (String)localObject2, j, (String)localObject3, str);
      if (AppBrandLauncherRecentsList.i(this.iMV))
        localObject2 = new ArrayList(0);
      while (true)
      {
        this.iMV.runOnUiThread(new AppBrandLauncherRecentsList.11.1(this, (ArrayList)localObject2, localArrayList));
        j.axh().a(AppBrandLauncherRecentsList.j(this.iMV).get(), true, AppBrandLauncherRecentsList.v(this.iMV), AppBrandLauncherRecentsList.w(this.iMV), AppBrandLauncherRecentsList.x(this.iMV));
        AppBrandLauncherRecentsList.y(this.iMV).set(true);
        AppMethodBeat.o(133343);
        return;
        localObject2 = new StringBuilder();
        int k = 0;
        for (int m = 0; k < localArrayList.size(); m = j)
        {
          localObject3 = localArrayList.get(k);
          j = m;
          if ((localObject3 instanceof AppBrandRecentTaskInfo))
          {
            localObject3 = (AppBrandRecentTaskInfo)localObject3;
            j = m + 1;
            ((StringBuilder)localObject2).append(((AppBrandRecentTaskInfo)localObject3).appId);
            if ((j == 20) || (j >= localArrayList.size()))
              break;
            ((StringBuilder)localObject2).append(":#:");
          }
          k++;
        }
        localObject2 = ((StringBuilder)localObject2).toString();
        break;
        localObject2 = localObject1;
        if (AppBrandLauncherRecentsList.n(this.iMV))
          localObject2 = ((s)f.E(s.class)).a(af.a.haL);
      }
      label348: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.11
 * JD-Core Version:    0.6.2
 */