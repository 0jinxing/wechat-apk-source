package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountInputPassUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingDeleteAccountInputPassUI$2(SettingDeleteAccountInputPassUI paramSettingDeleteAccountInputPassUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127067);
    this.qlN.aqX();
    this.qlN.startActivity(new Intent(this.qlN, SettingDeleteAccountUI.class));
    AppMethodBeat.o(127067);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI.2
 * JD-Core Version:    0.6.2
 */