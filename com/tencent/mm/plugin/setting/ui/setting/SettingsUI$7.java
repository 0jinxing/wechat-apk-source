package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SettingsUI$7
  implements ap.a
{
  SettingsUI$7(SettingsUI paramSettingsUI, ab paramab)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(127566);
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
    SettingsUI.p(this.qpA);
    AppMethodBeat.o(127566);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.7
 * JD-Core Version:    0.6.2
 */