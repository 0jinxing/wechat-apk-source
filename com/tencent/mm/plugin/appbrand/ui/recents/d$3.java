package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class d$3
  implements Runnable
{
  d$3(d paramd, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133327);
    if (!d.c(this.iMi))
      AppMethodBeat.o(133327);
    while (true)
    {
      return;
      d.b(this.iMi, this.iMj);
      int i = Math.min(4, this.iMj.size());
      this.iMi.iMd.setIconLayerCount(i);
      Iterator localIterator = this.iMj.iterator();
      for (int j = 0; ; j++)
      {
        if (!localIterator.hasNext())
          break label142;
        LocalUsageInfo localLocalUsageInfo = (LocalUsageInfo)localIterator.next();
        if (i == j)
        {
          AppMethodBeat.o(133327);
          break;
        }
        b.abR().a(this.iMi.iMd.qf(j), localLocalUsageInfo.haO, a.abQ(), d.d(this.iMi));
      }
      label142: if (bo.ek(this.iMj))
      {
        this.iMi.iMd.eO(true);
        AppMethodBeat.o(133327);
      }
      else
      {
        this.iMi.iMd.aOB();
        AppMethodBeat.o(133327);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.d.3
 * JD-Core Version:    0.6.2
 */