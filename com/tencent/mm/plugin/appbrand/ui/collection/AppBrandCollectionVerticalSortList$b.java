package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "from", "", "to", "drop"})
final class AppBrandCollectionVerticalSortList$b
  implements DragSortListView.h
{
  AppBrandCollectionVerticalSortList$b(AppBrandCollectionVerticalSortList paramAppBrandCollectionVerticalSortList)
  {
  }

  public final void dm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135040);
    Object localObject = AppBrandCollectionVerticalSortList.a(this.iLs);
    if (localObject != null)
    {
      localObject = ((c)localObject).pR(paramInt1);
      if (localObject != null)
      {
        c localc = AppBrandCollectionVerticalSortList.a(this.iLs);
        if (localc != null)
        {
          localc.insert(localObject, paramInt2);
          AppMethodBeat.o(135040);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135040);
      continue;
      AppMethodBeat.o(135040);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.b
 * JD-Core Version:    0.6.2
 */