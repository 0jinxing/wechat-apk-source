package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SettingsUI$10
  implements ap.a
{
  SettingsUI$10(SettingsUI paramSettingsUI, r paramr)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(127570);
    g.Rg().c(this.qmg);
    g.Rg().b(255, SettingsUI.q(this.qpA));
    SettingsUI.r(this.qpA);
    if (SettingsUI.s(this.qpA) != null)
    {
      SettingsUI.s(this.qpA).stopTimer();
      SettingsUI.t(this.qpA);
    }
    if (SettingsUI.o(this.qpA) != null)
      SettingsUI.o(this.qpA).cancel();
    SettingsUI.u(this.qpA);
    AppMethodBeat.o(127570);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.10
 * JD-Core Version:    0.6.2
 */