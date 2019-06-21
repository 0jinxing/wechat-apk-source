package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.a;

final class WalletForgotPwdVerifyIdUI$6
  implements a
{
  WalletForgotPwdVerifyIdUI$6(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(46311);
    if (paramBoolean)
    {
      ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS visible");
      WalletForgotPwdVerifyIdUI.a(this.trW, WalletForgotPwdVerifyIdUI.h(this.trW), WalletForgotPwdVerifyIdUI.a(this.trW));
      WalletForgotPwdVerifyIdUI.i(this.trW);
      AppMethodBeat.o(46311);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS unvisible");
      WalletForgotPwdVerifyIdUI.j(this.trW);
      WalletForgotPwdVerifyIdUI.h(this.trW).scrollTo(0, 0);
      AppMethodBeat.o(46311);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.6
 * JD-Core Version:    0.6.2
 */