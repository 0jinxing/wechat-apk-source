package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.q;
import java.util.List;

final class BizTimeLineUI$14
  implements Runnable
{
  BizTimeLineUI$14(BizTimeLineUI paramBizTimeLineUI, int paramInt, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14198);
    if ((BizTimeLineUI.e(this.jOK)) && (this.jOL != 0))
    {
      BizTimeLineUI.f(this.jOK);
      this.jOK.aWC();
    }
    if ((BizTimeLineUI.e(this.jOK)) && (this.jOL == 0))
      BizTimeLineUI.a(this.jOK, BizTimeLineUI.c(this.jOK).sg(0));
    if (!bo.ek(this.ibp))
    {
      long l = ((q)this.ibp.get(0)).field_orderFlag;
      b.a("BrandServiceWorkerThread", new f.3(BizTimeLineUI.h(this.jOK), l, BizTimeLineUI.g(this.jOK)), 0L);
    }
    AppMethodBeat.o(14198);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.14
 * JD-Core Version:    0.6.2
 */