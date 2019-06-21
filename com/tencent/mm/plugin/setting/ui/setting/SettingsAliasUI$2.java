package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAliasUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAliasUI$2(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127185);
    this.qmW.aqX();
    this.qmW.finish();
    AppMethodBeat.o(127185);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.2
 * JD-Core Version:    0.6.2
 */