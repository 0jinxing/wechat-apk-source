package com.tencent.mm.plugin.wallet_core.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d.a;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletScratchShakeView$b$1 extends d.a
{
  WalletScratchShakeView$b$1(WalletScratchShakeView.b paramb)
  {
  }

  public final void bUT()
  {
    AppMethodBeat.i(47923);
    long l = bo.az(WalletScratchShakeView.b.a(this.tOt));
    if (!WalletScratchShakeView.b.b(this.tOt))
    {
      if (l >= 1200L)
        break label56;
      AppMethodBeat.o(47923);
    }
    while (true)
    {
      return;
      if (l < 80L)
      {
        AppMethodBeat.o(47923);
      }
      else
      {
        label56: WalletScratchShakeView.b.a(this.tOt, bo.yz());
        WalletScratchShakeView.b.c(this.tOt);
        WalletScratchShakeView.b.d(this.tOt);
        AppMethodBeat.o(47923);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView.b.1
 * JD-Core Version:    0.6.2
 */