package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsUI$11
  implements DialogInterface.OnCancelListener
{
  SettingsUI$11(SettingsUI paramSettingsUI, r paramr)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127571);
    g.Rg().c(this.qmg);
    g.Rg().b(255, SettingsUI.q(this.qpA));
    SettingsUI.r(this.qpA);
    if (SettingsUI.s(this.qpA) != null)
    {
      SettingsUI.s(this.qpA).stopTimer();
      SettingsUI.t(this.qpA);
    }
    if (SettingsUI.o(this.qpA) != null)
      SettingsUI.o(this.qpA).dismiss();
    AppMethodBeat.o(127571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.11
 * JD-Core Version:    0.6.2
 */