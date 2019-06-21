package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class WalletPayDeductUI$2
  implements MMSwitchBtn.a
{
  WalletPayDeductUI$2(WalletPayDeductUI paramWalletPayDeductUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(46018);
    this.tpn.mX(paramBoolean);
    if (this.tpn.pWy != null)
    {
      h localh = h.pYm;
      if (paramBoolean)
        i = 1;
      localh.e(15379, new Object[] { Integer.valueOf(i), this.tpn.pWy.czZ });
    }
    AppMethodBeat.o(46018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI.2
 * JD-Core Version:    0.6.2
 */