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
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import org.json.JSONException;
import org.json.JSONObject;

final class q$8
  implements Runnable
{
  q$8(q paramq, lv paramlv)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47600);
    ab.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
    lv.b localb = this.tHv.cHE;
    if (localb == null)
    {
      this.tKq.pGr.tKd = 0;
      ab.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
      AppMethodBeat.o(47600);
    }
    while (true)
    {
      return;
      int i = localb.errCode;
      ab.v("MicroMsg.WalletPwdDialog", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), localb.aIm });
      int j;
      if (i == 0)
      {
        ab.i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", new Object[] { localb.cHI });
        label112: Object localObject1;
        if (this.tKq.pGr == null)
        {
          j = 0;
          if (this.tKq.pGr != null)
            break label363;
          localObject1 = "";
          ad.e(j, (String)localObject1, 22, "");
          this.tKq.pGr.tKd = 1;
          this.tKq.pGr.cBU = localb.cBU;
          this.tKq.pGr.cBV = localb.cBV;
        }
        try
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(((l)g.K(l.class)).bxi());
          ((JSONObject)localObject1).put("soter_type", r.cPI().cQm());
          this.tKq.pGr.cHI = ((JSONObject)localObject1).toString();
          this.tKq.pGr.cBS = localb.cBS;
          localObject1 = this.tKq.pGr;
          ((PayInfo)localObject1).tKe += 1;
          this.tKq.tJW.setText("");
          this.tKq.cRO();
          h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
          com.tencent.mm.plugin.soter.d.a.EC(0);
          AppMethodBeat.o(47600);
          continue;
          j = this.tKq.pGr.cIf;
          break label112;
          label363: localObject1 = this.tKq.pGr.czZ;
        }
        catch (JSONException localJSONException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.WalletPwdDialog", localJSONException, "", new Object[0]);
        }
      }
      else
      {
        ab.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        label415: Object localObject2;
        label429: int k;
        boolean bool1;
        if (this.tKq.pGr == null)
        {
          j = 0;
          if (this.tKq.pGr != null)
            break label848;
          localObject2 = "";
          ad.e(j, (String)localObject2, 23, "");
          this.tKq.pGr.tKd = 0;
          this.tKq.tJV.setVisibility(0);
          this.tKq.tJW.setTextColor(this.tKq.getContext().getResources().getColor(2131690384));
          this.tKq.tJW.setText(2131304800);
          j = (int)(System.currentTimeMillis() / 1000L);
          k = j - q.g(this.tKq);
          if (k > 1)
          {
            q.a(this.tKq, j);
            q.h(this.tKq);
            localObject2 = this.tKq.pGr;
            ((PayInfo)localObject2).tKe += 1;
          }
          h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
          if ((i != 2) && (i != 10308))
            break label863;
          bool1 = true;
          label633: if (localb.cHJ != 2)
            break label869;
        }
        label848: label863: label869: for (boolean bool2 = true; ; bool2 = false)
        {
          ab.v("MicroMsg.WalletPwdDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(q.i(this.tKq)), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((q.i(this.tKq) >= 3) || (k <= 1))) || (bool1))
            break label875;
          ab.v("MicroMsg.WalletPwdDialog", "alvinluo fingerprint pay");
          if (q.j(this.tKq) == null)
            q.a(this.tKq, com.tencent.mm.ui.c.a.eS(this.tKq.getContext()));
          this.tKq.tGW.setVisibility(8);
          this.tKq.tJW.setVisibility(4);
          q.j(this.tKq).reset();
          q.j(this.tKq).setAnimationListener(new q.8.1(this));
          this.tKq.tJW.startAnimation(q.j(this.tKq));
          com.tencent.mm.plugin.soter.d.a.EC(1);
          AppMethodBeat.o(47600);
          break;
          j = this.tKq.pGr.cIf;
          break label415;
          localObject2 = this.tKq.pGr.czZ;
          break label429;
          bool1 = false;
          break label633;
        }
        label875: if ((q.i(this.tKq) >= 3) || (bool1))
        {
          ab.v("MicroMsg.WalletPwdDialog", "alvinluo change to pwd pay");
          q.cRS();
          this.tKq.tJX = 0;
          q.k(this.tKq);
          this.tKq.tJU.setVisibility(8);
          this.tKq.tJV.setVisibility(8);
          this.tKq.tJW.setVisibility(0);
          this.tKq.tJW.setText(2131304801);
          this.tKq.tJW.setTextColor(this.tKq.getContext().getResources().getColor(2131690648));
          this.tKq.tJA.setText(2131305242);
          this.tKq.tJF.setVisibility(0);
          if (!this.tKq.nTi.isShown())
            this.tKq.nTi.setVisibility(0);
          com.tencent.mm.plugin.soter.d.a.EC(2);
          q.np(true);
        }
        AppMethodBeat.o(47600);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.8
 * JD-Core Version:    0.6.2
 */