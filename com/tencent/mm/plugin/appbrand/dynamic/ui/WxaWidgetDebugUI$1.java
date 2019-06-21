package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaWidgetDebugUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WxaWidgetDebugUI$1(WxaWidgetDebugUI paramWxaWidgetDebugUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(11010);
    this.hpe.finish();
    AppMethodBeat.o(11010);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI.1
 * JD-Core Version:    0.6.2
 */