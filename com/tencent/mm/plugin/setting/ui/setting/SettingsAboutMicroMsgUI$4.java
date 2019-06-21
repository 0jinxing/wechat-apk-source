package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SettingsAboutMicroMsgUI$4
  implements ap.a
{
  SettingsAboutMicroMsgUI$4(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI, r paramr)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(127094);
    g.Rg().c(this.qmg);
    g.Rg().b(255, SettingsAboutMicroMsgUI.c(this.qmc));
    SettingsAboutMicroMsgUI.d(this.qmc);
    if (SettingsAboutMicroMsgUI.e(this.qmc) != null)
    {
      SettingsAboutMicroMsgUI.e(this.qmc).stopTimer();
      SettingsAboutMicroMsgUI.f(this.qmc);
    }
    if (SettingsAboutMicroMsgUI.a(this.qmc) != null)
      SettingsAboutMicroMsgUI.a(this.qmc).cancel();
    SettingsAboutMicroMsgUI.g(this.qmc);
    AppMethodBeat.o(127094);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.4
 * JD-Core Version:    0.6.2
 */