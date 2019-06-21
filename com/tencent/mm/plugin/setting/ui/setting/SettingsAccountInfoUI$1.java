package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAccountInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAccountInfoUI$1(SettingsAccountInfoUI paramSettingsAccountInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127142);
    this.qmD.aqX();
    this.qmD.finish();
    AppMethodBeat.o(127142);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.1
 * JD-Core Version:    0.6.2
 */