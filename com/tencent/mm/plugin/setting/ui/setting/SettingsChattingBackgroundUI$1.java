package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsChattingBackgroundUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SettingsChattingBackgroundUI$1(SettingsChattingBackgroundUI paramSettingsChattingBackgroundUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127197);
    this.qna.aqX();
    this.qna.finish();
    AppMethodBeat.o(127197);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI.1
 * JD-Core Version:    0.6.2
 */