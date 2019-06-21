package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.f;
import com.tencent.mm.plugin.appbrand.appusage.f.b;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class AppBrandCollectionVerticalSortList$d
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandCollectionVerticalSortList$d(AppBrandCollectionVerticalSortList paramAppBrandCollectionVerticalSortList)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(135045);
    paramMenuItem = f.gYW;
    paramMenuItem = f.awZ();
    if (paramMenuItem == null)
      j.dWJ();
    c localc = AppBrandCollectionVerticalSortList.a(this.iLs);
    if (localc == null)
      j.dWJ();
    paramMenuItem.a((List)localc.iLD, (f.b)new AppBrandCollectionVerticalSortList.d.1(this));
    AppMethodBeat.o(135045);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.d
 * JD-Core Version:    0.6.2
 */