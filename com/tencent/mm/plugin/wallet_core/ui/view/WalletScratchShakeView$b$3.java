package com.tencent.mm.plugin.wallet_core.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletScratchShakeView$b$3
  implements Runnable
{
  WalletScratchShakeView$b$3(WalletScratchShakeView.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47925);
    if (WalletScratchShakeView.a(this.tOt.tOs) != null)
      WalletScratchShakeView.a(this.tOt.tOs).nt(true);
    AppMethodBeat.o(47925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView.b.3
 * JD-Core Version:    0.6.2
 */