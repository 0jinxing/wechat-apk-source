package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingRedesign$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingRedesign$1(SettingRedesign paramSettingRedesign)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127073);
    this.qlQ.finish();
    SettingRedesign.a(this.qlQ);
    AppMethodBeat.o(127073);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingRedesign.1
 * JD-Core Version:    0.6.2
 */