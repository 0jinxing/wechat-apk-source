package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsManageFindMoreUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsManageFindMoreUI$3(SettingsManageFindMoreUI paramSettingsManageFindMoreUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127270);
    this.qnG.finish();
    AppMethodBeat.o(127270);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI.3
 * JD-Core Version:    0.6.2
 */