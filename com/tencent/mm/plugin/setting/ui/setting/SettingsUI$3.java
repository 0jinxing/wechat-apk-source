package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsUI$3
  implements DialogInterface.OnClickListener
{
  SettingsUI$3(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127562);
    h.pYm.e(11545, new Object[] { Integer.valueOf(2) });
    ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCancel");
    if (SettingsUI.f(this.qpA) != null)
      SettingsUI.f(this.qpA).dismiss();
    AppMethodBeat.o(127562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.3
 * JD-Core Version:    0.6.2
 */