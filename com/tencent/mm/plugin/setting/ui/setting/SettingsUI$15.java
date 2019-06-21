package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SettingsUI$15
  implements ap.a
{
  SettingsUI$15(SettingsUI paramSettingsUI, ab paramab)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(127576);
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
      SettingsUI.o(this.qpA).cancel();
    SettingsUI.z(this.qpA);
    AppMethodBeat.o(127576);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.15
 * JD-Core Version:    0.6.2
 */