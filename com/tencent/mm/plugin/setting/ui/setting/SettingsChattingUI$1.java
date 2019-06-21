package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsChattingUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsChattingUI$1(SettingsChattingUI paramSettingsChattingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127209);
    this.qnb.aqX();
    this.qnb.finish();
    AppMethodBeat.o(127209);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.1
 * JD-Core Version:    0.6.2
 */