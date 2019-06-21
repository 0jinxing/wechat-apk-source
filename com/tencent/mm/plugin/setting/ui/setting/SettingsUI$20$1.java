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

final class SettingsUI$20$1
  implements Runnable
{
  SettingsUI$20$1(SettingsUI.20 param20, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127582);
    g.Rg().b(255, SettingsUI.q(this.qpE.qpA));
    SettingsUI.r(this.qpE.qpA);
    if (SettingsUI.s(this.qpE.qpA) != null)
    {
      SettingsUI.s(this.qpE.qpA).stopTimer();
      SettingsUI.t(this.qpE.qpA);
    }
    if (SettingsUI.o(this.qpE.qpA) != null)
      SettingsUI.o(this.qpE.qpA).dismiss();
    if ((this.crb.getType() == 255) && (((r)this.crb).fPr == 1))
      if ((this.crd == -3) && (this.crc == 4))
      {
        Intent localIntent = new Intent(this.qpE.qpA.mController.ylL, RegByMobileSetPwdUI.class);
        localIntent.putExtra("kintent_hint", this.qpE.qpA.getString(2131302301));
        this.qpE.qpA.startActivityForResult(localIntent, 0);
        AppMethodBeat.o(127582);
      }
    while (true)
    {
      return;
      SettingsUI.B(this.qpE.qpA);
      AppMethodBeat.o(127582);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.20.1
 * JD-Core Version:    0.6.2
 */