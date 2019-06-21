package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.w;
import com.tencent.mm.plugin.wallet_core.ui.p.b;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletPayCustomUI$1
  implements p.b
{
  WalletPayCustomUI$1(WalletPayCustomUI paramWalletPayCustomUI)
  {
  }

  public final void f(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(46009);
    int i = WalletPayCustomUI.a(this.tpc).xgi;
    String str1 = WalletPayCustomUI.a(this.tpc).xgh;
    String str2 = WalletPayCustomUI.a(this.tpc).sign;
    String str3 = WalletPayCustomUI.a(this.tpc).kmr;
    String str4 = WalletPayCustomUI.a(this.tpc).wmb;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      paramString1 = new w(paramString1, i, str1, str2, str3, str4, j, paramString2, "");
      this.tpc.a(paramString1, true, false);
      AppMethodBeat.o(46009);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI.1
 * JD-Core Version:    0.6.2
 */