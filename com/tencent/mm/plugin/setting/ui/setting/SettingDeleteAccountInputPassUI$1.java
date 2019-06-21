package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountInputPassUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingDeleteAccountInputPassUI$1(SettingDeleteAccountInputPassUI paramSettingDeleteAccountInputPassUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127066);
    this.qlN.aqX();
    this.qlN.finish();
    AppMethodBeat.o(127066);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI.1
 * JD-Core Version:    0.6.2
 */