package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsSearchAuthUI$7
  implements MenuItem.OnMenuItemClickListener
{
  SettingsSearchAuthUI$7(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127447);
    if (paramMenuItem.getItemId() == 700)
    {
      SettingsSearchAuthUI.a(this.qoM, true);
      SettingsSearchAuthUI.g(this.qoM).notifyDataSetChanged();
      SettingsSearchAuthUI.e(this.qoM);
    }
    AppMethodBeat.o(127447);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.7
 * JD-Core Version:    0.6.2
 */