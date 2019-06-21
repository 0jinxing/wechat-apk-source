package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsManageAuthUI$6
  implements MenuItem.OnMenuItemClickListener
{
  SettingsManageAuthUI$6(SettingsManageAuthUI paramSettingsManageAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127251);
    if (paramMenuItem.getItemId() == 700)
    {
      SettingsManageAuthUI.a(this.qnv, true);
      SettingsManageAuthUI.d(this.qnv).notifyDataSetChanged();
      SettingsManageAuthUI.e(this.qnv);
    }
    AppMethodBeat.o(127251);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI.6
 * JD-Core Version:    0.6.2
 */