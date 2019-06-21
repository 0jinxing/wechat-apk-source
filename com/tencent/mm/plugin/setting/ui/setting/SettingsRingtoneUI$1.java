package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsRingtoneUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsRingtoneUI$1(SettingsRingtoneUI paramSettingsRingtoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127424);
    this.qoF.aqX();
    this.qoF.finish();
    AppMethodBeat.o(127424);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI.1
 * JD-Core Version:    0.6.2
 */