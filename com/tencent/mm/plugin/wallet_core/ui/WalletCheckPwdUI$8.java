package com.tencent.mm.plugin.wallet_core.ui;

import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletCheckPwdUI$8
  implements Runnable
{
  WalletCheckPwdUI$8(WalletCheckPwdUI paramWalletCheckPwdUI, lv paramlv)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47340);
    ab.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback");
    lv.b localb = this.tHv.cHE;
    if (localb == null)
    {
      ab.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, result == null");
      AppMethodBeat.o(47340);
    }
    while (true)
    {
      return;
      int i = localb.errCode;
      ab.v("Micromsg.WalletCheckPwdUI", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), localb.aIm });
      if (i == 0)
      {
        ab.i("Micromsg.WalletCheckPwdUI", "hy: payInfo soterAuthReq: %s", new Object[] { localb.cHI });
        WalletCheckPwdUI.i(this.tHs).setVisibility(8);
        WalletCheckPwdUI.b(this.tHs, localb.cHI);
        com.tencent.mm.plugin.soter.d.a.EC(0);
        AppMethodBeat.o(47340);
      }
      else
      {
        ab.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = j - WalletCheckPwdUI.j(this.tHs);
        if (k > 1)
        {
          WalletCheckPwdUI.b(this.tHs, j);
          WalletCheckPwdUI.k(this.tHs);
        }
        boolean bool1;
        if ((i == 2) || (i == 10308))
        {
          bool1 = true;
          label189: if (localb.cHJ != 2)
            break label369;
        }
        label369: for (boolean bool2 = true; ; bool2 = false)
        {
          ab.v("Micromsg.WalletCheckPwdUI", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(WalletCheckPwdUI.l(this.tHs)), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((WalletCheckPwdUI.l(this.tHs) >= 3) || (k <= 1))) || (bool1))
            break label375;
          ab.v("Micromsg.WalletCheckPwdUI", "alvinluo fingerprint pay");
          if (WalletCheckPwdUI.m(this.tHs) == null)
            WalletCheckPwdUI.a(this.tHs, com.tencent.mm.ui.c.a.eS(this.tHs.mController.ylL));
          WalletCheckPwdUI.i(this.tHs).setVisibility(0);
          WalletCheckPwdUI.i(this.tHs).startAnimation(WalletCheckPwdUI.m(this.tHs));
          WalletCheckPwdUI.m(this.tHs).setFillAfter(true);
          com.tencent.mm.plugin.soter.d.a.EC(1);
          AppMethodBeat.o(47340);
          break;
          bool1 = false;
          break label189;
        }
        label375: if ((WalletCheckPwdUI.l(this.tHs) >= 3) || (bool1))
        {
          ab.v("Micromsg.WalletCheckPwdUI", "alvinluo change to pwd pay");
          WalletCheckPwdUI.cRA();
          WalletCheckPwdUI.a(this.tHs, 0);
          WalletCheckPwdUI.g(this.tHs);
          WalletCheckPwdUI.n(this.tHs).setVisibility(8);
          com.tencent.mm.plugin.soter.d.a.EC(2);
        }
        AppMethodBeat.o(47340);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.8
 * JD-Core Version:    0.6.2
 */