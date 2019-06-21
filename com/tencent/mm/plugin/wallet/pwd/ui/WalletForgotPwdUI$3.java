package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.wallet_core.ui.e;

final class WalletForgotPwdUI$3
  implements View.OnClickListener
{
  WalletForgotPwdUI$3(WalletForgotPwdUI paramWalletForgotPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46274);
    h.pYm.e(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
    paramView = this.trG;
    s.cNC();
    e.d(paramView, s.cND().bhp());
    AppMethodBeat.o(46274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.3
 * JD-Core Version:    0.6.2
 */