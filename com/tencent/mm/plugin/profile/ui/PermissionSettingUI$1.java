package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PermissionSettingUI$1
  implements MenuItem.OnMenuItemClickListener
{
  PermissionSettingUI$1(PermissionSettingUI paramPermissionSettingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23744);
    this.ppk.aqX();
    this.ppk.setResult(-1, new Intent());
    this.ppk.finish();
    AppMethodBeat.o(23744);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.PermissionSettingUI.1
 * JD-Core Version:    0.6.2
 */