package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsModifyUserAuthUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsModifyUserAuthUI$1(SettingsModifyUserAuthUI paramSettingsModifyUserAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127317);
    this.qnX.finish();
    AppMethodBeat.o(127317);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI.1
 * JD-Core Version:    0.6.2
 */