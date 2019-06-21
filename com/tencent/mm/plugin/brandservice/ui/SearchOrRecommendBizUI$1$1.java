package com.tencent.mm.plugin.brandservice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SearchOrRecommendBizUI$1$1
  implements Runnable
{
  SearchOrRecommendBizUI$1$1(SearchOrRecommendBizUI.1 param1, f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14040);
    ab.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "Has got recommend groups, so notifyDataSetChanged.");
    this.jMF.notifyDataSetChanged();
    AppMethodBeat.o(14040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI.1.1
 * JD-Core Version:    0.6.2
 */