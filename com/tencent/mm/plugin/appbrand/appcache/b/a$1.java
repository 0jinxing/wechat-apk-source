package com.tencent.mm.plugin.appbrand.appcache.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting;
import com.tencent.mm.protocal.protobuf.cga;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;

public final class a$1
  implements Runnable
{
  private void aA(List<cga> paramList)
  {
    AppMethodBeat.i(129441);
    com.tencent.mm.plugin.appbrand.appcache.b.c.a locala = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
    com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(0L, 0L);
    new a(paramList, (byte)0).acy().h(new a.1.1(this));
    AppMethodBeat.o(129441);
  }

  public final void run()
  {
    AppMethodBeat.i(129440);
    if ((!g.RN().eJb) || (com.tencent.mm.plugin.appbrand.app.f.auK() == null) || (com.tencent.mm.plugin.appbrand.app.f.auV() == null))
      AppMethodBeat.o(129440);
    while (true)
    {
      return;
      long l1 = ((Long)g.RP().Ry().get(ac.a.xOx, Long.valueOf(0L))).longValue();
      long l2 = AppBrandGlobalSystemConfig.ayC().hge.hgy;
      long l3 = bo.anT();
      if (l3 >= l1 + l2);
      List localList;
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label138;
        g.RP().Ry().set(ac.a.xOx, Long.valueOf(l3));
        localList = a.awt();
        if (!bo.ek(localList))
          break label146;
        ab.e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, empty list");
        AppMethodBeat.o(129440);
        break;
      }
      label138: AppMethodBeat.o(129440);
      continue;
      label146: int j = AppBrandGlobalSystemConfig.ayC().hge.hgB;
      i = 0;
      int k = 0;
      while (i < localList.size() / j)
      {
        int m = i * j;
        k = m + j;
        aA(localList.subList(m, k));
        i++;
      }
      if (k < localList.size())
        aA(localList.subList(k, localList.size()));
      AppMethodBeat.o(129440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.a.1
 * JD-Core Version:    0.6.2
 */