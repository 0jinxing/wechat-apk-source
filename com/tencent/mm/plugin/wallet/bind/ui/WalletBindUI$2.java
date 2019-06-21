package com.tencent.mm.plugin.wallet.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.ui.s;

final class WalletBindUI$2
  implements Runnable
{
  WalletBindUI$2(WalletBindUI paramWalletBindUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45796);
    if (WalletBindUI.a(this.tml))
    {
      AppMethodBeat.o(45796);
      return;
    }
    if (WalletBindUI.b(this.tml) == 4)
    {
      ai localai = new ai();
      WalletBindUI.d(this.tml).a(new WalletBindUI.2.1(this), localai.cQe());
    }
    while (true)
    {
      if (!WalletBindUI.a(this.tml))
        WalletBindUI.e(this.tml);
      AppMethodBeat.o(45796);
      break;
      WalletBindUI.c(this.tml);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.2
 * JD-Core Version:    0.6.2
 */