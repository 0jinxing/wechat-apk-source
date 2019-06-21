package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WidgetConsoleUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WidgetConsoleUI$1(WidgetConsoleUI paramWidgetConsoleUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(11002);
    this.hpa.finish();
    AppMethodBeat.o(11002);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WidgetConsoleUI.1
 * JD-Core Version:    0.6.2
 */