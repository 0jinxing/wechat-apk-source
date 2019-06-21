package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SettingsAboutMicroMsgUI$2$2
  implements ap.a
{
  SettingsAboutMicroMsgUI$2$2(SettingsAboutMicroMsgUI.2 param2, ab paramab)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(127089);
    g.Rg().c(this.qme);
    g.Rg().b(281, SettingsAboutMicroMsgUI.2.a(this.qmd));
    SettingsAboutMicroMsgUI.2.b(this.qmd);
    if (SettingsAboutMicroMsgUI.2.c(this.qmd) != null)
    {
      SettingsAboutMicroMsgUI.2.c(this.qmd).stopTimer();
      SettingsAboutMicroMsgUI.2.d(this.qmd);
    }
    if (SettingsAboutMicroMsgUI.a(this.qmd.qmc) != null)
      SettingsAboutMicroMsgUI.a(this.qmd.qmc).dismiss();
    SettingsAboutMicroMsgUI.b(this.qmd.qmc);
    AppMethodBeat.o(127089);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.2.2
 * JD-Core Version:    0.6.2
 */