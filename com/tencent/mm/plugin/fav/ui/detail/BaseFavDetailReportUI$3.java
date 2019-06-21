package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.a.x;

final class BaseFavDetailReportUI$3
  implements Runnable
{
  BaseFavDetailReportUI$3(BaseFavDetailReportUI paramBaseFavDetailReportUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74319);
    this.mlC.mlz.mff = (((ae)g.M(ae.class)).getFavItemInfoStorage().vz((int)this.mlC.mlz.meT) + 1);
    h.a(this.mlC.mlz);
    AppMethodBeat.o(74319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI.3
 * JD-Core Version:    0.6.2
 */