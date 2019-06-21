package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/collection/AppBrandLauncherCollectionList$onConfigurationChanged$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "counter", "", "onGlobalLayout", "", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherCollectionList$e
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private int counter;

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(135056);
    this.counter += 1;
    if (this.counter < 2)
      AppMethodBeat.o(135056);
    while (true)
    {
      return;
      Object localObject = AppBrandLauncherCollectionList.b(this.iLx);
      if (localObject != null)
      {
        localObject = ((i)localObject).getViewTreeObserver();
        if (localObject != null)
          ((ViewTreeObserver)localObject).removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
      }
      AppBrandLauncherCollectionList.c(this.iLx);
      AppMethodBeat.o(135056);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.e
 * JD-Core Version:    0.6.2
 */