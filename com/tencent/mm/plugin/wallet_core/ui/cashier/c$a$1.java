package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.plugin.soter.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$a$1
  implements Runnable
{
  c$a$1(c.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47828);
    Object localObject = this.tMO.tMN.cHE;
    if (localObject == null)
    {
      ab.i("MicroMsg.WcPayCashierFingerprintDialog", "hy: FingerPrintAuthEvent callback, result == null");
      AppMethodBeat.o(47828);
    }
    while (true)
    {
      return;
      int i = ((lv.b)localObject).errCode;
      ab.i("MicroMsg.WcPayCashierFingerprintDialog", "fingerprint verify errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), ((lv.b)localObject).aIm });
      if (i == 0)
      {
        ab.i("MicroMsg.WcPayCashierFingerprintDialog", "fingerprint success, soterAuthReq: %s", new Object[] { ((lv.b)localObject).cHI });
        c localc = this.tMO.tMM;
        localc.tMI.setImageResource(2131231064);
        localc.tMJ.setTextColor(localc.getContext().getResources().getColor(2131690155));
        localc.tMH.setVisibility(4);
        a.EC(0);
        c.a.a(this.tMO);
        this.tMO.tMM.dismiss();
        if (c.a(this.tMO.tMM) != null)
        {
          c.a(this.tMO.tMM).a((lv.b)localObject);
          AppMethodBeat.o(47828);
        }
      }
      else
      {
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = j - this.tMO.msy;
        if (k > 1)
        {
          this.tMO.msy = j;
          c.a.a(this.tMO);
        }
        boolean bool1;
        if ((i == 2) || (i == 10308))
        {
          bool1 = true;
          label248: if (((lv.b)localObject).cHJ != 2)
            break label434;
        }
        label434: for (boolean bool2 = true; ; bool2 = false)
        {
          ab.d("MicroMsg.WcPayCashierFingerprintDialog", "fingerprint not match, shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(this.tMO.tJZ), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((this.tMO.tJZ >= 3) || (k <= 1))) || (bool1))
            break label440;
          ab.i("MicroMsg.WcPayCashierFingerprintDialog", "fingerprint retry: %s", new Object[] { Integer.valueOf(this.tMO.tJZ) });
          localObject = this.tMO.tMM;
          ((c)localObject).tMI.setImageResource(2131231065);
          ((c)localObject).tMJ.setTextColor(((c)localObject).getContext().getResources().getColor(2131689602));
          ((c)localObject).tMH.setVisibility(0);
          ((c)localObject).tMH.setOnClickListener(new c.4((c)localObject));
          a.EC(1);
          AppMethodBeat.o(47828);
          break;
          bool1 = false;
          break label248;
        }
        label440: if ((this.tMO.tJZ >= 3) || (bool1))
        {
          ab.w("MicroMsg.WcPayCashierFingerprintDialog", "fingerprint verify fail!");
          a.EC(2);
          this.tMO.tMM.dismiss();
          if (c.a(this.tMO.tMM) != null)
            c.a(this.tMO.tMM).cSr();
        }
        AppMethodBeat.o(47828);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.c.a.1
 * JD-Core Version:    0.6.2
 */