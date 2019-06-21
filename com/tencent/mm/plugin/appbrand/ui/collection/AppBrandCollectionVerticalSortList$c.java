package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "which", "", "remove"})
final class AppBrandCollectionVerticalSortList$c
  implements DragSortListView.l
{
  AppBrandCollectionVerticalSortList$c(AppBrandCollectionVerticalSortList paramAppBrandCollectionVerticalSortList)
  {
  }

  public final void remove(int paramInt)
  {
    AppMethodBeat.i(135041);
    c localc = AppBrandCollectionVerticalSortList.a(this.iLs);
    if (localc != null)
    {
      localc.pR(paramInt);
      AppMethodBeat.o(135041);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135041);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.c
 * JD-Core Version:    0.6.2
 */