package com.tencent.mm.plugin.appbrand.ui.collection;

import a.a.v;
import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandLauncherCollectionList$h
  implements Runnable
{
  AppBrandLauncherCollectionList$h(AppBrandLauncherCollectionList paramAppBrandLauncherCollectionList, boolean paramBoolean, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135061);
    List localList = ((af)g.K(af.class)).a(2147483647, af.a.haK);
    if (localList == null)
      localList = (List)v.AUP;
    while (true)
    {
      this.iLx.runOnUiThread((Runnable)new AppBrandLauncherCollectionList.h.a(localList, this));
      AppMethodBeat.o(135061);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.h
 * JD-Core Version:    0.6.2
 */