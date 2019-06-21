package com.tencent.mm.plugin.wallet.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.s.a;

final class WalletBankcardManageUI$2
  implements s.a
{
  WalletBankcardManageUI$2(WalletBankcardManageUI paramWalletBankcardManageUI, Runnable paramRunnable)
  {
  }

  public final void bNo()
  {
    AppMethodBeat.i(45762);
    this.tma.run();
    AppMethodBeat.o(45762);
  }

  public final void bNp()
  {
    AppMethodBeat.i(45764);
    this.tma.run();
    AppMethodBeat.o(45764);
  }

  public final void cancel()
  {
    AppMethodBeat.i(45763);
    WalletBankcardManageUI.c(this.tlZ).cui = false;
    AppMethodBeat.o(45763);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.2
 * JD-Core Version:    0.6.2
 */