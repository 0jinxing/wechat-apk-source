package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAboutSystemUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAboutSystemUI$1(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127107);
    this.qml.aqX();
    this.qml.finish();
    AppMethodBeat.o(127107);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.1
 * JD-Core Version:    0.6.2
 */