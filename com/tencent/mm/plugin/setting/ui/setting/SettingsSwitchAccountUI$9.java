package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;

final class SettingsSwitchAccountUI$9
  implements View.OnClickListener
{
  SettingsSwitchAccountUI$9(SettingsSwitchAccountUI paramSettingsSwitchAccountUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127507);
    SettingsSwitchAccountUI.b(this.qpi, false);
    SettingsSwitchAccountUI.a(this.qpi, false);
    SettingsSwitchAccountUI.d(this.qpi).setDeleteState(false);
    SettingsSwitchAccountUI.d(this.qpi).cjt();
    SettingsSwitchAccountUI.e(this.qpi);
    AppMethodBeat.o(127507);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.9
 * JD-Core Version:    0.6.2
 */