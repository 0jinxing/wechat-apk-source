package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bx;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class SettingsSwitchAccountUI$4$1
  implements DialogInterface.OnClickListener
{
  SettingsSwitchAccountUI$4$1(SettingsSwitchAccountUI.4 param4, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127502);
    ab.i("MicroMsg.SettingsSwitchAccountUI", "delete %s", new Object[] { this.qpj });
    SettingsSwitchAccountUI.a(this.qpk.qpi, true);
    bx.fnB.oK(this.qpj);
    SettingsSwitchAccountUI.c(this.qpk.qpi).remove(this.qpj);
    paramDialogInterface = SettingsSwitchAccountUI.d(this.qpk.qpi);
    String str = this.qpj;
    if (paramDialogInterface.qrf.contains(str))
    {
      paramInt = paramDialogInterface.qrf.indexOf(str);
      paramDialogInterface.qrf.remove(str);
      paramDialogInterface.qrg.remove(paramInt);
      paramDialogInterface.qrh.remove(paramInt);
    }
    SettingsSwitchAccountUI.d(this.qpk.qpi).cjt();
    SettingsSwitchAccountUI.e(this.qpk.qpi);
    if (SettingsSwitchAccountUI.a(this.qpk.qpi) == 0)
      if (bx.fnB.aat().size() > 0)
      {
        h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(4), bx.fnB.aau() });
        AppMethodBeat.o(127502);
      }
    while (true)
    {
      return;
      h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(4), bx.fnB.aau() });
      AppMethodBeat.o(127502);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.4.1
 * JD-Core Version:    0.6.2
 */