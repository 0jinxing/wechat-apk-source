package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class AppBrandVideoPreviewUI$a
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandVideoPreviewUI$a(AppBrandVideoPreviewUI paramAppBrandVideoPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(135003);
    this.iJz.onBackPressed();
    AppMethodBeat.o(135003);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI.a
 * JD-Core Version:    0.6.2
 */