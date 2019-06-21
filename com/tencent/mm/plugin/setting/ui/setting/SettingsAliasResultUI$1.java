package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAliasResultUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAliasResultUI$1(SettingsAliasResultUI paramSettingsAliasResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127177);
    this.qmR.finish();
    AppMethodBeat.o(127177);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI.1
 * JD-Core Version:    0.6.2
 */