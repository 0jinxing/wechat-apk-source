package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsUI$4
  implements DialogInterface.OnClickListener
{
  SettingsUI$4(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127563);
    com.tencent.mm.modelstat.c.akc().commitNow();
    ((com.tencent.mm.plugin.expt.a.c)g.K(com.tencent.mm.plugin.expt.a.c.class)).logout();
    if ((SettingsUI.h(this.qpA) != null) && (SettingsUI.h(this.qpA).isChecked()))
    {
      ab.i("MicroMsg.SettingsUI", "push notify mode exit");
      h.pYm.a(99L, 143L, 1L, false);
      h.pYm.e(11545, new Object[] { Integer.valueOf(6) });
      ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
      aa.anh().edit().putBoolean("is_in_notify_mode", true).commit();
      SettingsUI.i(this.qpA);
      AppMethodBeat.o(127563);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SettingsUI", "normally exit");
      h.pYm.a(99L, 144L, 1L, false);
      h.pYm.e(11545, new Object[] { Integer.valueOf(7) });
      ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
      if ((g.Rg() != null) && (g.Rg().ftA != null))
        g.Rg().ftA.cG(false);
      paramDialogInterface = new gj();
      a.xxA.m(paramDialogInterface);
      SettingsUI.j(this.qpA);
      AppMethodBeat.o(127563);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.4
 * JD-Core Version:    0.6.2
 */