package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class AppBrandCollectionVerticalSortList$e
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandCollectionVerticalSortList$e(AppBrandCollectionVerticalSortList paramAppBrandCollectionVerticalSortList)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(135046);
    paramMenuItem = this.iLs.getActivity();
    if (paramMenuItem != null)
      paramMenuItem.finish();
    AppMethodBeat.o(135046);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.e
 * JD-Core Version:    0.6.2
 */