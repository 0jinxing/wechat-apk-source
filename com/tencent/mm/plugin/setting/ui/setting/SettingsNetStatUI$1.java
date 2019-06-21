package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsNetStatUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsNetStatUI$1(SettingsNetStatUI paramSettingsNetStatUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127341);
    this.qod.aqX();
    this.qod.finish();
    AppMethodBeat.o(127341);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.1
 * JD-Core Version:    0.6.2
 */