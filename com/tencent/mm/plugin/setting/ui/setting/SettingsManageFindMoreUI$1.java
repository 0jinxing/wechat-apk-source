package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;

final class SettingsManageFindMoreUI$1
  implements Runnable
{
  SettingsManageFindMoreUI$1(SettingsManageFindMoreUI paramSettingsManageFindMoreUI, CheckBoxPreference paramCheckBoxPreference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127269);
    this.qnF.uOT = false;
    SettingsManageFindMoreUI.a(this.qnG, this.qnF.isChecked());
    AppMethodBeat.o(127269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI.1
 * JD-Core Version:    0.6.2
 */