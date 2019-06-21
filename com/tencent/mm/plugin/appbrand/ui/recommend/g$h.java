package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onLoadMore"})
final class g$h
  implements LoadMoreRecyclerView.a
{
  g$h(g paramg)
  {
  }

  public final void aMC()
  {
    AppMethodBeat.i(135190);
    if (g.a(this.iQA).aNO())
    {
      ab.d(g.access$getTAG$cp(), "can load more: let's do fetch");
      g.b(this.iQA);
    }
    AppMethodBeat.o(135190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.g.h
 * JD-Core Version:    0.6.2
 */