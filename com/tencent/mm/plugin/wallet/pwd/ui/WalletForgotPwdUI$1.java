package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class WalletForgotPwdUI$1
  implements View.OnClickListener
{
  WalletForgotPwdUI$1(WalletForgotPwdUI paramWalletForgotPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46272);
    h.pYm.e(11353, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    WalletForgotPwdUI.a(this.trG);
    AppMethodBeat.o(46272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.1
 * JD-Core Version:    0.6.2
 */