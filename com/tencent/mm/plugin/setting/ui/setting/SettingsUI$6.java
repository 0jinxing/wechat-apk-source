package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsUI$6
  implements f
{
  SettingsUI$6(SettingsUI paramSettingsUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127565);
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
    AppMethodBeat.o(127565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.6
 * JD-Core Version:    0.6.2
 */