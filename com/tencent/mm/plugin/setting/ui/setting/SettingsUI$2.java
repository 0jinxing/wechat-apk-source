package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsUI$2
  implements DialogInterface.OnClickListener
{
  SettingsUI$2(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127561);
    h.pYm.e(11545, new Object[] { Integer.valueOf(3) });
    ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
    h.pYm.a(99L, 145L, 1L, false);
    if ((g.Rg() != null) && (g.Rg().ftA != null))
      g.Rg().ftA.cG(false);
    if (SettingsUI.f(this.qpA) != null)
      SettingsUI.f(this.qpA).dismiss();
    SettingsUI.g(this.qpA);
    AppMethodBeat.o(127561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.2
 * JD-Core Version:    0.6.2
 */