package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.a.a;
import a.f.b.j;
import a.l;
import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.a.b;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$refreshDataList$workerRunner$1$1$1"})
final class AppBrandCollectionDisplayVerticalList$g$a
  implements Runnable
{
  AppBrandCollectionDisplayVerticalList$g$a(List paramList, AppBrandCollectionDisplayVerticalList.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135014);
    Object localObject;
    if (this.iLl.isEmpty())
    {
      FragmentActivity localFragmentActivity = this.iLm.iLg.getActivity();
      localObject = localFragmentActivity;
      if (!(localFragmentActivity instanceof b))
        localObject = null;
      localObject = (b)localObject;
      if (localObject != null)
        ((b)localObject).eE(false);
      localObject = (Runnable)this.iLm.iLk.invoke();
      if (localObject == null)
        break label193;
      ((Runnable)localObject).run();
      AppMethodBeat.o(135014);
    }
    while (true)
    {
      return;
      localObject = AppBrandCollectionDisplayVerticalList.b(this.iLm.iLg);
      if (localObject == null)
        j.dWJ();
      ((k)localObject).aO(this.iLl);
      if (this.iLm.iLj)
      {
        localObject = AppBrandCollectionDisplayVerticalList.b(this.iLm.iLg);
        if (localObject == null)
          j.dWJ();
        ((k)localObject).ar(0, this.iLl.size());
        break;
      }
      localObject = AppBrandCollectionDisplayVerticalList.b(this.iLm.iLg);
      if (localObject == null)
        j.dWJ();
      ((k)localObject).at(0, this.iLl.size());
      break;
      label193: AppMethodBeat.o(135014);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.g.a
 * JD-Core Version:    0.6.2
 */