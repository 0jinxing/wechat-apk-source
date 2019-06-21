package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsNotificationUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsNotificationUI$1(SettingsNotificationUI paramSettingsNotificationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127351);
    this.qoe.aqX();
    this.qoe.finish();
    AppMethodBeat.o(127351);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.1
 * JD-Core Version:    0.6.2
 */