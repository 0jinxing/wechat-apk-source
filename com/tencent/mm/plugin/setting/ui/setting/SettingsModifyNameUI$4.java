package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsModifyNameUI$4
  implements MenuItem.OnMenuItemClickListener
{
  SettingsModifyNameUI$4(SettingsModifyNameUI paramSettingsModifyNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127309);
    this.qnV.aqX();
    this.qnV.finish();
    AppMethodBeat.o(127309);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI.4
 * JD-Core Version:    0.6.2
 */