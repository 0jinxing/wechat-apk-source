package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SettingsUI$9
  implements f
{
  SettingsUI$9(SettingsUI paramSettingsUI)
  {
  }

  public final void onSceneEnd(final int paramInt1, final int paramInt2, String paramString, final m paramm)
  {
    AppMethodBeat.i(127569);
    ab.d("MicroMsg.SettingsUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(127568);
        g.Rg().b(255, SettingsUI.q(SettingsUI.9.this.qpA));
        SettingsUI.r(SettingsUI.9.this.qpA);
        if (SettingsUI.s(SettingsUI.9.this.qpA) != null)
        {
          SettingsUI.s(SettingsUI.9.this.qpA).stopTimer();
          SettingsUI.t(SettingsUI.9.this.qpA);
        }
        if (SettingsUI.o(SettingsUI.9.this.qpA) != null)
          SettingsUI.o(SettingsUI.9.this.qpA).dismiss();
        if ((paramm.getType() == 255) && (((r)paramm).fPr == 2))
          if ((paramInt2 == -3) && (paramInt1 == 4))
          {
            Intent localIntent = new Intent(SettingsUI.9.this.qpA.mController.ylL, RegByMobileSetPwdUI.class);
            localIntent.putExtra("kintent_hint", SettingsUI.9.this.qpA.getString(2131302301));
            SettingsUI.9.this.qpA.startActivityForResult(localIntent, 5);
            AppMethodBeat.o(127568);
          }
        while (true)
        {
          return;
          SettingsUI.u(SettingsUI.9.this.qpA);
          AppMethodBeat.o(127568);
        }
      }
    });
    AppMethodBeat.o(127569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.9
 * JD-Core Version:    0.6.2
 */