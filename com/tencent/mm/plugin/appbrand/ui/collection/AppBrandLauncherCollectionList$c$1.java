package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandLauncherCollectionList$c$1
  implements Runnable
{
  AppBrandLauncherCollectionList$c$1(AppBrandLauncherCollectionList.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135051);
    Object localObject = AppBrandLauncherCollectionList.b(this.iLy.iLx);
    if (localObject == null)
      j.dWJ();
    ((i)localObject).setLayoutFrozen(true);
    localObject = AppBrandLauncherCollectionList.e(this.iLy.iLx);
    if (localObject == null)
      j.dWJ();
    ((b)localObject).setTouchEnabled(false);
    AppMethodBeat.o(135051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.c.1
 * JD-Core Version:    0.6.2
 */