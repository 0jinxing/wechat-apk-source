package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsSpecialSceneNotificationUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsSpecialSceneNotificationUI$1(SettingsSpecialSceneNotificationUI paramSettingsSpecialSceneNotificationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127490);
    this.qoZ.aqX();
    this.qoZ.finish();
    AppMethodBeat.o(127490);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI.1
 * JD-Core Version:    0.6.2
 */