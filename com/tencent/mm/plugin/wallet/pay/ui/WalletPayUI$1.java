package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletPayUI$1
  implements Runnable
{
  WalletPayUI$1(WalletPayUI paramWalletPayUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(46034);
    ab.i(this.tqj.TAG, "auto reset create flag");
    WalletPayUI.Pu();
    AppMethodBeat.o(46034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.1
 * JD-Core Version:    0.6.2
 */