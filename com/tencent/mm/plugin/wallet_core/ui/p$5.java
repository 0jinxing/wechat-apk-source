package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import org.json.JSONObject;

final class p$5
  implements Runnable
{
  p$5(p paramp, lv paramlv)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47562);
    ab.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback");
    Object localObject = this.tHv.cHE;
    if (localObject == null)
    {
      p.a(this.tKg, 0);
      ab.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, result == null");
      AppMethodBeat.o(47562);
    }
    while (true)
    {
      return;
      int i = ((lv.b)localObject).errCode;
      ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), ((lv.b)localObject).aIm });
      if (i == 0)
      {
        ab.i("MicroMsg.WalletPwdCustomDialog", "hy: payInfo soterAuthReq: %s", new Object[] { ((lv.b)localObject).cHI });
        p.a(this.tKg, 1);
        p.a(this.tKg, ((lv.b)localObject).cHI);
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(p.e(this.tKg));
          ((JSONObject)localObject).put("soter_type", "1");
          p.a(this.tKg, ((JSONObject)localObject).toString());
          p.f(this.tKg);
          this.tKg.tJW.setText("");
          this.tKg.cRO();
          h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
          com.tencent.mm.plugin.soter.d.a.EC(0);
          AppMethodBeat.o(47562);
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.WalletPwdCustomDialog", localException, "", new Object[0]);
        }
      }
      else
      {
        ab.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        p.a(this.tKg, 0);
        p.a(this.tKg, "");
        this.tKg.tJV.setVisibility(0);
        this.tKg.tJW.setTextColor(this.tKg.getContext().getResources().getColor(2131690384));
        this.tKg.tJW.setText(2131304800);
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = j - p.g(this.tKg);
        if (k > 1)
        {
          p.b(this.tKg, j);
          p.h(this.tKg);
          p.f(this.tKg);
        }
        h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
        boolean bool1;
        if ((i == 2) || (i == 10308))
        {
          bool1 = true;
          label462: if (localException.cHJ != 2)
            break label668;
        }
        label668: for (boolean bool2 = true; ; bool2 = false)
        {
          ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(p.i(this.tKg)), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((p.i(this.tKg) >= 3) || (k <= 1))) || (bool1))
            break label674;
          ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo fingerprint pay");
          if (p.j(this.tKg) == null)
            p.a(this.tKg, com.tencent.mm.ui.c.a.eS(this.tKg.getContext()));
          this.tKg.tGW.setVisibility(8);
          this.tKg.tJW.setVisibility(4);
          p.j(this.tKg).reset();
          p.j(this.tKg).setAnimationListener(new p.5.1(this));
          this.tKg.tJW.startAnimation(p.j(this.tKg));
          com.tencent.mm.plugin.soter.d.a.EC(1);
          AppMethodBeat.o(47562);
          break;
          bool1 = false;
          break label462;
        }
        label674: if ((p.i(this.tKg) >= 3) || (bool1))
        {
          ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo change to pwd pay");
          p.cRQ();
          this.tKg.tJX = 0;
          p.k(this.tKg);
          this.tKg.tJU.setVisibility(8);
          this.tKg.tJV.setVisibility(8);
          this.tKg.tJW.setVisibility(0);
          this.tKg.tJW.setText(2131304801);
          this.tKg.tJW.setTextColor(this.tKg.getContext().getResources().getColor(2131690648));
          this.tKg.tJA.setText(2131305242);
          this.tKg.tJF.setVisibility(0);
          if (!this.tKg.nTi.isShown())
            this.tKg.nTi.setVisibility(0);
          com.tencent.mm.plugin.soter.d.a.EC(2);
          p.cRR();
        }
        AppMethodBeat.o(47562);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p.5
 * JD-Core Version:    0.6.2
 */