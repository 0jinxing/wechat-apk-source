package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsVoipSoundVibrateUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsVoipSoundVibrateUI$1(SettingsVoipSoundVibrateUI paramSettingsVoipSoundVibrateUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127624);
    this.qpF.aqX();
    this.qpF.finish();
    AppMethodBeat.o(127624);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsVoipSoundVibrateUI.1
 * JD-Core Version:    0.6.2
 */