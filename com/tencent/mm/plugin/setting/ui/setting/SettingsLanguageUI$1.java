package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsLanguageUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsLanguageUI$1(SettingsLanguageUI paramSettingsLanguageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127237);
    this.qnr.aqX();
    this.qnr.finish();
    AppMethodBeat.o(127237);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI.1
 * JD-Core Version:    0.6.2
 */