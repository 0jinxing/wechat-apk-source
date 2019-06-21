package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandLauncherCollectionList$refreshDataList$workerRunner$1$1$1"})
final class AppBrandLauncherCollectionList$h$a
  implements Runnable
{
  AppBrandLauncherCollectionList$h$a(List paramList, AppBrandLauncherCollectionList.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135060);
    Object localObject;
    if (this.iLl.isEmpty())
    {
      localObject = this.iLC.iLx.getActivity();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.launcher.IFolderActivityContext");
        AppMethodBeat.o(135060);
        throw ((Throwable)localObject);
      }
      ((b)localObject).eE(false);
      localObject = (Runnable)this.iLC.iLk.invoke();
      if (localObject == null)
        break label229;
      ((Runnable)localObject).run();
      AppMethodBeat.o(135060);
    }
    while (true)
    {
      return;
      localObject = AppBrandLauncherCollectionList.a(this.iLC.iLx);
      if (localObject == null)
        j.dWJ();
      ((a)localObject).iLD.clear();
      localObject = AppBrandLauncherCollectionList.a(this.iLC.iLx);
      if (localObject == null)
        j.dWJ();
      ((a)localObject).iLD.addAll((Collection)this.iLl);
      if (this.iLC.iLj)
      {
        localObject = AppBrandLauncherCollectionList.a(this.iLC.iLx);
        if (localObject == null)
          j.dWJ();
        ((a)localObject).ar(0, this.iLl.size());
        break;
      }
      localObject = AppBrandLauncherCollectionList.a(this.iLC.iLx);
      if (localObject == null)
        j.dWJ();
      ((a)localObject).at(0, this.iLl.size());
      break;
      label229: AppMethodBeat.o(135060);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.h.a
 * JD-Core Version:    0.6.2
 */