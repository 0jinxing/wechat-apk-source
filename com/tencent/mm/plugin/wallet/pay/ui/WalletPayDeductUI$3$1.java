package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.base.h.a;
import java.util.List;

final class WalletPayDeductUI$3$1
  implements h.a
{
  WalletPayDeductUI$3$1(WalletPayDeductUI.3 param3)
  {
  }

  public final void BB(int paramInt)
  {
    AppMethodBeat.i(46019);
    WalletPayDeductUI.a(this.tpp.tpn, (Bankcard)this.tpp.tpo.get(paramInt));
    WalletPayDeductUI.c(this.tpp.tpn);
    AppMethodBeat.o(46019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI.3.1
 * JD-Core Version:    0.6.2
 */