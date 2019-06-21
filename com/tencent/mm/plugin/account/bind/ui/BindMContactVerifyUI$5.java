package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.ui.i.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;

final class BindMContactVerifyUI$5
  implements i.a
{
  BindMContactVerifyUI$5(BindMContactVerifyUI paramBindMContactVerifyUI)
  {
  }

  public final void e(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(13485);
    if (paramInt == 2)
      switch (BindMContactVerifyUI.d(this.grP))
      {
      case 2:
      default:
        if (BindMContactVerifyUI.g(this.grP))
        {
          if (BindMContactVerifyUI.d(this.grP) == 2)
            com.tencent.mm.plugin.report.service.h.pYm.e(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
        }
        else
        {
          if ((BindMContactVerifyUI.d(this.grP) != 0) || (!paramBundle.getBoolean("restart_wechat", false)))
            break label490;
          ab.i("MicroMsg.BindMContactVerifyUI", "restart after bind mobile!");
          com.tencent.mm.ui.base.h.a(this.grP, this.grP.getString(2131305853), this.grP.getString(2131297061), false, new BindMContactVerifyUI.5.2(this));
          AppMethodBeat.o(13485);
        }
        break;
      case 1:
      case 3:
      case 5:
      case 4:
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.BindMContactVerifyUI", "to startMySafedeviceListUI");
      if (!r.YH())
      {
        paramBundle = new tt();
        paramBundle.cPS.cPT = true;
        paramBundle.cPS.cPU = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      }
      BindMContactVerifyUI.e(this.grP);
      paramBundle = new Intent();
      paramBundle.addFlags(67108864);
      com.tencent.mm.plugin.account.a.a.gkE.e(this.grP, paramBundle);
      AppMethodBeat.o(13485);
      continue;
      ab.i("MicroMsg.BindMContactVerifyUI", "to BindMContactStatusUI for change mobile");
      if (paramBundle.getBoolean("restart_wechat", false))
      {
        ab.i("MicroMsg.BindMContactVerifyUI", "restart after change mobile!");
        com.tencent.mm.ui.base.h.a(this.grP, this.grP.getString(2131305853), this.grP.getString(2131297061), false, new BindMContactVerifyUI.5.1(this));
        AppMethodBeat.o(13485);
      }
      else
      {
        com.tencent.mm.ui.base.h.bQ(this.grP, this.grP.getString(2131296944));
        MMWizardActivity.J(this.grP, new Intent(this.grP, BindMContactStatusUI.class));
        AppMethodBeat.o(13485);
        continue;
        ab.i("MicroMsg.BindMContactVerifyUI", "to finish  finishWizard for get phone number");
        BindMContactVerifyUI.f(this.grP);
        AppMethodBeat.o(13485);
        continue;
        ab.i("MicroMsg.BindMContactVerifyUI", "to RegByMobileSetPwdUI for reset pwd");
        this.grP.finish();
        Intent localIntent = new Intent();
        localIntent.addFlags(603979776);
        localIntent.putExtra("setpwd_ticket", paramBundle.getString("setpwd_ticket", ""));
        d.b(this.grP, "account", ".ui.RegByMobileSetPwdUI", localIntent);
        AppMethodBeat.o(13485);
        continue;
        com.tencent.mm.plugin.report.service.h.pYm.e(11002, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
        break;
        label490: MMWizardActivity.J(this.grP, new Intent(this.grP, BindMContactStatusUI.class));
        AppMethodBeat.o(13485);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI.5
 * JD-Core Version:    0.6.2
 */