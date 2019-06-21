package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsMoreSafeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsMoreSafeUI$1(SettingsMoreSafeUI paramSettingsMoreSafeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127324);
    this.qob.aqX();
    this.qob.finish();
    AppMethodBeat.o(127324);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI.1
 * JD-Core Version:    0.6.2
 */