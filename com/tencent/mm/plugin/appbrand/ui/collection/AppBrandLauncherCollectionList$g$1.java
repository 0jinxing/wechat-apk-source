package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.config.j.a;
import com.tencent.mm.plugin.appbrand.config.r;
import java.util.HashSet;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandLauncherCollectionList$g$1
  implements Runnable
{
  AppBrandLauncherCollectionList$g$1(AppBrandLauncherCollectionList.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135058);
    AppBrandLauncherCollectionList.aMY();
    if (this.iLB.iLx.isAdded())
      AppBrandLauncherCollectionList.d(this.iLB.iLx);
    HashSet localHashSet = new HashSet();
    Object localObject = AppBrandLauncherCollectionList.a(this.iLB.iLx);
    if (localObject == null)
      a.f.b.j.dWJ();
    localObject = ((Iterable)((a)localObject).iLD).iterator();
    while (((Iterator)localObject).hasNext())
      localHashSet.add(((LocalUsageInfo)((Iterator)localObject).next()).username);
    r.a(a.a.j.m((Iterable)localHashSet), j.a.hhn);
    AppMethodBeat.o(135058);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.g.1
 * JD-Core Version:    0.6.2
 */