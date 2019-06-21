package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPrivacyUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsPrivacyUI$3(SettingsPrivacyUI paramSettingsPrivacyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127410);
    this.qoy.aqX();
    this.qoy.finish();
    AppMethodBeat.o(127410);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI.3
 * JD-Core Version:    0.6.2
 */