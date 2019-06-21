package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.ui.i.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMWizardActivity;

final class BindMContactIntroUI$25
  implements i.a
{
  BindMContactIntroUI$25(BindMContactIntroUI paramBindMContactIntroUI, String paramString)
  {
  }

  public final void e(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(13435);
    if (paramInt == 2)
      if (BindMContactIntroUI.f(this.grt) == 1)
      {
        if (!r.YH())
        {
          paramBundle = new tt();
          paramBundle.cPS.cPT = true;
          paramBundle.cPS.cPU = true;
          com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
        }
        BindMContactIntroUI.g(this.grt);
        paramBundle = new Intent();
        paramBundle.addFlags(67108864);
        com.tencent.mm.plugin.account.a.a.gkE.e(this.grt, paramBundle);
        AppMethodBeat.o(13435);
      }
    while (true)
    {
      return;
      MMWizardActivity.J(this.grt, new Intent(this.grt, BindMContactStatusUI.class).putExtra("bind_scene", BindMContactIntroUI.f(this.grt)));
      if (BindMContactIntroUI.h(this.grt))
      {
        if (BindMContactIntroUI.f(this.grt) == 2)
        {
          h.pYm.e(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
          AppMethodBeat.o(13435);
        }
        else
        {
          h.pYm.e(11002, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          AppMethodBeat.o(13435);
          continue;
          if (paramInt == 1)
          {
            paramBundle = new Intent(this.grt, BindMContactVerifyUI.class);
            paramBundle.putExtra("bindmcontact_mobile", this.grz);
            paramBundle.putExtra("bind_scene", BindMContactIntroUI.f(this.grt));
            paramBundle.putExtra("KEnterFromBanner", BindMContactIntroUI.h(this.grt));
            MMWizardActivity.J(this.grt, paramBundle);
          }
        }
      }
      else
        AppMethodBeat.o(13435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.25
 * JD-Core Version:    0.6.2
 */