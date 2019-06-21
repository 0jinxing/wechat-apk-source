package com.tencent.mm.plugin.wallet.balance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBalanceFetchUI$24
  implements Runnable
{
  WalletBalanceFetchUI$24(WalletBalanceFetchUI paramWalletBalanceFetchUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45380);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
    {
      e.a(WalletBalanceFetchUI.m(this.the), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
      AppMethodBeat.o(45380);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
      AppMethodBeat.o(45380);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.24
 * JD-Core Version:    0.6.2
 */