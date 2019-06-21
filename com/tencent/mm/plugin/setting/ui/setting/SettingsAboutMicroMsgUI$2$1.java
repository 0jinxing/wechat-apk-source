package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ap;

final class SettingsAboutMicroMsgUI$2$1
  implements f
{
  SettingsAboutMicroMsgUI$2$1(SettingsAboutMicroMsgUI.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127088);
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
    AppMethodBeat.o(127088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.2.1
 * JD-Core Version:    0.6.2
 */