package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountAgreementUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingDeleteAccountAgreementUI$3(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127063);
    this.qlK.aqX();
    this.qlK.finish();
    AppMethodBeat.o(127063);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountAgreementUI.3
 * JD-Core Version:    0.6.2
 */