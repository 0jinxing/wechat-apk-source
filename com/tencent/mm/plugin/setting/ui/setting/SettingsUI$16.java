package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsUI$16
  implements DialogInterface.OnCancelListener
{
  SettingsUI$16(SettingsUI paramSettingsUI, ab paramab)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127577);
    g.Rg().c(this.qme);
    g.Rg().b(281, SettingsUI.v(this.qpA));
    g.Rg().b(282, SettingsUI.x(this.qpA));
    SettingsUI.w(this.qpA);
    SettingsUI.y(this.qpA);
    if (SettingsUI.s(this.qpA) != null)
    {
      SettingsUI.s(this.qpA).stopTimer();
      SettingsUI.t(this.qpA);
    }
    if (SettingsUI.o(this.qpA) != null)
      SettingsUI.o(this.qpA).dismiss();
    AppMethodBeat.o(127577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.16
 * JD-Core Version:    0.6.2
 */