package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.a.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandCollectionDisplayVerticalList$k
  implements Runnable
{
  AppBrandCollectionDisplayVerticalList$k(AppBrandCollectionDisplayVerticalList paramAppBrandCollectionDisplayVerticalList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135019);
    FragmentActivity localFragmentActivity = this.iLg.getActivity();
    Object localObject = localFragmentActivity;
    if (!(localFragmentActivity instanceof b))
      localObject = null;
    localObject = (b)localObject;
    if (localObject != null)
    {
      ((b)localObject).eE(false);
      AppMethodBeat.o(135019);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135019);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.k
 * JD-Core Version:    0.6.2
 */