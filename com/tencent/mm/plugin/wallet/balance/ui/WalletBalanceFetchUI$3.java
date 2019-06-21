package com.tencent.mm.plugin.wallet.balance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.wallet_core.c.e;
import com.tencent.mm.wallet_core.c.k;

final class WalletBalanceFetchUI$3
  implements e
{
  WalletBalanceFetchUI$3(WalletBalanceFetchUI paramWalletBalanceFetchUI, k paramk, y paramy)
  {
  }

  public final void cMX()
  {
    AppMethodBeat.i(45356);
    if (this.thf.dNM())
      WalletBalanceFetchUI.n(this.the);
    AppMethodBeat.o(45356);
  }

  public final void cMY()
  {
    AppMethodBeat.i(45357);
    if (this.thf.dNM())
      this.the.finish();
    AppMethodBeat.o(45357);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(45355);
    if (this.thf.dNM())
      this.the.finish();
    AppMethodBeat.o(45355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.3
 * JD-Core Version:    0.6.2
 */