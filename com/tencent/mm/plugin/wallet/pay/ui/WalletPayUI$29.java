package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$29 extends com.tencent.mm.ui.s
{
  WalletPayUI$29(WalletPayUI paramWalletPayUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(46067);
    com.tencent.mm.plugin.wallet.a.s.cNC();
    int i;
    if (!com.tencent.mm.plugin.wallet.a.s.cND().cQh())
    {
      if (this.tqj.pVL != null)
        break label65;
      i = 0;
      if (this.tqj.pVL != null)
        break label79;
    }
    label65: label79: for (String str = ""; ; str = this.tqj.pVL.czZ)
    {
      ad.e(i, str, 6, "");
      this.tqj.cOd();
      AppMethodBeat.o(46067);
      return;
      i = this.tqj.pVL.cIf;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.29
 * JD-Core Version:    0.6.2
 */