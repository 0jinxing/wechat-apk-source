package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsNetStatUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsNetStatUI$2(SettingsNetStatUI paramSettingsNetStatUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127342);
    SettingsNetStatUI.a(this.qod);
    AppMethodBeat.o(127342);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.2
 * JD-Core Version:    0.6.2
 */