package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPersonalMoreUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsPersonalMoreUI$2(SettingsPersonalMoreUI paramSettingsPersonalMoreUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127382);
    this.qoi.aqX();
    this.qoi.finish();
    AppMethodBeat.o(127382);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI.2
 * JD-Core Version:    0.6.2
 */