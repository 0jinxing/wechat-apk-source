package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingDeleteAccountUI$1(SettingDeleteAccountUI paramSettingDeleteAccountUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127070);
    this.qlO.aqX();
    this.qlO.finish();
    AppMethodBeat.o(127070);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI.1
 * JD-Core Version:    0.6.2
 */