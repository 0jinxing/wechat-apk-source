package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandCollectionDisplayVerticalList$g
  implements Runnable
{
  AppBrandCollectionDisplayVerticalList$g(AppBrandCollectionDisplayVerticalList paramAppBrandCollectionDisplayVerticalList, boolean paramBoolean, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135015);
    List localList = AppBrandCollectionDisplayVerticalList.aMW();
    this.iLg.runOnUiThread((Runnable)new AppBrandCollectionDisplayVerticalList.g.a(localList, this));
    AppMethodBeat.o(135015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.g
 * JD-Core Version:    0.6.2
 */