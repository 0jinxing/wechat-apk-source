package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAboutCamera$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAboutCamera$1(SettingsAboutCamera paramSettingsAboutCamera)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127080);
    this.qlR.aqX();
    this.qlR.finish();
    AppMethodBeat.o(127080);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera.1
 * JD-Core Version:    0.6.2
 */