package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SettingsAboutMicroMsgUI$3$1
  implements Runnable
{
  SettingsAboutMicroMsgUI$3$1(SettingsAboutMicroMsgUI.3 param3, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127092);
    g.Rg().b(255, SettingsAboutMicroMsgUI.c(this.qmf.qmc));
    SettingsAboutMicroMsgUI.d(this.qmf.qmc);
    if (SettingsAboutMicroMsgUI.e(this.qmf.qmc) != null)
    {
      SettingsAboutMicroMsgUI.e(this.qmf.qmc).stopTimer();
      SettingsAboutMicroMsgUI.f(this.qmf.qmc);
    }
    if (SettingsAboutMicroMsgUI.a(this.qmf.qmc) != null)
      SettingsAboutMicroMsgUI.a(this.qmf.qmc).dismiss();
    if ((this.crb.getType() == 255) && (((r)this.crb).fPr == 1))
      if ((this.crd == -3) && (this.crc == 4))
      {
        Intent localIntent = new Intent(this.qmf.qmc.mController.ylL, RegByMobileSetPwdUI.class);
        localIntent.putExtra("kintent_hint", this.qmf.qmc.getString(2131302301));
        this.qmf.qmc.startActivityForResult(localIntent, 0);
        AppMethodBeat.o(127092);
      }
    while (true)
    {
      return;
      SettingsAboutMicroMsgUI.g(this.qmf.qmc);
      AppMethodBeat.o(127092);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.3.1
 * JD-Core Version:    0.6.2
 */