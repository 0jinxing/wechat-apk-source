package com.tencent.mm.plugin.wallet.pwd.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.bt.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.y;

final class WalletPasswordSettingUI$8$1
  implements Runnable
{
  WalletPasswordSettingUI$8$1(WalletPasswordSettingUI.8 param8, bt parambt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(46357);
    if (this.tre.cuT != null)
      if (this.tre.cuT.retCode == 0)
      {
        WalletPasswordSettingUI.e(this.tsw.tsu);
        g.RQ();
        g.RO().eJo.a(new y(null, 19), 0);
        AppMethodBeat.o(46357);
      }
    while (true)
    {
      return;
      WalletPasswordSettingUI.f(this.tsw.tsu);
      WalletPasswordSettingUI.g(this.tsw.tsu);
      AppMethodBeat.o(46357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.8.1
 * JD-Core Version:    0.6.2
 */