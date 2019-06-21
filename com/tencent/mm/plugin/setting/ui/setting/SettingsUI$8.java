package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsUI$8
  implements DialogInterface.OnCancelListener
{
  SettingsUI$8(SettingsUI paramSettingsUI, ab paramab)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127567);
    g.Rg().c(this.qme);
    g.Rg().b(281, SettingsUI.k(this.qpA));
    SettingsUI.l(this.qpA);
    if (SettingsUI.m(this.qpA) != null)
    {
      SettingsUI.m(this.qpA).stopTimer();
      SettingsUI.n(this.qpA);
    }
    if (SettingsUI.o(this.qpA) != null)
      SettingsUI.o(this.qpA).dismiss();
    AppMethodBeat.o(127567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.8
 * JD-Core Version:    0.6.2
 */