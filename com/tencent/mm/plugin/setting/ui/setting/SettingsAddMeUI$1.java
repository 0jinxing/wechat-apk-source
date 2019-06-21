package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAddMeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAddMeUI$1(SettingsAddMeUI paramSettingsAddMeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127168);
    this.qmM.aqX();
    this.qmM.finish();
    AppMethodBeat.o(127168);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI.1
 * JD-Core Version:    0.6.2
 */