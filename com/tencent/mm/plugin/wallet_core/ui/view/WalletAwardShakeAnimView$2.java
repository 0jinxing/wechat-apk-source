package com.tencent.mm.plugin.wallet_core.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletAwardShakeAnimView$2 extends d.a
{
  WalletAwardShakeAnimView$2(WalletAwardShakeAnimView paramWalletAwardShakeAnimView)
  {
  }

  public final void bUT()
  {
    AppMethodBeat.i(47890);
    ab.i("MicroMsg.WalletAwardShakeAnimView", "onShake");
    long l = bo.az(WalletAwardShakeAnimView.b(this.tNM));
    if (!WalletAwardShakeAnimView.c(this.tNM))
    {
      if (l >= 1200L)
        break label63;
      AppMethodBeat.o(47890);
    }
    while (true)
    {
      return;
      if (l < 80L)
      {
        AppMethodBeat.o(47890);
      }
      else
      {
        label63: WalletAwardShakeAnimView.a(this.tNM, bo.yz());
        WalletAwardShakeAnimView.d(this.tNM);
        if (!WalletAwardShakeAnimView.e(this.tNM))
        {
          WalletAwardShakeAnimView.f(this.tNM);
          WalletAwardShakeAnimView.g(this.tNM);
        }
        AppMethodBeat.o(47890);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView.2
 * JD-Core Version:    0.6.2
 */