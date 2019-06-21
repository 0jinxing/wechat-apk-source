package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class AppBrandLauncherFolderUI$c
  implements Runnable
{
  AppBrandLauncherFolderUI$c(AppBrandLauncherFolderUI paramAppBrandLauncherFolderUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134990);
    Fragment localFragment = this.iGH.getSupportFragmentManager().findFragmentById(16908290);
    Object localObject = localFragment;
    if (!(localFragment instanceof AppBrandLauncherUI.Fragment))
      localObject = null;
    localObject = (AppBrandLauncherUI.Fragment)localObject;
    if (localObject != null)
    {
      ((AppBrandLauncherUI.Fragment)localObject).aMf();
      AppMethodBeat.o(134990);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.c
 * JD-Core Version:    0.6.2
 */