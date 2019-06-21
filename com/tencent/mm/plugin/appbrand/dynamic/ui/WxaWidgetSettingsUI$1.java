package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaWidgetSettingsUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WxaWidgetSettingsUI$1(WxaWidgetSettingsUI paramWxaWidgetSettingsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(11030);
    this.hpm.finish();
    AppMethodBeat.o(11030);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetSettingsUI.1
 * JD-Core Version:    0.6.2
 */