package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bx;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import java.util.Set;

final class SettingsSwitchAccountUI$7
  implements View.OnClickListener
{
  SettingsSwitchAccountUI$7(SettingsSwitchAccountUI paramSettingsSwitchAccountUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138710);
    if (!SettingsSwitchAccountUI.f(this.qpi))
    {
      SettingsSwitchAccountUI.b(this.qpi, true);
      SettingsSwitchAccountUI.d(this.qpi).setDeleteState(SettingsSwitchAccountUI.f(this.qpi));
      SettingsSwitchAccountUI.d(this.qpi).cjt();
      SettingsSwitchAccountUI.e(this.qpi);
      if (bx.fnB.aat().size() > 1)
      {
        h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(3), bx.fnB.aau() });
        AppMethodBeat.o(138710);
      }
    }
    while (true)
    {
      return;
      h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(3), bx.fnB.aau() });
      AppMethodBeat.o(138710);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.7
 * JD-Core Version:    0.6.2
 */