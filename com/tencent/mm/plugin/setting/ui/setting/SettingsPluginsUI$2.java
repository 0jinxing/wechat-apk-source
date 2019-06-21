package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPluginsUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsPluginsUI$2(SettingsPluginsUI paramSettingsPluginsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127399);
    this.qoo.aqX();
    this.qoo.finish();
    AppMethodBeat.o(127399);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI.2
 * JD-Core Version:    0.6.2
 */