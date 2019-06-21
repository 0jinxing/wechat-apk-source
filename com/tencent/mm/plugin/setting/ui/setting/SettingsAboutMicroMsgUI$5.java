package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsAboutMicroMsgUI$5
  implements DialogInterface.OnCancelListener
{
  SettingsAboutMicroMsgUI$5(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI, r paramr)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127095);
    g.Rg().c(this.qmg);
    g.Rg().b(255, SettingsAboutMicroMsgUI.c(this.qmc));
    SettingsAboutMicroMsgUI.d(this.qmc);
    if (SettingsAboutMicroMsgUI.e(this.qmc) != null)
    {
      SettingsAboutMicroMsgUI.e(this.qmc).stopTimer();
      SettingsAboutMicroMsgUI.f(this.qmc);
    }
    if (SettingsAboutMicroMsgUI.a(this.qmc) != null)
      SettingsAboutMicroMsgUI.a(this.qmc).dismiss();
    AppMethodBeat.o(127095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.5
 * JD-Core Version:    0.6.2
 */