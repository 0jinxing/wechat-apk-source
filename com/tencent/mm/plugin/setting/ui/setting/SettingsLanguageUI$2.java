package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsLanguageUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsLanguageUI$2(SettingsLanguageUI paramSettingsLanguageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127238);
    SettingsLanguageUI.a(this.qnr, SettingsLanguageUI.a(this.qnr), SettingsLanguageUI.b(this.qnr));
    this.qnr.finish();
    AppMethodBeat.o(127238);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI.2
 * JD-Core Version:    0.6.2
 */