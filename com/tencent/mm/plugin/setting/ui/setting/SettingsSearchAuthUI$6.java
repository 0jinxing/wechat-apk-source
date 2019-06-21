package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsSearchAuthUI$6
  implements MenuItem.OnMenuItemClickListener
{
  SettingsSearchAuthUI$6(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127446);
    if (paramMenuItem.getItemId() == 700)
    {
      SettingsSearchAuthUI.a(this.qoM, false);
      SettingsSearchAuthUI.g(this.qoM).notifyDataSetChanged();
      SettingsSearchAuthUI.e(this.qoM);
    }
    AppMethodBeat.o(127446);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.6
 * JD-Core Version:    0.6.2
 */