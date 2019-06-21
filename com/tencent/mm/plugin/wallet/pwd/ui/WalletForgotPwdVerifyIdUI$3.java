package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;

final class WalletForgotPwdVerifyIdUI$3
  implements Runnable
{
  WalletForgotPwdVerifyIdUI$3(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(46308);
    WalletForgotPwdVerifyIdUI.c(this.trW).setVisibility(8);
    WalletForgotPwdVerifyIdUI.d(this.trW).setVisibility(8);
    this.trW.trP = ((ViewGroup.MarginLayoutParams)WalletForgotPwdVerifyIdUI.e(this.trW).getLayoutParams());
    this.trW.trP.topMargin = aj.fromDPToPix(this.trW, 47);
    WalletForgotPwdVerifyIdUI.e(this.trW).setLayoutParams(this.trW.trP);
    this.trW.trQ = ((ViewGroup.MarginLayoutParams)WalletForgotPwdVerifyIdUI.f(this.trW).getLayoutParams());
    this.trW.trQ.topMargin = aj.fromDPToPix(this.trW, 48);
    WalletForgotPwdVerifyIdUI.f(this.trW).setLayoutParams(this.trW.trQ);
    AppMethodBeat.o(46308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.3
 * JD-Core Version:    0.6.2
 */