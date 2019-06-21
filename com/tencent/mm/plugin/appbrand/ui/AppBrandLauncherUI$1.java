package com.tencent.mm.plugin.appbrand.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class AppBrandLauncherUI$1
  implements Runnable
{
  AppBrandLauncherUI$1(AppBrandLauncherUI paramAppBrandLauncherUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132970);
    if ((this.iGN.uiu) || (this.iGN.isFinishing()))
      AppMethodBeat.o(132970);
    while (true)
    {
      return;
      Fragment localFragment = AppBrandLauncherUI.a(this.iGN).findFragmentById(16908290);
      if ((localFragment == null) || (!(localFragment instanceof AppBrandLauncherUI.Fragment)))
      {
        AppMethodBeat.o(132970);
      }
      else
      {
        ((AppBrandLauncherUI.Fragment)localFragment).aMf();
        AppMethodBeat.o(132970);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.1
 * JD-Core Version:    0.6.2
 */