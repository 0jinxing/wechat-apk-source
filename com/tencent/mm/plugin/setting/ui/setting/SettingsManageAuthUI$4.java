package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.b;

final class SettingsManageAuthUI$4
  implements MenuItem.OnMenuItemClickListener
{
  SettingsManageAuthUI$4(SettingsManageAuthUI paramSettingsManageAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127249);
    paramMenuItem = new Intent(this.qnv, SettingsSearchAuthUI.class);
    this.qnv.startActivity(paramMenuItem);
    b.hK(this.qnv);
    AppMethodBeat.o(127249);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI.4
 * JD-Core Version:    0.6.2
 */