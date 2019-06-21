package com.tencent.mm.plugin.brandservice.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.sortview.c;
import java.util.List;

final class BrandServiceSortView$4
  implements Runnable
{
  BrandServiceSortView$4(BrandServiceSortView paramBrandServiceSortView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14061);
    ab.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run");
    List localList = this.jMW.getDatas();
    if ((this.sN >= 0) && (localList != null) && (this.sN < localList.size()))
    {
      localList.remove(this.sN);
      this.jMW.getAdapter().refresh();
      AppMethodBeat.o(14061);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run refresh all");
      this.jMW.refresh();
      AppMethodBeat.o(14061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.4
 * JD-Core Version:    0.6.2
 */