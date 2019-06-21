package com.tencent.mm.plugin.wallet.balance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBalanceManagerUI$11
  implements Runnable
{
  WalletBalanceManagerUI$11(WalletBalanceManagerUI paramWalletBalanceManagerUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45438);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
      e.a(this.thC.tgH, this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
    AppMethodBeat.o(45438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.11
 * JD-Core Version:    0.6.2
 */