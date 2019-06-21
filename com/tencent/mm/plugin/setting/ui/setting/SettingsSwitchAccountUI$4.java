package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.c;
import com.tencent.mm.ui.base.h;
import java.util.Map;

final class SettingsSwitchAccountUI$4
  implements SwitchAccountGridView.c
{
  SettingsSwitchAccountUI$4(SettingsSwitchAccountUI paramSettingsSwitchAccountUI)
  {
  }

  public final void Wz(String paramString)
  {
    AppMethodBeat.i(138707);
    h.d(this.qpi, this.qpi.getString(2131303290, new Object[] { ((SwitchAccountModel)SettingsSwitchAccountUI.c(this.qpi).get(paramString)).username }), this.qpi.getString(2131297061), this.qpi.getString(2131297088), this.qpi.getString(2131296990), new SettingsSwitchAccountUI.4.1(this, paramString), null);
    AppMethodBeat.o(138707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.4
 * JD-Core Version:    0.6.2
 */