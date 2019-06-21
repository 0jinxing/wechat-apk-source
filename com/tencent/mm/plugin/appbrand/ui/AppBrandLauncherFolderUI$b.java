package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class AppBrandLauncherFolderUI$b
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandLauncherFolderUI$b(AppBrandLauncherFolderUI paramAppBrandLauncherFolderUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(134989);
    this.iGH.finish();
    AppMethodBeat.o(134989);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.b
 * JD-Core Version:    0.6.2
 */