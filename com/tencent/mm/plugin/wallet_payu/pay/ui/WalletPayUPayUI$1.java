package com.tencent.mm.plugin.wallet_payu.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.utils.d;

final class WalletPayUPayUI$1
  implements b.b
{
  WalletPayUPayUI$1(WalletPayUPayUI paramWalletPayUPayUI)
  {
  }

  public final void a(String paramString1, String paramString2, FavorPayInfo paramFavorPayInfo)
  {
    AppMethodBeat.i(48483);
    this.tUe.aqX();
    WalletPayUPayUI.a(this.tUe, paramString1);
    WalletPayUPayUI.b(this.tUe, paramString2);
    this.tUe.na(false);
    d.cSP();
    AppMethodBeat.o(48483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI.1
 * JD-Core Version:    0.6.2
 */